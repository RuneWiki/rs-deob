import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class108 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public int field1696 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
    private int[] field1700 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
    private int[] field1698 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    private int field1701 = 100;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "[I")
    private int[] field1708 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    private int field1697 = 0;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field1710 = 500;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
    private static int[] field1714 = new int[32768];

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "[I")
    private static int[] field1715;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "[I")
    private static int[] field1713;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[I")
    private static int[] field1717;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "[I")
    private static int[] field1718;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[I")
    private static int[] field1716;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
    private static int[] field1719;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "[I")
    private static int[] field1720;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lql;")
    private class316 field1699;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lhi;")
    private class80 field1702;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lhi;")
    private class80 field1703;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lhi;")
    private class80 field1704;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lhi;")
    private class80 field1705;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lhi;")
    private class80 field1706;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lhi;")
    private class80 field1707;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lhi;")
    private class80 field1709;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Lhi;")
    private class80 field1711;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lhi;")
    private class80 field1712;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 11)
    public static void method712() {
        field1713 = null;
        field1714 = null;
        field1715 = null;
        field1719 = null;
        field1720 = null;
        field1718 = null;
        field1716 = null;
        field1717 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I", line = 36)
    public final int[] method713(int arg0, int arg1) {
        class230.method1563(field1713, 0, arg0);
        if (arg1 < 10) {
            return field1713;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1712.method577();
        this.field1707.method577();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1709 != null) {
            this.field1709.method577();
            this.field1702.method577();
            var5 = (int) ((double) (this.field1709.field1291 - this.field1709.field1295) * 32.768D / var3);
            var6 = (int) ((double) this.field1709.field1295 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1706 != null) {
            this.field1706.method577();
            this.field1703.method577();
            var8 = (int) ((double) (this.field1706.field1291 - this.field1706.field1295) * 32.768D / var3);
            var9 = (int) ((double) this.field1706.field1295 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1700[var11] != 0) {
                field1719[var11] = 0;
                field1720[var11] = (int) ((double) this.field1708[var11] * var3);
                field1718[var11] = (this.field1700[var11] << 14) / 100;
                field1716[var11] = (int) ((double) (this.field1712.field1291 - this.field1712.field1295) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1698[var11]) / var3);
                field1717[var11] = (int) ((double) this.field1712.field1295 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1712.method576(arg0);
            int var14 = this.field1707.method576(arg0);
            if (this.field1709 != null) {
                int var15 = this.field1709.method576(arg0);
                int var16 = this.field1702.method576(arg0);
                var13 += this.method714(var7, var16, this.field1709.field1292) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1706 != null) {
                int var17 = this.field1706.method576(arg0);
                int var18 = this.field1703.method576(arg0);
                var14 = var14 * ((this.method714(var10, var18, this.field1706.field1292) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1700[var19] != 0) {
                    int var20 = field1720[var19] + var12;
                    if (var20 < arg0) {
                        field1713[var20] += this.method714(field1719[var19], field1718[var19] * var14 >> 15, this.field1712.field1292);
                        field1719[var19] += (field1716[var19] * var13 >> 16) + field1717[var19];
                    }
                }
            }
        }
        if (this.field1705 != null) {
            this.field1705.method577();
            this.field1711.method577();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1705.method576(arg0);
                int var26 = this.field1711.method576(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1705.field1291 - this.field1705.field1295) * var25 >> 8) + this.field1705.field1295;
                } else {
                    var27 = ((this.field1705.field1291 - this.field1705.field1295) * var26 >> 8) + this.field1705.field1295;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1713[var24] = 0;
                }
            }
        }
        if (this.field1697 > 0 && this.field1701 > 0) {
            int var28 = (int) ((double) this.field1697 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1713[var29] += field1713[var29 - var28] * this.field1701 / 100;
            }
        }
        if (this.field1699.field5429[0] > 0 || this.field1699.field5429[1] > 0) {
            this.field1704.method577();
            int var30 = this.field1704.method576(arg0 + 1);
            int var31 = this.field1699.method2205(0, (float) var30 / 65536.0F);
            int var32 = this.field1699.method2205(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1713[var31 + var33] * (long) class316.field5426 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1713[var31 + var33 - var36 - 1] * (long) class316.field5424[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1713[var33 - var37 - 1] * (long) class316.field5424[1][var37] >> 16);
                    }
                    field1713[var33] = var35;
                    var30 = this.field1704.method576(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1713[var31 + var33] * (long) class316.field5426 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1713[var31 + var33 - var40 - 1] * (long) class316.field5424[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1713[var33 - var41 - 1] * (long) class316.field5424[1][var41] >> 16);
                        }
                        field1713[var33] = var39;
                        var30 = this.field1704.method576(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1713[var31 + var33 - var43 - 1] * (long) class316.field5424[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1713[var33 - var44 - 1] * (long) class316.field5424[1][var44] >> 16);
                            }
                            field1713[var33] = var42;
                            this.field1704.method576(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1699.method2205(0, (float) var30 / 65536.0F);
                    var32 = this.field1699.method2205(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1713[var46] < -32768) {
                field1713[var46] = -32768;
            }
            if (field1713[var46] > 32767) {
                field1713[var46] = 32767;
            }
        }
        return field1713;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I", line = 317)
    private final int method714(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1715[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1714[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lbb;)V", line = 355)
    public final void method715(class134 arg0) {
        this.field1712 = new class80();
        this.field1712.method574(arg0);
        this.field1707 = new class80();
        this.field1707.method574(arg0);
        int var2 = arg0.method948(-125);
        if (var2 != 0) {
            arg0.field2299--;
            this.field1709 = new class80();
            this.field1709.method574(arg0);
            this.field1702 = new class80();
            this.field1702.method574(arg0);
        }
        int var3 = arg0.method948(-122);
        if (var3 != 0) {
            arg0.field2299--;
            this.field1706 = new class80();
            this.field1706.method574(arg0);
            this.field1703 = new class80();
            this.field1703.method574(arg0);
        }
        int var4 = arg0.method948(-125);
        if (var4 != 0) {
            arg0.field2299--;
            this.field1705 = new class80();
            this.field1705.method574(arg0);
            this.field1711 = new class80();
            this.field1711.method574(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method930(-15535);
            if (var6 == 0) {
                break;
            }
            this.field1700[var5] = var6;
            this.field1698[var5] = arg0.method973((byte) -119);
            this.field1708[var5] = arg0.method930(-15535);
        }
        this.field1697 = arg0.method930(-15535);
        this.field1701 = arg0.method930(-15535);
        this.field1710 = arg0.method942(true);
        this.field1696 = arg0.method942(true);
        this.field1699 = new class316();
        this.field1704 = new class80();
        this.field1699.method2202(arg0, this.field1704);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1714[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1715 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1715[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1713 = new int[220500];
        field1717 = new int[5];
        field1718 = new int[5];
        field1716 = new int[5];
        field1719 = new int[5];
        field1720 = new int[5];
    }
}
