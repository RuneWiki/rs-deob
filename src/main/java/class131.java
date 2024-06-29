import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class131 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Z")
    public boolean field1783 = false;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public int field1784 = 5;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public int field1789 = -1;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public int field1788 = -1;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Z")
    public boolean field1794 = false;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public int field1795 = -1;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Z")
    public boolean field1791 = false;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Z")
    public boolean field1787 = false;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public int field1802 = 99;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public int field1800 = -1;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public int field1806 = 2;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public int field1813 = -1;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lml;")
    public static class176 field1786 = new class176(0, 0);

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "Lqk;")
    public static class146 field1810 = null;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "Lae;")
    public static class351 field1814 = new class351();

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "Lnc;")
    public class493 field1809;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "[I")
    public int[] field1785;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "[I")
    public int[] field1792;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "[I")
    private int[] field1793;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "[I")
    public int[] field1804;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "[I")
    public int[] field1808;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "[I")
    public int[] field1812;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "[Z")
    public boolean[] field1803;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "[[I")
    public int[][] field1797;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILsl;I)V")
    private final void method917(int arg0, class479 arg1, int arg2) {
        field1796++;
        if (arg0 == 1) {
            int var16 = arg1.method2882(-1);
            this.field1812 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field1812[var17] = arg1.method2882(-1);
            }
            this.field1792 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field1792[var18] = arg1.method2882(-1);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field1792[var19] = (arg1.method2882(-1) << 16) + this.field1792[var19];
            }
        } else if (arg0 == 2) {
            this.field1800 = arg1.method2882(-1);
        } else if (arg0 == 3) {
            this.field1803 = new boolean[256];
            int var14 = arg1.method2886(true);
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1803[arg1.method2886(true)] = true;
            }
        } else if (arg0 == 5) {
            this.field1784 = arg1.method2886(true);
        } else if (arg0 == 6) {
            this.field1789 = arg1.method2882(arg2 ^ 0xFFFF);
        } else if (arg0 == 7) {
            this.field1813 = arg1.method2882(arg2 + 65535);
        } else if (arg0 == 8) {
            this.field1802 = arg1.method2886(true);
        } else if (arg0 == 9) {
            this.field1795 = arg1.method2886(true);
        } else if (arg0 == 10) {
            this.field1788 = arg1.method2886(true);
        } else if (arg0 == 11) {
            this.field1806 = arg1.method2886(true);
        } else if (arg0 == 12) {
            int var11 = arg1.method2886(true);
            this.field1793 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1793[var12] = arg1.method2882(-1);
            }
            for (int var13 = 0; var13 < var11; var13++) {
                this.field1793[var13] += arg1.method2882(class639.method3689(arg2, 65535)) << 16;
            }
        } else if (arg0 == 13) {
            int var4 = arg1.method2882(-1);
            this.field1797 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2886(true);
                if (var6 > 0) {
                    this.field1797[var5] = new int[var6];
                    this.field1797[var5][0] = arg1.method2865(255);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field1797[var5][var7] = arg1.method2882(-1);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1794 = true;
        } else if (arg0 == 15) {
            this.field1783 = true;
        } else if (arg0 == 16) {
            this.field1791 = true;
        } else if (arg0 == 18) {
            this.field1787 = true;
        } else if (arg0 == 19) {
            if (this.field1808 == null) {
                this.field1808 = new int[this.field1797.length];
                for (int var10 = 0; var10 < this.field1797.length; var10++) {
                    this.field1808[var10] = 255;
                }
            }
            this.field1808[arg1.method2886(true)] = arg1.method2886(true);
        } else if (arg0 == 20) {
            if (this.field1804 == null || this.field1785 == null) {
                this.field1804 = new int[this.field1797.length];
                this.field1785 = new int[this.field1797.length];
                for (int var8 = 0; var8 < this.field1797.length; var8++) {
                    this.field1804[var8] = 256;
                    this.field1785[var8] = 256;
                }
            }
            int var9 = arg1.method2886(true);
            this.field1804[var9] = arg1.method2882(-1);
            this.field1785[var9] = arg1.method2882(-1);
        }
        if (arg2 != -65536) {
            this.method924(103, 86, true, 92);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public final void method918(int arg0) {
        if (arg0 > -39) {
            return;
        }
        if (this.field1795 == -1) {
            if (this.field1803 == null) {
                this.field1795 = 0;
            } else {
                this.field1795 = 2;
            }
        }
        field1805++;
        if (this.field1788 != -1) {
            return;
        }
        if (this.field1803 == null) {
            this.field1788 = 0;
        } else {
            this.field1788 = 2;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIIILka;IBI)Lka;")
    public final class282 method919(byte arg0, int arg1, int arg2, int arg3, class282 arg4, int arg5, byte arg6, int arg7) {
        field1801++;
        int var9 = this.field1812[arg1];
        int var10 = this.field1792[arg1];
        class700 var11 = this.field1809.method3005(var10 >> 16, 14344);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method509(arg6, arg7, true);
        }
        class700 var13 = null;
        if ((this.field1783 || class316.field4266) && arg2 != -1 && this.field1792.length > arg2) {
            int var14 = this.field1792[arg2];
            var13 = this.field1809.method3005(var14 >> 16, 14344);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field1794) {
            arg7 |= 0x200;
        }
        if (arg0 != -2) {
            this.method918(42);
        }
        if (var11.method3931(var12, (byte) -78)) {
            arg7 |= 0x80;
        }
        if (var11.method3930((byte) 63, var12)) {
            arg7 |= 0x100;
        }
        if (var11.method3934(var12, (byte) 38)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3931(arg2, (byte) -78)) {
                arg7 |= 0x80;
            }
            if (var13.method3930((byte) 63, arg2)) {
                arg7 |= 0x100;
            }
            if (var13.method3934(arg2, (byte) -11)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class282 var16 = arg4.method509(arg6, var15, true);
        var16.method1808(arg0 + 2, this.field1794, var11, arg5, var12, var13, arg3 - 1, var9, arg2);
        return var16;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBIILka;)Lka;")
    public final class282 method920(int arg0, int arg1, byte arg2, int arg3, int arg4, class282 arg5) {
        field1790++;
        int var7 = this.field1812[arg3];
        int var8 = this.field1792[arg3];
        class700 var9 = this.field1809.method3005(var8 >> 16, 14344);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method509((byte) 1, arg0, true);
        }
        if (arg2 != -51) {
            field1814 = null;
        }
        class700 var11 = null;
        if ((this.field1783 || class316.field4266) && arg1 != -1 && arg1 < this.field1792.length) {
            int var12 = this.field1792[arg1];
            var11 = this.field1809.method3005(var12 >> 16, 14344);
            arg1 = var12 & 0xFFFF;
        }
        class700 var13 = null;
        class700 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1793 != null) {
            if (this.field1793.length > arg3) {
                var15 = this.field1793[arg3];
                if (var15 != 65535) {
                    var13 = this.field1809.method3005(var15 >> 16, 14344);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1783 || class316.field4266) && arg1 != -1 && arg1 < this.field1793.length) {
                var16 = this.field1793[arg1];
                if (var16 != 65535) {
                    var14 = this.field1809.method3005(var16 >> 16, 14344);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1794) {
            arg0 |= 0x200;
        }
        if (var9.method3931(var10, (byte) -78)) {
            arg0 |= 0x80;
        }
        if (var9.method3930((byte) 63, var10)) {
            arg0 |= 0x100;
        }
        if (var9.method3934(var10, (byte) -92)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3931(var15, (byte) -78)) {
                arg0 |= 0x80;
            }
            if (var13.method3930((byte) 63, var15)) {
                arg0 |= 0x100;
            }
            if (var13.method3934(var15, (byte) -122)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3931(arg1, (byte) -78)) {
                arg0 |= 0x80;
            }
            if (var11.method3930((byte) 63, arg1)) {
                arg0 |= 0x100;
            }
            if (var11.method3934(arg1, (byte) 125)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3931(var16, (byte) -78)) {
                arg0 |= 0x80;
            }
            if (var14.method3930((byte) 63, var16)) {
                arg0 |= 0x100;
            }
            if (var14.method3934(var16, (byte) -109)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class282 var18 = arg5.method509((byte) 1, var17, true);
        var18.method1808(arg2 + 51, this.field1794, var9, 0, var10, var11, arg4 - 1, var7, arg1);
        if (var13 != null) {
            var18.method1808(arg2 + 51, this.field1794, var13, 0, var15, var14, arg4 - 1, var7, var16);
        }
        return var18;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field1786 = null;
        if (arg0 > -4) {
            method923(99);
        }
        field1810 = null;
        field1814 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lsl;I)V")
    public final void method922(class479 arg0, int arg1) {
        if (arg1 != -1) {
            this.method917(-118, null, -51);
        }
        field1807++;
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                return;
            }
            this.method917(var3, arg0, -65536);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)I")
    public static final int method923(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class143.field1943 - 1; var2++) {
            if (arg0 < class62.field999[var2] + class451.field6454[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class143.field1943 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZI)I")
    public final int method924(int arg0, int arg1, boolean arg2, int arg3) {
        field1798++;
        int var5 = 0;
        int var6 = 0;
        if (arg0 >= -74) {
            return -105;
        }
        int var7 = this.field1792[arg3];
        class700 var8 = null;
        class700 var9 = this.field1809.method3005(var7 >> 16, 14344);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1783 || class316.field4266) && arg1 != -1 && arg1 < this.field1792.length) {
            int var11 = this.field1792[arg1];
            var8 = this.field1809.method3005(var11 >> 16, 14344);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1794) {
            var5 |= 0x200;
        }
        if (var9.method3931(var10, (byte) -78)) {
            var5 |= 0x80;
        }
        if (var9.method3930((byte) 63, var10)) {
            var5 |= 0x100;
        }
        if (var9.method3934(var10, (byte) -92)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3931(var6, (byte) -78)) {
                var5 |= 0x80;
            }
            if (var8.method3930((byte) 63, var6)) {
                var5 |= 0x100;
            }
            if (var8.method3934(var6, (byte) -6)) {
                var5 |= 0x400;
            }
        }
        if (this.field1793 != null && arg2) {
            if (arg3 < this.field1793.length) {
                int var12 = this.field1793[arg3];
                if (var12 != 65535) {
                    class700 var13 = this.field1809.method3005(var12 >> 16, 14344);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3931(var14, (byte) -78)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3930((byte) 63, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3934(var14, (byte) 116)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1783 || class316.field4266) && arg1 != -1 && arg1 < this.field1793.length) {
                int var15 = this.field1793[arg1];
                if (var15 != 65535) {
                    class700 var16 = this.field1809.method3005(var15 >> 16, 14344);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3931(var17, (byte) -78)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3930((byte) 63, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3934(var17, (byte) 35)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
