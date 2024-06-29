import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class131 {

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public int field1800 = -1;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public int field1799 = 5;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "Z")
    public boolean field1792 = false;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public int field1805 = 99;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    public int field1811 = -1;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public int field1801 = 2;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public int field1804 = -1;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public int field1809 = -1;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Z")
    public boolean field1788 = false;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
    public int field1813 = 0;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "Z")
    public boolean field1817 = false;

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
    public int field1815 = -1;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "Z")
    public boolean field1816 = false;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public static int field1795 = 0;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1794 = -1;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Luc;")
    public static class27 field1789 = new class27(54, 12);

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "J")
    public static long field1818 = 0L;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "Lur;")
    public class493 field1808;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "[I")
    private int[] field1802;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "[I")
    public int[] field1806;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "[I")
    public int[] field1810;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "[Z")
    public boolean[] field1812;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "[[I")
    public int[][] field1793;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIII)I", line = 10)
    public final int method908(boolean arg0, int arg1, int arg2, int arg3) {
        field1791++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1806[arg2];
        class597 var8 = null;
        class597 var9 = this.field1808.method2757(64, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1788 || class492.field6791) && arg3 != -1 && this.field1806.length > arg3) {
            int var11 = this.field1806[arg3];
            var8 = this.field1808.method2757(64, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (arg1 != 128) {
            this.method912(86, -8, 94, 100, (byte) 70, -49, null, -7);
        }
        if (this.field1792) {
            var5 |= 0x200;
        }
        if (var9.method3303(true, var10)) {
            var5 |= 0x80;
        }
        if (var9.method3302(var10, false)) {
            var5 |= 0x100;
        }
        if (var9.method3304(arg1 - 254, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3303(true, var6)) {
                var5 |= 0x80;
            }
            if (var8.method3302(var6, false)) {
                var5 |= 0x100;
            }
            if (var8.method3304(18, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field1802 != null && arg0) {
            if (arg2 < this.field1802.length) {
                int var12 = this.field1802[arg2];
                if (var12 != 65535) {
                    class597 var13 = this.field1808.method2757(64, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3303(true, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3302(var14, false)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3304(103, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1788 || class492.field6791) && arg3 != -1 && arg3 < this.field1802.length) {
                int var15 = this.field1802[arg3];
                if (var15 != 65535) {
                    class597 var16 = this.field1808.method2757(64, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3303(true, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3302(var17, false)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3304(-119, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILba;III)Lba;", line = 136)
    public final class352 method909(int arg0, int arg1, class352 arg2, int arg3, int arg4, int arg5) {
        field1807++;
        int var7 = this.field1810[arg5];
        int var8 = this.field1806[arg5];
        class597 var9 = this.field1808.method2757(64, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method235((byte) 1, arg0, true);
        }
        class597 var11 = null;
        if ((this.field1788 || class492.field6791) && arg3 != -1 && this.field1806.length > arg3) {
            int var12 = this.field1806[arg3];
            var11 = this.field1808.method2757(64, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class597 var13 = null;
        class597 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1802 != null) {
            if (this.field1802.length > arg5) {
                var15 = this.field1802[arg5];
                if (var15 != 65535) {
                    var13 = this.field1808.method2757(64, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1788 || class492.field6791) && arg3 != -1 && this.field1802.length > arg3) {
                var16 = this.field1802[arg3];
                if (var16 != 65535) {
                    var14 = this.field1808.method2757(64, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1792) {
            arg0 |= 0x200;
        }
        if (arg4 != -2221) {
            this.method908(true, 10, -9, -74);
        }
        if (var9.method3303(true, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method3302(var10, false)) {
            arg0 |= 0x100;
        }
        if (var9.method3304(108, var10)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3303(true, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method3302(var15, false)) {
                arg0 |= 0x100;
            }
            if (var13.method3304(-95, var15)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3303(true, arg3)) {
                arg0 |= 0x80;
            }
            if (var11.method3302(arg3, false)) {
                arg0 |= 0x100;
            }
            if (var11.method3304(95, arg3)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3303(true, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method3302(var16, false)) {
                arg0 |= 0x100;
            }
            if (var14.method3304(13, var16)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class352 var18 = arg2.method235((byte) 1, var17, true);
        var18.method2090(arg1 - 1, var10, this.field1792, arg3, 0, var11, var7, 16383, var9);
        if (var13 != null) {
            var18.method2090(arg1 - 1, var15, this.field1792, var16, 0, var14, var7, 16383, var13);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjr;)V", line = 275)
    public final void method910(int arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method718(-106);
            if (var3 == 0) {
                if (arg0 != -1) {
                    return;
                }
                field1814++;
                return;
            }
            this.method913(arg1, var3, 87);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 296)
    public static void method911(byte arg0) {
        if (arg0 != 57) {
            field1803 = 94;
        }
        field1789 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIBILba;I)Lba;", line = 308)
    public final class352 method912(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class352 arg6, int arg7) {
        field1798++;
        int var9 = this.field1810[arg5];
        int var10 = this.field1806[arg5];
        class597 var11 = this.field1808.method2757(64, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method235(arg4, arg2, true);
        }
        class597 var13 = null;
        if ((this.field1788 || class492.field6791) && arg0 != -1 && arg0 < this.field1806.length) {
            int var14 = this.field1806[arg0];
            var13 = this.field1808.method2757(64, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field1792) {
            arg2 |= 0x200;
        }
        if (var11.method3303(true, var12)) {
            arg2 |= 0x80;
        }
        if (var11.method3302(var12, false)) {
            arg2 |= 0x100;
        }
        if (var11.method3304(-112, var12)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3303(true, arg0)) {
                arg2 |= 0x80;
            }
            if (var13.method3302(arg0, false)) {
                arg2 |= 0x100;
            }
            if (var13.method3304(arg1 ^ 0xFFFFFF12, arg0)) {
                arg2 |= 0x400;
            }
        }
        if (arg1 != 128) {
            this.method913(null, -61, 101);
        }
        int var15 = arg2 | 0x20;
        class352 var16 = arg6.method235(arg4, var15, true);
        var16.method2090(arg7 - 1, var12, this.field1792, arg0, arg3, var13, var9, 16383, var11);
        return var16;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljr;II)V", line = 384)
    private final void method913(class96 arg0, int arg1, int arg2) {
        int var4 = -89 / ((arg2 - 20) / 61);
        if (arg1 == 1) {
            int var5 = arg0.method743((byte) -45);
            this.field1810 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1810[var6] = arg0.method743((byte) -47);
            }
            this.field1806 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field1806[var7] = arg0.method743((byte) -111);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field1806[var8] = (arg0.method743((byte) -109) << 16) + this.field1806[var8];
            }
        } else if (arg1 == 2) {
            this.field1800 = arg0.method743((byte) -72);
        } else if (arg1 == 3) {
            this.field1812 = new boolean[256];
            int var9 = arg0.method718(114);
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1812[arg0.method718(116)] = true;
            }
        } else if (arg1 == 5) {
            this.field1799 = arg0.method718(80);
        } else if (arg1 == 6) {
            this.field1811 = arg0.method743((byte) -17);
        } else if (arg1 == 7) {
            this.field1815 = arg0.method743((byte) -16);
        } else if (arg1 == 8) {
            this.field1805 = arg0.method718(118);
        } else if (arg1 == 9) {
            this.field1804 = arg0.method718(-109);
        } else if (arg1 == 10) {
            this.field1809 = arg0.method718(-106);
        } else if (arg1 == 11) {
            this.field1801 = arg0.method718(85);
        } else if (arg1 == 12) {
            int var15 = arg0.method718(-55);
            this.field1802 = new int[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field1802[var16] = arg0.method743((byte) -76);
            }
            for (int var17 = 0; var17 < var15; var17++) {
                this.field1802[var17] += arg0.method743((byte) -36) << 16;
            }
        } else if (arg1 == 13) {
            int var11 = arg0.method743((byte) -94);
            this.field1793 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method718(-125);
                if (var13 > 0) {
                    this.field1793[var12] = new int[var13];
                    this.field1793[var12][0] = arg0.method736(-124);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field1793[var12][var14] = arg0.method743((byte) -7);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1792 = true;
        } else if (arg1 == 15) {
            this.field1788 = true;
        } else if (arg1 == 16) {
            this.field1817 = true;
        } else if (arg1 == 17) {
            this.field1813 = arg0.method718(88);
        } else if (arg1 == 18) {
            this.field1816 = true;
        }
        field1797++;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 558)
    public final void method914(int arg0) {
        if (arg0 >= -105) {
            return;
        }
        if (this.field1809 == -1) {
            if (this.field1812 == null) {
                this.field1809 = 0;
            } else {
                this.field1809 = 2;
            }
        }
        if (this.field1804 == -1) {
            if (this.field1812 == null) {
                this.field1804 = 0;
            } else {
                this.field1804 = 2;
            }
        }
        field1796++;
    }
}
