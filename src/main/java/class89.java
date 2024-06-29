import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class89 {

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private int field1677 = 100;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    private int[] field1675 = new int[5];

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public int field1679 = 500;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[I")
    private int[] field1682 = new int[5];

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    private int field1676 = 0;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field1691 = 0;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
    private int[] field1687 = new int[5];

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
    private static int[] field1684 = new int[32768];

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[I")
    private static int[] field1683;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
    private static int[] field1692;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[I")
    private static int[] field1697;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[I")
    private static int[] field1695;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
    private static int[] field1696;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "[I")
    private static int[] field1694;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "[I")
    private static int[] field1693;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lvf;")
    private class224 field1674;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lic;")
    private class90 field1673;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lic;")
    private class90 field1678;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lic;")
    private class90 field1680;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lic;")
    private class90 field1681;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lic;")
    private class90 field1685;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lic;")
    private class90 field1686;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Lic;")
    private class90 field1688;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lic;")
    private class90 field1689;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lic;")
    private class90 field1690;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public static void method574() {
        field1692 = null;
        field1684 = null;
        field1683 = null;
        field1695 = null;
        field1697 = null;
        field1696 = null;
        field1694 = null;
        field1693 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lka;)V")
    public final void method575(class109 arg0) {
        this.field1681 = new class90();
        this.field1681.method578(arg0);
        this.field1685 = new class90();
        this.field1685.method578(arg0);
        int var2 = arg0.method662((byte) -127);
        if (var2 != 0) {
            arg0.field2053--;
            this.field1673 = new class90();
            this.field1673.method578(arg0);
            this.field1686 = new class90();
            this.field1686.method578(arg0);
        }
        int var3 = arg0.method662((byte) -90);
        if (var3 != 0) {
            arg0.field2053--;
            this.field1680 = new class90();
            this.field1680.method578(arg0);
            this.field1688 = new class90();
            this.field1688.method578(arg0);
        }
        int var4 = arg0.method662((byte) -91);
        if (var4 != 0) {
            arg0.field2053--;
            this.field1689 = new class90();
            this.field1689.method578(arg0);
            this.field1678 = new class90();
            this.field1678.method578(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method699(15784);
            if (var6 == 0) {
                break;
            }
            this.field1675[var5] = var6;
            this.field1682[var5] = arg0.method697(127);
            this.field1687[var5] = arg0.method699(15784);
        }
        this.field1676 = arg0.method699(15784);
        this.field1677 = arg0.method699(15784);
        this.field1679 = arg0.method675(2);
        this.field1691 = arg0.method675(2);
        this.field1674 = new class224();
        this.field1690 = new class90();
        this.field1674.method1467(arg0, this.field1690);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
    private final int method576(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1683[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1684[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
    public final int[] method577(int arg0, int arg1) {
        class163.method1024(field1692, 0, arg0);
        if (arg1 < 10) {
            return field1692;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1681.method580();
        this.field1685.method580();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1673 != null) {
            this.field1673.method580();
            this.field1686.method580();
            var5 = (int) ((double) (this.field1673.field1701 - this.field1673.field1699) * 32.768D / var3);
            var6 = (int) ((double) this.field1673.field1699 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1680 != null) {
            this.field1680.method580();
            this.field1688.method580();
            var8 = (int) ((double) (this.field1680.field1701 - this.field1680.field1699) * 32.768D / var3);
            var9 = (int) ((double) this.field1680.field1699 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1675[var11] != 0) {
                field1695[var11] = 0;
                field1697[var11] = (int) ((double) this.field1687[var11] * var3);
                field1696[var11] = (this.field1675[var11] << 14) / 100;
                field1694[var11] = (int) ((double) (this.field1681.field1701 - this.field1681.field1699) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1682[var11]) / var3);
                field1693[var11] = (int) ((double) this.field1681.field1699 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1681.method581(arg0);
            int var40 = this.field1685.method581(arg0);
            if (this.field1673 != null) {
                int var41 = this.field1673.method581(arg0);
                int var42 = this.field1686.method581(arg0);
                var39 += this.method576(var7, var42, this.field1673.field1700) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1680 != null) {
                int var43 = this.field1680.method581(arg0);
                int var44 = this.field1688.method581(arg0);
                var40 = var40 * ((this.method576(var10, var44, this.field1680.field1700) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1675[var45] != 0) {
                    int var46 = field1697[var45] + var12;
                    if (var46 < arg0) {
                        field1692[var46] += this.method576(field1695[var45], field1696[var45] * var40 >> 15, this.field1681.field1700);
                        field1695[var45] += (field1694[var45] * var39 >> 16) + field1693[var45];
                    }
                }
            }
        }
        if (this.field1689 != null) {
            this.field1689.method580();
            this.field1678.method580();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1689.method581(arg0);
                int var18 = this.field1678.method581(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1689.field1701 - this.field1689.field1699) * var17 >> 8) + this.field1689.field1699;
                } else {
                    var19 = ((this.field1689.field1701 - this.field1689.field1699) * var18 >> 8) + this.field1689.field1699;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1692[var16] = 0;
                }
            }
        }
        if (this.field1676 > 0 && this.field1677 > 0) {
            int var20 = (int) ((double) this.field1676 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1692[var21] += field1692[var21 - var20] * this.field1677 / 100;
            }
        }
        if (this.field1674.field4196[0] > 0 || this.field1674.field4196[1] > 0) {
            this.field1690.method580();
            int var22 = this.field1690.method581(arg0 + 1);
            int var23 = this.field1674.method1469(0, (float) var22 / 65536.0F);
            int var24 = this.field1674.method1469(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1692[var23 + var25] * (long) class224.field4197 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1692[var23 + var25 - var36 - 1] * (long) class224.field4195[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1692[var25 - var37 - 1] * (long) class224.field4195[1][var37] >> 16);
                    }
                    field1692[var25] = var35;
                    var22 = this.field1690.method581(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1692[var23 + var25] * (long) class224.field4197 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1692[var23 + var25 - var33 - 1] * (long) class224.field4195[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1692[var25 - var34 - 1] * (long) class224.field4195[1][var34] >> 16);
                        }
                        field1692[var25] = var32;
                        var22 = this.field1690.method581(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1692[var23 + var25 - var29 - 1] * (long) class224.field4195[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1692[var25 - var30 - 1] * (long) class224.field4195[1][var30] >> 16);
                            }
                            field1692[var25] = var28;
                            this.field1690.method581(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1674.method1469(0, (float) var22 / 65536.0F);
                    var24 = this.field1674.method1469(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1692[var38] < -32768) {
                field1692[var38] = -32768;
            }
            if (field1692[var38] > 32767) {
                field1692[var38] = 32767;
            }
        }
        return field1692;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1684[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1683 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1683[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1692 = new int[220500];
        field1697 = new int[5];
        field1695 = new int[5];
        field1696 = new int[5];
        field1694 = new int[5];
        field1693 = new int[5];
    }
}
