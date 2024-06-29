import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public int field1790 = 500;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    private int field1797 = 0;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[I")
    private int[] field1800 = new int[5];

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field1799 = 0;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    private int field1796 = 100;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
    private int[] field1792 = new int[5];

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[I")
    private int[] field1798 = new int[5];

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[I")
    private static int[] field1795 = new int[32768];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
    private static int[] field1794;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
    private static int[] field1803;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
    private static int[] field1805;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "[I")
    private static int[] field1807;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "[I")
    private static int[] field1808;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "[I")
    private static int[] field1809;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "[I")
    private static int[] field1806;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lic;")
    private class59 field1785;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lmb;")
    private class85 field1786;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lmb;")
    private class85 field1787;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lmb;")
    private class85 field1788;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lmb;")
    private class85 field1789;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lmb;")
    private class85 field1791;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lmb;")
    private class85 field1793;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lmb;")
    private class85 field1801;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lmb;")
    private class85 field1802;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lmb;")
    private class85 field1804;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lmc;)V")
    public final void method599(class86 arg0) {
        this.field1786 = new class85();
        this.field1786.method622(arg0);
        this.field1791 = new class85();
        this.field1791.method622(arg0);
        int var2 = arg0.method646(-15447);
        if (var2 != 0) {
            arg0.field1924--;
            this.field1793 = new class85();
            this.field1793.method622(arg0);
            this.field1801 = new class85();
            this.field1801.method622(arg0);
        }
        int var3 = arg0.method646(-15447);
        if (var3 != 0) {
            arg0.field1924--;
            this.field1804 = new class85();
            this.field1804.method622(arg0);
            this.field1787 = new class85();
            this.field1787.method622(arg0);
        }
        int var4 = arg0.method646(-15447);
        if (var4 != 0) {
            arg0.field1924--;
            this.field1802 = new class85();
            this.field1802.method622(arg0);
            this.field1789 = new class85();
            this.field1789.method622(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method636((byte) 109);
            if (var6 == 0) {
                break;
            }
            this.field1792[var5] = var6;
            this.field1800[var5] = arg0.method641(99);
            this.field1798[var5] = arg0.method636((byte) 109);
        }
        this.field1797 = arg0.method636((byte) 109);
        this.field1796 = arg0.method636((byte) 109);
        this.field1790 = arg0.method632((byte) -80);
        this.field1799 = arg0.method632((byte) -80);
        this.field1785 = new class59();
        this.field1788 = new class85();
        this.field1785.method447(arg0, this.field1788);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
    public final int[] method600(int arg0, int arg1) {
        class101.method767(field1803, 0, arg0);
        if (arg1 < 10) {
            return field1803;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1786.method623();
        this.field1791.method623();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1793 != null) {
            this.field1793.method623();
            this.field1801.method623();
            var5 = (int) ((double) (this.field1793.field1897 - this.field1793.field1898) * 32.768D / var3);
            var6 = (int) ((double) this.field1793.field1898 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1804 != null) {
            this.field1804.method623();
            this.field1787.method623();
            var8 = (int) ((double) (this.field1804.field1897 - this.field1804.field1898) * 32.768D / var3);
            var9 = (int) ((double) this.field1804.field1898 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1792[var11] != 0) {
                field1808[var11] = 0;
                field1809[var11] = (int) ((double) this.field1798[var11] * var3);
                field1806[var11] = (this.field1792[var11] << 14) / 100;
                field1807[var11] = (int) ((double) (this.field1786.field1897 - this.field1786.field1898) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1800[var11]) / var3);
                field1805[var11] = (int) ((double) this.field1786.field1898 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1786.method621(arg0);
            int var40 = this.field1791.method621(arg0);
            if (this.field1793 != null) {
                int var41 = this.field1793.method621(arg0);
                int var42 = this.field1801.method621(arg0);
                var39 += this.method601(var7, var42, this.field1793.field1900) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1804 != null) {
                int var43 = this.field1804.method621(arg0);
                int var44 = this.field1787.method621(arg0);
                var40 = var40 * ((this.method601(var10, var44, this.field1804.field1900) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1792[var45] != 0) {
                    int var46 = field1809[var45] + var12;
                    if (var46 < arg0) {
                        field1803[var46] += this.method601(field1808[var45], field1806[var45] * var40 >> 15, this.field1786.field1900);
                        field1808[var45] += (field1807[var45] * var39 >> 16) + field1805[var45];
                    }
                }
            }
        }
        if (this.field1802 != null) {
            this.field1802.method623();
            this.field1789.method623();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1802.method621(arg0);
                int var18 = this.field1789.method621(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1802.field1897 - this.field1802.field1898) * var17 >> 8) + this.field1802.field1898;
                } else {
                    var19 = ((this.field1802.field1897 - this.field1802.field1898) * var18 >> 8) + this.field1802.field1898;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1803[var16] = 0;
                }
            }
        }
        if (this.field1797 > 0 && this.field1796 > 0) {
            int var20 = (int) ((double) this.field1797 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1803[var21] += field1803[var21 - var20] * this.field1796 / 100;
            }
        }
        if (this.field1785.field1266[0] > 0 || this.field1785.field1266[1] > 0) {
            this.field1788.method623();
            int var22 = this.field1788.method621(arg0 + 1);
            int var23 = this.field1785.method448(0, (float) var22 / 65536.0F);
            int var24 = this.field1785.method448(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1803[var23 + var25] * (long) class59.field1260 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1803[var23 + var25 - var36 - 1] * (long) class59.field1259[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1803[var25 - var37 - 1] * (long) class59.field1259[1][var37] >> 16);
                    }
                    field1803[var25] = var35;
                    var22 = this.field1788.method621(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1803[var23 + var25] * (long) class59.field1260 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1803[var23 + var25 - var33 - 1] * (long) class59.field1259[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1803[var25 - var34 - 1] * (long) class59.field1259[1][var34] >> 16);
                        }
                        field1803[var25] = var32;
                        var22 = this.field1788.method621(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1803[var23 + var25 - var29 - 1] * (long) class59.field1259[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1803[var25 - var30 - 1] * (long) class59.field1259[1][var30] >> 16);
                            }
                            field1803[var25] = var28;
                            this.field1788.method621(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1785.method448(0, (float) var22 / 65536.0F);
                    var24 = this.field1785.method448(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1803[var38] < -32768) {
                field1803[var38] = -32768;
            }
            if (field1803[var38] > 32767) {
                field1803[var38] = 32767;
            }
        }
        return field1803;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I")
    private final int method601(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1794[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1795[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
    public static void method602() {
        field1803 = null;
        field1795 = null;
        field1794 = null;
        field1808 = null;
        field1809 = null;
        field1806 = null;
        field1807 = null;
        field1805 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1795[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1794 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1794[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1803 = new int[220500];
        field1805 = new int[5];
        field1807 = new int[5];
        field1808 = new int[5];
        field1809 = new int[5];
        field1806 = new int[5];
    }
}
