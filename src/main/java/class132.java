import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class132 extends class51 {

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    private int field2788 = 0;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    private int field2792 = 0;

    @OriginalMember(owner = "client!og", name = "tb", descriptor = "I")
    private int field2805 = 0;

    @OriginalMember(owner = "client!og", name = "ub", descriptor = "Lpg;")
    public static class141 field2806 = new class141();

    @OriginalMember(owner = "client!og", name = "xb", descriptor = "Lea;")
    public static class38 field2809 = class9.method46((byte) 102, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!og", name = "yb", descriptor = "[I")
    public static int[] field2810 = new int[500];

    @OriginalMember(owner = "client!og", name = "zb", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!og", name = "vb", descriptor = "Lda;")
    public static class29 field2807 = new class29(4096);

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    private int field2789;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
    private int field2795;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
    private int field2796;

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
    private int field2797;

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!og", name = "ob", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!og", name = "pb", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!og", name = "qb", descriptor = "I")
    private int field2802;

    @OriginalMember(owner = "client!og", name = "rb", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!og", name = "sb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!og", name = "wb", descriptor = "Lfd;")
    public static class50 field2808;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "Lgg;")
    public static class61 field2791;

    @OriginalMember(owner = "client!og", name = "Ab", descriptor = "[Lk;")
    public static class89[] field2812;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)Lac;")
    public static final class4 method967(byte arg0) {
        int var1 = 85 % ((33 - arg0) / 62);
        ++field2799;
        if (class9.field207 == null) {
            class9.field207 = new class4();
        }
        return class9.field207;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field2790;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (arg0 <= 111) {
            return null;
        } else {
            if (super.field1292.field2032) {
                int[][] var4 = this.method377(0, arg1, (byte) -111);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class86.field2008 < ~var11; ++var11) {
                    this.method974(var6[var11], var7[var11], (byte) 125, var5[var11]);
                    for (this.field2802 += this.field2805; this.field2802 < 0; this.field2802 += 4096) {
                    }
                    this.field2793 += this.field2792;
                    this.field2789 += this.field2788;
                    while (~this.field2802 < -4097) {
                        this.field2802 -= 4096;
                    }
                    if (~this.field2793 > -1) {
                        this.field2793 = 0;
                    }
                    if (~this.field2793 < -4097) {
                        this.field2793 = 4096;
                    }
                    if (~this.field2789 > -1) {
                        this.field2789 = 0;
                    }
                    if (this.field2789 > 4096) {
                        this.field2789 = 4096;
                    }
                    this.method968(this.field2793, this.field2789, this.field2802, -8729);
                    var8[var11] = this.field2796;
                    var9[var11] = this.field2797;
                    var10[var11] = this.field2795;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IIII)V")
    private final void method968(int arg0, int arg1, int arg2, int arg3) {
        ++field2803;
        int var5 = arg0 > 2048 ? arg0 + arg1 + -(arg0 * arg1 >> 12) : (arg1 + 4096) * arg0 >> 12;
        if (arg3 != -8729) {
            field2810 = null;
        }
        if (~var5 >= -1) {
            this.field2796 = this.field2797 = this.field2795 = arg0;
        } else {
            int var6 = arg2 * 6;
            int var7 = arg0 - (-arg0 - -var5);
            int var8 = var6 >> 12;
            int var9 = (var5 - var7 << 12) / var5;
            int var10 = -(var8 << 12) + var6;
            int var12 = var9 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var8 != -1) {
                if (var8 != 1) {
                    if (var8 != 2) {
                        if (var8 != 3) {
                            if (var8 != 4) {
                                if (var8 == 5) {
                                    this.field2796 = var5;
                                    this.field2797 = var7;
                                    this.field2795 = var15;
                                }
                            } else {
                                this.field2795 = var5;
                                this.field2796 = var14;
                                this.field2797 = var7;
                            }
                        } else {
                            this.field2796 = var7;
                            this.field2797 = var15;
                            this.field2795 = var5;
                        }
                    } else {
                        this.field2795 = var14;
                        this.field2797 = var5;
                        this.field2796 = var7;
                    }
                } else {
                    this.field2795 = var7;
                    this.field2796 = var15;
                    this.field2797 = var5;
                }
            } else {
                this.field2795 = var7;
                this.field2797 = var14;
                this.field2796 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JB)V")
    public static final void method969(long arg0, byte arg1) {
        ++field2801;
        if (~arg0 < -1L) {
            if (arg1 == 58) {
                if (arg0 % 10L == 0L) {
                    class119.method914(arg0 + -1L, 256);
                    class119.method914(1L, arg1 ^ 314);
                } else {
                    class119.method914(arg0, 256);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field2805 = -8;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2792 = (arg0.method513((byte) 96) << 12) / 100;
                }
            } else {
                this.field2788 = (arg0.method513((byte) 92) << 12) / 100;
            }
        } else {
            this.field2805 = arg0.method462((byte) 121);
        }
        ++field2786;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLm;Lm;)V")
    public static final void method970(byte arg0, class107 arg1, class107 arg2) {
        if (class5.field151 == null) {
            class5.field151 = class87.method724(112, class163.field3395, class187.field3723, class146.field3049);
        }
        if (class94.field2126 == null) {
            class94.field2126 = class117.method904(class146.field3049, class187.field3723, 999999999, class181.field3652);
        }
        if (class123.field2624 == null) {
            class123.field2624 = class117.method904(class146.field3049, class187.field3723, 999999999, class118.field2572);
        }
        ++field2794;
        if (class145.field3029 == null) {
            class145.field3029 = class117.method904(class146.field3049, class187.field3723, 999999999, class58.field1450);
        }
        class71.method558(0, 23, 765, 480, 0);
        class71.method563(0, 0, 125, 23, 12425273, 9135624);
        class71.method563(125, 0, 640, 23, 5197647, 2697513);
        arg1.method645(class90.field2061, 62, 15, 0, -1);
        if (class145.field3029 != null) {
            class145.field3029[1].method335(140, 1);
            arg2.method646(class146.field3051, 152, 10, 16777215, -1);
            class145.field3029[0].method335(140, 12);
            arg2.method646(class202.field3988, 152, 21, 16777215, -1);
        }
        if (class123.field2624 != null) {
            short var3 = 280;
            short var4 = 390;
            if (~class200.field3939[0] == -1 && ~class74.field1813[0] == -1) {
                class123.field2624[2].method335(var3, 4);
            } else {
                class123.field2624[0].method335(var3, 4);
            }
            if (class200.field3939[0] == 0 && class74.field1813[0] == 1) {
                class123.field2624[3].method335(var3 - -15, 4);
            } else {
                class123.field2624[1].method335(var3 - -15, 4);
            }
            arg1.method646(class14.field297, var3 + 32, 17, 16777215, -1);
            short var5 = 610;
            short var6 = 500;
            if (class200.field3939[0] == 1 && class74.field1813[0] == 0) {
                class123.field2624[2].method335(var4, 4);
            } else {
                class123.field2624[0].method335(var4, 4);
            }
            if (~class200.field3939[0] == -2 && ~class74.field1813[0] == -2) {
                class123.field2624[3].method335(var4 + 15, 4);
            } else {
                class123.field2624[1].method335(var4 - -15, 4);
            }
            arg1.method646(class168.field3450, var4 + 32, 17, 16777215, -1);
            if (~class200.field3939[0] == -3 && ~class74.field1813[0] == -1) {
                class123.field2624[2].method335(var6, 4);
            } else {
                class123.field2624[0].method335(var6, 4);
            }
            if (class200.field3939[0] == 2 && class74.field1813[0] == 1) {
                class123.field2624[3].method335(var6 + 15, 4);
            } else {
                class123.field2624[1].method335(var6 + 15, 4);
            }
            arg1.method646(class151.field3119, var6 - -32, 17, 16777215, -1);
            if (class200.field3939[0] == 3 && class74.field1813[0] == 0) {
                class123.field2624[2].method335(var5, 4);
            } else {
                class123.field2624[0].method335(var5, 4);
            }
            if (~class200.field3939[0] == -4 && class74.field1813[0] == 1) {
                class123.field2624[3].method335(var5 + 15, 4);
            } else {
                class123.field2624[1].method335(var5 + 15, 4);
            }
            arg1.method646(class12.field256, var5 - -32, 17, 16777215, -1);
        }
        class71.method558(708, 4, 50, 16, 0);
        arg2.method645(class148.field3070, 733, 16, 16777215, -1);
        class109.field2449 = -1;
        if (class5.field151 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 765 / (var7 + 1);
            int var10 = 480 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if (~((var9 + -1) * var10) <= ~class114.field2536) {
                    --var9;
                }
                if ((var10 + -1) * var9 >= class114.field2536) {
                    --var10;
                }
                if (~class114.field2536 >= ~((var10 + -1) * var9)) {
                    --var10;
                }
            } while (~var10 != ~var11 || var9 != var12);
            int var13 = (-(var7 * var9) + 765) / (var9 - -1);
            if (~var13 < -6) {
                var13 = 5;
            }
            int var14 = (-(var8 * var10) + 480) / (var10 + 1);
            if (~var14 < -6) {
                var14 = 5;
            }
            int var15 = (480 - (var10 + -1) * var14 + -(var8 * var10)) / 2;
            int var16 = var15 + 23;
            int var17 = (765 - var7 * var9 + -((var9 + -1) * var13)) / 2;
            int var18 = var17;
            int var19 = 0;
            for (int var20 = 0; var20 < class114.field2536; ++var20) {
                class137 var21 = class48.field1161[var20];
                class38 var22 = class151.method1059(var21.field2878, (byte) -114);
                boolean var23 = true;
                if (~var21.field2878 == 0) {
                    var23 = false;
                    var22 = class66.field1571;
                } else if (~var21.field2878 < -1981) {
                    var22 = class203.field3997;
                    var23 = false;
                }
                if (~var18 >= ~class176.field3568 && ~class10.field222 <= ~var16 && var7 + var18 > class176.field3568 && ~class10.field222 > ~(var8 + var16) && var23) {
                    class109.field2449 = var20;
                    class5.field151[var21.field2867 ? 1 : 0].method739(var18, var16, 128, 16777215);
                } else {
                    class5.field151[var21.field2867 ? 1 : 0].method754(var18, var16);
                }
                if (class94.field2126 != null) {
                    class94.field2126[var21.field2875 + (!var21.field2867 ? 0 : 8)].method335(var18 + 29, var16);
                }
                arg1.method645(class151.method1059(var21.field2874, (byte) -114), var18 + 15, var16 - -(var8 / 2) + 5, 0, -1);
                arg2.method645(var22, var18 + 60, var8 / 2 + var16 + 5, 268435455, -1);
                var16 += var8 + var14;
                ++var19;
                if (var19 >= var10) {
                    var16 = var15 + 23;
                    var18 += var13 - -var7;
                    var19 = 0;
                }
            }
        }
        int var24 = -3 / ((-6 - arg0) / 51);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ldd;ILdd;)I")
    public static final int method971(class32 arg0, int arg1, class32 arg2) {
        ++field2785;
        int var3 = 0;
        if (arg0.method214(class136.field2856, class187.field3723, -113)) {
            ++var3;
        }
        if (arg2.method214(class128.field2740, class187.field3723, -100)) {
            ++var3;
        }
        if (arg2.method214(class11.field247, class187.field3723, -104)) {
            ++var3;
        }
        if (arg2.method214(class125.field2696, class187.field3723, -98)) {
            ++var3;
        }
        int var4 = 94 % ((arg1 - -67) / 43);
        if (arg2.method214(class86.field1995, class187.field3723, -110)) {
            ++var3;
        }
        if (arg2.method214(class136.field2863, class187.field3723, -93)) {
            ++var3;
        }
        arg2.method214(class163.field3395, class187.field3723, -124);
        arg2.method214(class181.field3652, class187.field3723, -126);
        arg2.method214(class118.field2572, class187.field3723, -103);
        arg2.method214(class58.field1450, class187.field3723, -118);
        arg2.method214(class83.field1962, class187.field3723, -69);
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public static void method972(byte arg0) {
        field2806 = null;
        field2808 = null;
        if (arg0 != -86) {
            field2791 = null;
        }
        field2807 = null;
        field2812 = null;
        field2809 = null;
        field2791 = null;
        field2810 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Ldc;")
    public static final class31 method973(boolean arg0, int arg1) {
        ++field2804;
        class31 var2 = (class31) class40.field892.method1078((byte) 82, (long) arg1);
        if (!arg0) {
            return null;
        } else if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class188.field3754.method215(0, arg1, 1);
            if (var3 == null) {
                return null;
            } else {
                class31 var4 = new class31();
                class66 var5 = new class66(var3);
                var5.field1620 = var5.field1627.length - 12;
                int var6 = var5.method464(-64);
                int var7 = 0;
                var4.field611 = var5.method511(-127);
                var4.field613 = var5.method511(-16);
                var4.field620 = var5.method511(-128);
                var4.field615 = var5.method511(84);
                var5.field1620 = 0;
                var4.field617 = var5.method486(255);
                var4.field614 = new class38[var6];
                var4.field608 = new int[var6];
                var4.field612 = new int[var6];
                while (~(var5.field1627.length + -12) < ~var5.field1620) {
                    int var8 = var5.method511(24);
                    if (var8 == 3) {
                        var4.field614[var7] = var5.method475((byte) 85);
                    } else if (var8 < 100 && var8 != 21 && ~var8 != -39 && ~var8 != -40) {
                        var4.field608[var7] = var5.method464(-73);
                    } else {
                        var4.field608[var7] = var5.method509(123);
                    }
                    var4.field612[var7++] = var8;
                }
                class40.field892.method1076((long) arg1, -4, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIBI)V")
    private final void method974(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 116) {
            method972((byte) 15);
        }
        ++field2798;
        int var5 = ~arg0 <= ~arg3 ? arg0 : arg3;
        int var6 = arg1 > var5 ? arg1 : var5;
        int var7 = ~arg3 > ~arg0 ? arg3 : arg0;
        int var8 = var7 > arg1 ? arg1 : var7;
        this.field2793 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (var9 > 0) {
            if (~this.field2793 < -1 && ~this.field2793 > -4097) {
                this.field2789 = (var9 << 12) / (this.field2793 > 2048 ? -(this.field2793 * 2) + 8192 : this.field2793 * 2);
            }
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (arg3 == var6) {
                this.field2802 = arg0 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg0 == ~var6) {
                this.field2802 = arg1 == var8 ? var10 + 4096 : 12288 - var12;
            } else {
                this.field2802 = ~arg3 == ~var8 ? 12288 - -var11 : -var10 + 20480;
            }
            this.field2802 /= 6;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lc;Z)V")
    public static final void method975(class19 arg0, boolean arg1) {
        if (!arg1) {
            method967((byte) 75);
        }
        arg0.field405 = 0;
        int var2 = -class45.field1098 + arg0.field388;
        if (~arg0.field401 == -1) {
            arg0.field421 = 1024;
        }
        int var3 = arg0.field424 * 128 + arg0.field423 * 64;
        arg0.field406 += (-arg0.field406 + var3) / var2;
        ++field2800;
        int var4 = arg0.field423 * 64 + arg0.field379 * 128;
        if (arg0.field401 == 1) {
            arg0.field421 = 1536;
        }
        arg0.field382 += (-arg0.field382 + var4) / var2;
        if (arg0.field401 == 2) {
            arg0.field421 = 0;
        }
        if (~arg0.field401 == -4) {
            arg0.field421 = 512;
        }
    }
}
