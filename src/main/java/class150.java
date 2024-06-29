import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class150 extends class89 {

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    private int field2606 = 16;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    private int field2611 = 0;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    private int field2616 = 4096;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    private int field2618 = 0;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    private int field2609 = 2000;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "[I")
    public static int[] field2617 = new int[4096];

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "[I")
    public static int[] field2620 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lcc;")
    public static class251 field2612;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILfb;III)V")
    public static final void method1061(int arg0, class109 arg1, int arg2, int arg3, int arg4) {
        ++field2613;
        if (class66.field1094 != arg1) {
            if (class52.field863 < 400) {
                class275 var10;
                if (~arg1.field1913 == -1) {
                    boolean var5 = true;
                    if (~class66.field1094.field1928 != 0 && arg1.field1928 != -1) {
                        int var6 = arg1.field1928 <= class66.field1094.field1928 ? arg1.field1928 : class66.field1094.field1928;
                        int var7 = arg1.field1908 < class66.field1094.field1908 ? class66.field1094.field1908 : arg1.field1908;
                        int var8 = var7 * 10 / 100 - -var6 + 5;
                        int var9 = -arg1.field1908 + class66.field1094.field1908;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        if (~var8 > ~var9) {
                            var5 = false;
                        }
                    }
                    if (arg1.field1908 >= arg1.field1925) {
                        var10 = class197.method1291(new class275[] { arg1.method809((byte) -33), !var5 ? class230.field4032 : class124.method898(arg1.field1908, 114, class66.field1094.field1908), class11.field161, class141.field2498, class250.method1644(arg1.field1908, (byte) -115), class30.field450 }, -30025);
                    } else {
                        var10 = class197.method1291(new class275[] { arg1.method809((byte) -33), var5 ? class124.method898(arg1.field1908, 125, class66.field1094.field1908) : class230.field4032, class11.field161, class141.field2498, class250.method1644(arg1.field1908, (byte) -115), class76.field1248, class250.method1644(-arg1.field1908 + arg1.field1925, (byte) -115), class30.field450 }, -30025);
                    }
                } else {
                    var10 = class197.method1291(new class275[] { arg1.method809((byte) -33), class11.field161, class159.field2785, class250.method1644(arg1.field1913, (byte) -115), class30.field450 }, -30025);
                }
                if (class190.field3272 != 1) {
                    if (!class144.field2523) {
                        for (int var11 = 7; ~var11 <= -1; --var11) {
                            if (class226.field3835[var11] != null) {
                                ++class149.field2592;
                                short var12 = 0;
                                if (class38.field630 == 0 && class226.field3835[var11].method1844(90, class139.field2435)) {
                                    if (~arg1.field1908 < ~class66.field1094.field1908) {
                                        var12 = 2000;
                                    }
                                    if (~class66.field1094.field1903 != -1 && arg1.field1903 != 0) {
                                        if (~class66.field1094.field1903 == ~arg1.field1903) {
                                            var12 = 2000;
                                        } else {
                                            var12 = 0;
                                        }
                                    }
                                } else if (class52.field870[var11]) {
                                    var12 = 2000;
                                }
                                boolean var13 = false;
                                short var14 = class67.field1099[var11];
                                short var15 = (short) (var12 + var14);
                                class246.method1619((long) arg2, arg3, class197.method1291(new class275[] { class230.field4032, var10 }, -30025), class226.field3835[var11], arg4, (byte) -70, var15);
                            }
                        }
                    } else if (~(8 & field2619) == -9) {
                        class246.method1619((long) arg2, arg3, class197.method1291(new class275[] { class19.field266, class108.field1870, var10 }, -30025), class103.field1715, arg4, (byte) -70, (short) 43);
                        ++class175.field3036;
                    }
                } else {
                    ++class55.field926;
                    class246.method1619((long) arg2, arg3, class197.method1291(new class275[] { class210.field3550, class108.field1870, var10 }, -30025), class165.field2869, arg4, (byte) -70, (short) 19);
                }
                if (arg0 >= -32) {
                    method1065(-11, 89);
                }
                for (int var16 = 0; var16 < class52.field863; ++var16) {
                    if (~class137.field2400[var16] == -30) {
                        class201.field3446[var16] = class197.method1291(new class275[] { class230.field4032, var10 }, -30025);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(III)Lud;")
    public static final class214 method1062(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        return var3 != null && var3.field39 != null ? var3.field39 : null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            this.field2609 = -53;
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -84);
        if (super.field1503.field664) {
            int var4 = this.field2616 >> 1;
            int[][] var5 = super.field1503.method226((byte) -107);
            Random var6 = new Random((long) this.field2611);
            for (int var7 = 0; var7 < this.field2609; ++var7) {
                int var8 = ~this.field2616 < -1 ? this.field2618 - (-class116.method845((byte) -86, var6, this.field2616) - -var4) : this.field2618;
                int var9 = class116.method845((byte) -43, var6, class65.field1070);
                int var10 = var8 >> 4 & 255;
                int var11 = class116.method845((byte) -80, var6, class16.field242);
                int var12 = (class159.field2791[var10] * this.field2606 >> 12) + var9;
                int var13 = (class143.field2519[var10] * this.field2606 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var9 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var9;
                        var9 = var11;
                        var11 = var18;
                        var12 = var13;
                        var13 = var17;
                    }
                    if (~var9 < ~var12) {
                        int var19 = var9;
                        int var20 = var11;
                        var11 = var13;
                        var9 = var12;
                        var13 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = -var11 + var13;
                    if (~var22 > -1) {
                        var22 = -var22;
                    }
                    int var23 = -var9 + var12;
                    int var24 = 2048 / var23;
                    int var25 = ~var13 >= ~var11 ? -1 : 1;
                    int var26 = 1024 + -(class116.method845((byte) -76, var6, 4096) >> 2);
                    int var27 = -var23 / 2;
                    for (int var28 = var9; var12 > var28; ++var28) {
                        var27 += var22;
                        int var29 = (-var9 + var28) * var24 + var26 + 1024;
                        int var30 = class1.field11 & var28;
                        int var31 = class277.field4837 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var27 > 0) {
                            var21 += var25;
                            var27 += -var23;
                        }
                    }
                }
            }
        }
        ++field2610;
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static void method1063(byte arg0) {
        field2617 = null;
        field2620 = null;
        int var1 = -91 / ((arg0 - -36) / 61);
        field2612 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILdj;)V")
    public static final void method1064(int arg0, class104 arg1) {
        arg1.field1788 = arg1.field1736;
        ++field2622;
        if (~arg1.field1791 == -1) {
            arg1.field1763 = 0;
        } else {
            if (arg1.field1776 != -1 && ~arg1.field1749 == -1) {
                class215 var2 = class201.method1321(128, arg1.field1776);
                if (~arg1.field1781 < -1 && var2.field3663 == 0) {
                    ++arg1.field1763;
                    return;
                }
                if (arg1.field1781 <= 0 && var2.field3656 == 0) {
                    ++arg1.field1763;
                    return;
                }
            }
            int var3 = arg1.field1770;
            int var4 = arg1.field1758;
            int var5 = arg1.field1752[arg1.field1791 + -1] * 128 - -(arg1.method750((byte) -108) * 64);
            int var6 = arg1.field1722[arg1.field1791 - 1] * 128 + 64 * arg1.method750((byte) -123);
            if (-var3 + var5 <= 256 && -var3 + var5 >= -256 && ~(-var4 + var6) >= -257 && -var4 + var6 >= -256) {
                if (~var3 <= ~var5) {
                    if (var5 < var3) {
                        if (~var6 < ~var4) {
                            arg1.field1773 = 768;
                        } else if (var6 < var4) {
                            arg1.field1773 = 256;
                        } else {
                            arg1.field1773 = 512;
                        }
                    } else if (~var4 > ~var6) {
                        arg1.field1773 = 1024;
                    } else if (var4 > var6) {
                        arg1.field1773 = 0;
                    }
                } else if (~var6 >= ~var4) {
                    if (~var6 > ~var4) {
                        arg1.field1773 = 1792;
                    } else {
                        arg1.field1773 = 1536;
                    }
                } else {
                    arg1.field1773 = 1280;
                }
                int var7 = -arg1.field1787 + arg1.field1773 & 2047;
                int var8 = arg1.field1741;
                int var9 = 4;
                if (var7 > 1024) {
                    var7 -= 2048;
                }
                boolean var10 = true;
                if (var7 >= -256 && var7 <= 256) {
                    var8 = arg1.field1778;
                } else if (~var7 <= -257 && ~var7 > -769) {
                    var8 = arg1.field1747;
                } else if (~var7 <= 767 && var7 <= -256) {
                    var8 = arg1.field1769;
                }
                if (~var8 == 0) {
                    var8 = arg1.field1778;
                }
                arg1.field1788 = var8;
                if (arg1 instanceof class165) {
                    var10 = ((class165) arg1).field2873.field341;
                }
                if (var10) {
                    if (arg1.field1787 != arg1.field1773 && arg1.field1735 == -1 && ~arg1.field1774 != -1) {
                        var9 = 2;
                    }
                    if (arg1.field1791 > 2) {
                        var9 = 6;
                    }
                    if (arg1.field1791 > 3) {
                        var9 = 8;
                    }
                    if (arg1.field1763 > 0 && arg1.field1791 > 1) {
                        --arg1.field1763;
                        var9 = 8;
                    }
                } else {
                    if (~arg1.field1791 < -2) {
                        var9 = 6;
                    }
                    if (~arg1.field1791 < -3) {
                        var9 = 8;
                    }
                    if (arg1.field1763 > 0 && arg1.field1791 > 1) {
                        --arg1.field1763;
                        var9 = 8;
                    }
                }
                if (arg1.field1755[arg1.field1791 + -1]) {
                    var9 <<= 1;
                }
                if (~var9 <= -9 && ~arg1.field1788 == ~arg1.field1778 && ~arg1.field1761 != 0) {
                    arg1.field1788 = arg1.field1761;
                }
                if (var4 < var6) {
                    arg1.field1758 += var9;
                    if (~arg1.field1758 < ~var6) {
                        arg1.field1758 = var6;
                    }
                } else if (~var6 > ~var4) {
                    arg1.field1758 -= var9;
                    if (~var6 < ~arg1.field1758) {
                        arg1.field1758 = var6;
                    }
                }
                if (arg0 < -112) {
                    if (~var5 >= ~var3) {
                        if (~var3 < ~var5) {
                            arg1.field1770 -= var9;
                            if (arg1.field1770 < var5) {
                                arg1.field1770 = var5;
                            }
                        }
                    } else {
                        arg1.field1770 += var9;
                        if (var5 < arg1.field1770) {
                            arg1.field1770 = var5;
                        }
                    }
                    if (~arg1.field1770 == ~var5 && arg1.field1758 == var6) {
                        if (~arg1.field1781 < -1) {
                            --arg1.field1781;
                        }
                        --arg1.field1791;
                    }
                }
            } else {
                arg1.field1770 = var5;
                arg1.field1758 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 == 1) {
            ++field2614;
            class250.method1642((byte) 103);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
    public static final int method1065(int arg0, int arg1) {
        if (arg1 > -14) {
            field2620 = null;
        }
        ++field2608;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static final void method1066(int arg0) {
        ++field2607;
        int var1 = -105 % ((-33 - arg0) / 45);
        class123.field2202.method993(104);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field2615;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field2616 = arg1.method608(124);
                        }
                    } else {
                        this.field2618 = arg1.method608(98);
                    }
                } else {
                    this.field2606 = arg1.method564((byte) 106);
                }
            } else {
                this.field2609 = arg1.method608(29);
            }
        } else {
            this.field2611 = arg1.method564((byte) 109);
        }
        if (arg0 != -20503) {
            this.method234(-52);
        }
    }
}
