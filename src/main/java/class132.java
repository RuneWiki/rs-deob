import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class132 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public int field1608 = 0;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "[I")
    private int[] field1613 = new int[5];

    @OriginalMember(owner = "client!as", name = "m", descriptor = "[I")
    private int[] field1620 = new int[5];

    @OriginalMember(owner = "client!as", name = "o", descriptor = "[I")
    private int[] field1622 = new int[5];

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    private int field1609 = 100;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    private int field1626 = 0;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public int field1610 = 500;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "[I")
    private static int[] field1614 = new int[32768];

    @OriginalMember(owner = "client!as", name = "h", descriptor = "[I")
    private static int[] field1615;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "[I")
    private static int[] field1612;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "[I")
    private static int[] field1629;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "[I")
    private static int[] field1630;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "[I")
    private static int[] field1625;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "[I")
    private static int[] field1632;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "[I")
    private static int[] field1628;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Lir;")
    private class25 field1616;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Lir;")
    private class25 field1617;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Lir;")
    private class25 field1618;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Lir;")
    private class25 field1619;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lir;")
    private class25 field1621;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "Lir;")
    private class25 field1623;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "Lir;")
    private class25 field1624;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "Lir;")
    private class25 field1627;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Lir;")
    private class25 field1631;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Ldw;")
    private class610 field1611;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)I")
    private final int method741(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1615[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1614[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "()V")
    public static void method742() {
        field1612 = null;
        field1614 = null;
        field1615 = null;
        field1625 = null;
        field1628 = null;
        field1632 = null;
        field1630 = null;
        field1629 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)[I")
    public final int[] method743(int arg0, int arg1) {
        class345.method1927(field1612, 0, arg0);
        if (arg1 < 10) {
            return field1612;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1617.method154();
        this.field1616.method154();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1618 != null) {
            this.field1618.method154();
            this.field1627.method154();
            var5 = (int) ((double) (this.field1618.field179 - this.field1618.field176) * 32.768D / var3);
            var6 = (int) ((double) this.field1618.field176 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1621 != null) {
            this.field1621.method154();
            this.field1631.method154();
            var8 = (int) ((double) (this.field1621.field179 - this.field1621.field176) * 32.768D / var3);
            var9 = (int) ((double) this.field1621.field176 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1622[var11] != 0) {
                field1625[var11] = 0;
                field1628[var11] = (int) ((double) this.field1620[var11] * var3);
                field1632[var11] = (this.field1622[var11] << 14) / 100;
                field1630[var11] = (int) ((double) (this.field1617.field179 - this.field1617.field176) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1613[var11]) / var3);
                field1629[var11] = (int) ((double) this.field1617.field176 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1617.method155(arg0);
            int var40 = this.field1616.method155(arg0);
            if (this.field1618 != null) {
                int var41 = this.field1618.method155(arg0);
                int var42 = this.field1627.method155(arg0);
                var39 += this.method741(var7, var42, this.field1618.field181) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1621 != null) {
                int var43 = this.field1621.method155(arg0);
                int var44 = this.field1631.method155(arg0);
                var40 = var40 * ((this.method741(var10, var44, this.field1621.field181) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1622[var45] != 0) {
                    int var46 = field1628[var45] + var12;
                    if (var46 < arg0) {
                        field1612[var46] += this.method741(field1625[var45], field1632[var45] * var40 >> 15, this.field1617.field181);
                        field1625[var45] += (field1630[var45] * var39 >> 16) + field1629[var45];
                    }
                }
            }
        }
        if (this.field1624 != null) {
            this.field1624.method154();
            this.field1623.method154();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1624.method155(arg0);
                int var18 = this.field1623.method155(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1624.field179 - this.field1624.field176) * var17 >> 8) + this.field1624.field176;
                } else {
                    var19 = ((this.field1624.field179 - this.field1624.field176) * var18 >> 8) + this.field1624.field176;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1612[var16] = 0;
                }
            }
        }
        if (this.field1626 > 0 && this.field1609 > 0) {
            int var20 = (int) ((double) this.field1626 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1612[var21] += field1612[var21 - var20] * this.field1609 / 100;
            }
        }
        if (this.field1611.field8858[0] > 0 || this.field1611.field8858[1] > 0) {
            this.field1619.method154();
            int var22 = this.field1619.method155(arg0 + 1);
            int var23 = this.field1611.method3510(0, (float) var22 / 65536.0F);
            int var24 = this.field1611.method3510(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1612[var23 + var25] * (long) class610.field8854 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1612[var23 + var25 - var36 - 1] * (long) class610.field8853[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1612[var25 - var37 - 1] * (long) class610.field8853[1][var37] >> 16);
                    }
                    field1612[var25] = var35;
                    var22 = this.field1619.method155(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1612[var23 + var25] * (long) class610.field8854 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1612[var23 + var25 - var33 - 1] * (long) class610.field8853[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1612[var25 - var34 - 1] * (long) class610.field8853[1][var34] >> 16);
                        }
                        field1612[var25] = var32;
                        var22 = this.field1619.method155(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1612[var23 + var25 - var29 - 1] * (long) class610.field8853[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1612[var25 - var30 - 1] * (long) class610.field8853[1][var30] >> 16);
                            }
                            field1612[var25] = var28;
                            this.field1619.method155(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1611.method3510(0, (float) var22 / 65536.0F);
                    var24 = this.field1611.method3510(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1612[var38] < -32768) {
                field1612[var38] = -32768;
            }
            if (field1612[var38] > 32767) {
                field1612[var38] = 32767;
            }
        }
        return field1612;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Los;)V")
    public final void method744(class374 arg0) {
        this.field1617 = new class25();
        this.field1617.method153(arg0);
        this.field1616 = new class25();
        this.field1616.method153(arg0);
        int var2 = arg0.method2129(-120);
        if (var2 != 0) {
            arg0.field4966--;
            this.field1618 = new class25();
            this.field1618.method153(arg0);
            this.field1627 = new class25();
            this.field1627.method153(arg0);
        }
        int var3 = arg0.method2129(-125);
        if (var3 != 0) {
            arg0.field4966--;
            this.field1621 = new class25();
            this.field1621.method153(arg0);
            this.field1631 = new class25();
            this.field1631.method153(arg0);
        }
        int var4 = arg0.method2129(-81);
        if (var4 != 0) {
            arg0.field4966--;
            this.field1624 = new class25();
            this.field1624.method153(arg0);
            this.field1623 = new class25();
            this.field1623.method153(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2122(false);
            if (var6 == 0) {
                break;
            }
            this.field1622[var5] = var6;
            this.field1613[var5] = arg0.method2119(true);
            this.field1620[var5] = arg0.method2122(false);
        }
        this.field1626 = arg0.method2122(false);
        this.field1609 = arg0.method2122(false);
        this.field1610 = arg0.method2136(false);
        this.field1608 = arg0.method2136(false);
        this.field1611 = new class610();
        this.field1619 = new class25();
        this.field1611.method3506(arg0, this.field1619);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1614[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1615 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1615[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1612 = new int[220500];
        field1629 = new int[5];
        field1630 = new int[5];
        field1625 = new int[5];
        field1632 = new int[5];
        field1628 = new int[5];
    }
}
