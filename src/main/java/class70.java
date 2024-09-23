import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YIBRLAQY")
public class class70 {

    @OriginalMember(owner = "YIBRLAQY", name = "a", descriptor = "I")
    public int field1651 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "b", descriptor = "J")
    public long field1652 = -1L;

    @OriginalMember(owner = "YIBRLAQY", name = "c", descriptor = "I")
    public int field1653 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "e", descriptor = "Z")
    public boolean field1655 = true;

    @OriginalMember(owner = "YIBRLAQY", name = "o", descriptor = "I")
    public int field1665 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "q", descriptor = "I")
    public int field1667 = 32;

    @OriginalMember(owner = "YIBRLAQY", name = "r", descriptor = "I")
    public int field1668 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "s", descriptor = "I")
    private int field1669 = 128;

    @OriginalMember(owner = "YIBRLAQY", name = "t", descriptor = "I")
    public int field1670 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "v", descriptor = "Z")
    public boolean field1672 = false;

    @OriginalMember(owner = "YIBRLAQY", name = "w", descriptor = "I")
    public int field1673 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "z", descriptor = "I")
    private int field1676 = -47097;

    @OriginalMember(owner = "YIBRLAQY", name = "A", descriptor = "I")
    private int field1677 = 128;

    @OriginalMember(owner = "YIBRLAQY", name = "B", descriptor = "I")
    public int field1678 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "D", descriptor = "I")
    public int field1680 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "E", descriptor = "I")
    public int field1681 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "F", descriptor = "I")
    public int field1682 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "G", descriptor = "Z")
    public boolean field1683 = true;

    @OriginalMember(owner = "YIBRLAQY", name = "J", descriptor = "I")
    public int field1686 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "K", descriptor = "I")
    public int field1687 = -1;

    @OriginalMember(owner = "YIBRLAQY", name = "M", descriptor = "I")
    private int field1689 = 635;

    @OriginalMember(owner = "YIBRLAQY", name = "N", descriptor = "B")
    public byte field1690 = 1;

    @OriginalMember(owner = "YIBRLAQY", name = "g", descriptor = "LWIUIWDML;")
    public static class66 field1657 = new class66(-99, 30);

    @OriginalMember(owner = "YIBRLAQY", name = "m", descriptor = "Z")
    private static boolean field1663 = true;

    @OriginalMember(owner = "YIBRLAQY", name = "j", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "YIBRLAQY", name = "l", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "YIBRLAQY", name = "n", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "YIBRLAQY", name = "x", descriptor = "I")
    private static int field1674;

    @OriginalMember(owner = "YIBRLAQY", name = "L", descriptor = "LPKHWFJLM;")
    private static class43 field1688;

    @OriginalMember(owner = "YIBRLAQY", name = "f", descriptor = "Lclient;")
    public static client field1656;

    @OriginalMember(owner = "YIBRLAQY", name = "p", descriptor = "Ljava/lang/String;")
    public String field1666;

    @OriginalMember(owner = "YIBRLAQY", name = "C", descriptor = "[B")
    public byte[] field1679;

    @OriginalMember(owner = "YIBRLAQY", name = "d", descriptor = "[I")
    private int[] field1654;

    @OriginalMember(owner = "YIBRLAQY", name = "h", descriptor = "[I")
    private int[] field1658;

    @OriginalMember(owner = "YIBRLAQY", name = "i", descriptor = "[I")
    public int[] field1659;

    @OriginalMember(owner = "YIBRLAQY", name = "u", descriptor = "[I")
    private int[] field1671;

    @OriginalMember(owner = "YIBRLAQY", name = "y", descriptor = "[I")
    private int[] field1675;

    @OriginalMember(owner = "YIBRLAQY", name = "H", descriptor = "[I")
    private static int[] field1684;

    @OriginalMember(owner = "YIBRLAQY", name = "k", descriptor = "[LYIBRLAQY;")
    private static class70[] field1661;

    @OriginalMember(owner = "YIBRLAQY", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field1685;

    @OriginalMember(owner = "YIBRLAQY", name = "a", descriptor = "(I)LYIBRLAQY;")
    public final class70 method576(int arg0) {
        int var2 = -1;
        if (arg0 != 29839) {
            this.field1689 = 459;
        }
        if (this.field1668 != -1) {
            class4 var3 = class4.field27[this.field1668];
            int var4 = var3.field29;
            int var5 = var3.field30;
            int var6 = var3.field31;
            int var7 = client.field204[var6 - var5];
            var2 = field1656.field188[var4] >> var5 & var7;
        } else if (this.field1665 != -1) {
            var2 = field1656.field188[this.field1665];
        }
        return var2 < 0 || var2 >= this.field1659.length || this.field1659[var2] == -1 ? null : method579(this.field1659[var2]);
    }

    @OriginalMember(owner = "YIBRLAQY", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    private final void method577(class43 arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method330();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method330();
                    this.field1675 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1675[var6] = arg0.method332();
                    }
                } else if (var4 == 2) {
                    this.field1666 = arg0.method337();
                } else if (var4 == 3) {
                    this.field1679 = arg0.method338(5);
                } else if (var4 == 12) {
                    this.field1690 = arg0.method331();
                } else if (var4 == 13) {
                    this.field1678 = arg0.method332();
                } else if (var4 == 14) {
                    this.field1686 = arg0.method332();
                } else if (var4 == 17) {
                    this.field1686 = arg0.method332();
                    this.field1670 = arg0.method332();
                    this.field1682 = arg0.method332();
                    this.field1653 = arg0.method332();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1685 == null) {
                        this.field1685 = new String[5];
                    }
                    this.field1685[var4 - 30] = arg0.method337();
                    if (this.field1685[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1685[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method330();
                    this.field1658 = new int[var7];
                    this.field1654 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1658[var8] = arg0.method332();
                        this.field1654[var8] = arg0.method332();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method330();
                    this.field1671 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1671[var10] = arg0.method332();
                    }
                } else if (var4 == 90) {
                    this.field1680 = arg0.method332();
                } else if (var4 == 91) {
                    this.field1681 = arg0.method332();
                } else if (var4 == 92) {
                    this.field1687 = arg0.method332();
                } else if (var4 == 93) {
                    this.field1683 = false;
                } else if (var4 == 95) {
                    this.field1651 = arg0.method332();
                } else if (var4 == 97) {
                    this.field1669 = arg0.method332();
                } else if (var4 == 98) {
                    this.field1677 = arg0.method332();
                } else if (var4 == 99) {
                    this.field1672 = true;
                } else if (var4 == 100) {
                    this.field1664 = arg0.method331();
                } else if (var4 == 101) {
                    this.field1660 = arg0.method331() * 5;
                } else if (var4 == 102) {
                    this.field1673 = arg0.method332();
                } else if (var4 == 103) {
                    this.field1667 = arg0.method332();
                } else if (var4 == 106) {
                    this.field1668 = arg0.method332();
                    if (this.field1668 == 65535) {
                        this.field1668 = -1;
                    }
                    this.field1665 = arg0.method332();
                    if (this.field1665 == 65535) {
                        this.field1665 = -1;
                    }
                    int var11 = arg0.method330();
                    this.field1659 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1659[var12] = arg0.method332();
                        if (this.field1659[var12] == 65535) {
                            this.field1659[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field1655 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "YIBRLAQY", name = "a", descriptor = "(B)V")
    public static final void method578(byte arg0) {
        field1657 = null;
        field1684 = null;
        if (arg0 == 0) {
            field1661 = null;
            field1688 = null;
        }
    }

    @OriginalMember(owner = "YIBRLAQY", name = "b", descriptor = "(I)LYIBRLAQY;")
    public static final class70 method579(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1661[var1].field1652) {
                return field1661[var1];
            }
        }
        field1674 = (field1674 + 1) % 20;
        class70 var2 = field1661[field1674] = new class70();
        field1688.field1105 = field1684[arg0];
        var2.field1652 = arg0;
        var2.method577(field1688, field1663);
        return var2;
    }

    @OriginalMember(owner = "YIBRLAQY", name = "a", descriptor = "(LTXPLZUUI;)V")
    public static final void method580(class60 arg0) {
        field1688 = new class43(arg0.method506("npc.dat", null), 0);
        class43 var1 = new class43(arg0.method506("npc.idx", null), 0);
        field1662 = var1.method332();
        field1684 = new int[field1662];
        int var2 = 2;
        for (int var3 = 0; var3 < field1662; var3++) {
            field1684[var3] = var2;
            var2 += var1.method332();
        }
        field1661 = new class70[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1661[var4] = new class70();
        }
    }

    @OriginalMember(owner = "YIBRLAQY", name = "a", descriptor = "(II[II)LPSGMMDJS;")
    public final class45 method581(int arg0, int arg1, int[] arg2, int arg3) {
        if (this.field1659 != null) {
            class70 var5 = this.method576(29839);
            return var5 == null ? null : var5.method581(arg0, arg1, arg2, this.field1676);
        }
        class45 var6 = (class45) field1657.method519(this.field1652);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1675.length; var8++) {
                if (!class45.method411(this.field1675[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class45[] var9 = new class45[this.field1675.length];
            for (int var10 = 0; var10 < this.field1675.length; var10++) {
                var9[var10] = class45.method410(this.field1675[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class45(8111, var9.length, var9);
            }
            if (this.field1658 != null) {
                for (int var11 = 0; var11 < this.field1658.length; var11++) {
                    var6.method424(this.field1658[var11], this.field1654[var11]);
                }
            }
            var6.method417(true);
            var6.method427(this.field1664 + 64, this.field1660 + 850, -30, -50, -30, true);
            field1657.method520(this.field1689, this.field1652, var6);
        }
        class45 var12 = class45.field1145;
        if (arg3 != -47097) {
            throw new NullPointerException();
        }
        var12.method412(2, var6, class3.method5((byte) 2, arg0) & class3.method5((byte) 2, arg1));
        if (arg0 != -1 && arg1 != -1) {
            var12.method419(arg2, true, arg1, arg0);
        } else if (arg0 != -1) {
            var12.method418(0, arg0);
        }
        if (this.field1669 != 128 || this.field1677 != 128) {
            var12.method426(this.field1677, this.field1669, this.field1669, 34836);
        }
        var12.method414((byte) 7);
        var12.field1182 = null;
        var12.field1181 = null;
        if (this.field1690 == 1) {
            var12.field1183 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "YIBRLAQY", name = "c", descriptor = "(I)LPSGMMDJS;")
    public final class45 method582(int arg0) {
        if (this.field1659 != null) {
            class70 var2 = this.method576(29839);
            return var2 == null ? null : var2.method582(-23891);
        } else if (this.field1671 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != -23891) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            for (int var5 = 0; var5 < this.field1671.length; var5++) {
                if (!class45.method411(this.field1671[var5])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class45[] var6 = new class45[this.field1671.length];
            for (int var7 = 0; var7 < this.field1671.length; var7++) {
                var6[var7] = class45.method410(this.field1671[var7]);
            }
            class45 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class45(8111, var6.length, var6);
            }
            if (this.field1658 != null) {
                for (int var9 = 0; var9 < this.field1658.length; var9++) {
                    var8.method424(this.field1658[var9], this.field1654[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "YIBRLAQY", name = "a", descriptor = "(Z)Z")
    public boolean method583(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field1659 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field1668 != -1) {
                class4 var3 = class4.field27[this.field1668];
                int var4 = var3.field29;
                int var5 = var3.field30;
                int var6 = var3.field31;
                int var7 = client.field204[var6 - var5];
                var2 = field1656.field188[var4] >> var5 & var7;
            } else if (this.field1665 != -1) {
                var2 = field1656.field188[this.field1665];
            }
            return var2 >= 0 && var2 < this.field1659.length && this.field1659[var2] != -1;
        }
    }
}
