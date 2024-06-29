import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class218 extends class228 {

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    private int field3779 = 4;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    private int field3789 = 0;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    private int field3788 = 1024;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    private int field3786 = 8;

    @OriginalMember(owner = "client!ce", name = "qb", descriptor = "I")
    private int field3801 = 409;

    @OriginalMember(owner = "client!ce", name = "tb", descriptor = "I")
    private int field3804 = 1024;

    @OriginalMember(owner = "client!ce", name = "yb", descriptor = "I")
    private int field3809 = 81;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    private int field3782 = 204;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Loa;")
    public static class99 field3778 = class221.method1463(2844, "(U");

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field3781 = 7759444;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "Loa;")
    private static class99 field3792 = class221.method1463(2844, "flash2:");

    @OriginalMember(owner = "client!ce", name = "nb", descriptor = "I")
    public static int field3798 = 0;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "[Loa;")
    public static class99[] field3795 = new class99[100];

    @OriginalMember(owner = "client!ce", name = "mb", descriptor = "Loa;")
    public static class99 field3797 = field3792;

    @OriginalMember(owner = "client!ce", name = "pb", descriptor = "Loa;")
    private static class99 field3800 = class221.method1463(2844, "yellow:");

    @OriginalMember(owner = "client!ce", name = "wb", descriptor = "Loa;")
    public static class99 field3807 = field3792;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "Loa;")
    public static class99 field3787 = field3800;

    @OriginalMember(owner = "client!ce", name = "zb", descriptor = "Loa;")
    public static class99 field3810 = field3800;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
    private int field3802;

    @OriginalMember(owner = "client!ce", name = "sb", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!ce", name = "ub", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "[I")
    private int[] field3793;

    @OriginalMember(owner = "client!ce", name = "lb", descriptor = "[Z")
    public static boolean[] field3796;

    @OriginalMember(owner = "client!ce", name = "vb", descriptor = "[[I")
    private int[][] field3806;

    @OriginalMember(owner = "client!ce", name = "xb", descriptor = "[[I")
    private int[][] field3808;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(B)V")
    private final void method1451(byte arg0) {
        ++field3780;
        Random var2 = new Random((long) this.field3786);
        this.field3783 = this.field3809 / 2;
        this.field3793 = new int[this.field3786 + 1];
        this.field3802 = 4096 / this.field3779;
        this.field3806 = new int[this.field3786][this.field3779 - -1];
        this.field3803 = 4096 / this.field3786;
        int var3 = this.field3803 / 2;
        if (arg0 <= 15) {
            method1456(-38, 8, 123, 101, -58, -23, 42);
        }
        this.field3808 = new int[this.field3786][this.field3779];
        this.field3793[0] = 0;
        int var4 = this.field3802 / 2;
        for (int var5 = 0; var5 < this.field3786; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3803;
                int var7 = (-2048 + class88.method606(var2, 4096, false)) * this.field3782 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field3793[var5] = this.field3793[var5 + -1] + var8;
            }
            this.field3806[var5][0] = 0;
            for (int var9 = 0; this.field3779 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3802;
                    int var11 = (class88.method606(var2, 4096, false) + -2048) * this.field3801 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field3806[var5][var9] = this.field3806[var5][var9 + -1] - -var12;
                }
                this.field3808[var5][var9] = ~this.field3804 < -1 ? -class88.method606(var2, this.field3804, false) + 4096 : 4096;
            }
            this.field3806[var5][this.field3779] = 4096;
        }
        this.field3793[this.field3786] = 4096;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public static final void method1452(int arg0) {
        for (int var1 = 0; ~class55.field900 < ~var1; ++var1) {
            class71 var2 = class199.method1340(-112, var1);
            if (var2 != null && var2.field1199 == 0) {
                class209.field3613[var1] = 0;
                class43.field733[var1] = 0;
            }
        }
        ++field3777;
        class276.field4852 = new class237(16);
        if (arg0 != -7434) {
            field3807 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)Lfj;")
    public static final class252 method1453(byte arg0, int arg1) {
        class252 var2 = (class252) class32.field575.method1811((long) arg1, -94);
        ++field3799;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class245.field4226.method1242(arg1, 1, 6801);
            if (arg0 > -82) {
                method1453((byte) -37, 65);
            }
            class252 var4 = new class252();
            var4.field4361 = arg1;
            if (var3 != null) {
                var4.method1632((byte) 121, new class261(var3));
            }
            var4.method1635((byte) -39);
            class32.field575.method1817((long) arg1, 16, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)V")
    public static void method1454(boolean arg0) {
        field3778 = null;
        field3787 = null;
        field3796 = null;
        field3807 = null;
        field3797 = null;
        field3795 = null;
        field3792 = null;
        field3800 = null;
        field3810 = null;
        if (arg0) {
            method1453((byte) -42, 7);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        this.method1451((byte) 108);
        ++field3791;
        if (arg0 != -8) {
            method1456(-29, 32, -96, -49, 63, -113, -15);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field3790;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field3804 = arg1.method1740((byte) 77);
                                    }
                                } else {
                                    this.field3809 = arg1.method1740((byte) 100);
                                }
                            } else {
                                this.field3789 = arg1.method1740((byte) 65);
                            }
                        } else {
                            this.field3788 = arg1.method1740((byte) 60);
                        }
                    } else {
                        this.field3782 = arg1.method1740((byte) 75);
                    }
                } else {
                    this.field3801 = arg1.method1740((byte) 61);
                }
            } else {
                this.field3786 = arg1.method1693((byte) 123);
            }
        } else {
            this.field3779 = arg1.method1693((byte) 103);
        }
        if (arg2 != -7618) {
            method1456(-36, -42, 75, 106, -79, -97, 76);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    public static final void method1455(int arg0, boolean arg1) {
        if (arg0 > 19) {
            class192.field3375 = arg1;
            if (!class192.field3375) {
                int var2 = class129.field2252.method1729((byte) 125);
                int var3 = (-class129.field2252.field4587 + class180.field3146) / 16;
                class220.field3834 = new int[var3][4];
                for (int var4 = 0; var4 < var3; ++var4) {
                    for (int var14 = 0; ~var14 > -5; ++var14) {
                        class220.field3834[var4][var14] = class129.field2252.method1727(4);
                    }
                }
                int var5 = class129.field2252.method1713((byte) 28);
                int var6 = class129.field2252.method1692(91);
                int var7 = class129.field2252.method1694(0);
                boolean var8 = false;
                int var9 = class129.field2252.method1729((byte) -41);
                class200.field3479 = new int[var3];
                class164.field2877 = null;
                class171.field3042 = new int[var3];
                if ((~(var9 / 8) == -49 || ~(var9 / 8) == -50) && ~(var5 / 8) == -49) {
                    var8 = true;
                }
                class138.field2445 = new int[var3];
                class197.field3441 = new int[var3];
                if (~(var9 / 8) == -49 && ~(var5 / 8) == -149) {
                    var8 = true;
                }
                class123.field2155 = new byte[var3][];
                class117.field2077 = new byte[var3][];
                class11.field100 = new int[var3];
                class124.field2183 = null;
                int var10 = 0;
                for (int var11 = (var9 + -6) / 8; ~var11 >= ~((var9 - -6) / 8); ++var11) {
                    for (int var12 = (var5 + -6) / 8; (var5 + 6) / 8 >= var12; ++var12) {
                        int var13 = (var11 << 8) - -var12;
                        if (!var8 || var12 != 49 && var12 != 149 && ~var12 != -148 && ~var11 != -51 && (~var11 != -50 || var12 != 47)) {
                            class171.field3042[var10] = var13;
                            class138.field2445[var10] = class269.field4732.method1245(class198.method1332(96, new class99[] { class156.field2806, class198.method1333(-124, var11), class137.field2415, class198.method1333(-115, var12) }), false);
                            class200.field3479[var10] = class269.field4732.method1245(class198.method1332(117, new class99[] { class254.field4394, class198.method1333(-84, var11), class137.field2415, class198.method1333(-127, var12) }), false);
                            class197.field3441[var10] = class269.field4732.method1245(class198.method1332(68, new class99[] { class253.field4371, class198.method1333(-117, var11), class137.field2415, class198.method1333(-111, var12) }), false);
                            class11.field100[var10] = class269.field4732.method1245(class198.method1332(100, new class99[] { class152.field2668, class198.method1333(-109, var11), class137.field2415, class198.method1333(-87, var12) }), false);
                        } else {
                            class171.field3042[var10] = var13;
                            class138.field2445[var10] = -1;
                            class200.field3479[var10] = -1;
                            class197.field3441[var10] = -1;
                            class11.field100[var10] = -1;
                        }
                        ++var10;
                    }
                }
                class128.method846(var6, false, var5, var9, 100, var2, var7);
            } else {
                int var15 = class129.field2252.method1692(-97);
                int var16 = class129.field2252.method1692(111);
                int var17 = class129.field2252.method1729((byte) 0);
                int var18 = class129.field2252.method1694(0);
                class129.field2252.method973(false);
                for (int var19 = 0; var19 < 4; ++var19) {
                    for (int var35 = 0; var35 < 13; ++var35) {
                        for (int var36 = 0; ~var36 > -14; ++var36) {
                            int var37 = class129.field2252.method975(1, true);
                            if (var37 == 1) {
                                class119.field2106[var19][var35][var36] = class129.field2252.method975(26, true);
                            } else {
                                class119.field2106[var19][var35][var36] = -1;
                            }
                        }
                    }
                }
                class129.field2252.method974(18964);
                int var20 = (class180.field3146 - class129.field2252.field4587) / 16;
                class220.field3834 = new int[var20][4];
                for (int var21 = 0; var21 < var20; ++var21) {
                    for (int var34 = 0; ~var34 > -5; ++var34) {
                        class220.field3834[var21][var34] = class129.field2252.method1712(-4);
                    }
                }
                int var22 = class129.field2252.method1713((byte) 28);
                class124.field2183 = null;
                class197.field3441 = new int[var20];
                class138.field2445 = new int[var20];
                class171.field3042 = new int[var20];
                class200.field3479 = new int[var20];
                class11.field100 = new int[var20];
                class164.field2877 = null;
                class123.field2155 = new byte[var20][];
                class117.field2077 = new byte[var20][];
                int var23 = 0;
                for (int var24 = 0; var24 < 4; ++var24) {
                    for (int var25 = 0; ~var25 > -14; ++var25) {
                        for (int var26 = 0; ~var26 > -14; ++var26) {
                            int var27 = class119.field2106[var24][var25][var26];
                            if (var27 != -1) {
                                int var28 = (16763206 & var27) >> 14;
                                int var29 = (16382 & var27) >> 3;
                                int var30 = (var28 / 8 << 8) + var29 / 8;
                                for (int var31 = 0; ~var31 > ~var23; ++var31) {
                                    if (~class171.field3042[var31] == ~var30) {
                                        var30 = -1;
                                        break;
                                    }
                                }
                                if (var30 != -1) {
                                    class171.field3042[var23] = var30;
                                    int var32 = var30 >> 8 & 255;
                                    int var33 = var30 & 255;
                                    class138.field2445[var23] = class269.field4732.method1245(class198.method1332(94, new class99[] { class156.field2806, class198.method1333(-99, var32), class137.field2415, class198.method1333(-85, var33) }), false);
                                    class200.field3479[var23] = class269.field4732.method1245(class198.method1332(116, new class99[] { class254.field4394, class198.method1333(-112, var32), class137.field2415, class198.method1333(-109, var33) }), false);
                                    class197.field3441[var23] = class269.field4732.method1245(class198.method1332(108, new class99[] { class253.field4371, class198.method1333(-124, var32), class137.field2415, class198.method1333(-97, var33) }), false);
                                    class11.field100[var23] = class269.field4732.method1245(class198.method1332(53, new class99[] { class152.field2668, class198.method1333(-96, var32), class137.field2415, class198.method1333(-126, var33) }), false);
                                    ++var23;
                                }
                            }
                        }
                    }
                }
                class128.method846(var15, false, var16, var22, 81, var17, var18);
            }
            ++field3785;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3784;
        int var7 = class166.method1127(class137.field2414, arg3, class178.field3101, arg2 ^ 8954);
        int var8 = class166.method1127(class137.field2414, arg1, class178.field3101, 8946);
        if (arg2 != 8) {
            field3795 = null;
        }
        int var9 = class166.method1127(class79.field1395, arg6, class197.field3437, 8946);
        int var10 = class166.method1127(class79.field1395, arg0, class197.field3437, arg2 + 8938);
        int var11 = class166.method1127(class137.field2414, arg3 + arg5, class178.field3101, arg2 + 8938);
        int var12 = class166.method1127(class137.field2414, -arg5 + arg1, class178.field3101, arg2 ^ 8954);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class175.method1174(class124.field2177[var13], arg4, -7, var9, var10);
        }
        for (int var14 = var8; var12 < var14; --var14) {
            class175.method1174(class124.field2177[var14], arg4, -7, var9, var10);
        }
        int var15 = class166.method1127(class79.field1395, arg5 + arg6, class197.field3437, 8946);
        int var16 = class166.method1127(class79.field1395, -arg5 + arg0, class197.field3437, arg2 ^ 8954);
        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
            int[] var18 = class124.field2177[var17];
            class175.method1174(var18, arg4, -7, var9, var15);
            class175.method1174(var18, arg4, -7, var16, var10);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class218() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field3805;
        if (arg1 != -3) {
            this.field3809 = 112;
        }
        int[] var3 = super.field3952.method1262(arg0, arg1 + 7495);
        if (super.field3952.field3276) {
            int var4 = 0;
            int var5;
            for (var5 = class54.field879[arg0] - -this.field3789; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field3786 > var4 && ~this.field3793[var4] >= ~var5) {
                ++var4;
            }
            boolean var6 = (var4 & 1) == 0;
            int var7 = var4 + -1;
            int var8 = this.field3793[var4];
            int var9 = this.field3793[var4 + -1];
            if (~(this.field3783 + var9) > ~var5 && ~(-this.field3783 + var8) < ~var5) {
                for (int var10 = 0; var10 < class234.field4046; ++var10) {
                    int var11 = !var6 ? -this.field3788 : this.field3788;
                    int var12;
                    for (var12 = (this.field3802 * var11 >> 12) + class281.field4923[var10]; var12 < 0; var12 += 4096) {
                    }
                    while (~var12 < -4097) {
                        var12 -= 4096;
                    }
                    int var13;
                    for (var13 = 0; var13 < this.field3779 && ~this.field3806[var7][var13] >= ~var12; ++var13) {
                    }
                    int var14 = var13 + -1;
                    int var15 = this.field3806[var7][var14];
                    int var16 = this.field3806[var7][var13];
                    if (this.field3783 + var15 < var12 && var16 - this.field3783 > var12) {
                        var3[var10] = this.field3808[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class241.method1569(var3, 0, class234.field4046, 0);
            }
        }
        return var3;
    }
}
