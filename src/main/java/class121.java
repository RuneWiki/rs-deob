import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class121 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[I")
    private int[] field1817 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    private int field1823 = 0;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    private int field1824 = 100;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    private int[] field1819 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field1828 = 500;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
    private int[] field1826 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public int field1825 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    private static int[] field1814 = new int[32768];

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
    private static int[] field1832;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    private static int[] field1829;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[I")
    private static int[] field1835;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "[I")
    private static int[] field1834;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[I")
    private static int[] field1833;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "[I")
    private static int[] field1836;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "[I")
    private static int[] field1838;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lck;")
    private class258 field1830;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lkh;")
    private class7 field1815;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lkh;")
    private class7 field1816;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lkh;")
    private class7 field1818;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lkh;")
    private class7 field1820;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lkh;")
    private class7 field1821;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lkh;")
    private class7 field1822;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Lkh;")
    private class7 field1827;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Lkh;")
    private class7 field1831;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lkh;")
    private class7 field1837;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V", line = 9)
    public static void method799() {
        field1829 = null;
        field1814 = null;
        field1832 = null;
        field1835 = null;
        field1836 = null;
        field1834 = null;
        field1838 = null;
        field1833 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)I", line = 33)
    private final int method800(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1832[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1814[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I", line = 65)
    public final int[] method801(int arg0, int arg1) {
        class42.method298(field1829, 0, arg0);
        if (arg1 < 10) {
            return field1829;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1827.method85();
        this.field1820.method85();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1831 != null) {
            this.field1831.method85();
            this.field1822.method85();
            var5 = (int) ((double) (this.field1831.field106 - this.field1831.field105) * 32.768D / var3);
            var6 = (int) ((double) this.field1831.field105 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1816 != null) {
            this.field1816.method85();
            this.field1837.method85();
            var8 = (int) ((double) (this.field1816.field106 - this.field1816.field105) * 32.768D / var3);
            var9 = (int) ((double) this.field1816.field105 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1819[var11] != 0) {
                field1835[var11] = 0;
                field1836[var11] = (int) ((double) this.field1826[var11] * var3);
                field1834[var11] = (this.field1819[var11] << 14) / 100;
                field1838[var11] = (int) ((double) (this.field1827.field106 - this.field1827.field105) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1817[var11]) / var3);
                field1833[var11] = (int) ((double) this.field1827.field105 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1827.method88(arg0);
            int var14 = this.field1820.method88(arg0);
            if (this.field1831 != null) {
                int var15 = this.field1831.method88(arg0);
                int var16 = this.field1822.method88(arg0);
                var13 += this.method800(var7, var16, this.field1831.field108) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1816 != null) {
                int var17 = this.field1816.method88(arg0);
                int var18 = this.field1837.method88(arg0);
                var14 = var14 * ((this.method800(var10, var18, this.field1816.field108) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1819[var19] != 0) {
                    int var20 = field1836[var19] + var12;
                    if (var20 < arg0) {
                        field1829[var20] += this.method800(field1835[var19], field1834[var19] * var14 >> 15, this.field1827.field108);
                        field1835[var19] += (field1838[var19] * var13 >> 16) + field1833[var19];
                    }
                }
            }
        }
        if (this.field1821 != null) {
            this.field1821.method85();
            this.field1818.method85();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1821.method88(arg0);
                int var26 = this.field1818.method88(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1821.field106 - this.field1821.field105) * var25 >> 8) + this.field1821.field105;
                } else {
                    var27 = ((this.field1821.field106 - this.field1821.field105) * var26 >> 8) + this.field1821.field105;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1829[var24] = 0;
                }
            }
        }
        if (this.field1823 > 0 && this.field1824 > 0) {
            int var28 = (int) ((double) this.field1823 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1829[var29] += field1829[var29 - var28] * this.field1824 / 100;
            }
        }
        if (this.field1830.field4409[0] > 0 || this.field1830.field4409[1] > 0) {
            this.field1815.method85();
            int var30 = this.field1815.method88(arg0 + 1);
            int var31 = this.field1830.method1792(0, (float) var30 / 65536.0F);
            int var32 = this.field1830.method1792(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1829[var31 + var33] * (long) class258.field4410 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1829[var31 + var33 - var36 - 1] * (long) class258.field4413[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1829[var33 - var37 - 1] * (long) class258.field4413[1][var37] >> 16);
                    }
                    field1829[var33] = var35;
                    var30 = this.field1815.method88(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1829[var31 + var33] * (long) class258.field4410 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1829[var31 + var33 - var40 - 1] * (long) class258.field4413[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1829[var33 - var41 - 1] * (long) class258.field4413[1][var41] >> 16);
                        }
                        field1829[var33] = var39;
                        var30 = this.field1815.method88(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1829[var31 + var33 - var43 - 1] * (long) class258.field4413[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1829[var33 - var44 - 1] * (long) class258.field4413[1][var44] >> 16);
                            }
                            field1829[var33] = var42;
                            this.field1815.method88(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1830.method1792(0, (float) var30 / 65536.0F);
                    var32 = this.field1830.method1792(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1829[var46] < -32768) {
                field1829[var46] = -32768;
            }
            if (field1829[var46] > 32767) {
                field1829[var46] = 32767;
            }
        }
        return field1829;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lii;)V", line = 356)
    public final void method802(class221 arg0) {
        this.field1827 = new class7();
        this.field1827.method86(arg0);
        this.field1820 = new class7();
        this.field1820.method86(arg0);
        int var2 = arg0.method1509(true);
        if (var2 != 0) {
            arg0.field3610--;
            this.field1831 = new class7();
            this.field1831.method86(arg0);
            this.field1822 = new class7();
            this.field1822.method86(arg0);
        }
        int var3 = arg0.method1509(true);
        if (var3 != 0) {
            arg0.field3610--;
            this.field1816 = new class7();
            this.field1816.method86(arg0);
            this.field1837 = new class7();
            this.field1837.method86(arg0);
        }
        int var4 = arg0.method1509(true);
        if (var4 != 0) {
            arg0.field3610--;
            this.field1821 = new class7();
            this.field1821.method86(arg0);
            this.field1818 = new class7();
            this.field1818.method86(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1507(-117);
            if (var6 == 0) {
                break;
            }
            this.field1819[var5] = var6;
            this.field1817[var5] = arg0.method1529(-1);
            this.field1826[var5] = arg0.method1507(-105);
        }
        this.field1823 = arg0.method1507(-30);
        this.field1824 = arg0.method1507(-18);
        this.field1828 = arg0.method1524((byte) 73);
        this.field1825 = arg0.method1524((byte) 124);
        this.field1830 = new class258();
        this.field1815 = new class7();
        this.field1830.method1793(arg0, this.field1815);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1814[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1832 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1832[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1829 = new int[220500];
        field1835 = new int[5];
        field1834 = new int[5];
        field1833 = new int[5];
        field1836 = new int[5];
        field1838 = new int[5];
    }
}
