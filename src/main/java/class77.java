import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 extends class29 {

    @OriginalMember(owner = "client!me", name = "zc", descriptor = "I")
    public int field1756 = -1;

    @OriginalMember(owner = "client!me", name = "Fc", descriptor = "I")
    public int field1762 = 0;

    @OriginalMember(owner = "client!me", name = "Ec", descriptor = "I")
    public int field1761 = 0;

    @OriginalMember(owner = "client!me", name = "Nc", descriptor = "I")
    public int field1770 = 0;

    @OriginalMember(owner = "client!me", name = "Pc", descriptor = "I")
    public int field1772 = -1;

    @OriginalMember(owner = "client!me", name = "Sc", descriptor = "Z")
    public boolean field1775 = false;

    @OriginalMember(owner = "client!me", name = "Uc", descriptor = "I")
    public int field1777 = 0;

    @OriginalMember(owner = "client!me", name = "Rc", descriptor = "I")
    public int field1774 = 0;

    @OriginalMember(owner = "client!me", name = "Tc", descriptor = "Li;")
    public static class48 field1776 = new class48(30);

    @OriginalMember(owner = "client!me", name = "Yc", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1781 = new CRC32();

    @OriginalMember(owner = "client!me", name = "fd", descriptor = "I")
    public static int field1788 = 0;

    @OriginalMember(owner = "client!me", name = "Zc", descriptor = "Lva;")
    private static class121 field1782 = class107.method797("Loaded textures", -10983);

    @OriginalMember(owner = "client!me", name = "bd", descriptor = "Lva;")
    private static class121 field1784 = class107.method797("Please try using a different world)3", -10983);

    @OriginalMember(owner = "client!me", name = "gd", descriptor = "Lva;")
    public static class121 field1789 = field1784;

    @OriginalMember(owner = "client!me", name = "ad", descriptor = "Lva;")
    public static class121 field1783 = field1782;

    @OriginalMember(owner = "client!me", name = "id", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!me", name = "dd", descriptor = "Lva;")
    public static class121 field1786 = field1784;

    @OriginalMember(owner = "client!me", name = "hd", descriptor = "Lva;")
    public static class121 field1790 = field1784;

    @OriginalMember(owner = "client!me", name = "jd", descriptor = "Lva;")
    public static class121 field1792 = field1784;

    @OriginalMember(owner = "client!me", name = "ed", descriptor = "Lva;")
    public static class121 field1787 = field1784;

    @OriginalMember(owner = "client!me", name = "cd", descriptor = "Lva;")
    public static class121 field1785 = field1784;

    @OriginalMember(owner = "client!me", name = "yc", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!me", name = "Ac", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!me", name = "Bc", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!me", name = "Cc", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!me", name = "Dc", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!me", name = "Gc", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!me", name = "Hc", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!me", name = "Ic", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!me", name = "Kc", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!me", name = "Lc", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!me", name = "Oc", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!me", name = "Qc", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!me", name = "Wc", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!me", name = "Xc", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!me", name = "Vc", descriptor = "Lrb;")
    public class102 field1778;

    @OriginalMember(owner = "client!me", name = "Jc", descriptor = "Lva;")
    public class121 field1766;

    @OriginalMember(owner = "client!me", name = "Mc", descriptor = "Lnd;")
    public class82 field1769;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(IIII)Z", line = 5)
    public static final boolean method529(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class58.field1348.method741(class121.field2807, arg3, arg0, arg1);
        ++field1763;
        if (arg2 > -54) {
            return true;
        } else {
            int var5 = (arg1 & 536862858) >> 14;
            if (~var4 == 0) {
                return false;
            } else {
                int var6 = var4 & 31;
                int var7 = var4 >> 6 & 3;
                if (var6 != 10 && var6 != 11 && var6 != 22) {
                    class115.method880(true, arg0, 25, 0, 0, 2, var7, 0, arg3, class62.field1494.field767[0], var6 + 1, class62.field1494.field730[0]);
                } else {
                    class59 var8 = class20.method179(6, var5);
                    int var9;
                    int var10;
                    if (~var7 != -1 && ~var7 != -3) {
                        var9 = var8.field1371;
                        var10 = var8.field1387;
                    } else {
                        var10 = var8.field1371;
                        var9 = var8.field1387;
                    }
                    int var11 = var8.field1393;
                    if (~var7 != -1) {
                        var11 = (var11 >> 4 - var7) + (15 & var11 << var7);
                    }
                    class115.method880(true, arg0, 25, var9, var11, 2, 0, var10, arg3, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                }
                class66.field1592 = class15.field280;
                class12.field229 = 2;
                class97.field2171 = class82.field1909;
                class41.field952 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Lrb;", line = 66)
    public final class102 method188(int arg0) {
        ++field1780;
        if (this.field1769 == null) {
            return null;
        } else {
            class41 var2 = ~super.field793 != 0 && super.field778 == 0 ? class5.method33(9, super.field793) : null;
            class41 var3 = ~super.field777 == 0 || this.field1775 || ~super.field777 == ~super.field740 && var2 != null ? null : class5.method33(9, super.field777);
            class102 var4 = this.field1769.method561(false, super.field733, var3, var2, super.field785);
            if (var4 == null) {
                return null;
            } else {
                if (arg0 <= 60) {
                    method531(97);
                }
                var4.method714();
                super.field784 = var4.field1965;
                if (!this.field1775 && super.field751 != -1 && ~super.field732 != 0) {
                    class102 var5 = class61.method446(super.field751, -119).method666((byte) 125, super.field732);
                    if (var5 != null) {
                        var5.method691(0, -super.field772, 0);
                        class102[] var6 = new class102[] { var4, var5 };
                        var4 = new class102(var6, 2, true);
                    }
                }
                if (!this.field1775 && this.field1778 != null) {
                    if (~this.field1774 >= ~class115.field2614) {
                        this.field1778 = null;
                    }
                    if (this.field1761 <= class115.field2614 && this.field1774 > class115.field2614) {
                        class102 var7 = this.field1778;
                        var7.method691(-super.field750 + this.field1767, -this.field1758 + this.field1779, this.field1760 - super.field742);
                        class102[] var8 = new class102[] { var4, var7 };
                        if (~super.field725 != -513) {
                            if (super.field725 == 1024) {
                                var7.method688();
                                var7.method688();
                            } else if (~super.field725 == -1537) {
                                var7.method688();
                            }
                        } else {
                            var7.method688();
                            var7.method688();
                            var7.method688();
                        }
                        var4 = new class102(var8, 2, true);
                        if (~super.field725 != -513) {
                            if (super.field725 != 1024) {
                                if (~super.field725 == -1537) {
                                    var7.method688();
                                    var7.method688();
                                    var7.method688();
                                }
                            } else {
                                var7.method688();
                                var7.method688();
                            }
                        } else {
                            var7.method688();
                        }
                        var7.method691(-this.field1767 + super.field750, -this.field1779 + this.field1758, -this.field1760 + super.field742);
                    }
                }
                var4.field2289 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Z", line = 179)
    public final boolean method232(int arg0) {
        ++field1759;
        if (arg0 != -251272184) {
            this.field1755 = -125;
        }
        return this.field1769 != null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ltc;Z)V", line = 198)
    public final void method530(class113 arg0, boolean arg1) {
        arg0.field2507 = 0;
        ++field1764;
        int var3 = arg0.method821(true);
        this.field1772 = arg0.method841(true);
        int[] var4 = new int[12];
        int var5 = -1;
        this.field1756 = arg0.method841(!arg1);
        this.field1777 = 0;
        if (arg1) {
            method531(-25);
        }
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method821(!arg1);
            if (var7 == 0) {
                var4[var6] = 0;
            } else {
                int var8 = arg0.method821(true);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && ~var4[0] == -65536) {
                    var5 = arg0.method870(-1);
                    break;
                }
                if (var4[var6] >= 512) {
                    int var12 = class114.method872((byte) 121, var4[var6] - 512).field2748;
                    if (var12 != 0) {
                        this.field1777 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg0.method821(true);
            if (~var11 > -1 || ~class41.field930[var10].length >= ~var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field740 = arg0.method870(-1);
        if (super.field740 == 65535) {
            super.field740 = -1;
        }
        super.field738 = arg0.method870(-1);
        if (~super.field738 == -65536) {
            super.field738 = -1;
        }
        super.field769 = arg0.method870(-1);
        if (super.field769 == 65535) {
            super.field769 = -1;
        }
        super.field759 = arg0.method870(-1);
        if (super.field759 == 65535) {
            super.field759 = -1;
        }
        super.field721 = arg0.method870(-1);
        if (~super.field721 == -65536) {
            super.field721 = -1;
        }
        super.field765 = arg0.method870(-1);
        if (super.field765 == 65535) {
            super.field765 = -1;
        }
        super.field736 = arg0.method870(-1);
        if (~super.field736 == -65536) {
            super.field736 = -1;
        }
        this.field1766 = class95.method636(-3, arg0.method854(103)).method963(-14767);
        this.field1770 = arg0.method821(true);
        this.field1762 = arg0.method870(-1);
        if (this.field1769 == null) {
            this.field1769 = new class82();
        }
        this.field1769.method570(var9, var5, ~var3 == -2, 13314, var4);
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V", line = 372)
    public static void method531(int arg0) {
        field1790 = null;
        if (arg0 != 12) {
            method529(-13, 72, -83, 104);
        }
        field1786 = null;
        field1782 = null;
        field1784 = null;
        field1787 = null;
        field1783 = null;
        field1792 = null;
        field1776 = null;
        field1785 = null;
        field1781 = null;
        field1789 = null;
    }
}
