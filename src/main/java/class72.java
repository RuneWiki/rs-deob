import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZJWNEIBQ")
public class class72 {

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "Z")
    private boolean field1754 = false;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "j", descriptor = "[I")
    private int[] field1763 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "k", descriptor = "[I")
    private int[] field1764 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "l", descriptor = "[I")
    private int[] field1765 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "n", descriptor = "I")
    private int field1767 = 100;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "q", descriptor = "I")
    public int field1770 = 500;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "v", descriptor = "[I")
    private static int[] field1775 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "w", descriptor = "[I")
    private static int[] field1776 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "x", descriptor = "[I")
    private static int[] field1777 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "y", descriptor = "[I")
    private static int[] field1778 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "z", descriptor = "[I")
    private static int[] field1779 = new int[5];

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "m", descriptor = "I")
    private int field1766;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "r", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "b", descriptor = "LHCHPPCNY;")
    private class20 field1755;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "c", descriptor = "LHCHPPCNY;")
    private class20 field1756;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "d", descriptor = "LHCHPPCNY;")
    private class20 field1757;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "e", descriptor = "LHCHPPCNY;")
    private class20 field1758;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "f", descriptor = "LHCHPPCNY;")
    private class20 field1759;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "g", descriptor = "LHCHPPCNY;")
    private class20 field1760;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "h", descriptor = "LHCHPPCNY;")
    private class20 field1761;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "i", descriptor = "LHCHPPCNY;")
    private class20 field1762;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "p", descriptor = "LHCHPPCNY;")
    private class20 field1769;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "o", descriptor = "LPTIFANAY;")
    private class42 field1768;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "s", descriptor = "[I")
    private static int[] field1772;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "t", descriptor = "[I")
    private static int[] field1773;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "u", descriptor = "[I")
    private static int[] field1774;

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "()V")
    public static final void method601() {
        field1773 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1773[var0] = 1;
            } else {
                field1773[var0] = -1;
            }
        }
        field1774 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1774[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1772 = new int[220500];
    }

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "(II)[I")
    public final int[] method602(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1772[var3] = 0;
        }
        if (arg1 < 10) {
            return field1772;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1755.method318(7);
        this.field1756.method318(7);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1757 != null) {
            this.field1757.method318(7);
            this.field1758.method318(7);
            var6 = (int) ((double) (this.field1757.field761 - this.field1757.field760) * 32.768D / var4);
            var7 = (int) ((double) this.field1757.field760 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1759 != null) {
            this.field1759.method318(7);
            this.field1760.method318(7);
            var9 = (int) ((double) (this.field1759.field761 - this.field1759.field760) * 32.768D / var4);
            var10 = (int) ((double) this.field1759.field760 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1763[var12] != 0) {
                field1775[var12] = 0;
                field1776[var12] = (int) ((double) this.field1765[var12] * var4);
                field1777[var12] = (this.field1763[var12] << 14) / 100;
                field1778[var12] = (int) ((double) (this.field1755.field761 - this.field1755.field760) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1764[var12]) / var4);
                field1779[var12] = (int) ((double) this.field1755.field760 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1755.method319(arg0, (byte) 81);
            int var42 = this.field1756.method319(arg0, (byte) 81);
            if (this.field1757 != null) {
                int var43 = this.field1757.method319(arg0, (byte) 81);
                int var44 = this.field1758.method319(arg0, (byte) 81);
                var41 += this.method603(var44, var8, this.field1757.field762, 1) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1759 != null) {
                int var45 = this.field1759.method319(arg0, (byte) 81);
                int var46 = this.field1760.method319(arg0, (byte) 81);
                var42 = var42 * ((this.method603(var46, var11, this.field1759.field762, 1) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1763[var47] != 0) {
                    int var48 = field1776[var47] + var13;
                    if (var48 < arg0) {
                        field1772[var48] += this.method603(field1777[var47] * var42 >> 15, field1775[var47], this.field1755.field762, 1);
                        field1775[var47] += (field1778[var47] * var41 >> 16) + field1779[var47];
                    }
                }
            }
        }
        if (this.field1761 != null) {
            this.field1761.method318(7);
            this.field1762.method318(7);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1761.method319(arg0, (byte) 81);
                int var19 = this.field1762.method319(arg0, (byte) 81);
                int var20;
                if (var16) {
                    var20 = ((this.field1761.field761 - this.field1761.field760) * var18 >> 8) + this.field1761.field760;
                } else {
                    var20 = ((this.field1761.field761 - this.field1761.field760) * var19 >> 8) + this.field1761.field760;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1772[var17] = 0;
                }
            }
        }
        if (this.field1766 > 0 && this.field1767 > 0) {
            int var21 = (int) ((double) this.field1766 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1772[var22] += field1772[var22 - var21] * this.field1767 / 100;
            }
        }
        if (this.field1768.field1154[0] > 0 || this.field1768.field1154[1] > 0) {
            this.field1769.method318(7);
            int var23 = this.field1769.method319(arg0 + 1, (byte) 81);
            int var24 = this.field1768.method434(748, (float) var23 / 65536.0F, 0);
            int var25 = this.field1768.method434(748, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1772[var24 + var26] * (long) class42.field1161 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1772[var24 + var26 - var38 - 1] * (long) class42.field1159[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1772[var26 - var39 - 1] * (long) class42.field1159[1][var39] >> 16);
                    }
                    field1772[var26] = var37;
                    var23 = this.field1769.method319(arg0 + 1, (byte) 81);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1772[var24 + var26] * (long) class42.field1161 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1772[var24 + var26 - var35 - 1] * (long) class42.field1159[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1772[var26 - var36 - 1] * (long) class42.field1159[1][var36] >> 16);
                        }
                        field1772[var26] = var34;
                        var23 = this.field1769.method319(arg0 + 1, (byte) 81);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1772[var24 + var26 - var31 - 1] * (long) class42.field1159[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1772[var26 - var32 - 1] * (long) class42.field1159[1][var32] >> 16);
                            }
                            field1772[var26] = var30;
                            this.field1769.method319(arg0 + 1, (byte) 81);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1768.method434(748, (float) var23 / 65536.0F, 0);
                    var25 = this.field1768.method434(748, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1772[var40] < -32768) {
                field1772[var40] = -32768;
            }
            if (field1772[var40] > 32767) {
                field1772[var40] = 32767;
            }
        }
        return field1772;
    }

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "(IIII)I")
    private final int method603(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 1 || arg3 > 1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg2 == 2) {
            return field1774[arg1 & 0x7FFF] * arg0 >> 14;
        } else if (arg2 == 3) {
            return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg2 == 4) {
            return field1773[arg1 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "(ILBSNPYLEV;)V")
    public final void method604(int arg0, class7 arg1) {
        this.field1755 = new class20();
        this.field1755.method316(7, arg1);
        this.field1756 = new class20();
        this.field1756.method316(7, arg1);
        int var3 = arg1.method47();
        if (var3 != 0) {
            arg1.field91--;
            this.field1757 = new class20();
            this.field1757.method316(7, arg1);
            this.field1758 = new class20();
            this.field1758.method316(7, arg1);
        }
        int var4 = arg1.method47();
        if (var4 != 0) {
            arg1.field91--;
            this.field1759 = new class20();
            this.field1759.method316(7, arg1);
            this.field1760 = new class20();
            this.field1760.method316(7, arg1);
        }
        int var5 = arg1.method47();
        if (arg0 != 7) {
            this.field1754 = !this.field1754;
        }
        if (var5 != 0) {
            arg1.field91--;
            this.field1761 = new class20();
            this.field1761.method316(7, arg1);
            this.field1762 = new class20();
            this.field1762.method316(7, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method61();
            if (var7 == 0) {
                break;
            }
            this.field1763[var6] = var7;
            this.field1764[var6] = arg1.method60();
            this.field1765[var6] = arg1.method61();
        }
        this.field1766 = arg1.method61();
        this.field1767 = arg1.method61();
        this.field1770 = arg1.method49();
        this.field1771 = arg1.method49();
        this.field1768 = new class42();
        this.field1769 = new class20();
        this.field1768.method435((byte) 28, arg1, this.field1769);
    }
}
