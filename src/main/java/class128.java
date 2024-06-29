import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class128 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    private int field1809 = 100;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
    private int[] field1816 = new int[5];

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
    private int[] field1817 = new int[5];

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public int field1825 = 0;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    private int field1826 = 0;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
    private int[] field1807 = new int[5];

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public int field1828 = 500;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
    private static int[] field1804 = new int[32768];

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
    private static int[] field1815;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    private static int[] field1813;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[I")
    private static int[] field1822;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[I")
    private static int[] field1821;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[I")
    private static int[] field1827;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
    private static int[] field1824;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "[I")
    private static int[] field1823;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Leh;")
    private class107 field1806;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Leh;")
    private class107 field1808;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Leh;")
    private class107 field1810;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Leh;")
    private class107 field1811;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Leh;")
    private class107 field1812;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Leh;")
    private class107 field1814;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Leh;")
    private class107 field1818;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Leh;")
    private class107 field1819;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Leh;")
    private class107 field1820;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Le;")
    private class204 field1805;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I")
    public final int[] method784(int arg0, int arg1) {
        class37.method187(field1813, 0, arg0);
        if (arg1 < 10) {
            return field1813;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1812.method645();
        this.field1820.method645();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1814 != null) {
            this.field1814.method645();
            this.field1818.method645();
            var5 = (int) ((double) (this.field1814.field1531 - this.field1814.field1530) * 32.768D / var3);
            var6 = (int) ((double) this.field1814.field1530 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1811 != null) {
            this.field1811.method645();
            this.field1819.method645();
            var8 = (int) ((double) (this.field1811.field1531 - this.field1811.field1530) * 32.768D / var3);
            var9 = (int) ((double) this.field1811.field1530 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1807[var11] != 0) {
                field1827[var11] = 0;
                field1821[var11] = (int) ((double) this.field1817[var11] * var3);
                field1824[var11] = (this.field1807[var11] << 14) / 100;
                field1823[var11] = (int) ((double) (this.field1812.field1531 - this.field1812.field1530) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1816[var11]) / var3);
                field1822[var11] = (int) ((double) this.field1812.field1530 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1812.method646(arg0);
            int var40 = this.field1820.method646(arg0);
            if (this.field1814 != null) {
                int var41 = this.field1814.method646(arg0);
                int var42 = this.field1818.method646(arg0);
                var39 += this.method785(var7, var42, this.field1814.field1535) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1811 != null) {
                int var43 = this.field1811.method646(arg0);
                int var44 = this.field1819.method646(arg0);
                var40 = var40 * ((this.method785(var10, var44, this.field1811.field1535) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1807[var45] != 0) {
                    int var46 = field1821[var45] + var12;
                    if (var46 < arg0) {
                        field1813[var46] += this.method785(field1827[var45], field1824[var45] * var40 >> 15, this.field1812.field1535);
                        field1827[var45] += (field1823[var45] * var39 >> 16) + field1822[var45];
                    }
                }
            }
        }
        if (this.field1806 != null) {
            this.field1806.method645();
            this.field1808.method645();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1806.method646(arg0);
                int var18 = this.field1808.method646(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1806.field1531 - this.field1806.field1530) * var17 >> 8) + this.field1806.field1530;
                } else {
                    var19 = ((this.field1806.field1531 - this.field1806.field1530) * var18 >> 8) + this.field1806.field1530;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1813[var16] = 0;
                }
            }
        }
        if (this.field1826 > 0 && this.field1809 > 0) {
            int var20 = (int) ((double) this.field1826 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1813[var21] += field1813[var21 - var20] * this.field1809 / 100;
            }
        }
        if (this.field1805.field3678[0] > 0 || this.field1805.field3678[1] > 0) {
            this.field1810.method645();
            int var22 = this.field1810.method646(arg0 + 1);
            int var23 = this.field1805.method1385(0, (float) var22 / 65536.0F);
            int var24 = this.field1805.method1385(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1813[var23 + var25] * (long) class204.field3676 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1813[var23 + var25 - var36 - 1] * (long) class204.field3672[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1813[var25 - var37 - 1] * (long) class204.field3672[1][var37] >> 16);
                    }
                    field1813[var25] = var35;
                    var22 = this.field1810.method646(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1813[var23 + var25] * (long) class204.field3676 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1813[var23 + var25 - var33 - 1] * (long) class204.field3672[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1813[var25 - var34 - 1] * (long) class204.field3672[1][var34] >> 16);
                        }
                        field1813[var25] = var32;
                        var22 = this.field1810.method646(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1813[var23 + var25 - var29 - 1] * (long) class204.field3672[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1813[var25 - var30 - 1] * (long) class204.field3672[1][var30] >> 16);
                            }
                            field1813[var25] = var28;
                            this.field1810.method646(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1805.method1385(0, (float) var22 / 65536.0F);
                    var24 = this.field1805.method1385(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1813[var38] < -32768) {
                field1813[var38] = -32768;
            }
            if (field1813[var38] > 32767) {
                field1813[var38] = 32767;
            }
        }
        return field1813;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
    private final int method785(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1815[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1804[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lp;)V")
    public final void method786(class56 arg0) {
        this.field1812 = new class107();
        this.field1812.method643(arg0);
        this.field1820 = new class107();
        this.field1820.method643(arg0);
        int var2 = arg0.method367(1);
        if (var2 != 0) {
            arg0.field699--;
            this.field1814 = new class107();
            this.field1814.method643(arg0);
            this.field1818 = new class107();
            this.field1818.method643(arg0);
        }
        int var3 = arg0.method367(1);
        if (var3 != 0) {
            arg0.field699--;
            this.field1811 = new class107();
            this.field1811.method643(arg0);
            this.field1819 = new class107();
            this.field1819.method643(arg0);
        }
        int var4 = arg0.method367(1);
        if (var4 != 0) {
            arg0.field699--;
            this.field1806 = new class107();
            this.field1806.method643(arg0);
            this.field1808 = new class107();
            this.field1808.method643(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method307((byte) 73);
            if (var6 == 0) {
                break;
            }
            this.field1807[var5] = var6;
            this.field1816[var5] = arg0.method325(-6419);
            this.field1817[var5] = arg0.method307((byte) 73);
        }
        this.field1826 = arg0.method307((byte) 73);
        this.field1809 = arg0.method307((byte) 73);
        this.field1828 = arg0.method318(true);
        this.field1825 = arg0.method318(true);
        this.field1805 = new class204();
        this.field1810 = new class107();
        this.field1805.method1386(arg0, this.field1810);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static void method787() {
        field1813 = null;
        field1804 = null;
        field1815 = null;
        field1827 = null;
        field1821 = null;
        field1824 = null;
        field1823 = null;
        field1822 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1804[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1815 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1815[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1813 = new int[220500];
        field1822 = new int[5];
        field1821 = new int[5];
        field1827 = new int[5];
        field1824 = new int[5];
        field1823 = new int[5];
    }
}
