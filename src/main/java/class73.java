import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class73 extends class100 {

    @OriginalMember(owner = "client!ke", name = "nb", descriptor = "Z")
    private volatile boolean field1631 = false;

    @OriginalMember(owner = "client!ke", name = "xb", descriptor = "I")
    private int field1641 = -1;

    @OriginalMember(owner = "client!ke", name = "Eb", descriptor = "Z")
    private boolean field1648 = false;

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "Ld;")
    private class22 field1633;

    @OriginalMember(owner = "client!ke", name = "Hb", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "Ld;")
    private class22 field1627;

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
    public static volatile int field1634 = 0;

    @OriginalMember(owner = "client!ke", name = "ub", descriptor = "Lrd;")
    private static class114 field1638 = class84.method656("Select", (byte) 120);

    @OriginalMember(owner = "client!ke", name = "Bb", descriptor = "Lrd;")
    public static class114 field1645 = class84.method656("Lade Wordpack )2 ", (byte) 125);

    @OriginalMember(owner = "client!ke", name = "Gb", descriptor = "Lrd;")
    public static class114 field1650 = class84.method656("cross", (byte) 127);

    @OriginalMember(owner = "client!ke", name = "Ib", descriptor = "Lrd;")
    public static class114 field1652 = field1638;

    @OriginalMember(owner = "client!ke", name = "Db", descriptor = "Lrd;")
    public static class114 field1647 = class84.method656("Regelversto-8 melden", (byte) 114);

    @OriginalMember(owner = "client!ke", name = "Ob", descriptor = "Lrd;")
    public static class114 field1658 = class84.method656(",Zffentlicher Chat", (byte) 115);

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!ke", name = "Jb", descriptor = "I")
    public static int field1653 = -1;

    @OriginalMember(owner = "client!ke", name = "Kb", descriptor = "Lrd;")
    public static class114 field1654 = class84.method656("Angreifen", (byte) 124);

    @OriginalMember(owner = "client!ke", name = "Pb", descriptor = "I")
    public static int field1659 = 0;

    @OriginalMember(owner = "client!ke", name = "Mb", descriptor = "Lrd;")
    private static class114 field1656 = class84.method656("Please subscribe)1 or use a different world)3", (byte) 121);

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "[I")
    public static int[] field1625 = new int[25];

    @OriginalMember(owner = "client!ke", name = "ob", descriptor = "Lrd;")
    public static class114 field1632 = field1656;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ke", name = "rb", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ke", name = "sb", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ke", name = "vb", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ke", name = "Ab", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ke", name = "Cb", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ke", name = "Fb", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ke", name = "Lb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ke", name = "Nb", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ke", name = "Rb", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ke", name = "yb", descriptor = "Lpb;")
    public static class100 field1642;

    @OriginalMember(owner = "client!ke", name = "wb", descriptor = "Ljd;")
    public static class66 field1640;

    @OriginalMember(owner = "client!ke", name = "zb", descriptor = "Loa;")
    public static class93 field1643;

    @OriginalMember(owner = "client!ke", name = "tb", descriptor = "Z")
    public static boolean field1637;

    @OriginalMember(owner = "client!ke", name = "Qb", descriptor = "[I")
    public static int[] field1660;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "[Z")
    private volatile boolean[] field1624;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
    public final int method589(int arg0) {
        ++field1657;
        if (this.field1631) {
            return 100;
        } else if (super.field2274 != null) {
            return 99;
        } else if (arg0 != 0) {
            return 46;
        } else {
            int var2 = class34.method244(255, 32, this.field1651);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)I")
    private final int method590(int arg0, int arg1) {
        ++field1661;
        if (super.field2274[arg1] != null) {
            return 100;
        } else if (arg0 != 30637) {
            return 23;
        } else {
            return this.field1624[arg1] ? 100 : class34.method244(this.field1651, 68, arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
    public static final void method591(byte arg0) {
        ++field1655;
        if (arg0 == -61) {
            for (int var1 = 0; ~class85.field1923 < ~var1; ++var1) {
                int var10002 = class9.field141[var1]--;
                if (~class9.field141[var1] <= 9) {
                    class57 var3 = class31.field626[var1];
                    if (var3 == null) {
                        var3 = class57.method421(class12.field280, class72.field1616[var1], 0);
                        if (var3 == null) {
                            continue;
                        }
                        class9.field141[var1] += var3.method420();
                        class31.field626[var1] = var3;
                    }
                    if (~class9.field141[var1] > -1) {
                        int var4;
                        if (~class46.field954[var1] == -1) {
                            var4 = class58.field1208;
                        } else {
                            int var5 = (class46.field954[var1] & 255) * 128;
                            int var6 = (16731272 & class46.field954[var1]) >> 16;
                            int var7 = var6 * 128 + 64 - class7.field103.field712;
                            int var8 = 255 & class46.field954[var1] >> 8;
                            if (var7 < 0) {
                                var7 = -var7;
                            }
                            int var9 = var8 * 128 + 64 + -class7.field103.field756;
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = var9 - 128 + var7;
                            if (var10 > var5) {
                                class9.field141[var1] = -100;
                                continue;
                            }
                            if (~var10 > -1) {
                                var10 = 0;
                            }
                            var4 = (-var10 + var5) * class84.field1860 / var5;
                        }
                        class87 var11 = var3.method418().method664(class80.field1819);
                        class4 var12 = class4.method47(var11, 100, var4);
                        var12.method16(class143.field3415[var1] + -1);
                        class29.field614.method895(var12);
                        class9.field141[var1] = -100;
                    }
                } else {
                    --class85.field1923;
                    for (int var2 = var1; ~class85.field1923 < ~var2; ++var2) {
                        class72.field1616[var2] = class72.field1616[var2 + 1];
                        class31.field626[var2] = class31.field626[var2 + 1];
                        class143.field3415[var2] = class143.field3415[var2 + 1];
                        class9.field141[var2] = class9.field141[var2 + 1];
                        class46.field954[var2] = class46.field954[var2 - -1];
                    }
                    --var1;
                }
            }
            if (class82.field1828 > 0) {
                class82.field1828 -= 20;
                if (~class82.field1828 > -1) {
                    class82.field1828 = 0;
                }
                if (class82.field1828 == 0 && class39.field825 != 0 && class8.field112 != -1) {
                    class78.method618(0, class8.field112, false, class137.field3318, 0, class39.field825, (byte) 124);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)V")
    public final void method592(int arg0, int arg1) {
        this.field1628 = arg1;
        if (this.field1633 != null) {
            class70.method558(this.field1633, this.field1651, arg0 + 30004, this);
        } else {
            class128.method989(this, this.field1651, this.field1628, (byte) -16, 255, (byte) 0, true);
        }
        if (arg0 == -30004) {
            ++field1649;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
    public final void method593(int arg0, int arg1) {
        ++field1626;
        if (this.field1627 != null && this.field1624 != null && this.field1624[arg0]) {
            class70.method558(this.field1627, arg0, 0, this);
        } else {
            class128.method989(this, arg0, super.field2280[arg0], (byte) -16, this.field1651, (byte) 2, true);
        }
        if (arg1 != -1126799000) {
            this.method598(false, -48, (byte) 14, (byte[]) null, false);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILtd;I)V")
    public static final void method594(int arg0, int arg1, class126 arg2, int arg3) {
        if (~arg2.field750 == ~arg1 && arg1 != -1) {
            int var4 = class12.method97(arg1, false).field604;
            if (~var4 == -2) {
                arg2.field694 = 0;
                arg2.field705 = arg0;
                arg2.field692 = 0;
                arg2.field755 = 0;
            }
            if (var4 == 2) {
                arg2.field694 = 0;
            }
        } else if (~arg1 == 0 || ~arg2.field750 == 0 || ~class12.method97(arg1, false).field613 <= ~class12.method97(arg2.field750, false).field613) {
            arg2.field705 = arg0;
            arg2.field742 = arg2.field754;
            arg2.field694 = 0;
            arg2.field755 = 0;
            arg2.field692 = 0;
            arg2.field750 = arg1;
        }
        if (arg3 != 2) {
            method591((byte) -45);
        }
        ++field1644;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ld;Ld;IZZZ)V")
    public class73(class22 arg0, class22 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1633 = arg1;
        this.field1651 = arg2;
        this.field1627 = arg0;
        this.field1648 = arg5;
        class78.method624(9, this, this.field1651);
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    private final void method595(int arg0) {
        ++field1621;
        this.field1624 = new boolean[super.field2274.length];
        for (int var2 = arg0; ~this.field1624.length < ~var2; ++var2) {
            this.field1624[var2] = false;
        }
        if (this.field1627 == null) {
            this.field1631 = true;
        } else {
            this.field1641 = -1;
            for (int var3 = 0; var3 < this.field1624.length; ++var3) {
                if (~super.field2290[var3] < -1) {
                    class62.method507(var3, this, this.field1627, true);
                    this.field1641 = var3;
                }
            }
            if (this.field1641 == -1) {
                this.field1631 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[BLd;Z)V")
    public final void method596(int arg0, int arg1, byte[] arg2, class22 arg3, boolean arg4) {
        ++field1639;
        if (arg1 >= -43) {
            this.field1641 = 120;
        }
        if (this.field1633 == arg3) {
            if (this.field1631) {
                throw new RuntimeException();
            } else if (arg2 == null) {
                class128.method989(this, this.field1651, this.field1628, (byte) -16, 255, (byte) 0, true);
            } else {
                class109.field2500.reset();
                class109.field2500.update(arg2, 0, arg2.length);
                int var6 = (int) class109.field2500.getValue();
                if (~this.field1628 != ~var6) {
                    class128.method989(this, this.field1651, this.field1628, (byte) -16, 255, (byte) 0, true);
                } else {
                    this.method757(arg2, (byte) -125);
                    this.method595(0);
                }
            }
        } else {
            if (!arg4 && ~this.field1641 == ~arg0) {
                this.field1631 = true;
            }
            if (arg2 != null && arg2.length > 2) {
                class109.field2500.reset();
                class109.field2500.update(arg2, 0, arg2.length + -2);
                int var7 = (int) class109.field2500.getValue();
                int var8 = ((arg2[arg2.length + -2] & 255) << 8) - -(255 & arg2[arg2.length - 1]);
                if (~super.field2280[arg0] == ~var7 && ~super.field2309[arg0] == ~var8) {
                    this.field1624[arg0] = true;
                    if (arg4) {
                        super.field2274[arg0] = class141.method1129(122, arg2, false);
                    }
                } else {
                    this.field1624[arg0] = false;
                    if (this.field1648 || arg4) {
                        class128.method989(this, arg0, super.field2280[arg0], (byte) -16, this.field1651, (byte) 2, arg4);
                    }
                }
            } else {
                this.field1624[arg0] = false;
                if (this.field1648 || arg4) {
                    class128.method989(this, arg0, super.field2280[arg0], (byte) -16, this.field1651, (byte) 2, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1656 = null;
        field1658 = null;
        field1632 = null;
        field1638 = null;
        field1660 = null;
        field1652 = null;
        field1643 = null;
        field1654 = null;
        field1650 = null;
        field1640 = null;
        if (arg0 == 17579) {
            field1645 = null;
            field1642 = null;
            field1625 = null;
            field1647 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIB[BZ)V")
    public final void method598(boolean arg0, int arg1, byte arg2, byte[] arg3, boolean arg4) {
        ++field1629;
        if (arg2 != 0) {
            this.method595(-42);
        }
        if (arg4) {
            if (this.field1631) {
                throw new RuntimeException();
            } else {
                if (this.field1633 != null) {
                    class122.method950(arg3, this.field1633, this.field1651, true);
                }
                this.method757(arg3, (byte) 118);
                this.method595(0);
            }
        } else {
            arg3[arg3.length + -2] = (byte) (super.field2309[arg1] >> 8);
            arg3[arg3.length - 1] = (byte) super.field2309[arg1];
            if (this.field1627 != null) {
                class122.method950(arg3, this.field1627, arg1, true);
                this.field1624[arg1] = true;
            }
            if (arg0) {
                super.field2274[arg1] = class141.method1129(arg2 + 114, arg3, false);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
    public final void method599(int arg0, byte arg1) {
        class117.method910(125, this.field1651, arg0);
        if (arg1 > 1) {
            ++field1622;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)I")
    public final int method600(boolean arg0) {
        if (arg0) {
            method594(-17, 34, (class126) null, -125);
        }
        ++field1636;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; super.field2274.length > var4; ++var4) {
            if (~super.field2290[var4] < -1) {
                var2 += 100;
                var3 += this.method590(30637, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(II)Z")
    public static final boolean method601(int arg0, int arg1) {
        if (arg0 <= 38) {
            field1656 = null;
        }
        ++field1646;
        return ~(1 & arg1 >> 20) != -1;
    }
}
