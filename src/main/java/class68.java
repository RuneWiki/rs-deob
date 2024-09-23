import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZDMOUFDZ")
public class class68 {

    @OriginalMember(owner = "ZDMOUFDZ", name = "a", descriptor = "I")
    public int field1644 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "b", descriptor = "I")
    public int field1645 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "c", descriptor = "Z")
    public boolean field1646 = false;

    @OriginalMember(owner = "ZDMOUFDZ", name = "e", descriptor = "I")
    public int field1648 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "g", descriptor = "I")
    public int field1650 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "i", descriptor = "I")
    private int field1652 = 128;

    @OriginalMember(owner = "ZDMOUFDZ", name = "k", descriptor = "Z")
    public boolean field1654 = true;

    @OriginalMember(owner = "ZDMOUFDZ", name = "l", descriptor = "I")
    public int field1655 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "n", descriptor = "I")
    public int field1657 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "q", descriptor = "I")
    public int field1660 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "t", descriptor = "I")
    public int field1663 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "u", descriptor = "I")
    public int field1664 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "x", descriptor = "J")
    public long field1667 = -1L;

    @OriginalMember(owner = "ZDMOUFDZ", name = "y", descriptor = "I")
    public int field1668 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "z", descriptor = "B")
    public byte field1669 = 1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "A", descriptor = "I")
    public int field1670 = 32;

    @OriginalMember(owner = "ZDMOUFDZ", name = "F", descriptor = "I")
    private int field1675 = 128;

    @OriginalMember(owner = "ZDMOUFDZ", name = "G", descriptor = "I")
    public int field1676 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "H", descriptor = "I")
    public int field1677 = -1;

    @OriginalMember(owner = "ZDMOUFDZ", name = "K", descriptor = "Z")
    private boolean field1680 = false;

    @OriginalMember(owner = "ZDMOUFDZ", name = "L", descriptor = "Z")
    public boolean field1681 = true;

    @OriginalMember(owner = "ZDMOUFDZ", name = "w", descriptor = "I")
    private static int field1666 = -302;

    @OriginalMember(owner = "ZDMOUFDZ", name = "I", descriptor = "LISXEOURU;")
    public static class21 field1678 = new class21(-15730, 30);

    @OriginalMember(owner = "ZDMOUFDZ", name = "f", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "ZDMOUFDZ", name = "j", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "ZDMOUFDZ", name = "s", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "ZDMOUFDZ", name = "D", descriptor = "I")
    private static int field1673;

    @OriginalMember(owner = "ZDMOUFDZ", name = "r", descriptor = "LZOMNSJJM;")
    private static class69 field1661;

    @OriginalMember(owner = "ZDMOUFDZ", name = "m", descriptor = "Lclient;")
    public static client field1656;

    @OriginalMember(owner = "ZDMOUFDZ", name = "E", descriptor = "Ljava/lang/String;")
    public String field1674;

    @OriginalMember(owner = "ZDMOUFDZ", name = "C", descriptor = "[B")
    public byte[] field1672;

    @OriginalMember(owner = "ZDMOUFDZ", name = "h", descriptor = "[I")
    private static int[] field1651;

    @OriginalMember(owner = "ZDMOUFDZ", name = "p", descriptor = "[I")
    private int[] field1659;

    @OriginalMember(owner = "ZDMOUFDZ", name = "v", descriptor = "[I")
    private int[] field1665;

    @OriginalMember(owner = "ZDMOUFDZ", name = "B", descriptor = "[I")
    private int[] field1671;

    @OriginalMember(owner = "ZDMOUFDZ", name = "J", descriptor = "[I")
    private int[] field1679;

    @OriginalMember(owner = "ZDMOUFDZ", name = "M", descriptor = "[I")
    public int[] field1682;

    @OriginalMember(owner = "ZDMOUFDZ", name = "d", descriptor = "[LZDMOUFDZ;")
    private static class68[] field1647;

    @OriginalMember(owner = "ZDMOUFDZ", name = "o", descriptor = "[Ljava/lang/String;")
    public String[] field1658;

    @OriginalMember(owner = "ZDMOUFDZ", name = "a", descriptor = "(I)LZDMOUFDZ;")
    public final class68 method528(int arg0) {
        int var2 = -1;
        if (arg0 >= 0) {
            this.field1680 = !this.field1680;
        }
        if (this.field1664 != -1) {
            class14 var3 = class14.field795[this.field1664];
            int var4 = var3.field797;
            int var5 = var3.field798;
            int var6 = var3.field799;
            int var7 = client.field405[var6 - var5];
            var2 = field1656.field530[var4] >> var5 & var7;
        } else if (this.field1645 != -1) {
            var2 = field1656.field530[this.field1645];
        }
        return var2 < 0 || var2 >= this.field1682.length || this.field1682[var2] == -1 ? null : method529(this.field1682[var2]);
    }

    @OriginalMember(owner = "ZDMOUFDZ", name = "b", descriptor = "(I)LZDMOUFDZ;")
    public static final class68 method529(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1647[var1].field1667) {
                return field1647[var1];
            }
        }
        field1673 = (field1673 + 1) % 20;
        class68 var2 = field1647[field1673] = new class68();
        field1661.field1700 = field1651[arg0];
        var2.field1667 = arg0;
        var2.method531(field1661, (byte) 5);
        return var2;
    }

    @OriginalMember(owner = "ZDMOUFDZ", name = "a", descriptor = "(II[II)LCCYECDYX;")
    public final class4 method530(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg3 != 7) {
            this.field1680 = !this.field1680;
        }
        if (this.field1682 != null) {
            class68 var5 = this.method528(-863);
            return var5 == null ? null : var5.method530(arg0, arg1, arg2, 7);
        }
        class4 var6 = (class4) field1678.method228(this.field1667);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1665.length; var8++) {
                if (!class4.method12(this.field1665[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class4[] var9 = new class4[this.field1665.length];
            for (int var10 = 0; var10 < this.field1665.length; var10++) {
                var9[var10] = class4.method11(this.field1665[var10], -142);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class4(var9, 990, var9.length);
            }
            if (this.field1659 != null) {
                for (int var11 = 0; var11 < this.field1659.length; var11++) {
                    var6.method25(this.field1659[var11], this.field1679[var11]);
                }
            }
            var6.method18(true);
            var6.method28(this.field1649 + 64, this.field1653 + 850, -30, -50, -30, true);
            field1678.method229(15631, this.field1667, var6);
        }
        class4 var12 = class4.field28;
        var12.method13((byte) 7, class41.method383(arg1, (byte) 8) & class41.method383(arg0, (byte) 8), var6);
        if (arg1 != -1 && arg0 != -1) {
            var12.method20(false, arg2, arg1, arg0);
        } else if (arg1 != -1) {
            var12.method19(arg1, (byte) 106);
        }
        if (this.field1652 != 128 || this.field1675 != 128) {
            var12.method27(this.field1652, this.field1675, this.field1652, (byte) 6);
        }
        var12.method15(false);
        var12.field65 = null;
        var12.field64 = null;
        if (this.field1669 == 1) {
            var12.field66 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "ZDMOUFDZ", name = "a", descriptor = "(LZOMNSJJM;B)V")
    private final void method531(class69 arg0, byte arg1) {
        if (arg1 == 5) {
            boolean var3 = false;
        } else {
            this.field1680 = !this.field1680;
        }
        while (true) {
            while (true) {
                int var4 = arg0.method547();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method547();
                    this.field1665 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1665[var6] = arg0.method549();
                    }
                } else if (var4 == 2) {
                    this.field1674 = arg0.method554();
                } else if (var4 == 3) {
                    this.field1672 = arg0.method555((byte) 3);
                } else if (var4 == 12) {
                    this.field1669 = arg0.method548();
                } else if (var4 == 13) {
                    this.field1677 = arg0.method549();
                } else if (var4 == 14) {
                    this.field1663 = arg0.method549();
                } else if (var4 == 17) {
                    this.field1663 = arg0.method549();
                    this.field1676 = arg0.method549();
                    this.field1644 = arg0.method549();
                    this.field1650 = arg0.method549();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1658 == null) {
                        this.field1658 = new String[5];
                    }
                    this.field1658[var4 - 30] = arg0.method554();
                    if (this.field1658[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1658[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method547();
                    this.field1659 = new int[var7];
                    this.field1679 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1659[var8] = arg0.method549();
                        this.field1679[var8] = arg0.method549();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method547();
                    this.field1671 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1671[var10] = arg0.method549();
                    }
                } else if (var4 == 90) {
                    this.field1657 = arg0.method549();
                } else if (var4 == 91) {
                    this.field1660 = arg0.method549();
                } else if (var4 == 92) {
                    this.field1655 = arg0.method549();
                } else if (var4 == 93) {
                    this.field1681 = false;
                } else if (var4 == 95) {
                    this.field1648 = arg0.method549();
                } else if (var4 == 97) {
                    this.field1652 = arg0.method549();
                } else if (var4 == 98) {
                    this.field1675 = arg0.method549();
                } else if (var4 == 99) {
                    this.field1646 = true;
                } else if (var4 == 100) {
                    this.field1649 = arg0.method548();
                } else if (var4 == 101) {
                    this.field1653 = arg0.method548() * 5;
                } else if (var4 == 102) {
                    this.field1668 = arg0.method549();
                } else if (var4 == 103) {
                    this.field1670 = arg0.method549();
                } else if (var4 == 106) {
                    this.field1664 = arg0.method549();
                    if (this.field1664 == 65535) {
                        this.field1664 = -1;
                    }
                    this.field1645 = arg0.method549();
                    if (this.field1645 == 65535) {
                        this.field1645 = -1;
                    }
                    int var11 = arg0.method547();
                    this.field1682 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1682[var12] = arg0.method549();
                        if (this.field1682[var12] == 65535) {
                            this.field1682[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field1654 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "ZDMOUFDZ", name = "a", descriptor = "(LLYZBHNJP;)V")
    public static final void method532(class31 arg0) {
        field1661 = new class69(arg0.method290("npc.dat", null), field1666);
        class69 var1 = new class69(arg0.method290("npc.idx", null), field1666);
        field1662 = var1.method549();
        field1651 = new int[field1662];
        int var2 = 2;
        for (int var3 = 0; var3 < field1662; var3++) {
            field1651[var3] = var2;
            var2 += var1.method549();
        }
        field1647 = new class68[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1647[var4] = new class68();
        }
    }

    @OriginalMember(owner = "ZDMOUFDZ", name = "c", descriptor = "(I)LCCYECDYX;")
    public final class4 method533(int arg0) {
        int var2 = 77 / arg0;
        if (this.field1682 != null) {
            class68 var3 = this.method528(-863);
            return var3 == null ? null : var3.method533(516);
        } else if (this.field1671 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field1671.length; var5++) {
                if (!class4.method12(this.field1671[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            class4[] var6 = new class4[this.field1671.length];
            for (int var7 = 0; var7 < this.field1671.length; var7++) {
                var6[var7] = class4.method11(this.field1671[var7], -142);
            }
            class4 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class4(var6, 990, var6.length);
            }
            if (this.field1659 != null) {
                for (int var9 = 0; var9 < this.field1659.length; var9++) {
                    var8.method25(this.field1659[var9], this.field1679[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "ZDMOUFDZ", name = "a", descriptor = "(B)V")
    public static final void method534(byte arg0) {
        field1678 = null;
        if (arg0 != 46) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1651 = null;
        field1647 = null;
        field1661 = null;
    }
}
