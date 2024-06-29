import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class95 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
    private int[] field1588 = new int[5];

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[I")
    private int[] field1597 = new int[5];

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    private int field1590 = 0;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public int field1595 = 0;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[I")
    private int[] field1605 = new int[5];

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    private int field1610 = 100;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public int field1609 = 500;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[I")
    private static int[] field1592 = new int[32768];

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[I")
    private static int[] field1600;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    private static int[] field1589;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[I")
    private static int[] field1607;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "[I")
    private static int[] field1606;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "[I")
    private static int[] field1608;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "[I")
    private static int[] field1611;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
    private static int[] field1612;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lsb;")
    private class118 field1599;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lmc;")
    private class50 field1591;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lmc;")
    private class50 field1593;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lmc;")
    private class50 field1594;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lmc;")
    private class50 field1596;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lmc;")
    private class50 field1598;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lmc;")
    private class50 field1601;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lmc;")
    private class50 field1602;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lmc;")
    private class50 field1603;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Lmc;")
    private class50 field1604;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)[I")
    public final int[] method732(int arg0, int arg1) {
        class117.method874(field1589, 0, arg0);
        if (arg1 < 10) {
            return field1589;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1594.method305();
        this.field1596.method305();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1591 != null) {
            this.field1591.method305();
            this.field1602.method305();
            var5 = (int) ((double) (this.field1591.field688 - this.field1591.field685) * 32.768D / var3);
            var6 = (int) ((double) this.field1591.field685 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1601 != null) {
            this.field1601.method305();
            this.field1598.method305();
            var8 = (int) ((double) (this.field1601.field688 - this.field1601.field685) * 32.768D / var3);
            var9 = (int) ((double) this.field1601.field685 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1605[var11] != 0) {
                field1606[var11] = 0;
                field1612[var11] = (int) ((double) this.field1588[var11] * var3);
                field1607[var11] = (this.field1605[var11] << 14) / 100;
                field1611[var11] = (int) ((double) (this.field1594.field688 - this.field1594.field685) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1597[var11]) / var3);
                field1608[var11] = (int) ((double) this.field1594.field685 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1594.method303(arg0);
            int var40 = this.field1596.method303(arg0);
            if (this.field1591 != null) {
                int var41 = this.field1591.method303(arg0);
                int var42 = this.field1602.method303(arg0);
                var39 += this.method734(var7, var42, this.field1591.field687) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1601 != null) {
                int var43 = this.field1601.method303(arg0);
                int var44 = this.field1598.method303(arg0);
                var40 = var40 * ((this.method734(var10, var44, this.field1601.field687) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1605[var45] != 0) {
                    int var46 = field1612[var45] + var12;
                    if (var46 < arg0) {
                        field1589[var46] += this.method734(field1606[var45], field1607[var45] * var40 >> 15, this.field1594.field687);
                        field1606[var45] += (field1611[var45] * var39 >> 16) + field1608[var45];
                    }
                }
            }
        }
        if (this.field1604 != null) {
            this.field1604.method305();
            this.field1603.method305();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1604.method303(arg0);
                int var18 = this.field1603.method303(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1604.field688 - this.field1604.field685) * var17 >> 8) + this.field1604.field685;
                } else {
                    var19 = ((this.field1604.field688 - this.field1604.field685) * var18 >> 8) + this.field1604.field685;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1589[var16] = 0;
                }
            }
        }
        if (this.field1590 > 0 && this.field1610 > 0) {
            int var20 = (int) ((double) this.field1590 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1589[var21] += field1589[var21 - var20] * this.field1610 / 100;
            }
        }
        if (this.field1599.field1917[0] > 0 || this.field1599.field1917[1] > 0) {
            this.field1593.method305();
            int var22 = this.field1593.method303(arg0 + 1);
            int var23 = this.field1599.method884(0, (float) var22 / 65536.0F);
            int var24 = this.field1599.method884(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1589[var23 + var25] * (long) class118.field1916 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1589[var23 + var25 - var36 - 1] * (long) class118.field1918[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1589[var25 - var37 - 1] * (long) class118.field1918[1][var37] >> 16);
                    }
                    field1589[var25] = var35;
                    var22 = this.field1593.method303(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1589[var23 + var25] * (long) class118.field1916 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1589[var23 + var25 - var33 - 1] * (long) class118.field1918[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1589[var25 - var34 - 1] * (long) class118.field1918[1][var34] >> 16);
                        }
                        field1589[var25] = var32;
                        var22 = this.field1593.method303(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1589[var23 + var25 - var29 - 1] * (long) class118.field1918[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1589[var25 - var30 - 1] * (long) class118.field1918[1][var30] >> 16);
                            }
                            field1589[var25] = var28;
                            this.field1593.method303(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1599.method884(0, (float) var22 / 65536.0F);
                    var24 = this.field1599.method884(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1589[var38] < -32768) {
                field1589[var38] = -32768;
            }
            if (field1589[var38] > 32767) {
                field1589[var38] = 32767;
            }
        }
        return field1589;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lhc;)V")
    public final void method733(class53 arg0) {
        this.field1594 = new class50();
        this.field1594.method304(arg0);
        this.field1596 = new class50();
        this.field1596.method304(arg0);
        int var2 = arg0.method366(-16505);
        if (var2 != 0) {
            arg0.field735--;
            this.field1591 = new class50();
            this.field1591.method304(arg0);
            this.field1602 = new class50();
            this.field1602.method304(arg0);
        }
        int var3 = arg0.method366(-16505);
        if (var3 != 0) {
            arg0.field735--;
            this.field1601 = new class50();
            this.field1601.method304(arg0);
            this.field1598 = new class50();
            this.field1598.method304(arg0);
        }
        int var4 = arg0.method366(-16505);
        if (var4 != 0) {
            arg0.field735--;
            this.field1604 = new class50();
            this.field1604.method304(arg0);
            this.field1603 = new class50();
            this.field1603.method304(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method368(-129);
            if (var6 == 0) {
                break;
            }
            this.field1605[var5] = var6;
            this.field1597[var5] = arg0.method373(117);
            this.field1588[var5] = arg0.method368(-129);
        }
        this.field1590 = arg0.method368(-129);
        this.field1610 = arg0.method368(-129);
        this.field1609 = arg0.method331(-42);
        this.field1595 = arg0.method331(-118);
        this.field1599 = new class118();
        this.field1593 = new class50();
        this.field1599.method882(arg0, this.field1593);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)I")
    private final int method734(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1600[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1592[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public static void method735() {
        field1589 = null;
        field1592 = null;
        field1600 = null;
        field1606 = null;
        field1612 = null;
        field1607 = null;
        field1611 = null;
        field1608 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1592[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1600 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1600[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1589 = new int[220500];
        field1607 = new int[5];
        field1606 = new int[5];
        field1608 = new int[5];
        field1611 = new int[5];
        field1612 = new int[5];
    }
}
