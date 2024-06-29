import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class100 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
    private int[] field1803 = new int[5];

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    private int field1798 = 100;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
    private int[] field1801 = new int[5];

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public int field1806 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
    private int[] field1797 = new int[5];

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public int field1807 = 500;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    private int field1814 = 0;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
    private static int[] field1811 = new int[32768];

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
    private static int[] field1816;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
    private static int[] field1805;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "[I")
    private static int[] field1817;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "[I")
    private static int[] field1819;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    private static int[] field1821;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[I")
    private static int[] field1820;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[I")
    private static int[] field1818;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lqd;")
    private class172 field1812;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lhd;")
    private class80 field1799;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lhd;")
    private class80 field1800;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lhd;")
    private class80 field1802;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lhd;")
    private class80 field1804;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lhd;")
    private class80 field1808;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lhd;")
    private class80 field1809;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lhd;")
    private class80 field1810;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lhd;")
    private class80 field1813;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lhd;")
    private class80 field1815;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lwa;)V")
    public final void method614(class229 arg0) {
        this.field1810 = new class80();
        this.field1810.method513(arg0);
        this.field1800 = new class80();
        this.field1800.method513(arg0);
        int var2 = arg0.method1475(255);
        if (var2 != 0) {
            arg0.field4101--;
            this.field1799 = new class80();
            this.field1799.method513(arg0);
            this.field1808 = new class80();
            this.field1808.method513(arg0);
        }
        int var3 = arg0.method1475(255);
        if (var3 != 0) {
            arg0.field4101--;
            this.field1802 = new class80();
            this.field1802.method513(arg0);
            this.field1804 = new class80();
            this.field1804.method513(arg0);
        }
        int var4 = arg0.method1475(255);
        if (var4 != 0) {
            arg0.field4101--;
            this.field1809 = new class80();
            this.field1809.method513(arg0);
            this.field1813 = new class80();
            this.field1813.method513(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1440(19108);
            if (var6 == 0) {
                break;
            }
            this.field1803[var5] = var6;
            this.field1801[var5] = arg0.method1470(77);
            this.field1797[var5] = arg0.method1440(19108);
        }
        this.field1814 = arg0.method1440(19108);
        this.field1798 = arg0.method1440(19108);
        this.field1807 = arg0.method1490((byte) 73);
        this.field1806 = arg0.method1490((byte) 73);
        this.field1812 = new class172();
        this.field1815 = new class80();
        this.field1812.method1103(arg0, this.field1815);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
    public static void method615() {
        field1805 = null;
        field1811 = null;
        field1816 = null;
        field1819 = null;
        field1820 = null;
        field1817 = null;
        field1818 = null;
        field1821 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method616(int arg0, int arg1) {
        class145.method922(field1805, 0, arg0);
        if (arg1 < 10) {
            return field1805;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1810.method512();
        this.field1800.method512();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1799 != null) {
            this.field1799.method512();
            this.field1808.method512();
            var5 = (int) ((double) (this.field1799.field1537 - this.field1799.field1538) * 32.768D / var3);
            var6 = (int) ((double) this.field1799.field1538 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1802 != null) {
            this.field1802.method512();
            this.field1804.method512();
            var8 = (int) ((double) (this.field1802.field1537 - this.field1802.field1538) * 32.768D / var3);
            var9 = (int) ((double) this.field1802.field1538 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1803[var11] != 0) {
                field1819[var11] = 0;
                field1820[var11] = (int) ((double) this.field1797[var11] * var3);
                field1817[var11] = (this.field1803[var11] << 14) / 100;
                field1818[var11] = (int) ((double) (this.field1810.field1537 - this.field1810.field1538) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1801[var11]) / var3);
                field1821[var11] = (int) ((double) this.field1810.field1538 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1810.method515(arg0);
            int var40 = this.field1800.method515(arg0);
            if (this.field1799 != null) {
                int var41 = this.field1799.method515(arg0);
                int var42 = this.field1808.method515(arg0);
                var39 += this.method617(var7, var42, this.field1799.field1535) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1802 != null) {
                int var43 = this.field1802.method515(arg0);
                int var44 = this.field1804.method515(arg0);
                var40 = var40 * ((this.method617(var10, var44, this.field1802.field1535) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1803[var45] != 0) {
                    int var46 = field1820[var45] + var12;
                    if (var46 < arg0) {
                        field1805[var46] += this.method617(field1819[var45], field1817[var45] * var40 >> 15, this.field1810.field1535);
                        field1819[var45] += (field1818[var45] * var39 >> 16) + field1821[var45];
                    }
                }
            }
        }
        if (this.field1809 != null) {
            this.field1809.method512();
            this.field1813.method512();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1809.method515(arg0);
                int var18 = this.field1813.method515(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1809.field1537 - this.field1809.field1538) * var17 >> 8) + this.field1809.field1538;
                } else {
                    var19 = ((this.field1809.field1537 - this.field1809.field1538) * var18 >> 8) + this.field1809.field1538;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1805[var16] = 0;
                }
            }
        }
        if (this.field1814 > 0 && this.field1798 > 0) {
            int var20 = (int) ((double) this.field1814 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1805[var21] += field1805[var21 - var20] * this.field1798 / 100;
            }
        }
        if (this.field1812.field3117[0] > 0 || this.field1812.field3117[1] > 0) {
            this.field1815.method512();
            int var22 = this.field1815.method515(arg0 + 1);
            int var23 = this.field1812.method1102(0, (float) var22 / 65536.0F);
            int var24 = this.field1812.method1102(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1805[var23 + var25] * (long) class172.field3115 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1805[var23 + var25 - var36 - 1] * (long) class172.field3118[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1805[var25 - var37 - 1] * (long) class172.field3118[1][var37] >> 16);
                    }
                    field1805[var25] = var35;
                    var22 = this.field1815.method515(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1805[var23 + var25] * (long) class172.field3115 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1805[var23 + var25 - var33 - 1] * (long) class172.field3118[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1805[var25 - var34 - 1] * (long) class172.field3118[1][var34] >> 16);
                        }
                        field1805[var25] = var32;
                        var22 = this.field1815.method515(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1805[var23 + var25 - var29 - 1] * (long) class172.field3118[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1805[var25 - var30 - 1] * (long) class172.field3118[1][var30] >> 16);
                            }
                            field1805[var25] = var28;
                            this.field1815.method515(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1812.method1102(0, (float) var22 / 65536.0F);
                    var24 = this.field1812.method1102(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1805[var38] < -32768) {
                field1805[var38] = -32768;
            }
            if (field1805[var38] > 32767) {
                field1805[var38] = 32767;
            }
        }
        return field1805;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
    private final int method617(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1816[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1811[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1811[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1816 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1816[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1805 = new int[220500];
        field1817 = new int[5];
        field1819 = new int[5];
        field1821 = new int[5];
        field1820 = new int[5];
        field1818 = new int[5];
    }
}
