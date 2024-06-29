import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class116 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "J")
    public static long field1803 = 0L;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1808 = -1;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[I")
    public static int[] field1804 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lii;")
    public class263 field1816;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[I")
    public int[] field1794;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "[I")
    public int[] field1800;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[I")
    public int[] field1801;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[I")
    public int[] field1802;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[I")
    public int[] field1809;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "[I")
    public int[] field1813;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "[Lii;")
    public class263[] field1814;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "[[I")
    public int[][] field1806;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[[I")
    public int[][] field1812;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)I")
    public static final int method843(int arg0, int arg1, int arg2) {
        field1805++;
        if (arg2 == -2) {
            return 12345678;
        } else if (~arg2 == arg1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method844(int arg0) {
        field1804 = null;
        if (arg0 != -7) {
            field1808 = -79;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static final void method845(byte arg0) {
        field1815++;
        class221.field3457.method1782(97);
        if (arg0 > -67) {
            method844(-88);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BI)V")
    private final void method846(byte[] arg0, int arg1) {
        class37 var3 = new class37(class241.method1630(arg0, (byte) 95));
        int var4 = var3.method333((byte) -59);
        field1796++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1810 = var3.method307(arg1 ^ 0xFFFF81DC);
        } else {
            this.field1810 = 0;
        }
        int var5 = -1;
        int var6 = var3.method333((byte) -59);
        this.field1807 = var3.method293(111);
        this.field1813 = new int[this.field1807];
        int var7 = 0;
        for (int var8 = 0; var8 < this.field1807; var8++) {
            this.field1813[var8] = var7 += var3.method293(91);
            if (this.field1813[var8] > var5) {
                var5 = this.field1813[var8];
            }
        }
        this.field1795 = var5 + 1;
        this.field1809 = new int[this.field1795];
        this.field1806 = new int[this.field1795][];
        this.field1800 = new int[this.field1795];
        this.field1802 = new int[this.field1795];
        this.field1801 = new int[this.field1795];
        if (var6 != 0) {
            this.field1794 = new int[this.field1795];
            for (int var9 = 0; var9 < this.field1795; var9++) {
                this.field1794[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1807; var10++) {
                this.field1794[this.field1813[var10]] = var3.method307(-54);
            }
            this.field1816 = new class263(this.field1794);
        }
        for (int var11 = 0; var11 < this.field1807; var11++) {
            this.field1809[this.field1813[var11]] = var3.method307(-72);
        }
        if (arg1 != 32335) {
            method843(91, -86, 88);
        }
        for (int var12 = 0; var12 < this.field1807; var12++) {
            this.field1800[this.field1813[var12]] = var3.method307(-73);
        }
        for (int var13 = 0; var13 < this.field1807; var13++) {
            this.field1802[this.field1813[var13]] = var3.method293(-17);
        }
        for (int var14 = 0; var14 < this.field1807; var14++) {
            int var21 = 0;
            int var22 = -1;
            int var23 = this.field1813[var14];
            int var24 = this.field1802[var23];
            this.field1806[var23] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field1806[var23][var25] = var21 += var3.method293(class76.method605(arg1, 32304));
                if (var22 < var26) {
                    var22 = var26;
                }
            }
            this.field1801[var23] = var22 + 1;
            if ((var22 + 1) == var24) {
                this.field1806[var23] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field1812 = new int[var5 + 1][];
        this.field1814 = new class263[var5 + 1];
        for (int var15 = 0; var15 < this.field1807; var15++) {
            int var16 = this.field1813[var15];
            int var17 = this.field1802[var16];
            this.field1812[var16] = new int[this.field1801[var16]];
            for (int var18 = 0; var18 < this.field1801[var16]; var18++) {
                this.field1812[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1806[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1806[var16][var19];
                }
                this.field1812[var16][var20] = var3.method307(-49);
            }
            this.field1814[var16] = new class263(this.field1812[var16]);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([BI)V")
    public class116(byte[] arg0, int arg1) {
        this.field1797 = class76.method604(arg0.length, 0, arg0);
        if (this.field1797 != arg1) {
            throw new RuntimeException();
        }
        this.method846(arg0, 32335);
    }
}
