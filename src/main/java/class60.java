import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VWKJSKWX")
public class class60 {

    @OriginalMember(owner = "VWKJSKWX", name = "b", descriptor = "I")
    public int field1603 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "e", descriptor = "Z")
    public boolean field1606 = true;

    @OriginalMember(owner = "VWKJSKWX", name = "g", descriptor = "I")
    private int field1608 = 128;

    @OriginalMember(owner = "VWKJSKWX", name = "i", descriptor = "I")
    public int field1610 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "j", descriptor = "I")
    public int field1611 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "k", descriptor = "I")
    public int field1612 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "l", descriptor = "J")
    public long field1613 = -1L;

    @OriginalMember(owner = "VWKJSKWX", name = "m", descriptor = "Z")
    public boolean field1614 = true;

    @OriginalMember(owner = "VWKJSKWX", name = "p", descriptor = "I")
    public int field1617 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "r", descriptor = "I")
    public int field1619 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "s", descriptor = "I")
    public int field1620 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "u", descriptor = "I")
    public int field1622 = 32;

    @OriginalMember(owner = "VWKJSKWX", name = "x", descriptor = "I")
    public int field1625 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "y", descriptor = "I")
    public int field1626 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "A", descriptor = "B")
    public byte field1628 = 1;

    @OriginalMember(owner = "VWKJSKWX", name = "B", descriptor = "Z")
    public boolean field1629 = false;

    @OriginalMember(owner = "VWKJSKWX", name = "C", descriptor = "I")
    public int field1630 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "D", descriptor = "I")
    public int field1631 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "F", descriptor = "I")
    public int field1633 = -1;

    @OriginalMember(owner = "VWKJSKWX", name = "K", descriptor = "I")
    private int field1638 = 128;

    @OriginalMember(owner = "VWKJSKWX", name = "f", descriptor = "LUECXVCCS;")
    public static class55 field1607 = new class55(30, (byte) -2);

    @OriginalMember(owner = "VWKJSKWX", name = "z", descriptor = "I")
    private static int field1627 = 36177;

    @OriginalMember(owner = "VWKJSKWX", name = "o", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "VWKJSKWX", name = "t", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "VWKJSKWX", name = "H", descriptor = "I")
    private static int field1635;

    @OriginalMember(owner = "VWKJSKWX", name = "I", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "VWKJSKWX", name = "G", descriptor = "LMLYYHULT;")
    private static class30 field1634;

    @OriginalMember(owner = "VWKJSKWX", name = "n", descriptor = "Lclient;")
    public static client field1615;

    @OriginalMember(owner = "VWKJSKWX", name = "h", descriptor = "Ljava/lang/String;")
    public String field1609;

    @OriginalMember(owner = "VWKJSKWX", name = "E", descriptor = "[B")
    public byte[] field1632;

    @OriginalMember(owner = "VWKJSKWX", name = "a", descriptor = "[I")
    private int[] field1602;

    @OriginalMember(owner = "VWKJSKWX", name = "c", descriptor = "[I")
    private static int[] field1604;

    @OriginalMember(owner = "VWKJSKWX", name = "d", descriptor = "[I")
    private int[] field1605;

    @OriginalMember(owner = "VWKJSKWX", name = "q", descriptor = "[I")
    public int[] field1618;

    @OriginalMember(owner = "VWKJSKWX", name = "J", descriptor = "[I")
    private int[] field1637;

    @OriginalMember(owner = "VWKJSKWX", name = "L", descriptor = "[I")
    private int[] field1639;

    @OriginalMember(owner = "VWKJSKWX", name = "v", descriptor = "[LVWKJSKWX;")
    private static class60[] field1623;

    @OriginalMember(owner = "VWKJSKWX", name = "w", descriptor = "[Ljava/lang/String;")
    public String[] field1624;

    @OriginalMember(owner = "VWKJSKWX", name = "a", descriptor = "(LMLYYHULT;B)V")
    private final void method568(class30 arg0, byte arg1) {
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method296();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method296();
                    this.field1637 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1637[var5] = arg0.method298();
                    }
                } else if (var3 == 2) {
                    this.field1609 = arg0.method303();
                } else if (var3 == 3) {
                    this.field1632 = arg0.method304(337);
                } else if (var3 == 12) {
                    this.field1628 = arg0.method297();
                } else if (var3 == 13) {
                    this.field1625 = arg0.method298();
                } else if (var3 == 14) {
                    this.field1603 = arg0.method298();
                } else if (var3 == 17) {
                    this.field1603 = arg0.method298();
                    this.field1620 = arg0.method298();
                    this.field1612 = arg0.method298();
                    this.field1626 = arg0.method298();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1624 == null) {
                        this.field1624 = new String[5];
                    }
                    this.field1624[var3 - 30] = arg0.method303();
                    if (this.field1624[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1624[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method296();
                    this.field1602 = new int[var6];
                    this.field1639 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1602[var7] = arg0.method298();
                        this.field1639[var7] = arg0.method298();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method296();
                    this.field1605 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1605[var9] = arg0.method298();
                    }
                } else if (var3 == 90) {
                    this.field1619 = arg0.method298();
                } else if (var3 == 91) {
                    this.field1611 = arg0.method298();
                } else if (var3 == 92) {
                    this.field1617 = arg0.method298();
                } else if (var3 == 93) {
                    this.field1606 = false;
                } else if (var3 == 95) {
                    this.field1630 = arg0.method298();
                } else if (var3 == 97) {
                    this.field1638 = arg0.method298();
                } else if (var3 == 98) {
                    this.field1608 = arg0.method298();
                } else if (var3 == 99) {
                    this.field1629 = true;
                } else if (var3 == 100) {
                    this.field1636 = arg0.method297();
                } else if (var3 == 101) {
                    this.field1616 = arg0.method297() * 5;
                } else if (var3 == 102) {
                    this.field1610 = arg0.method298();
                } else if (var3 == 103) {
                    this.field1622 = arg0.method298();
                } else if (var3 == 106) {
                    this.field1633 = arg0.method298();
                    if (this.field1633 == 65535) {
                        this.field1633 = -1;
                    }
                    this.field1631 = arg0.method298();
                    if (this.field1631 == 65535) {
                        this.field1631 = -1;
                    }
                    int var10 = arg0.method296();
                    this.field1618 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1618[var11] = arg0.method298();
                        if (this.field1618[var11] == 65535) {
                            this.field1618[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1614 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "VWKJSKWX", name = "a", descriptor = "(I)Z")
    public boolean method569(int arg0) {
        if (this.field1618 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1633 != -1) {
            class61 var4 = class61.field1641[this.field1633];
            int var5 = var4.field1643;
            int var6 = var4.field1644;
            int var7 = var4.field1645;
            int var8 = client.field166[var7 - var6];
            var2 = field1615.field293[var5] >> var6 & var8;
        } else if (this.field1631 != -1) {
            var2 = field1615.field293[this.field1631];
        }
        return var2 >= 0 && var2 < this.field1618.length && this.field1618[var2] != -1;
    }

    @OriginalMember(owner = "VWKJSKWX", name = "b", descriptor = "(I)LVWKJSKWX;")
    public final class60 method570(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1633 != -1) {
            class61 var4 = class61.field1641[this.field1633];
            int var5 = var4.field1643;
            int var6 = var4.field1644;
            int var7 = var4.field1645;
            int var8 = client.field166[var7 - var6];
            var2 = field1615.field293[var5] >> var6 & var8;
        } else if (this.field1631 != -1) {
            var2 = field1615.field293[this.field1631];
        }
        return var2 < 0 || var2 >= this.field1618.length || this.field1618[var2] == -1 ? null : method574(this.field1618[var2]);
    }

    @OriginalMember(owner = "VWKJSKWX", name = "c", descriptor = "(I)V")
    public static final void method571(int arg0) {
        field1607 = null;
        field1604 = null;
        field1623 = null;
        if (arg0 != -38190) {
            field1627 = 432;
        }
        field1634 = null;
    }

    @OriginalMember(owner = "VWKJSKWX", name = "a", descriptor = "(III[I)LCADBNSXE;")
    public final class3 method572(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = 21 / arg0;
        if (this.field1618 != null) {
            class60 var6 = this.method570(0);
            return var6 == null ? null : var6.method572(119, arg1, arg2, arg3);
        }
        class3 var7 = (class3) field1607.method538(this.field1613);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1637.length; var9++) {
                if (!class3.method12(this.field1637[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class3[] var10 = new class3[this.field1637.length];
            for (int var11 = 0; var11 < this.field1637.length; var11++) {
                var10[var11] = class3.method11(this.field1637[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class3(var10, var10.length, 337);
            }
            if (this.field1602 != null) {
                for (int var12 = 0; var12 < this.field1602.length; var12++) {
                    var7.method25(this.field1602[var12], this.field1639[var12]);
                }
            }
            var7.method18(false);
            var7.method28(this.field1636 + 64, this.field1616 + 850, -30, -50, -30, true);
            field1607.method539(var7, -488, this.field1613);
        }
        class3 var13 = class3.field22;
        var13.method13(0, var7, class8.method215(false, arg2) & class8.method215(false, arg1));
        if (arg2 != -1 && arg1 != -1) {
            var13.method20(arg2, arg1, (byte) 4, arg3);
        } else if (arg2 != -1) {
            var13.method19(arg2, (byte) -62);
        }
        if (this.field1638 != 128 || this.field1608 != 128) {
            var13.method27(this.field1638, 0, this.field1608, this.field1638);
        }
        var13.method15(1);
        var13.field58 = null;
        var13.field57 = null;
        if (this.field1628 == 1) {
            var13.field59 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "VWKJSKWX", name = "a", descriptor = "(LGWOEELWB;)V")
    public static final void method573(class18 arg0) {
        field1634 = new class30(true, arg0.method249("npc.dat", null));
        class30 var1 = new class30(true, arg0.method249("npc.idx", null));
        field1621 = var1.method298();
        field1604 = new int[field1621];
        int var2 = 2;
        for (int var3 = 0; var3 < field1621; var3++) {
            field1604[var3] = var2;
            var2 += var1.method298();
        }
        field1623 = new class60[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1623[var4] = new class60();
        }
    }

    @OriginalMember(owner = "VWKJSKWX", name = "d", descriptor = "(I)LVWKJSKWX;")
    public static final class60 method574(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1623[var1].field1613) {
                return field1623[var1];
            }
        }
        field1635 = (field1635 + 1) % 20;
        class60 var2 = field1623[field1635] = new class60();
        field1634.field1092 = field1604[arg0];
        var2.field1613 = arg0;
        var2.method568(field1634, (byte) 2);
        return var2;
    }

    @OriginalMember(owner = "VWKJSKWX", name = "a", descriptor = "(B)LCADBNSXE;")
    public final class3 method575(byte arg0) {
        if (arg0 != -72) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1618 != null) {
            class60 var3 = this.method570(0);
            return var3 == null ? null : var3.method575((byte) -72);
        } else if (this.field1605 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field1605.length; var5++) {
                if (!class3.method12(this.field1605[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            class3[] var6 = new class3[this.field1605.length];
            for (int var7 = 0; var7 < this.field1605.length; var7++) {
                var6[var7] = class3.method11(this.field1605[var7]);
            }
            class3 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class3(var6, var6.length, 337);
            }
            if (this.field1602 != null) {
                for (int var9 = 0; var9 < this.field1602.length; var9++) {
                    var8.method25(this.field1602[var9], this.field1639[var9]);
                }
            }
            return var8;
        }
    }
}
