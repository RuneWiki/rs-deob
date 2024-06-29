import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class141 extends class35 {

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public int field2623 = 0;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
    public int field2636 = 0;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "Z")
    private boolean field2632 = false;

    @OriginalMember(owner = "client!ob", name = "xb", descriptor = "B")
    public byte field2646 = 0;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!ob", name = "Ob", descriptor = "[I")
    public int[] field2663;

    @OriginalMember(owner = "client!ob", name = "Mb", descriptor = "[I")
    public int[] field2661;

    @OriginalMember(owner = "client!ob", name = "Tb", descriptor = "[I")
    public int[] field2668;

    @OriginalMember(owner = "client!ob", name = "Db", descriptor = "[I")
    private int[] field2652;

    @OriginalMember(owner = "client!ob", name = "Hb", descriptor = "[I")
    public int[] field2656;

    @OriginalMember(owner = "client!ob", name = "Lb", descriptor = "[I")
    public int[] field2660;

    @OriginalMember(owner = "client!ob", name = "Rb", descriptor = "[I")
    public int[] field2666;

    @OriginalMember(owner = "client!ob", name = "ub", descriptor = "[B")
    public byte[] field2643;

    @OriginalMember(owner = "client!ob", name = "Eb", descriptor = "[B")
    public byte[] field2653;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "[B")
    public byte[] field2630;

    @OriginalMember(owner = "client!ob", name = "Sb", descriptor = "[I")
    private int[] field2667;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "[S")
    public short[] field2625;

    @OriginalMember(owner = "client!ob", name = "Qb", descriptor = "[B")
    public byte[] field2665;

    @OriginalMember(owner = "client!ob", name = "Ib", descriptor = "[S")
    public short[] field2657;

    @OriginalMember(owner = "client!ob", name = "yb", descriptor = "[B")
    public byte[] field2647;

    @OriginalMember(owner = "client!ob", name = "Gb", descriptor = "[S")
    public short[] field2655;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "[S")
    public short[] field2631;

    @OriginalMember(owner = "client!ob", name = "Pb", descriptor = "[S")
    public short[] field2664;

    @OriginalMember(owner = "client!ob", name = "Kb", descriptor = "[S")
    private short[] field2659;

    @OriginalMember(owner = "client!ob", name = "Ab", descriptor = "[S")
    private short[] field2649;

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "[S")
    private short[] field2635;

    @OriginalMember(owner = "client!ob", name = "vb", descriptor = "[B")
    private byte[] field2644;

    @OriginalMember(owner = "client!ob", name = "Bb", descriptor = "[B")
    private byte[] field2650;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "[B")
    private byte[] field2624;

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "[B")
    private byte[] field2637;

    @OriginalMember(owner = "client!ob", name = "zb", descriptor = "[B")
    private byte[] field2648;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "[[I")
    public int[][] field2622;

    @OriginalMember(owner = "client!ob", name = "qb", descriptor = "[[I")
    public int[][] field2639;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "[Lcc;")
    public class24[] field2634;

    @OriginalMember(owner = "client!ob", name = "wb", descriptor = "[Lu;")
    public class198[] field2645;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "[Lcc;")
    public class24[] field2629;

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "S")
    public short field2638;

    @OriginalMember(owner = "client!ob", name = "Jb", descriptor = "S")
    public short field2658;

    @OriginalMember(owner = "client!ob", name = "Fb", descriptor = "[I")
    private static int[] field2654 = new int[10000];

    @OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
    private static int field2640 = 0;

    @OriginalMember(owner = "client!ob", name = "Nb", descriptor = "[I")
    private static int[] field2662 = new int[10000];

    @OriginalMember(owner = "client!ob", name = "Cb", descriptor = "[I")
    private static int[] field2651 = class72.field1404;

    @OriginalMember(owner = "client!ob", name = "Ub", descriptor = "[I")
    private static int[] field2669 = class72.field1396;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "S")
    private short field2626;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "S")
    private short field2628;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "S")
    private short field2633;

    @OriginalMember(owner = "client!ob", name = "sb", descriptor = "S")
    private short field2641;

    @OriginalMember(owner = "client!ob", name = "tb", descriptor = "S")
    private short field2642;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lob;Lob;IIIZ)V")
    public static final void method877(class141 arg0, class141 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method889();
        arg0.method885();
        arg1.method889();
        arg1.method885();
        ++field2640;
        int var6 = 0;
        int[] var7 = arg1.field2663;
        int var8 = arg1.field2623;
        for (int var9 = 0; var9 < arg0.field2623; ++var9) {
            class24 var12 = arg0.field2634[var9];
            if (var12.field519 != 0) {
                int var13 = arg0.field2661[var9] - arg3;
                if (var13 >= arg1.field758 && var13 <= arg1.field2626) {
                    int var14 = arg0.field2663[var9] - arg2;
                    if (var14 >= arg1.field2641 && var14 <= arg1.field2633) {
                        int var15 = arg0.field2668[var9] - arg4;
                        if (var15 >= arg1.field2642 && var15 <= arg1.field2628) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class24 var17 = arg1.field2634[var16];
                                if (var7[var16] == var14 && arg1.field2668[var16] == var15 && arg1.field2661[var16] == var13 && var17.field519 != 0) {
                                    if (arg0.field2629 == null) {
                                        arg0.field2629 = new class24[arg0.field2623];
                                    }
                                    if (arg1.field2629 == null) {
                                        arg1.field2629 = new class24[var8];
                                    }
                                    class24 var18 = arg0.field2629[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2629[var9] = new class24(var12);
                                    }
                                    class24 var19 = arg1.field2629[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2629[var16] = new class24(var17);
                                    }
                                    var18.field516 += var17.field516;
                                    var18.field522 += var17.field522;
                                    var18.field513 += var17.field513;
                                    var18.field519 += var17.field519;
                                    var19.field516 += var12.field516;
                                    var19.field522 += var12.field522;
                                    var19.field513 += var12.field513;
                                    var19.field519 += var12.field519;
                                    ++var6;
                                    field2662[var9] = field2640;
                                    field2654[var16] = field2640;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2636; ++var10) {
                if (field2662[arg0.field2656[var10]] == field2640 && field2662[arg0.field2660[var10]] == field2640 && field2662[arg0.field2666[var10]] == field2640) {
                    if (arg0.field2643 == null) {
                        arg0.field2643 = new byte[arg0.field2636];
                    }
                    arg0.field2643[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2636; ++var11) {
                if (field2654[arg1.field2656[var11]] == field2640 && field2654[arg1.field2660[var11]] == field2640 && field2654[arg1.field2666[var11]] == field2640) {
                    if (arg1.field2643 == null) {
                        arg1.field2643 = new byte[arg1.field2636];
                    }
                    arg1.field2643[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
    private final void method878() {
        this.field2634 = null;
        this.field2629 = null;
        this.field2645 = null;
        this.field2632 = false;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
    public final void method879() {
        for (int var1 = 0; var1 < this.field2623; ++var1) {
            int var2 = this.field2668[var1];
            this.field2668[var1] = this.field2663[var1];
            this.field2663[var1] = -var2;
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
    public final void method880() {
        int var10002;
        if (this.field2652 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2623; ++var3) {
                int var7 = this.field2652[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2622 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2622[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2623) {
                int var6 = this.field2652[var5];
                this.field2622[var6][var1[var6]++] = var5++;
            }
            this.field2652 = null;
        }
        if (this.field2667 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2636; ++var10) {
                int var14 = this.field2667[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2639 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2639[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2636) {
                int var13 = this.field2667[var12];
                this.field2639[var13][var8[var13]++] = var12++;
            }
            this.field2667 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([[IIIIZI)Lob;")
    public final class141 method881(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method889();
        int var7 = this.field2641 + arg1;
        int var8 = this.field2633 + arg1;
        int var9 = this.field2642 + arg3;
        int var10 = this.field2628 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class141 var15;
                if (arg4) {
                    var15 = new class141();
                    var15.field2623 = this.field2623;
                    var15.field2636 = this.field2636;
                    var15.field2627 = this.field2627;
                    var15.field2663 = this.field2663;
                    var15.field2668 = this.field2668;
                    var15.field2656 = this.field2656;
                    var15.field2660 = this.field2660;
                    var15.field2666 = this.field2666;
                    var15.field2643 = this.field2643;
                    var15.field2653 = this.field2653;
                    var15.field2630 = this.field2630;
                    var15.field2665 = this.field2665;
                    var15.field2657 = this.field2657;
                    var15.field2625 = this.field2625;
                    var15.field2646 = this.field2646;
                    var15.field2647 = this.field2647;
                    var15.field2655 = this.field2655;
                    var15.field2631 = this.field2631;
                    var15.field2664 = this.field2664;
                    var15.field2659 = this.field2659;
                    var15.field2649 = this.field2649;
                    var15.field2635 = this.field2635;
                    var15.field2644 = this.field2644;
                    var15.field2650 = this.field2650;
                    var15.field2624 = this.field2624;
                    var15.field2637 = this.field2637;
                    var15.field2648 = this.field2648;
                    var15.field2652 = this.field2652;
                    var15.field2667 = this.field2667;
                    var15.field2622 = this.field2622;
                    var15.field2639 = this.field2639;
                    var15.field2638 = this.field2638;
                    var15.field2658 = this.field2658;
                    var15.field2661 = new int[var15.field2623];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2623; ++var16) {
                        int var17 = this.field2663[var16] + arg1;
                        int var18 = this.field2668[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2661[var16] = this.field2661[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2623; ++var26) {
                        int var27 = (this.field2661[var26] << 16) / super.field758;
                        if (var27 < arg5) {
                            int var28 = this.field2663[var26] + arg1;
                            int var29 = this.field2668[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2661[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2661[var26];
                        } else {
                            var15.field2661[var26] = this.field2661[var26];
                        }
                    }
                }
                var15.method878();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public final void method882(int arg0) {
        int var2 = field2669[arg0];
        int var3 = field2651[arg0];
        for (int var4 = 0; var4 < this.field2623; ++var4) {
            int var5 = this.field2668[var4] * var2 + this.field2663[var4] * var3 >> 16;
            this.field2668[var4] = this.field2668[var4] * var3 - this.field2663[var4] * var2 >> 16;
            this.field2663[var4] = var5;
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
    public final void method883(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2623; ++var4) {
            this.field2663[var4] = this.field2663[var4] * arg0 / 128;
            this.field2661[var4] = this.field2661[var4] * arg1 / 128;
            this.field2668[var4] = this.field2668[var4] * arg2 / 128;
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)Lkc;")
    public final class102 method884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class102(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
    public final void method885() {
        if (this.field2634 == null) {
            this.field2634 = new class24[this.field2623];
            for (int var1 = 0; var1 < this.field2623; ++var1) {
                this.field2634[var1] = new class24();
            }
            for (int var2 = 0; var2 < this.field2636; ++var2) {
                int var3 = this.field2656[var2];
                int var4 = this.field2660[var2];
                int var5 = this.field2666[var2];
                int var6 = this.field2663[var4] - this.field2663[var3];
                int var7 = this.field2661[var4] - this.field2661[var3];
                int var8 = this.field2668[var4] - this.field2668[var3];
                int var9 = this.field2663[var5] - this.field2663[var3];
                int var10 = this.field2661[var5] - this.field2661[var3];
                int var11 = this.field2668[var5] - this.field2668[var3];
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
                if (this.field2643 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2643[var2];
                }
                if (var19 == 0) {
                    class24 var20 = this.field2634[var3];
                    var20.field516 += var16;
                    var20.field522 += var17;
                    var20.field513 += var18;
                    ++var20.field519;
                    class24 var21 = this.field2634[var4];
                    var21.field516 += var16;
                    var21.field522 += var17;
                    var21.field513 += var18;
                    ++var21.field519;
                    class24 var22 = this.field2634[var5];
                    var22.field516 += var16;
                    var22.field522 += var17;
                    var22.field513 += var18;
                    ++var22.field519;
                } else if (var19 == 1) {
                    if (this.field2645 == null) {
                        this.field2645 = new class198[this.field2636];
                    }
                    class198 var23 = this.field2645[var2] = new class198();
                    var23.field3856 = var16;
                    var23.field3855 = var17;
                    var23.field3858 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "()V")
    public final void method886() {
        for (int var1 = 0; var1 < this.field2623; ++var1) {
            this.field2668[var1] = -this.field2668[var1];
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "()V")
    public final void method887() {
        for (int var1 = 0; var1 < this.field2623; ++var1) {
            this.field2663[var1] = -this.field2663[var1];
            this.field2668[var1] = -this.field2668[var1];
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(SS)V")
    public final void method888(short arg0, short arg1) {
        if (this.field2625 != null) {
            for (int var3 = 0; var3 < this.field2636; ++var3) {
                if (this.field2625[var3] == arg0) {
                    this.field2625[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "()V")
    private final void method889() {
        if (!this.field2632) {
            this.field2632 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field2623; ++var7) {
                int var8 = this.field2663[var7];
                int var9 = this.field2661[var7];
                int var10 = this.field2668[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field2641 = (short) var1;
            this.field2633 = (short) var4;
            super.field758 = (short) var2;
            this.field2626 = (short) var5;
            this.field2642 = (short) var3;
            this.field2628 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(SS)V")
    public final void method890(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2636; ++var3) {
            if (this.field2657[var3] == arg0) {
                this.field2657[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([B)V")
    private final void method891(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class121 var4 = new class121(arg0);
        class121 var5 = new class121(arg0);
        class121 var6 = new class121(arg0);
        class121 var7 = new class121(arg0);
        class121 var8 = new class121(arg0);
        var4.field2222 = arg0.length - 18;
        int var9 = var4.method755((byte) -24);
        int var10 = var4.method755((byte) -127);
        int var11 = var4.method751((byte) -117);
        int var12 = var4.method751((byte) 85);
        int var13 = var4.method751((byte) -86);
        int var14 = var4.method751((byte) 121);
        int var15 = var4.method751((byte) 88);
        int var16 = var4.method751((byte) 121);
        int var17 = var4.method755((byte) -99);
        int var18 = var4.method755((byte) -35);
        int var19 = var4.method755((byte) -88);
        int var20 = var4.method755((byte) -76);
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
        this.field2623 = var9;
        this.field2636 = var10;
        this.field2627 = var11;
        this.field2663 = new int[var9];
        this.field2661 = new int[var9];
        this.field2668 = new int[var9];
        this.field2656 = new int[var10];
        this.field2660 = new int[var10];
        this.field2666 = new int[var10];
        if (var11 > 0) {
            this.field2647 = new byte[var11];
            this.field2655 = new short[var11];
            this.field2631 = new short[var11];
            this.field2664 = new short[var11];
        }
        if (var16 == 1) {
            this.field2652 = new int[var9];
        }
        if (var12 == 1) {
            this.field2643 = new byte[var10];
            this.field2665 = new byte[var10];
            this.field2625 = new short[var10];
        }
        if (var13 == 255) {
            this.field2653 = new byte[var10];
        } else {
            this.field2646 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2630 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2667 = new int[var10];
        }
        this.field2657 = new short[var10];
        var4.field2222 = var21;
        var5.field2222 = var36;
        var6.field2222 = var38;
        var7.field2222 = var40;
        var8.field2222 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method751((byte) -46);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method771((byte) 83);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method771((byte) -116);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method771((byte) 64);
            }
            this.field2663[var46] = var43 + var63;
            this.field2661[var46] = var44 + var64;
            this.field2668[var46] = var45 + var65;
            var43 = this.field2663[var46];
            var44 = this.field2661[var46];
            var45 = this.field2668[var46];
            if (var16 == 1) {
                this.field2652[var46] = var8.method751((byte) 105);
            }
        }
        var4.field2222 = var32;
        var5.field2222 = var28;
        var6.field2222 = var26;
        var7.field2222 = var30;
        var8.field2222 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2657[var47] = (short) var4.method755((byte) -28);
            if (var12 == 1) {
                int var61 = var5.method751((byte) -83);
                if ((var61 & 1) == 1) {
                    this.field2643[var47] = 1;
                    var2 = true;
                } else {
                    this.field2643[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2665[var47] = (byte) (var61 >> 2);
                    this.field2625[var47] = this.field2657[var47];
                    this.field2657[var47] = 127;
                    if (this.field2625[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2665[var47] = -1;
                    this.field2625[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2653[var47] = var6.method767(-80);
            }
            if (var14 == 1) {
                this.field2630[var47] = var7.method767(-128);
            }
            if (var15 == 1) {
                this.field2667[var47] = var8.method751((byte) -127);
            }
        }
        var4.field2222 = var25;
        var5.field2222 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method751((byte) 107);
            if (var57 == 1) {
                var48 = var4.method771((byte) 100) + var51;
                var49 = var4.method771((byte) -124) + var48;
                var50 = var4.method771((byte) 89) + var49;
                var51 = var50;
                this.field2656[var52] = var48;
                this.field2660[var52] = var49;
                this.field2666[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method771((byte) -84) + var51;
                var51 = var50;
                this.field2656[var52] = var48;
                this.field2660[var52] = var49;
                this.field2666[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method771((byte) -58) + var51;
                var51 = var50;
                this.field2656[var52] = var48;
                this.field2660[var52] = var49;
                this.field2666[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method771((byte) -83) + var51;
                var51 = var50;
                this.field2656[var52] = var48;
                this.field2660[var52] = var60;
                this.field2666[var52] = var50;
            }
        }
        var4.field2222 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2647[var53] = 0;
            this.field2655[var53] = (short) var4.method755((byte) -27);
            this.field2631[var53] = (short) var4.method755((byte) -67);
            this.field2664[var53] = (short) var4.method755((byte) -56);
        }
        if (this.field2665 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2665[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2655[var56] & 65535) == this.field2656[var55] && (this.field2631[var56] & 65535) == this.field2660[var55] && (this.field2664[var56] & 65535) == this.field2666[var55]) {
                        this.field2665[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2665 = null;
            }
        }
        if (!var3) {
            this.field2625 = null;
        }
        if (!var2) {
            this.field2643 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lob;I)I")
    private final int method892(class141 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2663[arg1];
        int var5 = arg0.field2661[arg1];
        int var6 = arg0.field2668[arg1];
        for (int var7 = 0; var7 < this.field2623; ++var7) {
            if (this.field2663[var7] == var4 && this.field2661[var7] == var5 && this.field2668[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2663[this.field2623] = var4;
            this.field2661[this.field2623] = var5;
            this.field2668[this.field2623] = var6;
            if (arg0.field2652 != null) {
                this.field2652[this.field2623] = arg0.field2652[arg1];
            }
            var3 = this.field2623++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "()V")
    public final void method893() {
        for (int var1 = 0; var1 < this.field2636; ++var1) {
            int var2 = this.field2656[var1];
            this.field2656[var1] = this.field2666[var1];
            this.field2666[var1] = var2;
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)V")
    public final void method894(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2623; ++var4) {
            this.field2663[var4] += arg0;
            this.field2661[var4] += arg1;
            this.field2668[var4] += arg2;
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([B)V")
    private final void method895(byte[] arg0) {
        class121 var2 = new class121(arg0);
        class121 var3 = new class121(arg0);
        class121 var4 = new class121(arg0);
        class121 var5 = new class121(arg0);
        class121 var6 = new class121(arg0);
        class121 var7 = new class121(arg0);
        class121 var8 = new class121(arg0);
        var2.field2222 = arg0.length - 23;
        int var9 = var2.method755((byte) -60);
        int var10 = var2.method755((byte) -84);
        int var11 = var2.method751((byte) 86);
        int var12 = var2.method751((byte) -88);
        int var13 = var2.method751((byte) -128);
        int var14 = var2.method751((byte) -78);
        int var15 = var2.method751((byte) -67);
        int var16 = var2.method751((byte) 100);
        int var17 = var2.method751((byte) 84);
        int var18 = var2.method755((byte) -66);
        int var19 = var2.method755((byte) -89);
        int var20 = var2.method755((byte) -41);
        int var21 = var2.method755((byte) -87);
        int var22 = var2.method755((byte) -35);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2647 = new byte[var11];
            var2.field2222 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2647[var26] = var2.method767(-84);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2623 = var9;
        this.field2636 = var10;
        this.field2627 = var11;
        this.field2663 = new int[var9];
        this.field2661 = new int[var9];
        this.field2668 = new int[var9];
        this.field2656 = new int[var10];
        this.field2660 = new int[var10];
        this.field2666 = new int[var10];
        if (var17 == 1) {
            this.field2652 = new int[var9];
        }
        if (var12 == 1) {
            this.field2643 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2653 = new byte[var10];
        } else {
            this.field2646 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2630 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2667 = new int[var10];
        }
        if (var16 == 1) {
            this.field2625 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2665 = new byte[var10];
        }
        this.field2657 = new short[var10];
        if (var11 > 0) {
            this.field2655 = new short[var11];
            this.field2631 = new short[var11];
            this.field2664 = new short[var11];
            if (var24 > 0) {
                this.field2659 = new short[var24];
                this.field2649 = new short[var24];
                this.field2635 = new short[var24];
                this.field2644 = new byte[var24];
                this.field2650 = new byte[var24];
                this.field2624 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2637 = new byte[var25];
                this.field2648 = new byte[var25];
            }
        }
        var2.field2222 = var11;
        var3.field2222 = var44;
        var4.field2222 = var46;
        var5.field2222 = var48;
        var6.field2222 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method751((byte) -60);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method771((byte) -89);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method771((byte) 59);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method771((byte) -59);
            }
            this.field2663[var67] = var64 + var82;
            this.field2661[var67] = var65 + var83;
            this.field2668[var67] = var66 + var84;
            var64 = this.field2663[var67];
            var65 = this.field2661[var67];
            var66 = this.field2668[var67];
            if (var17 == 1) {
                this.field2652[var67] = var6.method751((byte) -100);
            }
        }
        var2.field2222 = var42;
        var3.field2222 = var31;
        var4.field2222 = var34;
        var5.field2222 = var37;
        var6.field2222 = var35;
        var7.field2222 = var40;
        var8.field2222 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2657[var68] = (short) var2.method755((byte) -53);
            if (var12 == 1) {
                this.field2643[var68] = var3.method767(-96);
            }
            if (var13 == 255) {
                this.field2653[var68] = var4.method767(-84);
            }
            if (var14 == 1) {
                this.field2630[var68] = var5.method767(-112);
            }
            if (var15 == 1) {
                this.field2667[var68] = var6.method751((byte) 108);
            }
            if (var16 == 1) {
                this.field2625[var68] = (short) (var7.method755((byte) -71) - 1);
            }
            if (this.field2665 != null) {
                if (this.field2625[var68] != -1) {
                    this.field2665[var68] = (byte) (var8.method751((byte) 95) - 1);
                } else {
                    this.field2665[var68] = -1;
                }
            }
        }
        var2.field2222 = var33;
        var3.field2222 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method751((byte) 113);
            if (var77 == 1) {
                var69 = var2.method771((byte) -104) + var72;
                var70 = var2.method771((byte) -68) + var69;
                var71 = var2.method771((byte) 114) + var70;
                var72 = var71;
                this.field2656[var73] = var69;
                this.field2660[var73] = var70;
                this.field2666[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method771((byte) -75) + var72;
                var72 = var71;
                this.field2656[var73] = var69;
                this.field2660[var73] = var70;
                this.field2666[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method771((byte) 73) + var72;
                var72 = var71;
                this.field2656[var73] = var69;
                this.field2660[var73] = var70;
                this.field2666[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method771((byte) 67) + var72;
                var72 = var71;
                this.field2656[var73] = var69;
                this.field2660[var73] = var80;
                this.field2666[var73] = var71;
            }
        }
        var2.field2222 = var50;
        var3.field2222 = var52;
        var4.field2222 = var54;
        var5.field2222 = var56;
        var6.field2222 = var58;
        var7.field2222 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2647[var74] & 255;
            if (var76 == 0) {
                this.field2655[var74] = (short) var2.method755((byte) -113);
                this.field2631[var74] = (short) var2.method755((byte) -29);
                this.field2664[var74] = (short) var2.method755((byte) -37);
            }
            if (var76 == 1) {
                this.field2655[var74] = (short) var3.method755((byte) -93);
                this.field2631[var74] = (short) var3.method755((byte) -118);
                this.field2664[var74] = (short) var3.method755((byte) -28);
                this.field2659[var74] = (short) var4.method755((byte) -95);
                this.field2649[var74] = (short) var4.method755((byte) -117);
                this.field2635[var74] = (short) var4.method755((byte) -34);
                this.field2644[var74] = var5.method767(-104);
                this.field2650[var74] = var6.method767(-109);
                this.field2624[var74] = var7.method767(-116);
            }
            if (var76 == 2) {
                this.field2655[var74] = (short) var3.method755((byte) -44);
                this.field2631[var74] = (short) var3.method755((byte) -66);
                this.field2664[var74] = (short) var3.method755((byte) -59);
                this.field2659[var74] = (short) var4.method755((byte) -99);
                this.field2649[var74] = (short) var4.method755((byte) -53);
                this.field2635[var74] = (short) var4.method755((byte) -84);
                this.field2644[var74] = var5.method767(-99);
                this.field2650[var74] = var6.method767(-99);
                this.field2624[var74] = var7.method767(-102);
                this.field2637[var74] = var7.method767(-108);
                this.field2648[var74] = var7.method767(-116);
            }
            if (var76 == 3) {
                this.field2655[var74] = (short) var3.method755((byte) -60);
                this.field2631[var74] = (short) var3.method755((byte) -31);
                this.field2664[var74] = (short) var3.method755((byte) -41);
                this.field2659[var74] = (short) var4.method755((byte) -39);
                this.field2649[var74] = (short) var4.method755((byte) -82);
                this.field2635[var74] = (short) var4.method755((byte) -72);
                this.field2644[var74] = var5.method767(-77);
                this.field2650[var74] = var6.method767(-121);
                this.field2624[var74] = var7.method767(-117);
            }
        }
        var2.field2222 = var62;
        int var75 = var2.method751((byte) -105);
        if (var75 != 0) {
            new class34();
            var2.method755((byte) -74);
            var2.method755((byte) -105);
            var2.method755((byte) -39);
            var2.method776(-109);
        }
    }

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "()V")
    public static void method896() {
        field2662 = null;
        field2654 = null;
        field2669 = null;
        field2651 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIZZ)Lvf;")
    public final class213 method897(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class102(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "()V")
    public final void method898() {
        for (int var1 = 0; var1 < this.field2623; ++var1) {
            int var2 = this.field2663[var1];
            this.field2663[var1] = this.field2668[var1];
            this.field2668[var1] = -var2;
        }
        this.method878();
    }

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "()Lob;")
    public final class141 method899() {
        class141 var1 = new class141();
        if (this.field2643 != null) {
            var1.field2643 = new byte[this.field2636];
            for (int var2 = 0; var2 < this.field2636; ++var2) {
                var1.field2643[var2] = this.field2643[var2];
            }
        }
        var1.field2623 = this.field2623;
        var1.field2636 = this.field2636;
        var1.field2627 = this.field2627;
        var1.field2663 = this.field2663;
        var1.field2661 = this.field2661;
        var1.field2668 = this.field2668;
        var1.field2656 = this.field2656;
        var1.field2660 = this.field2660;
        var1.field2666 = this.field2666;
        var1.field2653 = this.field2653;
        var1.field2630 = this.field2630;
        var1.field2665 = this.field2665;
        var1.field2657 = this.field2657;
        var1.field2625 = this.field2625;
        var1.field2646 = this.field2646;
        var1.field2647 = this.field2647;
        var1.field2655 = this.field2655;
        var1.field2631 = this.field2631;
        var1.field2664 = this.field2664;
        var1.field2659 = this.field2659;
        var1.field2649 = this.field2649;
        var1.field2635 = this.field2635;
        var1.field2644 = this.field2644;
        var1.field2650 = this.field2650;
        var1.field2624 = this.field2624;
        var1.field2637 = this.field2637;
        var1.field2648 = this.field2648;
        var1.field2652 = this.field2652;
        var1.field2667 = this.field2667;
        var1.field2622 = this.field2622;
        var1.field2639 = this.field2639;
        var1.field2634 = this.field2634;
        var1.field2645 = this.field2645;
        var1.field2638 = this.field2638;
        var1.field2658 = this.field2658;
        return var1;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    private class141() {
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbc;II)Lob;")
    public static final class141 method900(class14 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method142(arg1, arg2, (byte) 2);
        return var3 == null ? null : new class141(var3);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
    private class141(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method895(arg0);
        } else {
            this.method891(arg0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([Lob;I)V")
    public class141(class141[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2623 = 0;
        this.field2636 = 0;
        this.field2627 = 0;
        this.field2646 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class141 var15 = arg0[var9];
            if (var15 != null) {
                this.field2623 += var15.field2623;
                this.field2636 += var15.field2636;
                this.field2627 += var15.field2627;
                if (var15.field2653 != null) {
                    var4 = true;
                } else {
                    if (this.field2646 == -1) {
                        this.field2646 = var15.field2646;
                    }
                    if (this.field2646 != var15.field2646) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2643 != null;
                var5 |= var15.field2630 != null;
                var6 |= var15.field2667 != null;
                var7 |= var15.field2625 != null;
                var8 |= var15.field2665 != null;
            }
        }
        this.field2663 = new int[this.field2623];
        this.field2661 = new int[this.field2623];
        this.field2668 = new int[this.field2623];
        this.field2652 = new int[this.field2623];
        this.field2656 = new int[this.field2636];
        this.field2660 = new int[this.field2636];
        this.field2666 = new int[this.field2636];
        if (var3) {
            this.field2643 = new byte[this.field2636];
        }
        if (var4) {
            this.field2653 = new byte[this.field2636];
        }
        if (var5) {
            this.field2630 = new byte[this.field2636];
        }
        if (var6) {
            this.field2667 = new int[this.field2636];
        }
        if (var7) {
            this.field2625 = new short[this.field2636];
        }
        if (var8) {
            this.field2665 = new byte[this.field2636];
        }
        this.field2657 = new short[this.field2636];
        if (this.field2627 > 0) {
            this.field2647 = new byte[this.field2627];
            this.field2655 = new short[this.field2627];
            this.field2631 = new short[this.field2627];
            this.field2664 = new short[this.field2627];
            this.field2659 = new short[this.field2627];
            this.field2649 = new short[this.field2627];
            this.field2635 = new short[this.field2627];
            this.field2644 = new byte[this.field2627];
            this.field2650 = new byte[this.field2627];
            this.field2624 = new byte[this.field2627];
            this.field2637 = new byte[this.field2627];
            this.field2648 = new byte[this.field2627];
        }
        this.field2623 = 0;
        this.field2636 = 0;
        this.field2627 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class141 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2636; ++var12) {
                    if (var3 && var11.field2643 != null) {
                        this.field2643[this.field2636] = var11.field2643[var12];
                    }
                    if (var4) {
                        if (var11.field2653 != null) {
                            this.field2653[this.field2636] = var11.field2653[var12];
                        } else {
                            this.field2653[this.field2636] = var11.field2646;
                        }
                    }
                    if (var5 && var11.field2630 != null) {
                        this.field2630[this.field2636] = var11.field2630[var12];
                    }
                    if (var6 && var11.field2667 != null) {
                        this.field2667[this.field2636] = var11.field2667[var12];
                    }
                    if (var7) {
                        if (var11.field2625 != null) {
                            this.field2625[this.field2636] = var11.field2625[var12];
                        } else {
                            this.field2625[this.field2636] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2665 != null && var11.field2665[var12] != -1) {
                            this.field2665[this.field2636] = (byte) (var11.field2665[var12] + this.field2627);
                        } else {
                            this.field2665[this.field2636] = -1;
                        }
                    }
                    this.field2657[this.field2636] = var11.field2657[var12];
                    this.field2656[this.field2636] = this.method892(var11, var11.field2656[var12]);
                    this.field2660[this.field2636] = this.method892(var11, var11.field2660[var12]);
                    this.field2666[this.field2636] = this.method892(var11, var11.field2666[var12]);
                    ++this.field2636;
                }
                for (int var13 = 0; var13 < var11.field2627; ++var13) {
                    byte var14 = this.field2647[this.field2627] = var11.field2647[var13];
                    if (var14 == 0) {
                        this.field2655[this.field2627] = (short) this.method892(var11, var11.field2655[var13]);
                        this.field2631[this.field2627] = (short) this.method892(var11, var11.field2631[var13]);
                        this.field2664[this.field2627] = (short) this.method892(var11, var11.field2664[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2655[this.field2627] = var11.field2655[var13];
                        this.field2631[this.field2627] = var11.field2631[var13];
                        this.field2664[this.field2627] = var11.field2664[var13];
                        this.field2659[this.field2627] = var11.field2659[var13];
                        this.field2649[this.field2627] = var11.field2649[var13];
                        this.field2635[this.field2627] = var11.field2635[var13];
                        this.field2644[this.field2627] = var11.field2644[var13];
                        this.field2650[this.field2627] = var11.field2650[var13];
                        this.field2624[this.field2627] = var11.field2624[var13];
                    }
                    if (var14 == 2) {
                        this.field2637[this.field2627] = var11.field2637[var13];
                        this.field2648[this.field2627] = var11.field2648[var13];
                    }
                    ++this.field2627;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lob;ZZZZ)V")
    public class141(class141 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2623 = arg0.field2623;
        this.field2636 = arg0.field2636;
        this.field2627 = arg0.field2627;
        if (arg1) {
            this.field2663 = arg0.field2663;
            this.field2661 = arg0.field2661;
            this.field2668 = arg0.field2668;
        } else {
            this.field2663 = new int[this.field2623];
            this.field2661 = new int[this.field2623];
            this.field2668 = new int[this.field2623];
            for (int var6 = 0; var6 < this.field2623; ++var6) {
                this.field2663[var6] = arg0.field2663[var6];
                this.field2661[var6] = arg0.field2661[var6];
                this.field2668[var6] = arg0.field2668[var6];
            }
        }
        if (arg2) {
            this.field2657 = arg0.field2657;
        } else {
            this.field2657 = new short[this.field2636];
            for (int var7 = 0; var7 < this.field2636; ++var7) {
                this.field2657[var7] = arg0.field2657[var7];
            }
        }
        if (!arg3 && arg0.field2625 != null) {
            this.field2625 = new short[this.field2636];
            for (int var8 = 0; var8 < this.field2636; ++var8) {
                this.field2625[var8] = arg0.field2625[var8];
            }
        } else {
            this.field2625 = arg0.field2625;
        }
        if (arg4) {
            this.field2630 = arg0.field2630;
        } else {
            this.field2630 = new byte[this.field2636];
            if (arg0.field2630 == null) {
                for (int var9 = 0; var9 < this.field2636; ++var9) {
                    this.field2630[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2636; ++var10) {
                    this.field2630[var10] = arg0.field2630[var10];
                }
            }
        }
        this.field2656 = arg0.field2656;
        this.field2660 = arg0.field2660;
        this.field2666 = arg0.field2666;
        this.field2643 = arg0.field2643;
        this.field2653 = arg0.field2653;
        this.field2665 = arg0.field2665;
        this.field2646 = arg0.field2646;
        this.field2647 = arg0.field2647;
        this.field2655 = arg0.field2655;
        this.field2631 = arg0.field2631;
        this.field2664 = arg0.field2664;
        this.field2659 = arg0.field2659;
        this.field2649 = arg0.field2649;
        this.field2635 = arg0.field2635;
        this.field2644 = arg0.field2644;
        this.field2650 = arg0.field2650;
        this.field2624 = arg0.field2624;
        this.field2637 = arg0.field2637;
        this.field2648 = arg0.field2648;
        this.field2652 = arg0.field2652;
        this.field2667 = arg0.field2667;
        this.field2622 = arg0.field2622;
        this.field2639 = arg0.field2639;
        this.field2634 = arg0.field2634;
        this.field2645 = arg0.field2645;
        this.field2629 = arg0.field2629;
        this.field2638 = arg0.field2638;
        this.field2658 = arg0.field2658;
    }
}
