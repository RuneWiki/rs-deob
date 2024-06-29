import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class139 extends class59 {

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    private int field2702 = 409;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    private int field2710 = 8;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    private int field2715 = 0;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    private int field2701 = 1024;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    private int field2699 = 4;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
    private int field2718 = 81;

    @OriginalMember(owner = "client!pd", name = "xb", descriptor = "I")
    private int field2726 = 1024;

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "I")
    private int field2720 = 204;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "J")
    public static long field2696 = 0L;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Lsd;")
    private static class166 field2695 = class135.method935("M", 0);

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "Lsd;")
    public static class166 field2697 = field2695;

    @OriginalMember(owner = "client!pd", name = "wb", descriptor = "I")
    public static int field2725 = 0;

    @OriginalMember(owner = "client!pd", name = "vb", descriptor = "Lsd;")
    public static class166 field2724 = class135.method935(" ", 0);

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "Lsd;")
    public static class166 field2717 = field2695;

    @OriginalMember(owner = "client!pd", name = "yb", descriptor = "J")
    public static long field2727 = 0L;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!pd", name = "tb", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Z")
    public static boolean field2713;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "[I")
    public static int[] field2698;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "[I")
    private int[] field2712;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "[[I")
    private int[][] field2703;

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "[[I")
    private int[][] field2721;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        this.method949((byte) 123);
        ++field2722;
        if (arg0 != 23459) {
            field2697 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
    private final void method949(byte arg0) {
        Random var2 = new Random((long) this.field2710);
        this.field2708 = 4096 / this.field2699;
        int var3 = this.field2708 / 2;
        ++field2723;
        this.field2709 = 4096 / this.field2710;
        this.field2721 = new int[this.field2710][this.field2699];
        int var4 = this.field2709 / 2;
        this.field2705 = this.field2718 / 2;
        this.field2712 = new int[this.field2710 + 1];
        int var5 = 41 % ((88 - arg0) / 33);
        this.field2712[0] = 0;
        this.field2703 = new int[this.field2710][this.field2699 - -1];
        for (int var6 = 0; this.field2710 > var6; ++var6) {
            if (var6 > 0) {
                int var7 = this.field2709;
                int var8 = (class12.method75(var2, (byte) -128, 4096) + -2048) * this.field2720 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field2712[var6] = this.field2712[var6 + -1] + var9;
            }
            this.field2703[var6][0] = 0;
            for (int var10 = 0; ~this.field2699 < ~var10; ++var10) {
                if (var10 > 0) {
                    int var11 = this.field2708;
                    int var12 = (-2048 + class12.method75(var2, (byte) -126, 4096)) * this.field2702 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field2703[var6][var10] = this.field2703[var6][var10 - 1] + var13;
                }
                this.field2721[var6][var10] = ~this.field2701 < -1 ? 4096 - class12.method75(var2, (byte) -126, this.field2701) : 4096;
            }
            this.field2703[var6][this.field2699] = 4096;
        }
        this.field2712[this.field2710] = 4096;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 >= -124) {
            return null;
        } else {
            int[] var3 = super.field1219.method721(arg0, -128);
            if (super.field1219.field1816) {
                int var4 = 0;
                int var5;
                for (var5 = class136.field2657[arg0] + this.field2715; var5 < 0; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (~var4 > ~this.field2710 && ~var5 <= ~this.field2712[var4]) {
                    ++var4;
                }
                float var6 = (float) this.field2712[var4];
                float var7 = (float) this.field2712[var4 - 1];
                if ((float) this.field2705 + var7 < (float) var5 && (float) (-this.field2705) + var6 > (float) var5) {
                    for (int var8 = 0; ~var8 > ~class98.field1879; ++var8) {
                        int var9 = 0;
                        int var10 = var4 % 2 != 0 ? -this.field2726 : this.field2726;
                        int var11;
                        for (var11 = (this.field2708 * var10 >> 12) + class187.field3569[var8]; var11 < 0; var11 += 4096) {
                        }
                        while (var11 > 4096) {
                            var11 -= 4096;
                        }
                        while (~this.field2699 < ~var9 && var11 >= this.field2703[var4 + -1][var9]) {
                            ++var9;
                        }
                        float var12 = (float) this.field2703[var4 + -1][var9];
                        float var13 = (float) this.field2703[var4 - 1][var9 + -1];
                        if ((float) var11 > (float) this.field2705 + var13 && (float) var11 < (float) (-this.field2705) + var12) {
                            var3[var8] = this.field2721[var4 + -1][var9 + -1];
                        } else {
                            var3[var8] = 0;
                        }
                    }
                } else {
                    class71.method568(var3, 0, class98.field1879, 0);
                }
            }
            ++field2700;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 <= 18) {
            method953(-49, -77, 19, 77, -127, -103);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field2701 = arg0.method405(2);
                                    }
                                } else {
                                    this.field2718 = arg0.method405(2);
                                }
                            } else {
                                this.field2715 = arg0.method405(2);
                            }
                        } else {
                            this.field2726 = arg0.method405(2);
                        }
                    } else {
                        this.field2720 = arg0.method405(2);
                    }
                } else {
                    this.field2702 = arg0.method405(2);
                }
            } else {
                this.field2710 = arg0.method400(255);
            }
        } else {
            this.field2699 = arg0.method400(255);
        }
        ++field2706;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static void method950(byte arg0) {
        if (arg0 != -40) {
            field2697 = null;
        }
        field2724 = null;
        field2698 = null;
        field2697 = null;
        field2717 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZZIBLcb;I)V")
    public static final void method951(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4, class22 arg5, int arg6) {
        ++field2719;
        long var7 = (long) ((arg0 << 16) + arg6);
        class89 var9 = (class89) class6.field124.method224(-1, var7);
        if (var9 == null) {
            class89 var10 = (class89) class178.field3370.method224(-1, var7);
            if (var10 == null) {
                if (arg1) {
                    class89 var11 = (class89) class89.field1748.method224(-1, var7);
                    if (var11 != null) {
                        if (arg2) {
                            var11.method116(256);
                            class6.field124.method216(var11, 12682, var7);
                            --class34.field629;
                            ++class184.field3518;
                        }
                    } else {
                        if (!arg2) {
                            class89 var12 = (class89) class45.field808.method224(-1, var7);
                            if (var12 != null) {
                                return;
                            }
                        }
                        class89 var13 = new class89();
                        var13.field1749 = arg5;
                        var13.field1745 = arg4;
                        var13.field1747 = arg3;
                        if (arg2) {
                            class6.field124.method216(var13, 12682, var7);
                            ++class184.field3518;
                        } else {
                            class136.field2656.method780(var13, 9571);
                            class89.field1748.method216(var13, 12682, var7);
                            ++class34.field629;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)V")
    public static final void method952(int arg0, int arg1, int arg2) {
        ++field2707;
        if (class79.field1622 != 0 && arg0 != -1) {
            class79.method647(0, false, (byte) 35, class18.field303, arg0, class79.field1622);
            class49.field913 = true;
        }
        int var3 = 45 / ((arg2 - 48) / 56);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V")
    public static final void method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg3 - 32) * arg3 / arg1;
        ++field2716;
        class117.field2279[0].method731(arg2, arg4);
        if (~var6 > -9) {
            var6 = 8;
        }
        class117.field2279[1].method731(arg2, arg3 + arg4 + -16);
        int var7 = (-var6 + -32 + arg3) * arg5 / (arg1 - arg3);
        if (arg0 != -26151) {
            method952(-29, -21, -47);
        }
        class17.method91(arg2, arg4 + 16, 16, arg3 + -32, class157.field2999);
        class17.method91(arg2, var7 + 16 + arg4, 16, var6, class191.field3628);
        class17.method107(arg2, 16 - -var7 + arg4, var6, class119.field2335);
        class17.method107(arg2 + 1, arg4 + var7 + 16, var6, class119.field2335);
        class17.method106(arg2, arg4 + 16 - -var7, 16, class119.field2335);
        class17.method106(arg2, arg4 + 17 + var7, 16, class119.field2335);
        class17.method107(arg2 + 15, arg4 - -16 + var7, var6, class137.field2674);
        class17.method107(arg2 + 14, arg4 - -var7 + 17, var6 - 1, class137.field2674);
        class17.method106(arg2, arg4 + 15 + var6 + var7, 16, class137.field2674);
        class17.method106(arg2 + 1, arg4 - (-var6 + -14) + var7, 15, class137.field2674);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class139() {
        super(0, true);
    }
}
