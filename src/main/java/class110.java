import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class143 {

    @OriginalMember(owner = "client!pf", name = "nb", descriptor = "I")
    private int field2654 = 0;

    @OriginalMember(owner = "client!pf", name = "zb", descriptor = "I")
    private int field2666 = 0;

    @OriginalMember(owner = "client!pf", name = "Db", descriptor = "Z")
    private boolean field2670 = false;

    @OriginalMember(owner = "client!pf", name = "Nb", descriptor = "B")
    private byte field2680 = 0;

    @OriginalMember(owner = "client!pf", name = "Tb", descriptor = "I")
    private int field2686 = 0;

    @OriginalMember(owner = "client!pf", name = "Pb", descriptor = "[I")
    private int[] field2682;

    @OriginalMember(owner = "client!pf", name = "vb", descriptor = "[I")
    private int[] field2662;

    @OriginalMember(owner = "client!pf", name = "Kb", descriptor = "[I")
    private int[] field2677;

    @OriginalMember(owner = "client!pf", name = "qb", descriptor = "[I")
    private int[] field2657;

    @OriginalMember(owner = "client!pf", name = "Rb", descriptor = "[I")
    private int[] field2684;

    @OriginalMember(owner = "client!pf", name = "Ub", descriptor = "[I")
    private int[] field2687;

    @OriginalMember(owner = "client!pf", name = "Bb", descriptor = "[I")
    private int[] field2668;

    @OriginalMember(owner = "client!pf", name = "Mb", descriptor = "[I")
    private int[] field2679;

    @OriginalMember(owner = "client!pf", name = "pb", descriptor = "[I")
    private int[] field2656;

    @OriginalMember(owner = "client!pf", name = "Ob", descriptor = "[I")
    private int[] field2681;

    @OriginalMember(owner = "client!pf", name = "yb", descriptor = "[B")
    private byte[] field2665;

    @OriginalMember(owner = "client!pf", name = "tb", descriptor = "[B")
    private byte[] field2660;

    @OriginalMember(owner = "client!pf", name = "wb", descriptor = "[B")
    private byte[] field2663;

    @OriginalMember(owner = "client!pf", name = "Eb", descriptor = "[B")
    private byte[] field2671;

    @OriginalMember(owner = "client!pf", name = "Gb", descriptor = "[I")
    private int[] field2673;

    @OriginalMember(owner = "client!pf", name = "sb", descriptor = "[S")
    private short[] field2659;

    @OriginalMember(owner = "client!pf", name = "Ib", descriptor = "[[I")
    private int[][] field2675;

    @OriginalMember(owner = "client!pf", name = "Ab", descriptor = "[[I")
    private int[][] field2667;

    @OriginalMember(owner = "client!pf", name = "Sb", descriptor = "[Luc;")
    private class138[] field2685;

    @OriginalMember(owner = "client!pf", name = "mb", descriptor = "[Lcf;")
    private class21[] field2653;

    @OriginalMember(owner = "client!pf", name = "Jb", descriptor = "[Luc;")
    private class138[] field2676;

    @OriginalMember(owner = "client!pf", name = "Wb", descriptor = "S")
    public short field2689;

    @OriginalMember(owner = "client!pf", name = "Lb", descriptor = "S")
    public short field2678;

    @OriginalMember(owner = "client!pf", name = "rb", descriptor = "[I")
    private static int[] field2658 = new int[10000];

    @OriginalMember(owner = "client!pf", name = "Hb", descriptor = "I")
    private static int field2674 = 0;

    @OriginalMember(owner = "client!pf", name = "Fb", descriptor = "[I")
    private static int[] field2672 = new int[10000];

    @OriginalMember(owner = "client!pf", name = "Qb", descriptor = "[I")
    private static int[] field2683 = new int[128];

    @OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
    private int field2655;

    @OriginalMember(owner = "client!pf", name = "ub", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!pf", name = "xb", descriptor = "I")
    private int field2664;

    @OriginalMember(owner = "client!pf", name = "Cb", descriptor = "I")
    private int field2669;

    @OriginalMember(owner = "client!pf", name = "Vb", descriptor = "I")
    private int field2688;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lpf;Lpf;IIIZ)V")
    public static final void method888(class110 arg0, class110 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method902();
        arg0.method889();
        arg1.method902();
        arg1.method889();
        ++field2674;
        int var6 = 0;
        int[] var7 = arg1.field2682;
        int var8 = arg1.field2686;
        for (int var9 = 0; var9 < arg0.field2686; ++var9) {
            class138 var12 = arg0.field2685[var9];
            if (var12.field3340 != 0) {
                int var13 = arg0.field2662[var9] - arg3;
                if (var13 <= arg1.field2688) {
                    int var14 = arg0.field2682[var9] - arg2;
                    if (var14 >= arg1.field2655 && var14 <= arg1.field2664) {
                        int var15 = arg0.field2677[var9] - arg4;
                        if (var15 >= arg1.field2669 && var15 <= arg1.field2661) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class138 var17 = arg1.field2685[var16];
                                if (var7[var16] == var14 && arg1.field2677[var16] == var15 && arg1.field2662[var16] == var13 && var17.field3340 != 0) {
                                    if (arg0.field2676 == null) {
                                        arg0.field2676 = new class138[arg0.field2686];
                                    }
                                    if (arg1.field2676 == null) {
                                        arg1.field2676 = new class138[var8];
                                    }
                                    class138 var18 = arg0.field2676[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2676[var9] = new class138(var12);
                                    }
                                    class138 var19 = arg1.field2676[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2676[var16] = new class138(var17);
                                    }
                                    var18.field3337 += var17.field3337;
                                    var18.field3341 += var17.field3341;
                                    var18.field3336 += var17.field3336;
                                    var18.field3340 += var17.field3340;
                                    var19.field3337 += var12.field3337;
                                    var19.field3341 += var12.field3341;
                                    var19.field3336 += var12.field3336;
                                    var19.field3340 += var12.field3340;
                                    ++var6;
                                    field2672[var9] = field2674;
                                    field2658[var16] = field2674;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2666; ++var10) {
                if (field2672[arg0.field2657[var10]] == field2674 && field2672[arg0.field2684[var10]] == field2674 && field2672[arg0.field2687[var10]] == field2674) {
                    if (arg0.field2665 == null) {
                        arg0.field2665 = new byte[arg0.field2666];
                    }
                    arg0.field2665[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2666; ++var11) {
                if (field2658[arg1.field2657[var11]] == field2674 && field2658[arg1.field2684[var11]] == field2674 && field2658[arg1.field2687[var11]] == field2674) {
                    if (arg1.field2665 == null) {
                        arg1.field2665 = new byte[arg1.field2666];
                    }
                    arg1.field2665[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public final void method889() {
        if (this.field2685 == null) {
            this.field2685 = new class138[this.field2686];
            for (int var1 = 0; var1 < this.field2686; ++var1) {
                this.field2685[var1] = new class138();
            }
            for (int var2 = 0; var2 < this.field2666; ++var2) {
                int var3 = this.field2657[var2];
                int var4 = this.field2684[var2];
                int var5 = this.field2687[var2];
                int var6 = this.field2682[var4] - this.field2682[var3];
                int var7 = this.field2662[var4] - this.field2662[var3];
                int var8 = this.field2677[var4] - this.field2677[var3];
                int var9 = this.field2682[var5] - this.field2682[var3];
                int var10 = this.field2662[var5] - this.field2662[var3];
                int var11 = this.field2677[var5] - this.field2677[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field2665 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2665[var2];
                }
                if (var19 == 0) {
                    class138 var20 = this.field2685[var3];
                    var20.field3337 += var16;
                    var20.field3341 += var17;
                    var20.field3336 += var18;
                    ++var20.field3340;
                    class138 var21 = this.field2685[var4];
                    var21.field3337 += var16;
                    var21.field3341 += var17;
                    var21.field3336 += var18;
                    ++var21.field3340;
                    class138 var22 = this.field2685[var5];
                    var22.field3337 += var16;
                    var22.field3341 += var17;
                    var22.field3336 += var18;
                    ++var22.field3340;
                } else if (var19 == 1) {
                    if (this.field2653 == null) {
                        this.field2653 = new class21[this.field2666];
                    }
                    class21 var23 = this.field2653[var2] = new class21();
                    var23.field492 = var16;
                    var23.field497 = var17;
                    var23.field495 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lpf;I)I")
    private final int method890(class110 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2682[arg1];
        int var5 = arg0.field2662[arg1];
        int var6 = arg0.field2677[arg1];
        for (int var7 = 0; var7 < this.field2686; ++var7) {
            if (this.field2682[var7] == var4 && this.field2662[var7] == var5 && this.field2677[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2682[this.field2686] = var4;
            this.field2662[this.field2686] = var5;
            this.field2677[this.field2686] = var6;
            if (arg0.field2681 != null) {
                this.field2681[this.field2686] = arg0.field2681[arg1];
            }
            var3 = this.field2686++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()Lpf;")
    public final class110 method891() {
        class110 var1 = new class110();
        if (this.field2665 != null) {
            var1.field2665 = new byte[this.field2666];
            for (int var2 = 0; var2 < this.field2666; ++var2) {
                var1.field2665[var2] = this.field2665[var2];
            }
        }
        var1.field2686 = this.field2686;
        var1.field2666 = this.field2666;
        var1.field2654 = this.field2654;
        var1.field2682 = this.field2682;
        var1.field2662 = this.field2662;
        var1.field2677 = this.field2677;
        var1.field2657 = this.field2657;
        var1.field2684 = this.field2684;
        var1.field2687 = this.field2687;
        var1.field2663 = this.field2663;
        var1.field2671 = this.field2671;
        var1.field2660 = this.field2660;
        var1.field2659 = this.field2659;
        var1.field2680 = this.field2680;
        var1.field2668 = this.field2668;
        var1.field2679 = this.field2679;
        var1.field2656 = this.field2656;
        var1.field2681 = this.field2681;
        var1.field2673 = this.field2673;
        var1.field2675 = this.field2675;
        var1.field2667 = this.field2667;
        var1.field2685 = this.field2685;
        var1.field2653 = this.field2653;
        var1.field2689 = this.field2689;
        var1.field2678 = this.field2678;
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method892(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2686; ++var4) {
            this.field2682[var4] = this.field2682[var4] * arg0 / 128;
            this.field2662[var4] = this.field2662[var4] * arg1 / 128;
            this.field2677[var4] = this.field2677[var4] * arg2 / 128;
        }
        this.method898();
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()V")
    private final void method893() {
        int var10002;
        if (this.field2681 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2686; ++var3) {
                int var7 = this.field2681[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2675 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2675[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2686) {
                int var6 = this.field2681[var5];
                this.field2675[var6][var1[var6]++] = var5++;
            }
            this.field2681 = null;
        }
        if (this.field2673 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2666; ++var10) {
                int var14 = this.field2673[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2667 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2667[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2666) {
                int var13 = this.field2673[var12];
                this.field2667[var13][var8[var13]++] = var12++;
            }
            this.field2673 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)I")
    private static final int method894(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()V")
    public static void method895() {
        field2672 = null;
        field2658 = null;
        field2683 = null;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "()V")
    public final void method896() {
        for (int var1 = 0; var1 < this.field2686; ++var1) {
            int var2 = this.field2677[var1];
            this.field2677[var1] = this.field2682[var1];
            this.field2682[var1] = -var2;
        }
        this.method898();
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "()V")
    public final void method897() {
        for (int var1 = 0; var1 < this.field2686; ++var1) {
            this.field2682[var1] = -this.field2682[var1];
            this.field2677[var1] = -this.field2677[var1];
        }
        this.method898();
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "()V")
    private final void method898() {
        this.field2685 = null;
        this.field2676 = null;
        this.field2653 = null;
        this.field2670 = false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIZ)Lpf;")
    public final class110 method899(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class110 var6;
            if (arg4) {
                var6 = new class110();
                var6.field2686 = this.field2686;
                var6.field2666 = this.field2666;
                var6.field2654 = this.field2654;
                var6.field2682 = this.field2682;
                var6.field2677 = this.field2677;
                var6.field2657 = this.field2657;
                var6.field2684 = this.field2684;
                var6.field2687 = this.field2687;
                var6.field2665 = this.field2665;
                var6.field2663 = this.field2663;
                var6.field2671 = this.field2671;
                var6.field2660 = this.field2660;
                var6.field2659 = this.field2659;
                var6.field2680 = this.field2680;
                var6.field2668 = this.field2668;
                var6.field2679 = this.field2679;
                var6.field2656 = this.field2656;
                var6.field2681 = this.field2681;
                var6.field2673 = this.field2673;
                var6.field2675 = this.field2675;
                var6.field2667 = this.field2667;
                var6.field2689 = this.field2689;
                var6.field2678 = this.field2678;
                var6.field2662 = new int[var6.field2686];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field2686; ++var8) {
                int var9 = this.field2682[var8];
                int var10 = this.field2662[var8];
                int var11 = this.field2677[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field2662[var8] = var10 + var14 - var7;
            }
            var6.method898();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "()V")
    public final void method900() {
        for (int var1 = 0; var1 < this.field2686; ++var1) {
            this.field2677[var1] = -this.field2677[var1];
        }
        for (int var2 = 0; var2 < this.field2666; ++var2) {
            int var3 = this.field2657[var2];
            this.field2657[var2] = this.field2687[var2];
            this.field2687[var2] = var3;
        }
        this.method898();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)Lna;")
    public final class91 method901(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method889();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class91 var8 = new class91();
        var8.field2130 = new int[this.field2666];
        var8.field2122 = new int[this.field2666];
        var8.field2149 = new int[this.field2666];
        for (int var9 = 0; var9 < this.field2666; ++var9) {
            byte var10;
            if (this.field2665 == null) {
                var10 = 0;
            } else {
                var10 = this.field2665[var9];
            }
            if (this.field2660 != null && this.field2660[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class21 var17 = this.field2653[var9];
                        int var18 = (var17.field495 * arg4 + var17.field497 * arg3 + var17.field492 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field2130[var9] = method906(var18);
                        var8.field2149[var9] = -1;
                    } else {
                        var8.field2149[var9] = -2;
                    }
                } else {
                    class138 var11;
                    if (this.field2676 != null && this.field2676[this.field2657[var9]] != null) {
                        var11 = this.field2676[this.field2657[var9]];
                    } else {
                        var11 = this.field2685[this.field2657[var9]];
                    }
                    int var12 = (var11.field3336 * arg4 + var11.field3341 * arg3 + var11.field3337 * arg2) / (var11.field3340 * var7) + arg0;
                    var8.field2130[var9] = method906(var12);
                    class138 var13;
                    if (this.field2676 != null && this.field2676[this.field2684[var9]] != null) {
                        var13 = this.field2676[this.field2684[var9]];
                    } else {
                        var13 = this.field2685[this.field2684[var9]];
                    }
                    int var14 = (var13.field3336 * arg4 + var13.field3341 * arg3 + var13.field3337 * arg2) / (var13.field3340 * var7) + arg0;
                    var8.field2122[var9] = method906(var14);
                    class138 var15;
                    if (this.field2676 != null && this.field2676[this.field2687[var9]] != null) {
                        var15 = this.field2676[this.field2687[var9]];
                    } else {
                        var15 = this.field2685[this.field2687[var9]];
                    }
                    int var16 = (var15.field3336 * arg4 + var15.field3341 * arg3 + var15.field3337 * arg2) / (var15.field3340 * var7) + arg0;
                    var8.field2149[var9] = method906(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class21 var26 = this.field2653[var9];
                    int var27 = (var26.field495 * arg4 + var26.field497 * arg3 + var26.field492 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2130[var9] = method894(this.field2659[var9] & 65535, var27);
                    var8.field2149[var9] = -1;
                } else {
                    var8.field2149[var9] = -2;
                }
            } else {
                int var19 = this.field2659[var9] & 65535;
                class138 var20;
                if (this.field2676 != null && this.field2676[this.field2657[var9]] != null) {
                    var20 = this.field2676[this.field2657[var9]];
                } else {
                    var20 = this.field2685[this.field2657[var9]];
                }
                int var21 = (var20.field3336 * arg4 + var20.field3341 * arg3 + var20.field3337 * arg2) / (var20.field3340 * var7) + arg0;
                var8.field2130[var9] = method894(var19, var21);
                class138 var22;
                if (this.field2676 != null && this.field2676[this.field2684[var9]] != null) {
                    var22 = this.field2676[this.field2684[var9]];
                } else {
                    var22 = this.field2685[this.field2684[var9]];
                }
                int var23 = (var22.field3336 * arg4 + var22.field3341 * arg3 + var22.field3337 * arg2) / (var22.field3340 * var7) + arg0;
                var8.field2122[var9] = method894(var19, var23);
                class138 var24;
                if (this.field2676 != null && this.field2676[this.field2687[var9]] != null) {
                    var24 = this.field2676[this.field2687[var9]];
                } else {
                    var24 = this.field2685[this.field2687[var9]];
                }
                int var25 = (var24.field3336 * arg4 + var24.field3341 * arg3 + var24.field3337 * arg2) / (var24.field3340 * var7) + arg0;
                var8.field2149[var9] = method894(var19, var25);
            }
        }
        this.method893();
        var8.field2139 = this.field2686;
        var8.field2141 = this.field2682;
        var8.field2145 = this.field2662;
        var8.field2126 = this.field2677;
        var8.field2140 = this.field2666;
        var8.field2147 = this.field2657;
        var8.field2124 = this.field2684;
        var8.field2132 = this.field2687;
        var8.field2146 = this.field2663;
        var8.field2129 = this.field2671;
        var8.field2142 = this.field2660;
        if (var8.field2142 != null) {
            var8.field2143 = this.field2659;
        } else {
            var8.field2143 = null;
        }
        var8.field2128 = this.field2680;
        var8.field2127 = this.field2654;
        var8.field2137 = this.field2668;
        var8.field2131 = this.field2679;
        var8.field2134 = this.field2656;
        var8.field2150 = this.field2675;
        var8.field2151 = this.field2667;
        return var8;
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "()V")
    private final void method902() {
        if (!this.field2670) {
            super.field3495 = 0;
            this.field2688 = 0;
            this.field2655 = 999999;
            this.field2664 = -999999;
            this.field2661 = -99999;
            this.field2669 = 99999;
            for (int var1 = 0; var1 < this.field2686; ++var1) {
                int var2 = this.field2682[var1];
                int var3 = this.field2662[var1];
                int var4 = this.field2677[var1];
                if (var2 < this.field2655) {
                    this.field2655 = var2;
                }
                if (var2 > this.field2664) {
                    this.field2664 = var2;
                }
                if (var4 < this.field2669) {
                    this.field2669 = var4;
                }
                if (var4 > this.field2661) {
                    this.field2661 = var4;
                }
                if (-var3 > super.field3495) {
                    super.field3495 = -var3;
                }
                if (var3 > this.field2688) {
                    this.field2688 = var3;
                }
            }
            this.field2670 = true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lg;II)Lpf;")
    public static final class110 method903(class43 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method324(0, arg2, arg1);
        return var3 == null ? null : new class110(var3);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(SS)V")
    public final void method904(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2666; ++var3) {
            if (this.field2659[var3] == arg0) {
                this.field2659[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
    public final void method905(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2686; ++var4) {
            this.field2682[var4] += arg0;
            this.field2662[var4] += arg1;
            this.field2677[var4] += arg2;
        }
        this.method898();
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)I")
    private static final int method906(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field2683[arg0];
    }

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "()V")
    public final void method907() {
        for (int var1 = 0; var1 < this.field2686; ++var1) {
            int var2 = this.field2682[var1];
            this.field2682[var1] = this.field2677[var1];
            this.field2677[var1] = -var2;
        }
        this.method898();
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    private class110() {
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
    private class110(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class59 var4 = new class59(arg0);
        class59 var5 = new class59(arg0);
        class59 var6 = new class59(arg0);
        class59 var7 = new class59(arg0);
        class59 var8 = new class59(arg0);
        var4.field1485 = arg0.length - 18;
        int var9 = var4.method483((byte) 24);
        int var10 = var4.method483((byte) 24);
        int var11 = var4.method480(0);
        int var12 = var4.method480(0);
        int var13 = var4.method480(0);
        int var14 = var4.method480(0);
        int var15 = var4.method480(0);
        int var16 = var4.method480(0);
        int var17 = var4.method483((byte) 24);
        int var18 = var4.method483((byte) 24);
        int var19 = var4.method483((byte) 24);
        int var20 = var4.method483((byte) 24);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2686 = var9;
        this.field2666 = var10;
        this.field2654 = var11;
        this.field2682 = new int[var9];
        this.field2662 = new int[var9];
        this.field2677 = new int[var9];
        this.field2657 = new int[var10];
        this.field2684 = new int[var10];
        this.field2687 = new int[var10];
        if (var11 > 0) {
            this.field2668 = new int[var11];
            this.field2679 = new int[var11];
            this.field2656 = new int[var11];
        }
        if (var16 == 1) {
            this.field2681 = new int[var9];
        }
        if (var12 == 1) {
            this.field2665 = new byte[var10];
            this.field2660 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2663 = new byte[var10];
        } else {
            this.field2680 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2671 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2673 = new int[var10];
        }
        this.field2659 = new short[var10];
        var4.field1485 = var21;
        var5.field1485 = var36;
        var6.field1485 = var38;
        var7.field1485 = var40;
        var8.field1485 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method480(0);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method479(128);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method479(128);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method479(128);
            }
            this.field2682[var46] = var43 + var60;
            this.field2662[var46] = var44 + var61;
            this.field2677[var46] = var45 + var62;
            var43 = this.field2682[var46];
            var44 = this.field2662[var46];
            var45 = this.field2677[var46];
            if (var16 == 1) {
                this.field2681[var46] = var8.method480(0);
            }
        }
        var4.field1485 = var32;
        var5.field1485 = var28;
        var6.field1485 = var26;
        var7.field1485 = var30;
        var8.field1485 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2659[var47] = (short) var4.method483((byte) 24);
            if (var12 == 1) {
                int var58 = var5.method480(0);
                if ((var58 & 1) == 1) {
                    this.field2665[var47] = 1;
                    var3 = true;
                } else {
                    this.field2665[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field2660[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field2660[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2663[var47] = var6.method475(-49152);
            }
            if (var14 == 1) {
                this.field2671[var47] = var7.method475(-49152);
            }
            if (var15 == 1) {
                this.field2673[var47] = var8.method480(0);
            }
        }
        var4.field1485 = var25;
        var5.field1485 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method480(0);
            if (var54 == 1) {
                var48 = var4.method479(128) + var51;
                var49 = var4.method479(128) + var48;
                var50 = var4.method479(128) + var49;
                var51 = var50;
                this.field2657[var52] = var48;
                this.field2684[var52] = var49;
                this.field2687[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method479(128) + var51;
                var51 = var50;
                this.field2657[var52] = var48;
                this.field2684[var52] = var49;
                this.field2687[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method479(128) + var51;
                var51 = var50;
                this.field2657[var52] = var48;
                this.field2684[var52] = var49;
                this.field2687[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method479(128) + var51;
                var51 = var50;
                this.field2657[var52] = var48;
                this.field2684[var52] = var57;
                this.field2687[var52] = var50;
            }
        }
        var4.field1485 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2668[var53] = var4.method483((byte) 24);
            this.field2679[var53] = var4.method483((byte) 24);
            this.field2656[var53] = var4.method483((byte) 24);
        }
        if (!var2) {
            this.field2660 = null;
        }
        if (!var3) {
            this.field2665 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([Lpf;I)V")
    public class110(class110[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field2686 = 0;
        this.field2666 = 0;
        this.field2654 = 0;
        this.field2680 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class110 var14 = arg0[var8];
            if (var14 != null) {
                this.field2686 += var14.field2686;
                this.field2666 += var14.field2666;
                this.field2654 += var14.field2654;
                if (var14.field2663 != null) {
                    var4 = true;
                } else {
                    if (this.field2680 == -1) {
                        this.field2680 = var14.field2680;
                    }
                    if (this.field2680 != var14.field2680) {
                        var4 = true;
                    }
                }
                var3 |= var14.field2665 != null;
                var5 |= var14.field2671 != null;
                var6 |= var14.field2673 != null;
                var7 |= var14.field2660 != null;
            }
        }
        this.field2682 = new int[this.field2686];
        this.field2662 = new int[this.field2686];
        this.field2677 = new int[this.field2686];
        this.field2681 = new int[this.field2686];
        this.field2657 = new int[this.field2666];
        this.field2684 = new int[this.field2666];
        this.field2687 = new int[this.field2666];
        if (this.field2654 > 0) {
            this.field2668 = new int[this.field2654];
            this.field2679 = new int[this.field2654];
            this.field2656 = new int[this.field2654];
        }
        if (var3) {
            this.field2665 = new byte[this.field2666];
        }
        if (var4) {
            this.field2663 = new byte[this.field2666];
        }
        if (var5) {
            this.field2671 = new byte[this.field2666];
        }
        if (var7) {
            this.field2660 = new byte[this.field2666];
        }
        if (var6) {
            this.field2673 = new int[this.field2666];
        }
        this.field2659 = new short[this.field2666];
        this.field2686 = 0;
        this.field2666 = 0;
        this.field2654 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class110 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2666; ++var12) {
                    if (var3 && var11.field2665 != null) {
                        this.field2665[this.field2666] = var11.field2665[var12];
                    }
                    if (var4) {
                        if (var11.field2663 != null) {
                            this.field2663[this.field2666] = var11.field2663[var12];
                        } else {
                            this.field2663[this.field2666] = var11.field2680;
                        }
                    }
                    if (var5 && var11.field2671 != null) {
                        this.field2671[this.field2666] = var11.field2671[var12];
                    }
                    if (var7) {
                        if (var11.field2660 != null && var11.field2660[var12] != -1) {
                            this.field2660[this.field2666] = (byte) (var11.field2660[var12] + var9);
                        } else {
                            this.field2660[this.field2666] = -1;
                        }
                    }
                    if (var6 && var11.field2673 != null) {
                        this.field2673[this.field2666] = var11.field2673[var12];
                    }
                    this.field2659[this.field2666] = var11.field2659[var12];
                    this.field2657[this.field2666] = this.method890(var11, var11.field2657[var12]);
                    this.field2684[this.field2666] = this.method890(var11, var11.field2684[var12]);
                    this.field2687[this.field2666] = this.method890(var11, var11.field2687[var12]);
                    ++this.field2666;
                }
                for (int var13 = 0; var13 < var11.field2654; ++var13) {
                    this.field2668[this.field2654] = this.method890(var11, var11.field2668[var13]);
                    this.field2679[this.field2654] = this.method890(var11, var11.field2679[var13]);
                    this.field2656[this.field2654] = this.method890(var11, var11.field2656[var13]);
                    ++this.field2654;
                }
                var9 += var11.field2654;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lpf;ZZZ)V")
    public class110(class110 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field2686 = arg0.field2686;
        this.field2666 = arg0.field2666;
        this.field2654 = arg0.field2654;
        if (arg1) {
            this.field2682 = arg0.field2682;
            this.field2662 = arg0.field2662;
            this.field2677 = arg0.field2677;
        } else {
            this.field2682 = new int[this.field2686];
            this.field2662 = new int[this.field2686];
            this.field2677 = new int[this.field2686];
            for (int var5 = 0; var5 < this.field2686; ++var5) {
                this.field2682[var5] = arg0.field2682[var5];
                this.field2662[var5] = arg0.field2662[var5];
                this.field2677[var5] = arg0.field2677[var5];
            }
        }
        if (arg2) {
            this.field2659 = arg0.field2659;
        } else {
            this.field2659 = new short[this.field2666];
            for (int var6 = 0; var6 < this.field2666; ++var6) {
                this.field2659[var6] = arg0.field2659[var6];
            }
        }
        if (arg3) {
            this.field2671 = arg0.field2671;
        } else {
            this.field2671 = new byte[this.field2666];
            if (arg0.field2671 == null) {
                for (int var7 = 0; var7 < this.field2666; ++var7) {
                    this.field2671[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field2666; ++var8) {
                    this.field2671[var8] = arg0.field2671[var8];
                }
            }
        }
        this.field2657 = arg0.field2657;
        this.field2684 = arg0.field2684;
        this.field2687 = arg0.field2687;
        this.field2665 = arg0.field2665;
        this.field2663 = arg0.field2663;
        this.field2660 = arg0.field2660;
        this.field2680 = arg0.field2680;
        this.field2668 = arg0.field2668;
        this.field2679 = arg0.field2679;
        this.field2656 = arg0.field2656;
        this.field2681 = arg0.field2681;
        this.field2673 = arg0.field2673;
        this.field2675 = arg0.field2675;
        this.field2667 = arg0.field2667;
        this.field2685 = arg0.field2685;
        this.field2653 = arg0.field2653;
        this.field2676 = arg0.field2676;
        this.field2689 = arg0.field2689;
        this.field2678 = arg0.field2678;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field2683[var0++] = 255;
        }
        while (var0 < 16) {
            field2683[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field2683[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field2683[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field2683[var0++] = var1--;
        }
    }
}
