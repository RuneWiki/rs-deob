import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class138 extends class105 {

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    private int field2694 = 4;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    private int field2695 = 4;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    private int field2699 = 0;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    private int field2703 = 4;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    private int field2708 = 1638;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "[I")
    private int[] field2711 = new int[512];

    @OriginalMember(owner = "client!pc", name = "wb", descriptor = "Z")
    private boolean field2718 = true;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "Lwf;")
    public static class204 field2710 = new class204(8);

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "Leh;")
    private static class47 field2713 = class195.method1282((byte) -4, "purple:");

    @OriginalMember(owner = "client!pc", name = "ub", descriptor = "Leh;")
    public static class47 field2716 = field2713;

    @OriginalMember(owner = "client!pc", name = "vb", descriptor = "Leh;")
    public static class47 field2717 = field2713;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Loc;")
    public static class129 field2697;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "Ldh;")
    public static class38 field2714;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "[I")
    private int[] field2698;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "[I")
    private int[] field2702;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public static void method1001(int arg0) {
        field2716 = null;
        field2713 = null;
        field2714 = null;
        field2697 = null;
        if (arg0 != 1) {
            field2716 = null;
        }
        field2710 = null;
        field2717 = null;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        if (arg0 == -1) {
            this.method1007(-1549);
            ++field2706;
            this.method1002(12291);
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
    private final void method1002(int arg0) {
        if (arg0 != 12291) {
            this.method1007(-51);
        }
        if (this.field2708 <= 0) {
            if (this.field2702 != null && this.field2702.length == this.field2694) {
                this.field2698 = new int[this.field2694];
                for (int var2 = 0; this.field2694 > var2; ++var2) {
                    this.field2698[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2698 = new int[this.field2694];
            this.field2702 = new int[this.field2694];
            for (int var3 = 0; ~var3 > ~this.field2694; ++var3) {
                this.field2702[var3] = (int) (Math.pow((double) (this.field2708 / 4096), (double) var3) * 4096.0D);
                this.field2698[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        ++field2705;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZZ)V")
    public static final void method1003(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field2696;
        if (arg1 >= 8000 && arg1 <= 48000) {
            if (arg3) {
                field2716 = null;
            }
            class47.field973 = arg0;
            class36.field697 = arg2;
            class110.field2276 = arg1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)I")
    public static final int method1004(int arg0) {
        if (arg0 != 28041) {
            field2710 = null;
        }
        ++field2709;
        return class154.field3024++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 < 78) {
            this.method17(115, (class68) null, -74);
        }
        int[] var3 = super.field2192.method336(-125, arg0);
        if (super.field2192.field770) {
            int var4 = this.field2695 << 12;
            int var5 = this.field2703 << 12;
            int var6 = class26.field500[arg0] * this.field2703;
            for (int var7 = 0; class149.field2928 > var7; ++var7) {
                int var8 = 0;
                int var9 = class167.field3237[var7] * this.field2695;
                for (int var10 = 0; ~var10 > ~this.field2694; ++var10) {
                    int var11 = this.field2698[var10];
                    int var12 = this.field2702[var10];
                    int var13 = this.method1005(var9 * var11 >> 12, var6 * var11 >> 12, var4 * var11 >> 12, 255, var5 * var11 >> 12);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field2718) {
                    var8 = 2048 - -(var8 >> 1);
                }
                var3[var7] = var8;
            }
        }
        ++field2701;
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)I")
    private final int method1005(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0 & -4096;
        int var7 = arg0 - var6;
        ++field2712;
        int var8 = -4096 & arg4;
        int var9 = -4096 & arg1;
        int var10 = -4096 & arg2;
        int var11 = arg1 - var9;
        int var12 = var9 >> 12;
        int var13 = var6 >> 12;
        int var14 = var13 + 1;
        int var15 = var12 + 1;
        int var16 = var12 & 255;
        if (~var14 <= ~(var10 >> 12)) {
            var14 = 0;
        }
        int var17 = var13 & arg3;
        int var18 = this.field2711[this.field2711[var16] + var17] % 4;
        if (var15 >= var8 >> 12) {
            var15 = 0;
        }
        int var19 = var14 & 255;
        int var20 = var15 & 255;
        int var21 = this.field2711[this.field2711[var20] + var19] % 4;
        int var22 = this.field2711[this.field2711[var20] + var17] % 4;
        int var23 = this.field2711[var19 - -this.field2711[var16]] % 4;
        int var24 = class135.method985(var7, class184.field3525[var18], 4096, var11);
        int var25 = class135.method985(var7 + -4096, class184.field3525[var23], 4096, var11);
        int var26 = class135.method985(var7, class184.field3525[var22], 4096, var11 + -4096);
        int var27 = class135.method985(var7 + -4096, class184.field3525[var21], 4096, var11 + -4096);
        int var28 = class185.method1231(var7, (byte) 75);
        int var29 = class185.method1231(var11, (byte) 33);
        int var30 = class131.method970(var25, var24, (byte) -109, var28);
        int var31 = class131.method970(var27, var26, (byte) -38, var28);
        return class131.method970(var31, var30, (byte) -73, var29);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILfh;II)V")
    public static final void method1006(int arg0, int arg1, class56 arg2, int arg3, int arg4) {
        int var5 = -96 % ((-64 - arg0) / 54);
        ++field2704;
        if (~class95.field1971 > -401) {
            if (arg2.field1074 != null) {
                arg2 = arg2.method485((byte) -76);
            }
            if (arg2 != null) {
                if (arg2.field1067) {
                    class47 var6 = arg2.field1101;
                    if (arg2.field1081 != 0) {
                        var6 = class5.method24(new class47[] { var6, class117.method919(class123.field2489.field605, arg2.field1081, -7), class131.field2588, class152.field2984, class167.method1133(arg2.field1081, (byte) 26), class188.field3652 }, (byte) 78);
                    }
                    if (class109.field2268 != 1) {
                        if (!class78.field1688) {
                            ++class161.field3122;
                            class47[] var7 = arg2.field1109;
                            if (class61.field1224) {
                                var7 = class193.method1269((byte) 31, var7);
                            }
                            if (var7 != null) {
                                for (int var8 = 4; ~var8 <= -1; --var8) {
                                    if (var7[var8] != null && !var7[var8].method411(false, class23.field446)) {
                                        ++class130.field2560;
                                        byte var9 = 0;
                                        if (~var8 == -1) {
                                            var9 = 9;
                                        }
                                        if (~var8 == -2) {
                                            var9 = 4;
                                        }
                                        if (~var8 == -3) {
                                            var9 = 11;
                                        }
                                        if (~var8 == -4) {
                                            var9 = 15;
                                        }
                                        if (var8 == 4) {
                                            var9 = 38;
                                        }
                                        class81.method686(var7[var8], arg4, arg3, class5.method24(new class47[] { class25.field489, var6 }, (byte) 99), (byte) 68, var9, (long) arg1);
                                    }
                                }
                            }
                            if (var7 != null) {
                                for (int var10 = 4; ~var10 <= -1; --var10) {
                                    if (var7[var10] != null && var7[var10].method411(false, class23.field446)) {
                                        ++class148.field2904;
                                        short var11 = 0;
                                        if (class123.field2489.field605 < arg2.field1081) {
                                            var11 = 2000;
                                        }
                                        short var12 = 0;
                                        if (var10 == 0) {
                                            var12 = 9;
                                        }
                                        if (~var10 == -2) {
                                            var12 = 4;
                                        }
                                        if (var10 == 2) {
                                            var12 = 11;
                                        }
                                        if (~var10 == -4) {
                                            var12 = 15;
                                        }
                                        if (~var10 == -5) {
                                            var12 = 38;
                                        }
                                        if (~var12 != -1) {
                                            var12 += var11;
                                        }
                                        class81.method686(var7[var10], arg4, arg3, class5.method24(new class47[] { class25.field489, var6 }, (byte) 106), (byte) -46, var12, (long) arg1);
                                    }
                                }
                            }
                            class81.method686(class126.field2530, arg4, arg3, class5.method24(new class47[] { class25.field489, var6 }, (byte) 88), (byte) -59, (short) 1005, (long) arg1);
                            return;
                        }
                        if (~(2 & class196.field3811) == -3) {
                            class81.method686(class35.field686, arg4, arg3, class5.method24(new class47[] { class117.field2371, class85.field1794, var6 }, (byte) 70), (byte) 106, (short) 41, (long) arg1);
                            ++class122.field2474;
                            return;
                        }
                    } else {
                        ++class70.field1540;
                        class81.method686(class98.field2082, arg4, arg3, class5.method24(new class47[] { class179.field3435, class85.field1794, var6 }, (byte) 93), (byte) 125, (short) 17, (long) arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field2707;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2703 = arg1.method604((byte) -126);
                                }
                            } else {
                                this.field2695 = arg1.method604((byte) 106);
                            }
                        } else {
                            this.field2699 = arg1.method604((byte) -42);
                        }
                    } else {
                        this.field2695 = this.field2703 = arg1.method604((byte) -123);
                    }
                } else {
                    this.field2708 = arg1.method601(25640);
                    if (~this.field2708 > -1) {
                        this.field2702 = new int[this.field2694];
                        for (int var5 = 0; ~this.field2694 < ~var5; ++var5) {
                            this.field2702[var5] = arg1.method601(25640);
                        }
                    }
                }
            } else {
                this.field2694 = arg1.method604((byte) 121);
            }
        } else {
            this.field2718 = arg1.method604((byte) -128) == 1;
        }
        if (arg2 != -256) {
            this.method1007(-66);
        }
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
    private final void method1007(int arg0) {
        Random var2 = new Random((long) this.field2699);
        if (arg0 == -1549) {
            for (int var3 = 0; ~var3 > -256; ++var3) {
                this.field2711[var3] = -1;
            }
            ++field2700;
            for (int var4 = 0; var4 < 255; ++var4) {
                int var5;
                do {
                    var5 = class51.method452(false, 255, var2);
                } while (~this.field2711[var5] != 0);
                this.field2711[var5 + 255] = this.field2711[var5] = var4;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class138() {
        super(0, true);
    }
}
