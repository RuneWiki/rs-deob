import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class20 extends class502 {

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "Z")
    public boolean field299 = false;

    @OriginalMember(owner = "client!dg", name = "qb", descriptor = "Z")
    public boolean field302 = false;

    @OriginalMember(owner = "client!dg", name = "xb", descriptor = "Z")
    public boolean field309 = false;

    @OriginalMember(owner = "client!dg", name = "Db", descriptor = "Z")
    public boolean field315 = false;

    @OriginalMember(owner = "client!dg", name = "Hb", descriptor = "Z")
    public boolean field319 = false;

    @OriginalMember(owner = "client!dg", name = "ob", descriptor = "[I")
    public static int[] field300 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!dg", name = "Cb", descriptor = "I")
    public static int field314 = -1;

    @OriginalMember(owner = "client!dg", name = "zb", descriptor = "I")
    public static int field311 = 0;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!dg", name = "pb", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!dg", name = "rb", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!dg", name = "sb", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!dg", name = "tb", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!dg", name = "ub", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!dg", name = "vb", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!dg", name = "wb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!dg", name = "yb", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!dg", name = "Ab", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!dg", name = "Bb", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!dg", name = "Eb", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!dg", name = "Fb", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!dg", name = "Gb", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!dg", name = "Ib", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!dg", name = "Jb", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)I")
    private final int method126(int arg0, int arg1) {
        if (arg0 >= -35) {
            this.field302 = false;
        }
        ++field308;
        byte var3;
        if (arg1 > 12000) {
            var3 = 4;
            this.method141(124);
        } else if (~arg1 < -5001) {
            this.method130(-29520);
            var3 = 3;
        } else if (arg1 <= 2000) {
            var3 = 1;
            this.method145(true, (byte) -89);
        } else {
            this.method139(false);
            var3 = 2;
        }
        if (~class651.field9191 != -3) {
            super.field6632 = 2;
            class393.method2111(2, true);
        }
        this.method138(class590.field8289, (byte) 101);
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    private final void method127(byte arg0) {
        if (arg0 != -126) {
            field314 = 21;
        }
        if (~class384.field4844 >= -2) {
            super.field6617 = 2;
        } else {
            super.field6617 = 4;
        }
        ++field294;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(ZII)I")
    private final int method128(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method133((byte) -121);
        }
        ++field318;
        byte var4;
        if (arg1 <= 20000) {
            if (arg1 <= 10000) {
                if (arg1 <= 5000) {
                    var4 = 1;
                    this.method145(true, (byte) -91);
                } else {
                    var4 = 2;
                    this.method139(false);
                }
            } else {
                var4 = 3;
                this.method130(-29520);
            }
        } else {
            this.method141(112);
            var4 = 4;
        }
        if (class651.field9191 != arg2) {
            super.field6632 = arg2;
            class393.method2111(arg2, true);
        }
        this.method138(class590.field8289, (byte) 92);
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)I")
    public static final int method129(int arg0, int arg1, int arg2) {
        if (arg2 != -11) {
            method133((byte) 31);
        }
        ++field307;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (133814947 & var5) >> 19;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final void method130(int arg0) {
        if (arg0 == -29520) {
            ++field303;
            this.method142(true, 1000);
            super.field6604 = true;
            super.field6615 = false;
            super.field6634 = super.field6626 = 1;
            super.field6609 = true;
            super.field6618 = true;
            super.field6639 = true;
            super.field6637 = true;
            super.field6621 = true;
            super.field6630 = true;
            super.field6610 = 1;
            super.field6613 = true;
            super.field6638 = super.field6645 = 0;
            super.field6631 = false;
            super.field6646 = true;
            if (class380.field4801 > 95) {
                class304.method1746(0, 1);
            } else {
                class304.method1746(arg0 + 29520, 0);
            }
            super.field6636 = true;
            super.field6606 = 0;
            super.field6648 = false;
            this.method127((byte) -126);
            this.method140((byte) 106, 1);
            super.field6643 = 3;
            class309.method1785((byte) 112);
            class19.method122(-32);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)Z")
    public final boolean method131(int arg0, int arg1) {
        ++field320;
        if (arg1 != -2) {
            return true;
        } else {
            return arg0 != 0 ? true : super.field6622;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)[Lrc;")
    public static final class29[] method132(int arg0) {
        ++field313;
        return arg0 < 13 ? null : new class29[] { class602.field8471, class676.field9488, class16.field259 };
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static void method133(byte arg0) {
        if (arg0 == 5) {
            field300 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Les;Z)V")
    private final void method134(class630 arg0, boolean arg1) {
        ++field305;
        if (~(arg0.field8804.length + -arg0.field8812) <= -2) {
            int var3 = arg0.method3501(-9268);
            if (var3 >= 0 && var3 <= 22) {
                byte var4;
                if (var3 == 22) {
                    var4 = 45;
                } else if (~var3 == -22) {
                    var4 = 44;
                } else if (var3 == 20) {
                    var4 = 43;
                } else if (~var3 == -20) {
                    var4 = 42;
                } else if (~var3 != -19) {
                    if (var3 != 17) {
                        if (var3 != 16) {
                            if (var3 != 15) {
                                if (~var3 == -15) {
                                    var4 = 36;
                                } else if (var3 != 13) {
                                    if (var3 == 12) {
                                        var4 = 34;
                                    } else if (~var3 == -12) {
                                        var4 = 33;
                                    } else if (~var3 == -11) {
                                        var4 = 32;
                                    } else if (~var3 != -10) {
                                        if (var3 != 8) {
                                            if (~var3 == -8) {
                                                var4 = 29;
                                            } else if (var3 == 6) {
                                                var4 = 28;
                                            } else if (~var3 == -6) {
                                                var4 = 28;
                                            } else if (var3 == 4) {
                                                var4 = 24;
                                            } else if (var3 != 3) {
                                                if (var3 == 2) {
                                                    var4 = 22;
                                                } else if (~var3 == -2) {
                                                    var4 = 23;
                                                } else {
                                                    var4 = 19;
                                                }
                                            } else {
                                                var4 = 23;
                                            }
                                        } else {
                                            var4 = 30;
                                        }
                                    } else {
                                        var4 = 31;
                                    }
                                } else {
                                    var4 = 35;
                                }
                            } else {
                                var4 = 37;
                            }
                        } else {
                            var4 = 38;
                        }
                    } else {
                        var4 = 40;
                    }
                } else {
                    var4 = 41;
                }
                if (arg1) {
                    field311 = 48;
                }
                if (var4 <= arg0.field8804.length + -arg0.field8812) {
                    super.field6649 = arg0.method3501(-9268);
                    if (~super.field6649 <= -2) {
                        if (~super.field6649 < -5) {
                            super.field6649 = 4;
                        }
                    } else {
                        super.field6649 = 1;
                    }
                    this.method142(arg0.method3501(-9268) == 1, 1000);
                    super.field6637 = ~arg0.method3501(-9268) == -2;
                    super.field6646 = arg0.method3501(-9268) == 1;
                    super.field6630 = arg0.method3501(-9268) == 1;
                    super.field6610 = ~arg0.method3501(-9268) == -2 ? 1 : 0;
                    super.field6618 = arg0.method3501(-9268) == 1;
                    super.field6621 = ~arg0.method3501(-9268) == -2;
                    super.field6613 = arg0.method3501(-9268) == 1;
                    super.field6634 = arg0.method3501(-9268);
                    if (~super.field6634 < -3) {
                        super.field6634 = 2;
                    }
                    if (var3 >= 17) {
                        super.field6626 = arg0.method3501(-9268);
                    }
                    if (var3 < 2) {
                        super.field6639 = ~arg0.method3501(-9268) == -2;
                        arg0.method3501(-9268);
                    } else {
                        super.field6639 = arg0.method3501(-9268) == 1;
                        if (var3 >= 17) {
                            super.field6615 = arg0.method3501(-9268) == 1;
                        }
                    }
                    super.field6631 = arg0.method3501(-9268) == 1;
                    super.field6609 = ~arg0.method3501(-9268) == -2;
                    super.field6638 = arg0.method3501(-9268);
                    if (super.field6638 > 2) {
                        super.field6638 = 2;
                    }
                    super.field6645 = super.field6638;
                    super.field6612 = ~arg0.method3501(-9268) == -2;
                    super.field6628 = arg0.method3501(-9268);
                    if (super.field6628 > 127) {
                        super.field6628 = 127;
                    }
                    if (~var3 > -21) {
                        super.field6635 = super.field6628;
                    } else {
                        super.field6635 = arg0.method3501(-9268);
                        if (super.field6635 > 127) {
                            super.field6635 = 127;
                        }
                    }
                    super.field6633 = arg0.method3501(-9268);
                    super.field6644 = arg0.method3501(-9268);
                    if (super.field6644 > 127) {
                        super.field6644 = 127;
                    }
                    if (var3 >= 21) {
                        super.field6641 = arg0.method3501(-9268);
                        if (~super.field6641 < -128) {
                            super.field6641 = 127;
                        }
                    } else {
                        super.field6641 = super.field6633;
                    }
                    if (~var3 <= -2) {
                        super.field6642 = arg0.method3470(13111);
                        super.field6625 = arg0.method3470(13111);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg0.method3501(-9268);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method3501(-9268);
                        if (var5 < 0 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class380.field4801 < 96) {
                            var5 = 0;
                        }
                        class304.method1746(0, var5);
                    }
                    if (~var3 <= -6) {
                        super.field6605 = arg0.method3483(97);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field6616 = var6 = arg0.method3501(-9268);
                    }
                    if (super.field6616 != 1 && ~super.field6616 != -3) {
                        super.field6616 = 2;
                    }
                    if (var3 >= 7) {
                        super.field6620 = ~arg0.method3501(-9268) == -2;
                    }
                    if (var3 >= 8) {
                        super.field6607 = arg0.method3501(-9268) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field6606 = arg0.method3501(-9268);
                    }
                    if (super.field6606 < 0 || ~super.field6606 < ~class557.method3066(-93, class380.field4801)) {
                        super.field6606 = 0;
                    }
                    if (var3 >= 10) {
                        super.field6648 = ~arg0.method3501(-9268) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field6629 = ~arg0.method3501(-9268) != -1;
                    }
                    if (var3 >= 12) {
                        super.field6610 = arg0.method3501(-9268);
                    }
                    if (~super.field6610 > -1 || super.field6610 > 2) {
                        super.field6610 = 1;
                    }
                    if (var3 >= 13) {
                        super.field6636 = ~arg0.method3501(-9268) == -2;
                    }
                    if (var3 < 14) {
                        if (var6 == 0) {
                            super.field6632 = 2;
                        } else {
                            super.field6632 = 1;
                        }
                    } else {
                        super.field6632 = arg0.method3501(-9268);
                    }
                    if (~super.field6632 > -1 || ~super.field6632 < -6) {
                        super.field6632 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field6617 = arg0.method3501(-9268);
                        if (~super.field6617 > -1 || ~super.field6617 < -5) {
                            super.field6617 = ~class384.field4844 != -2 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field6604 = arg0.method3501(-9268) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field6604 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && super.field6632 == 0) {
                        super.field6632 = 2;
                    }
                    if (var3 >= 18) {
                        super.field6643 = arg0.method3501(-9268);
                        if (super.field6643 < 0 || super.field6643 > 4) {
                            super.field6643 = 0;
                        }
                    }
                    if (~var3 <= -20) {
                        super.field6627 = arg0.method3501(-9268);
                    } else if (super.field6643 != 1 && ~super.field6643 != -3) {
                        if (~super.field6643 != -4) {
                            super.field6627 = 0;
                        } else {
                            super.field6627 = 1;
                        }
                    } else {
                        super.field6627 = 2;
                    }
                    if (var3 >= 22) {
                        super.field6619 = arg0.method3501(-9268);
                    }
                    if (super.field6632 == 0 && class380.field4801 < 96 && ~super.field6643 != -2 && ~super.field6643 != -1) {
                        this.method145(false, (byte) -108);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(II)Z")
    public final boolean method135(int arg0, int arg1) {
        ++field321;
        if (arg1 <= 72) {
            field316 = 57;
        }
        return arg0 == 0 && !this.field319 ? super.field6622 : true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)I")
    public final int method136(int arg0, byte arg1) {
        ++field304;
        int var3 = -77 / ((30 - arg1) / 51);
        if (class388.method2088(arg0, (byte) -59) && !class278.method1579(113, class504.field6675)) {
            return class380.field4801 < 96 && class697.method3923(-1, arg0) && super.field6627 == 0 ? 1 : super.field6627;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)I")
    public final int method137(byte arg0) {
        ++field301;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class590.field8289.field9151 && !class590.field8289.field9138) {
            if (class648.field9143.startsWith("win")) {
                if (!class648.field9135.startsWith("amd64") && !class648.field9135.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
                var3 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field315) {
            var2 = false;
        }
        if (this.field299) {
            var4 = false;
        }
        if (this.field309) {
            var3 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method144(0);
        } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
                try {
                    var5 = class3.method33(2, (byte) -113, 1000);
                } catch (Exception var16) {
                }
            }
            if (var4) {
                try {
                    var7 = class3.method33(3, (byte) -104, 1000);
                    if (~class651.field9191 == -4) {
                        class226 var8 = class32.field452.method1001();
                        long var9 = 281474976710655L & var8.field2826;
                        int var11 = var8.field2823;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= var9 >= 64425238954L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class3.method33(1, (byte) -111, 1000);
                } catch (Exception var14) {
                }
            }
            if (~var5 == 0 && var6 == -1 && var7 == -1) {
                return this.method144(0);
            } else if (arg0 <= 99) {
                return 81;
            } else {
                int var12 = (int) ((float) var6 * 1.1F);
                int var13 = (int) ((float) var7 * 1.1F);
                if (~var13 > ~var5 && ~var12 > ~var5) {
                    return this.method126(-81, var5);
                } else {
                    return var13 <= var12 ? this.method128(false, var12, 1) : this.method128(false, var13, 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lrj;B)V")
    public final void method138(class648 arg0, byte arg1) {
        ++field317;
        class479 var3 = null;
        try {
            if (arg1 <= 30) {
                this.field319 = true;
            }
            class264 var4 = arg0.method3641("", (byte) -28, true);
            while (~var4.field3358 == -1) {
                class419.method2233(-28448, 1L);
            }
            if (var4.field3358 == 1) {
                var3 = (class479) var4.field3356;
                class630 var5 = new class630(class529.method2877(4929));
                this.method2698(123, var5);
                var3.method2605(0, (byte) 57, var5.field8812, var5.field8804);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2603((byte) -128);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public final void method139(boolean arg0) {
        ++field293;
        this.method142(true, 1000);
        super.field6613 = false;
        super.field6639 = false;
        super.field6604 = false;
        super.field6630 = false;
        super.field6618 = false;
        super.field6621 = false;
        super.field6610 = 0;
        super.field6646 = true;
        super.field6615 = false;
        super.field6631 = false;
        super.field6638 = super.field6645 = 0;
        super.field6609 = false;
        super.field6637 = arg0;
        super.field6634 = super.field6626 = 0;
        class304.method1746(0, 0);
        super.field6606 = 0;
        super.field6636 = true;
        super.field6648 = false;
        this.method127((byte) -126);
        this.method140((byte) 120, 2);
        super.field6643 = 2;
        class309.method1785((byte) 102);
        class19.method122(125);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
    public final void method140(byte arg0, int arg1) {
        class304.field3743 = null;
        class376.field4745 = true;
        ++field310;
        if (arg0 <= 103) {
            this.method142(false, -122);
        }
        super.field6627 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public final void method141(int arg0) {
        this.method142(true, 1000);
        ++field297;
        super.field6613 = true;
        super.field6609 = true;
        super.field6610 = 1;
        super.field6634 = super.field6626 = 2;
        super.field6618 = true;
        super.field6621 = true;
        super.field6639 = true;
        super.field6604 = true;
        super.field6631 = true;
        super.field6637 = true;
        super.field6615 = true;
        super.field6646 = true;
        super.field6638 = super.field6645 = 0;
        super.field6630 = true;
        int var2 = -30 / ((arg0 - 59) / 50);
        if (class380.field4801 > 95) {
            class304.method1746(0, 2);
        } else {
            class304.method1746(0, 0);
        }
        super.field6636 = true;
        super.field6606 = 0;
        super.field6648 = false;
        this.method127((byte) -126);
        this.method140((byte) 111, 0);
        super.field6643 = 4;
        class309.method1785((byte) 83);
        class19.method122(125);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
    public final void method142(boolean arg0, int arg1) {
        ++field298;
        super.field6622 = arg0;
        if (arg1 == 1000) {
            if (class428.field5352 != null) {
                class428.field5352.method3144(1, !this.method135(class651.field9191, 74));
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(II)I")
    public final int method143(int arg0, int arg1) {
        int var3 = -109 % ((arg0 - 1) / 57);
        ++field296;
        if (this.field302) {
            return 0;
        } else if (!this.method135(arg1, 118)) {
            return 1;
        } else {
            return super.field6637 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)I")
    private final int method144(int arg0) {
        ++field306;
        if (arg0 != 0) {
            field314 = 1;
        }
        byte var2;
        if (~class380.field4801 > -97) {
            this.method145(true, (byte) -120);
            var2 = 1;
        } else {
            int var3 = class393.method2109(arg0 + -115);
            if (var3 <= 100) {
                var2 = 4;
                this.method141(121);
            } else if (~var3 < -501) {
                if (var3 > 1000) {
                    var2 = 1;
                    this.method145(true, (byte) -115);
                } else {
                    var2 = 2;
                    this.method139(false);
                }
            } else {
                this.method130(-29520);
                var2 = 3;
            }
        }
        if (~class651.field9191 != -1) {
            super.field6632 = 0;
            class393.method2111(0, true);
        }
        this.method138(class590.field8289, (byte) 123);
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZB)V")
    public final void method145(boolean arg0, byte arg1) {
        ++field312;
        this.method142(false, 1000);
        super.field6610 = 0;
        super.field6609 = false;
        super.field6604 = false;
        super.field6621 = false;
        super.field6639 = false;
        if (arg1 >= -12) {
            field292 = 86;
        }
        super.field6618 = false;
        super.field6638 = super.field6645 = 0;
        super.field6613 = false;
        super.field6615 = false;
        super.field6631 = false;
        super.field6637 = false;
        super.field6646 = false;
        super.field6630 = false;
        super.field6634 = super.field6626 = 0;
        class304.method1746(0, 0);
        super.field6648 = false;
        super.field6606 = 0;
        super.field6636 = false;
        this.method127((byte) -126);
        this.method140((byte) 127, 2);
        super.field6643 = 1;
        if (arg0) {
            class309.method1785((byte) 77);
        }
        class19.method122(6);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lrj;)V")
    public class20(class648 arg0) {
        super.field6643 = 3;
        super.field6649 = 3;
        this.method142(true, 1000);
        super.field6637 = true;
        super.field6613 = true;
        super.field6642 = 0;
        super.field6638 = 0;
        super.field6646 = true;
        super.field6631 = true;
        super.field6609 = true;
        super.field6610 = 1;
        super.field6635 = 127;
        super.field6633 = 127;
        super.field6615 = false;
        super.field6645 = 0;
        super.field6644 = 127;
        super.field6625 = 0;
        super.field6630 = true;
        super.field6621 = true;
        super.field6641 = 127;
        super.field6612 = true;
        super.field6628 = 127;
        super.field6634 = 2;
        super.field6639 = true;
        super.field6618 = true;
        super.field6626 = 0;
        if (class380.field4801 >= 96) {
            class304.method1746(0, 2);
        } else {
            class304.method1746(0, 0);
        }
        super.field6606 = 0;
        super.field6617 = class384.field4844 != 1 ? 4 : 2;
        super.field6636 = true;
        super.field6648 = false;
        super.field6620 = false;
        super.field6629 = true;
        super.field6616 = 2;
        super.field6605 = 0;
        super.field6607 = false;
        super.field6632 = 2;
        super.field6627 = 0;
        class479 var2 = null;
        try {
            class264 var3 = arg0.method3641("", (byte) -28, true);
            while (~var3.field3358 == -1) {
                class419.method2233(-28448, 1L);
            }
            if (~var3.field3358 == -2) {
                var2 = (class479) var3.field3356;
                byte[] var4 = new byte[(int) var2.method2604(0)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method2607(var5, var4, var4.length + -var5, 3);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method134(new class630(var4), false);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2603((byte) -127);
            }
        } catch (Exception var7) {
        }
    }
}
