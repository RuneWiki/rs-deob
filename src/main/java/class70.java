import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 extends class115 {

    @OriginalMember(owner = "client!ka", name = "Rc", descriptor = "I")
    public int field1640 = 0;

    @OriginalMember(owner = "client!ka", name = "Pc", descriptor = "I")
    public int field1638 = 0;

    @OriginalMember(owner = "client!ka", name = "fd", descriptor = "I")
    public int field1654 = 0;

    @OriginalMember(owner = "client!ka", name = "Nc", descriptor = "I")
    public int field1636 = 0;

    @OriginalMember(owner = "client!ka", name = "Tc", descriptor = "Z")
    public boolean field1642 = false;

    @OriginalMember(owner = "client!ka", name = "ed", descriptor = "I")
    public int field1653 = 0;

    @OriginalMember(owner = "client!ka", name = "md", descriptor = "I")
    public int field1661 = -1;

    @OriginalMember(owner = "client!ka", name = "bd", descriptor = "I")
    public int field1650 = -1;

    @OriginalMember(owner = "client!ka", name = "Ic", descriptor = "[[[I")
    public static int[][][] field1631 = new int[4][105][105];

    @OriginalMember(owner = "client!ka", name = "Yc", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!ka", name = "Mc", descriptor = "Lec;")
    private static class32 field1635 = class73.method594("Connecting to update server", true);

    @OriginalMember(owner = "client!ka", name = "Ec", descriptor = "Lec;")
    public static class32 field1627 = field1635;

    @OriginalMember(owner = "client!ka", name = "Lc", descriptor = "I")
    public static int field1634 = -1;

    @OriginalMember(owner = "client!ka", name = "Hc", descriptor = "I")
    public static int field1630 = 127;

    @OriginalMember(owner = "client!ka", name = "kd", descriptor = "I")
    public static int field1659 = 0;

    @OriginalMember(owner = "client!ka", name = "nd", descriptor = "Lec;")
    private static class32 field1662 = class73.method594("Close", true);

    @OriginalMember(owner = "client!ka", name = "id", descriptor = "Lec;")
    public static class32 field1657 = field1662;

    @OriginalMember(owner = "client!ka", name = "Dc", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ka", name = "Fc", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!ka", name = "Gc", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ka", name = "Kc", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!ka", name = "Oc", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!ka", name = "Sc", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ka", name = "Uc", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!ka", name = "Vc", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "client!ka", name = "Wc", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!ka", name = "Xc", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "client!ka", name = "Zc", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ka", name = "ad", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!ka", name = "cd", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ka", name = "hd", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ka", name = "jd", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ka", name = "gd", descriptor = "Lod;")
    public class101 field1655;

    @OriginalMember(owner = "client!ka", name = "Jc", descriptor = "Leb;")
    public class31 field1632;

    @OriginalMember(owner = "client!ka", name = "ld", descriptor = "Lec;")
    public class32 field1660;

    @OriginalMember(owner = "client!ka", name = "Qc", descriptor = "[I")
    public static int[] field1639;

    @OriginalMember(owner = "client!ka", name = "dd", descriptor = "[Lh;")
    public static class49[] field1652;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjd;)V")
    public final void method577(byte arg0, class66 arg1) {
        arg1.field1569 = 0;
        ++field1656;
        int[] var3 = new int[12];
        int var4 = -1;
        int var5 = arg1.method533(255);
        this.field1650 = arg1.method545((byte) 105);
        this.field1661 = arg1.method545((byte) 80);
        this.field1638 = 0;
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg1.method533(255);
            if (~var7 == -1) {
                var3[var6] = 0;
            } else {
                int var8 = arg1.method533(255);
                var3[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var3[0] == 65535) {
                    var4 = arg1.method532(0);
                    break;
                }
                if (var3[var6] >= 512) {
                    int var13 = class146.method1094(var3[var6] - 512, 122).field1426;
                    if (~var13 != -1) {
                        this.field1638 = var13;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var12 = arg1.method533(255);
            if (var12 < 0 || ~class140.field3220[var10].length >= ~var12) {
                var12 = 0;
            }
            var9[var10] = var12;
        }
        super.field2689 = arg1.method532(0);
        if (super.field2689 == 65535) {
            super.field2689 = -1;
        }
        super.field2746 = arg1.method532(0);
        if (~super.field2746 == -65536) {
            super.field2746 = -1;
        }
        int var11 = 35 / ((arg0 - -36) / 58);
        super.field2718 = super.field2746;
        super.field2711 = arg1.method532(0);
        if (~super.field2711 == -65536) {
            super.field2711 = -1;
        }
        super.field2736 = arg1.method532(0);
        if (super.field2736 == 65535) {
            super.field2736 = -1;
        }
        super.field2725 = arg1.method532(0);
        if (~super.field2725 == -65536) {
            super.field2725 = -1;
        }
        super.field2731 = arg1.method532(0);
        if (~super.field2731 == -65536) {
            super.field2731 = -1;
        }
        super.field2707 = arg1.method532(0);
        if (~super.field2707 == -65536) {
            super.field2707 = -1;
        }
        this.field1660 = class9.method59(arg1.method528(-109), 1).method264((byte) 52);
        this.field1636 = arg1.method533(255);
        this.field1653 = arg1.method532(0);
        if (this.field1632 == null) {
            this.field1632 = new class31();
        }
        this.field1632.method232(var9, var4, var3, ~var5 == -2, (byte) -19);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Lod;")
    public final class101 method132(byte arg0) {
        ++field1629;
        if (this.field1632 == null) {
            return null;
        } else {
            class149 var2 = ~super.field2714 != 0 && ~super.field2717 == -1 ? class97.method762((byte) 95, super.field2714) : null;
            class149 var3 = ~super.field2710 == 0 || this.field1642 || ~super.field2710 == ~super.field2689 && var2 != null ? null : class97.method762((byte) 123, super.field2710);
            if (arg0 != 109) {
                return null;
            } else {
                class101 var4 = this.field1632.method233(var2, super.field2730, var3, -5774, super.field2727);
                if (var4 == null) {
                    return null;
                } else {
                    var4.method806();
                    super.field2690 = var4.field470;
                    if (!this.field1642 && super.field2733 != -1 && super.field2756 != -1) {
                        class101 var5 = class38.method317(super.field2733, -14).method1019(118, super.field2756);
                        if (var5 != null) {
                            class101[] var6 = new class101[] { var4, var5 };
                            var5.method819(0, -super.field2729, 0);
                            var4 = new class101(var6, 2);
                        }
                    }
                    if (!this.field1642 && this.field1655 != null) {
                        if (~this.field1654 >= ~class140.field3219) {
                            this.field1655 = null;
                        }
                        if (~this.field1640 >= ~class140.field3219 && this.field1654 > class140.field3219) {
                            class101 var7 = this.field1655;
                            var7.method819(-super.field2749 + this.field1628, -this.field1644 + this.field1645, this.field1649 - super.field2700);
                            if (~super.field2744 == -513) {
                                var7.method803();
                                var7.method803();
                                var7.method803();
                            } else if (super.field2744 != 1024) {
                                if (super.field2744 == 1536) {
                                    var7.method803();
                                }
                            } else {
                                var7.method803();
                                var7.method803();
                            }
                            class101[] var8 = new class101[] { var4, var7 };
                            var4 = new class101(var8, 2);
                            if (super.field2744 != 512) {
                                if (~super.field2744 == -1025) {
                                    var7.method803();
                                    var7.method803();
                                } else if (~super.field2744 == -1537) {
                                    var7.method803();
                                    var7.method803();
                                    var7.method803();
                                }
                            } else {
                                var7.method803();
                            }
                            var7.method819(-this.field1628 + super.field2749, this.field1644 - this.field1645, -this.field1649 + super.field2700);
                        }
                    }
                    var4.field2324 = true;
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)I")
    public static final int method578(byte arg0, int arg1) {
        class4 var2 = class80.method637(arg1, (byte) -124);
        int var3 = var2.field75;
        if (arg0 != -98) {
            return -32;
        } else {
            int var4 = var2.field66;
            ++field1658;
            int var5 = var2.field78;
            int var6 = class117.field2781[var5 - var4];
            return class27.field504[var3] >> var4 & var6;
        }
    }

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "(I)Z")
    public final boolean method579(int arg0) {
        ++field1641;
        if (arg0 != 0) {
            method578((byte) 110, -75);
        }
        return this.field1632 != null;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static final void method580(byte arg0) {
        ++field1651;
        field1639 = null;
        if (arg0 == 29) {
            class74.field1747 = null;
            class147.field3346 = null;
            class126.field2927 = null;
            class34.field720 = null;
            class31.field616 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public static void method581(byte arg0) {
        field1657 = null;
        field1652 = null;
        field1627 = null;
        if (arg0 == -68) {
            field1639 = null;
            field1631 = null;
            field1662 = null;
            field1635 = null;
        }
    }
}
