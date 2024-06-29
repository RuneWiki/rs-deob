import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class126 {

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    private int field1641 = 100;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public int field1640 = 0;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "[I")
    private int[] field1646 = new int[5];

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "[I")
    private int[] field1648 = new int[5];

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public int field1643 = 500;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "[I")
    private int[] field1654 = new int[5];

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    private int field1655 = 0;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "[I")
    private static int[] field1637 = new int[32768];

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "[I")
    private static int[] field1639;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "[I")
    private static int[] field1652;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "[I")
    private static int[] field1658;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "[I")
    private static int[] field1661;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "[I")
    private static int[] field1660;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "[I")
    private static int[] field1657;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "[I")
    private static int[] field1659;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Lnj;")
    private class248 field1638;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "Lnj;")
    private class248 field1642;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "Lnj;")
    private class248 field1645;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "Lnj;")
    private class248 field1647;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "Lnj;")
    private class248 field1649;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Lnj;")
    private class248 field1650;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "Lnj;")
    private class248 field1651;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "Lnj;")
    private class248 field1653;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "Lnj;")
    private class248 field1656;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "Lmd;")
    private class544 field1644;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1637[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1639 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1639[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1652 = new int[220500];
        field1658 = new int[5];
        field1661 = new int[5];
        field1660 = new int[5];
        field1657 = new int[5];
        field1659 = new int[5];
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lji;)V", line = 11)
    public final void method807(class611 arg0) {
        this.field1653 = new class248();
        this.field1653.method1488(arg0);
        this.field1656 = new class248();
        this.field1656.method1488(arg0);
        int var2 = arg0.method3428((byte) 95);
        if (var2 != 0) {
            arg0.field8520--;
            this.field1647 = new class248();
            this.field1647.method1488(arg0);
            this.field1642 = new class248();
            this.field1642.method1488(arg0);
        }
        int var3 = arg0.method3428((byte) 36);
        if (var3 != 0) {
            arg0.field8520--;
            this.field1649 = new class248();
            this.field1649.method1488(arg0);
            this.field1651 = new class248();
            this.field1651.method1488(arg0);
        }
        int var4 = arg0.method3428((byte) -99);
        if (var4 != 0) {
            arg0.field8520--;
            this.field1645 = new class248();
            this.field1645.method1488(arg0);
            this.field1650 = new class248();
            this.field1650.method1488(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3396(1689622712);
            if (var6 == 0) {
                break;
            }
            this.field1654[var5] = var6;
            this.field1648[var5] = arg0.method3438(-80);
            this.field1646[var5] = arg0.method3396(1689622712);
        }
        this.field1655 = arg0.method3396(1689622712);
        this.field1641 = arg0.method3396(1689622712);
        this.field1643 = arg0.method3402((byte) 127);
        this.field1640 = arg0.method3402((byte) 127);
        this.field1644 = new class544();
        this.field1638 = new class248();
        this.field1644.method3087(arg0, this.field1638);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)I", line = 85)
    private final int method808(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1639[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1637[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I", line = 108)
    public final int[] method809(int arg0, int arg1) {
        class373.method2193(field1652, 0, arg0);
        if (arg1 < 10) {
            return field1652;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1653.method1486();
        this.field1656.method1486();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1647 != null) {
            this.field1647.method1486();
            this.field1642.method1486();
            var5 = (int) ((double) (this.field1647.field3217 - this.field1647.field3221) * 32.768D / var3);
            var6 = (int) ((double) this.field1647.field3221 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1649 != null) {
            this.field1649.method1486();
            this.field1651.method1486();
            var8 = (int) ((double) (this.field1649.field3217 - this.field1649.field3221) * 32.768D / var3);
            var9 = (int) ((double) this.field1649.field3221 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1654[var11] != 0) {
                field1660[var11] = 0;
                field1657[var11] = (int) ((double) this.field1646[var11] * var3);
                field1661[var11] = (this.field1654[var11] << 14) / 100;
                field1658[var11] = (int) ((double) (this.field1653.field3217 - this.field1653.field3221) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1648[var11]) / var3);
                field1659[var11] = (int) ((double) this.field1653.field3221 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1653.method1487(arg0);
            int var40 = this.field1656.method1487(arg0);
            if (this.field1647 != null) {
                int var41 = this.field1647.method1487(arg0);
                int var42 = this.field1642.method1487(arg0);
                var39 += this.method808(var7, var42, this.field1647.field3218) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1649 != null) {
                int var43 = this.field1649.method1487(arg0);
                int var44 = this.field1651.method1487(arg0);
                var40 = var40 * ((this.method808(var10, var44, this.field1649.field3218) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1654[var45] != 0) {
                    int var46 = field1657[var45] + var12;
                    if (var46 < arg0) {
                        field1652[var46] += this.method808(field1660[var45], field1661[var45] * var40 >> 15, this.field1653.field3218);
                        field1660[var45] += (field1658[var45] * var39 >> 16) + field1659[var45];
                    }
                }
            }
        }
        if (this.field1645 != null) {
            this.field1645.method1486();
            this.field1650.method1486();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1645.method1487(arg0);
                int var18 = this.field1650.method1487(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1645.field3217 - this.field1645.field3221) * var17 >> 8) + this.field1645.field3221;
                } else {
                    var19 = ((this.field1645.field3217 - this.field1645.field3221) * var18 >> 8) + this.field1645.field3221;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1652[var16] = 0;
                }
            }
        }
        if (this.field1655 > 0 && this.field1641 > 0) {
            int var20 = (int) ((double) this.field1655 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1652[var21] += field1652[var21 - var20] * this.field1641 / 100;
            }
        }
        if (this.field1644.field7699[0] > 0 || this.field1644.field7699[1] > 0) {
            this.field1638.method1486();
            int var22 = this.field1638.method1487(arg0 + 1);
            int var23 = this.field1644.method3088(0, (float) var22 / 65536.0F);
            int var24 = this.field1644.method3088(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1652[var23 + var25] * (long) class544.field7701 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1652[var23 + var25 - var36 - 1] * (long) class544.field7700[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1652[var25 - var37 - 1] * (long) class544.field7700[1][var37] >> 16);
                    }
                    field1652[var25] = var35;
                    var22 = this.field1638.method1487(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1652[var23 + var25] * (long) class544.field7701 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1652[var23 + var25 - var33 - 1] * (long) class544.field7700[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1652[var25 - var34 - 1] * (long) class544.field7700[1][var34] >> 16);
                        }
                        field1652[var25] = var32;
                        var22 = this.field1638.method1487(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1652[var23 + var25 - var29 - 1] * (long) class544.field7700[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1652[var25 - var30 - 1] * (long) class544.field7700[1][var30] >> 16);
                            }
                            field1652[var25] = var28;
                            this.field1638.method1487(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1644.method3088(0, (float) var22 / 65536.0F);
                    var24 = this.field1644.method3088(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1652[var38] < -32768) {
                field1652[var38] = -32768;
            }
            if (field1652[var38] > 32767) {
                field1652[var38] = 32767;
            }
        }
        return field1652;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()V", line = 389)
    public static void method810() {
        field1652 = null;
        field1637 = null;
        field1639 = null;
        field1660 = null;
        field1657 = null;
        field1661 = null;
        field1658 = null;
        field1659 = null;
    }
}
