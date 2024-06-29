import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class128 {

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    private int field1692 = 0;

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "I")
    private int field1707 = 0;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    private int field1701 = -1;

    @OriginalMember(owner = "client!qea", name = "D", descriptor = "I")
    private int field1719 = -1;

    @OriginalMember(owner = "client!qea", name = "F", descriptor = "I")
    private int field1720 = -1;

    @OriginalMember(owner = "client!qea", name = "H", descriptor = "Z")
    private boolean field1721 = false;

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "Z")
    private boolean field1715 = false;

    @OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public int field1697;

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "B")
    private byte field1704;

    @OriginalMember(owner = "client!qea", name = "O", descriptor = "Lvs;")
    private class593 field1728;

    @OriginalMember(owner = "client!qea", name = "I", descriptor = "B")
    private byte field1722;

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "Z")
    private boolean field1702;

    @OriginalMember(owner = "client!qea", name = "w", descriptor = "Lqe;")
    public static class469 field1712 = new class469(69, 4);

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!qea", name = "v", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!qea", name = "x", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client!qea", name = "A", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!qea", name = "B", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!qea", name = "C", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!qea", name = "J", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!qea", name = "N", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "Lr;")
    private class183 field1691;

    @OriginalMember(owner = "client!qea", name = "K", descriptor = "Lao;")
    private class288 field1724;

    @OriginalMember(owner = "client!qea", name = "Q", descriptor = "Lqe;")
    public static class469 field1730;

    @OriginalMember(owner = "client!qea", name = "u", descriptor = "Lka;")
    private class473 field1710;

    @OriginalMember(owner = "client!qea", name = "P", descriptor = "Lgk;")
    public static class476 field1729;

    @OriginalMember(owner = "client!qea", name = "M", descriptor = "Lfe;")
    private class572 field1726;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "Lpaa;")
    public class626 field1690;

    @OriginalMember(owner = "client!qea", name = "L", descriptor = "[Z")
    private boolean[] field1725;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lfe;I)V", line = 4)
    public final void method896(class572 arg0, int arg1) {
        this.field1710 = null;
        if (arg1 == 6706) {
            field1698++;
            this.field1726 = arg0;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZI)V", line = 17)
    private final void method897(boolean arg0, int arg1) {
        field1718++;
        int var3 = arg1;
        boolean var4 = arg0;
        if (arg1 == -1) {
            class211 var5 = class239.field3470.method388(this.field1709, 100);
            class211 var6 = var5;
            if (var5.field3172 != null) {
                var5 = var5.method1442((byte) -40, class83.field1160);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3176 != null) {
                if (this.field1724 != null && var5.method1430(true, this.field1724.field4102)) {
                    return;
                }
                var3 = var5.method1441(-65);
                if (this.field1701 != var5.field3158) {
                    var4 = var5.field3108;
                }
            } else if (var5.field3092 == -1) {
                if (var6 != null && var6.field3176 != null) {
                    if (this.field1724 != null && var6.method1430(!arg0, this.field1724.field4102)) {
                        return;
                    }
                    var3 = var6.method1441(91);
                    if (this.field1701 != var6.field3158) {
                        var4 = var6.field3108;
                    }
                } else if (var6 != null && var6.field3092 != -1 && this.field1701 != var6.field3158) {
                    var4 = var6.field3108;
                    var3 = var6.field3092;
                }
            } else if (this.field1701 != var5.field3158) {
                var3 = var5.field3092;
                var4 = var5.field3108;
            }
        }
        if (var3 == -1) {
            this.field1724 = null;
            return;
        }
        this.field1710 = null;
        if (this.field1724 == null || this.field1724.field4102 != var3) {
            this.field1724 = class742.field10404.method2663(0, var3);
        } else if (this.field1724.field4094 == 0) {
            return;
        }
        if (this.field1724.field4081 == null) {
            this.field1724 = null;
            return;
        }
        if (var4) {
            this.field1714 = (int) ((double) this.field1724.field4081.length * Math.random());
            this.field1694 = (int) ((double) this.field1724.field4087[this.field1714] * Math.random()) + 1;
        } else {
            this.field1694 = 1;
            this.field1714 = 0;
        }
        this.field1699 = this.field1714 + 1;
        if (this.field1699 < 0 || this.field1724.field4081.length <= this.field1699) {
            this.field1699 = -1;
        }
        this.field1708 = class357.field5189 - this.field1694;
    }

    @OriginalMember(owner = "client!qea", name = "finalize", descriptor = "()V", line = 135)
    protected final void finalize() {
        if (this.field1690 != null) {
            this.field1690.method3605();
        }
        field1693++;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)I", line = 150)
    public final int method898(int arg0) {
        if (arg0 <= 48) {
            return -99;
        } else {
            field1716++;
            return this.field1707;
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)I", line = 167)
    public final int method899(int arg0) {
        field1700++;
        if (arg0 < 104) {
            this.finalize();
        }
        return this.field1692;
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)Z", line = 181)
    public final boolean method900(int arg0) {
        if (arg0 < 114) {
            this.field1719 = 62;
        }
        field1713++;
        return this.field1702;
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lha;Lsu;IIIILvs;ZI)V", line = 576)
    public class128(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, class593 arg6, boolean arg7, int arg8) {
        this.field1709 = arg1.field3158;
        this.field1696 = arg3;
        this.field1697 = arg2;
        this.field1704 = (byte) arg5;
        this.field1728 = arg6;
        this.field1722 = (byte) arg4;
        this.field1715 = arg7;
        this.field1702 = arg0.method456() && arg1.field3175 && !this.field1715;
        if (arg8 != -1) {
            this.field1721 = true;
        }
        this.method897(false, arg8);
    }

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "(I)V", line = 196)
    public static void method901(int arg0) {
        field1730 = null;
        if (arg0 != 0) {
            method901(-112);
        }
        field1712 = null;
        field1729 = null;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V", line = 210)
    public final void method902(int arg0, byte arg1) {
        field1695++;
        if (arg1 != -110) {
            this.method896(null, 26);
        }
        this.field1721 = true;
        this.method897(false, arg0);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lha;IIZZ)Lka;", line = 223)
    public final class473 method903(class60 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field1723++;
        class211 var6 = class239.field3470.method388(this.field1709, 100);
        if (var6.field3172 != null) {
            var6 = var6.method1442((byte) -37, class83.field1160);
        }
        if (var6 == null) {
            this.method907(12898, arg0);
            this.field1720 = -1;
            this.field1701 = -1;
            this.field1719 = -1;
            return null;
        }
        if (!this.field1721 && this.field1701 != var6.field3158) {
            this.field1710 = null;
            this.method897(false, -1);
        }
        this.method904(-1, this.field1728);
        if (arg4) {
            boolean var7 = arg4 & this.field1702 & class63.field916.field10185.method2160(17503) != 0;
            arg4 = var7 & (this.field1719 != var6.field3158 || this.field1724 != null && class63.field916.field10185.method2160(17503) >= 2 && (this.field1720 != this.field1714 || (this.field1724.field4086 || class358.field5202) && this.field1714 != this.field1699));
        }
        if (arg3 && !arg4) {
            this.field1701 = var6.field3158;
            return null;
        }
        if (arg4) {
            class58.method405(this.field1691, this.field1704, this.field1728.field8423, this.field1728.field8428, this.field1725);
            this.field1720 = -1;
            this.field1719 = -1;
        }
        class280 var8 = class582.field8287[this.field1704];
        class280 var9;
        if (this.field1715) {
            var9 = class531.field7566[0];
        } else {
            var9 = this.field1704 >= 3 ? null : class582.field8287[this.field1704 + 1];
        }
        class473 var10 = null;
        if (arg2 <= 84) {
            this.method902(69, (byte) 39);
        }
        if (this.field1724 != null) {
            if (arg4) {
                arg1 |= 0x40000;
            }
            var10 = var6.method1440(this.field1728.field8423, this.field1699, this.field1697 == 11 ? 10 : this.field1697, this.field1728.field8428, arg1, this.field1694, var8.method1786(this.field1728.field8428, (byte) 113, this.field1728.field8423), this.field1724, -65536, var8, this.field1714, var9, this.field1697 == 11 ? this.field1696 + 4 : this.field1696, arg0, this.field1726);
            if (var10 == null) {
                this.field1691 = null;
                this.field1692 = 0;
                this.field1725 = null;
                this.field1707 = 0;
            } else {
                if (arg4) {
                    if (this.field1725 == null) {
                        this.field1725 = new boolean[4];
                    }
                    this.field1691 = var10.method242(this.field1691);
                    class467.method2833(this.field1691, this.field1704, this.field1728.field8423, this.field1728.field8428, this.field1725);
                    this.field1720 = this.field1714;
                    this.field1719 = var6.field3158;
                }
                this.field1707 = var10.method253();
                this.field1692 = var10.method269();
            }
            this.field1710 = null;
        } else if (this.field1710 != null && (arg1 & this.field1710.method255()) == arg1 && this.field1701 == var6.field3158) {
            var10 = this.field1710;
        } else {
            if (this.field1710 != null) {
                arg1 |= this.field1710.method255();
            }
            class77 var11 = var6.method1443((byte) 101, arg4, var9, this.field1697 == 11 ? this.field1696 + 4 : this.field1696, var8.method1786(this.field1728.field8428, (byte) 113, this.field1728.field8423), arg1, this.field1726, this.field1697 == 11 ? 10 : this.field1697, arg0, this.field1728.field8423, this.field1728.field8428, var8);
            if (var11 == null) {
                this.field1725 = null;
                this.field1710 = null;
                this.field1692 = 0;
                this.field1707 = 0;
                this.field1691 = null;
            } else {
                var10 = var11.field1068;
                this.field1710 = var11.field1068;
                if (arg4) {
                    this.field1725 = null;
                    this.field1691 = var11.field1067;
                    class467.method2833(this.field1691, this.field1704, this.field1728.field8423, this.field1728.field8428, null);
                    this.field1719 = var6.field3158;
                    this.field1720 = -1;
                }
                this.field1707 = var10.method253();
                this.field1692 = var10.method269();
            }
        }
        this.field1701 = var6.field3158;
        return var10;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILvs;)V", line = 378)
    private final void method904(int arg0, class593 arg1) {
        field1703++;
        if (arg0 != -1) {
            this.method898(-115);
        }
        label90: while (true) {
            if (this.field1724 == null) {
                if (this.field1721) {
                    return;
                }
                this.method897(false, -1);
                if (this.field1724 == null) {
                    return;
                }
            }
            int var3 = class357.field5189 - this.field1708;
            if (var3 > 100 && this.field1724.field4082 > 0) {
                int var4 = this.field1724.field4081.length - this.field1724.field4082;
                while (var4 > this.field1714 && var3 > this.field1724.field4087[this.field1714]) {
                    var3 -= this.field1724.field4087[this.field1714];
                    this.field1714++;
                }
                if (var4 <= this.field1714) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field1724.field4081.length; var6++) {
                        var5 += this.field1724.field4087[var6];
                    }
                    var3 %= var5;
                }
                this.field1699 = this.field1714 + 1;
                if (this.field1699 >= this.field1724.field4081.length) {
                    this.field1699 -= this.field1724.field4082;
                    if (this.field1699 < 0 || this.field1699 >= this.field1724.field4081.length) {
                        this.field1699 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field1724.field4087[this.field1714]) {
                            this.field1708 = class357.field5189 - var3;
                            this.field1694 = var3;
                            return;
                        }
                        class294.method1865(this.field1714, arg1, this.field1724, -80);
                        var3 -= this.field1724.field4087[this.field1714];
                        this.field1714++;
                        if (this.field1714 >= this.field1724.field4081.length) {
                            this.field1714 -= this.field1724.field4082;
                            if (this.field1714 < 0 || this.field1714 >= this.field1724.field4081.length) {
                                this.field1724 = null;
                                continue label90;
                            }
                        }
                        this.field1699 = this.field1714 + 1;
                    } while (this.field1699 < this.field1724.field4081.length);
                    this.field1699 -= this.field1724.field4082;
                } while (this.field1699 >= 0 && this.field1724.field4081.length > this.field1699);
                this.field1699 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILha;)V", line = 479)
    public final void method905(int arg0, class60 arg1) {
        field1727++;
        this.method903(arg1, 262144, 87, true, true);
        int var3 = 72 / ((-arg0 - 57) / 45);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZILql;ILha;ILka;I)V", line = 489)
    public final void method906(int arg0, boolean arg1, int arg2, class738 arg3, int arg4, class60 arg5, int arg6, class473 arg7, int arg8) {
        field1711++;
        if (arg4 > -23) {
            this.method903(null, 27, 127, false, false);
        }
        class459[] var10 = arg7.method266();
        class285[] var11 = arg7.method285();
        if ((this.field1690 == null || this.field1690.field8759) && (var10 != null || var11 != null)) {
            class211 var12 = class239.field3470.method388(this.field1709, 100);
            if (var12.field3172 != null) {
                var12 = var12.method1442((byte) -45, class83.field1160);
            }
            if (var12 != null) {
                this.field1690 = class626.method3604(class357.field5189, true);
            }
        }
        if (this.field1690 == null) {
            return;
        }
        arg7.method244(arg3);
        if (arg1) {
            this.field1690.method3606(arg5, (long) class357.field5189, var10, var11, false);
        } else {
            this.field1690.method3617((long) class357.field5189);
        }
        this.field1690.method3608(this.field1722, arg6, arg8, arg2, arg0);
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(ILha;)V", line = 545)
    public final void method907(int arg0, class60 arg1) {
        if (this.field1691 != null) {
            class58.method405(this.field1691, this.field1704, this.field1728.field8423, this.field1728.field8428, this.field1725);
            this.field1725 = null;
            this.field1691 = null;
        }
        if (arg0 != 12898) {
            this.finalize();
        }
        field1705++;
    }
}
