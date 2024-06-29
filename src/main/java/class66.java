import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YANZSPIT")
public class class66 {

    @OriginalMember(owner = "client!YANZSPIT", name = "b", descriptor = "B")
    public byte field1616 = 1;

    @OriginalMember(owner = "client!YANZSPIT", name = "d", descriptor = "I")
    public int field1618 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "e", descriptor = "I")
    public int field1619 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "f", descriptor = "I")
    public int field1620 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "g", descriptor = "I")
    public int field1621 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "i", descriptor = "I")
    public int field1623 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "j", descriptor = "I")
    private int field1624 = 128;

    @OriginalMember(owner = "client!YANZSPIT", name = "k", descriptor = "I")
    private int field1625 = 12272;

    @OriginalMember(owner = "client!YANZSPIT", name = "n", descriptor = "I")
    public int field1628 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "o", descriptor = "J")
    public long field1629 = -1L;

    @OriginalMember(owner = "client!YANZSPIT", name = "p", descriptor = "I")
    private int field1630 = 41952;

    @OriginalMember(owner = "client!YANZSPIT", name = "q", descriptor = "I")
    public int field1631 = 32;

    @OriginalMember(owner = "client!YANZSPIT", name = "s", descriptor = "Z")
    public boolean field1633 = true;

    @OriginalMember(owner = "client!YANZSPIT", name = "t", descriptor = "Z")
    public boolean field1634 = true;

    @OriginalMember(owner = "client!YANZSPIT", name = "u", descriptor = "I")
    public int field1635 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "y", descriptor = "I")
    private int field1639 = 42179;

    @OriginalMember(owner = "client!YANZSPIT", name = "A", descriptor = "I")
    public int field1641 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "C", descriptor = "I")
    public int field1643 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "D", descriptor = "Ljava/lang/String;")
    public String field1644 = "null";

    @OriginalMember(owner = "client!YANZSPIT", name = "E", descriptor = "I")
    public int field1645 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "H", descriptor = "Z")
    public boolean field1648 = false;

    @OriginalMember(owner = "client!YANZSPIT", name = "J", descriptor = "I")
    private int field1650 = -2167;

    @OriginalMember(owner = "client!YANZSPIT", name = "K", descriptor = "I")
    private int field1651 = 128;

    @OriginalMember(owner = "client!YANZSPIT", name = "L", descriptor = "I")
    public int field1652 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "P", descriptor = "I")
    public int field1656 = -1;

    @OriginalMember(owner = "client!YANZSPIT", name = "h", descriptor = "LJGECYJMS;")
    public static class22 field1622 = new class22(30, -11885);

    @OriginalMember(owner = "client!YANZSPIT", name = "m", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!YANZSPIT", name = "v", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!YANZSPIT", name = "G", descriptor = "I")
    private static int field1647;

    @OriginalMember(owner = "client!YANZSPIT", name = "I", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client!YANZSPIT", name = "r", descriptor = "LTQYMAXSO;")
    private static class53 field1632;

    @OriginalMember(owner = "client!YANZSPIT", name = "O", descriptor = "Lclient;")
    public static client field1655;

    @OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "Z")
    private static boolean field1615;

    @OriginalMember(owner = "client!YANZSPIT", name = "F", descriptor = "[B")
    public byte[] field1646;

    @OriginalMember(owner = "client!YANZSPIT", name = "c", descriptor = "[I")
    private int[] field1617;

    @OriginalMember(owner = "client!YANZSPIT", name = "l", descriptor = "[I")
    private int[] field1626;

    @OriginalMember(owner = "client!YANZSPIT", name = "w", descriptor = "[I")
    private int[] field1637;

    @OriginalMember(owner = "client!YANZSPIT", name = "x", descriptor = "[I")
    public int[] field1638;

    @OriginalMember(owner = "client!YANZSPIT", name = "B", descriptor = "[I")
    private int[] field1642;

    @OriginalMember(owner = "client!YANZSPIT", name = "M", descriptor = "[I")
    private static int[] field1653;

    @OriginalMember(owner = "client!YANZSPIT", name = "N", descriptor = "[LYANZSPIT;")
    private static class66[] field1654;

    @OriginalMember(owner = "client!YANZSPIT", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1640;

    @OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "([IIII)LKDWDYCIL;")
    public final class25 method561(int[] arg0, int arg1, int arg2, int arg3) {
        if (this.field1638 != null) {
            class66 var5 = this.method568(this.field1639);
            return var5 == null ? null : var5.method561(arg0, arg1, 4318, arg3);
        }
        class25 var6 = (class25) field1622.method230(this.field1629);
        if (arg2 != 4318) {
            this.field1639 = 35;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1617.length; var8++) {
                if (!class25.method247(this.field1617[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class25[] var9 = new class25[this.field1617.length];
            for (int var10 = 0; var10 < this.field1617.length; var10++) {
                var9[var10] = class25.method246(this.field1617[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class25(var9, var9.length, this.field1625);
            }
            if (this.field1642 != null) {
                for (int var11 = 0; var11 < this.field1642.length; var11++) {
                    var6.method260(this.field1642[var11], this.field1626[var11]);
                }
            }
            var6.method253(0);
            var6.method263(this.field1649 + 64, this.field1636 + 850, -30, -50, -30, true);
            field1622.method231(this.field1629, 811, var6);
        }
        class25 var12 = class25.field871;
        var12.method248(class48.method423(arg1, this.field1630) & class48.method423(arg3, this.field1630), (byte) 0, var6);
        if (arg1 != -1 && arg3 != -1) {
            var12.method255(arg3, 16750, arg1, arg0);
        } else if (arg1 != -1) {
            var12.method254(arg1, 151);
        }
        if (this.field1624 != 128 || this.field1651 != 128) {
            var12.method262((byte) 3, this.field1624, this.field1624, this.field1651);
        }
        var12.method250(-705);
        var12.field907 = null;
        var12.field906 = null;
        if (this.field1616 == 1) {
            var12.field908 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "(I)V")
    public static final void method562(int arg0) {
        field1622 = null;
        field1653 = null;
        if (arg0 < 5 || arg0 > 5) {
            field1615 = !field1615;
        }
        field1654 = null;
        field1632 = null;
    }

    @OriginalMember(owner = "client!YANZSPIT", name = "b", descriptor = "(I)LYANZSPIT;")
    public static final class66 method563(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1654[var1].field1629) {
                return field1654[var1];
            }
        }
        field1647 = (field1647 + 1) % 20;
        class66 var2 = field1654[field1647] = new class66();
        field1632.field1457 = field1653[arg0];
        var2.field1629 = arg0;
        var2.method566(3, field1632);
        return var2;
    }

    @OriginalMember(owner = "client!YANZSPIT", name = "c", descriptor = "(I)LKDWDYCIL;")
    public final class25 method564(int arg0) {
        if (arg0 != 2) {
            throw new NullPointerException();
        } else if (this.field1638 != null) {
            class66 var2 = this.method568(this.field1639);
            return var2 == null ? null : var2.method564(2);
        } else if (this.field1637 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1637.length; var4++) {
                if (!class25.method247(this.field1637[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class25[] var5 = new class25[this.field1637.length];
            for (int var6 = 0; var6 < this.field1637.length; var6++) {
                var5[var6] = class25.method246(this.field1637[var6]);
            }
            class25 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class25(var5, var5.length, this.field1625);
            }
            if (this.field1642 != null) {
                for (int var8 = 0; var8 < this.field1642.length; var8++) {
                    var7.method260(this.field1642[var8], this.field1626[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "(LSXKKBWPU;)V")
    public static final void method565(class50 arg0) {
        field1632 = new class53(arg0.method442("npc.dat", null), -631);
        class53 var1 = new class53(arg0.method442("npc.idx", null), -631);
        field1627 = var1.method470();
        field1653 = new int[field1627];
        int var2 = 2;
        for (int var3 = 0; var3 < field1627; var3++) {
            field1653[var3] = var2;
            var2 += var1.method470();
        }
        field1654 = new class66[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1654[var4] = new class66();
        }
    }

    @OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "(ILTQYMAXSO;)V")
    private final void method566(int arg0, class53 arg1) {
        if (arg0 != 3) {
            field1615 = !field1615;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method468();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method468();
                    this.field1617 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1617[var5] = arg1.method470();
                    }
                } else if (var3 == 2) {
                    this.field1644 = arg1.method475();
                } else if (var3 == 3) {
                    this.field1646 = arg1.method476(this.field1650);
                } else if (var3 == 12) {
                    this.field1616 = arg1.method469();
                } else if (var3 == 13) {
                    this.field1618 = arg1.method470();
                } else if (var3 == 14) {
                    this.field1643 = arg1.method470();
                } else if (var3 == 17) {
                    this.field1643 = arg1.method470();
                    this.field1623 = arg1.method470();
                    this.field1652 = arg1.method470();
                    this.field1635 = arg1.method470();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1640 == null) {
                        this.field1640 = new String[5];
                    }
                    this.field1640[var3 - 30] = arg1.method475();
                    if (this.field1640[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1640[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method468();
                    this.field1642 = new int[var6];
                    this.field1626 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1642[var7] = arg1.method470();
                        this.field1626[var7] = arg1.method470();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method468();
                    this.field1637 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1637[var9] = arg1.method470();
                    }
                } else if (var3 == 90) {
                    this.field1641 = arg1.method470();
                } else if (var3 == 91) {
                    this.field1621 = arg1.method470();
                } else if (var3 == 92) {
                    this.field1628 = arg1.method470();
                } else if (var3 == 93) {
                    this.field1633 = false;
                } else if (var3 == 95) {
                    this.field1620 = arg1.method470();
                } else if (var3 == 97) {
                    this.field1624 = arg1.method470();
                } else if (var3 == 98) {
                    this.field1651 = arg1.method470();
                } else if (var3 == 99) {
                    this.field1648 = true;
                } else if (var3 == 100) {
                    this.field1649 = arg1.method469();
                } else if (var3 == 101) {
                    this.field1636 = arg1.method469() * 5;
                } else if (var3 == 102) {
                    this.field1645 = arg1.method470();
                } else if (var3 == 103) {
                    this.field1631 = arg1.method470();
                } else if (var3 == 106) {
                    this.field1619 = arg1.method470();
                    if (this.field1619 == 65535) {
                        this.field1619 = -1;
                    }
                    this.field1656 = arg1.method470();
                    if (this.field1656 == 65535) {
                        this.field1656 = -1;
                    }
                    int var10 = arg1.method468();
                    this.field1638 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1638[var11] = arg1.method470();
                        if (this.field1638[var11] == 65535) {
                            this.field1638[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1634 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!YANZSPIT", name = "d", descriptor = "(I)Z")
    public boolean method567(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1638 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field1619 != -1) {
                class5 var3 = class5.field74[this.field1619];
                int var4 = var3.field76;
                int var5 = var3.field77;
                int var6 = var3.field78;
                int var7 = client.field306[var6 - var5];
                var2 = field1655.field385[var4] >> var5 & var7;
            } else if (this.field1656 != -1) {
                var2 = field1655.field385[this.field1656];
            }
            return var2 >= 0 && var2 < this.field1638.length && this.field1638[var2] != -1;
        }
    }

    @OriginalMember(owner = "client!YANZSPIT", name = "e", descriptor = "(I)LYANZSPIT;")
    public final class66 method568(int arg0) {
        if (arg0 != 42179) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field1619 != -1) {
            class5 var4 = class5.field74[this.field1619];
            int var5 = var4.field76;
            int var6 = var4.field77;
            int var7 = var4.field78;
            int var8 = client.field306[var7 - var6];
            var3 = field1655.field385[var5] >> var6 & var8;
        } else if (this.field1656 != -1) {
            var3 = field1655.field385[this.field1656];
        }
        return var3 < 0 || var3 >= this.field1638.length || this.field1638[var3] == -1 ? null : method563(this.field1638[var3]);
    }
}
