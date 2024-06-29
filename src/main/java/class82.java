import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class82 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
    private int[] field1582 = new int[5];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field1581 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public int field1587 = 0;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field1588 = 500;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    private int field1590 = 100;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    private int[] field1580 = new int[5];

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[I")
    private int[] field1589 = new int[5];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    private static int[] field1583 = new int[32768];

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[I")
    private static int[] field1596;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
    private static int[] field1579;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "[I")
    private static int[] field1598;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "[I")
    private static int[] field1599;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
    private static int[] field1600;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "[I")
    private static int[] field1597;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[I")
    private static int[] field1601;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Loa;")
    private class153 field1584;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ldd;")
    private class37 field1578;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ldd;")
    private class37 field1585;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Ldd;")
    private class37 field1586;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Ldd;")
    private class37 field1591;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Ldd;")
    private class37 field1592;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Ldd;")
    private class37 field1593;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Ldd;")
    private class37 field1594;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Ldd;")
    private class37 field1595;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "Ldd;")
    private class37 field1602;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
    public final int[] method522(int arg0, int arg1) {
        class154.method987(field1579, 0, arg0);
        if (arg1 < 10) {
            return field1579;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1602.method244();
        this.field1591.method244();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1585 != null) {
            this.field1585.method244();
            this.field1578.method244();
            var5 = (int) ((double) (this.field1585.field804 - this.field1585.field808) * 32.768D / var3);
            var6 = (int) ((double) this.field1585.field808 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1595 != null) {
            this.field1595.method244();
            this.field1586.method244();
            var8 = (int) ((double) (this.field1595.field804 - this.field1595.field808) * 32.768D / var3);
            var9 = (int) ((double) this.field1595.field808 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1580[var11] != 0) {
                field1601[var11] = 0;
                field1600[var11] = (int) ((double) this.field1582[var11] * var3);
                field1599[var11] = (this.field1580[var11] << 14) / 100;
                field1598[var11] = (int) ((double) (this.field1602.field804 - this.field1602.field808) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1589[var11]) / var3);
                field1597[var11] = (int) ((double) this.field1602.field808 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1602.method246(arg0);
            int var40 = this.field1591.method246(arg0);
            if (this.field1585 != null) {
                int var41 = this.field1585.method246(arg0);
                int var42 = this.field1578.method246(arg0);
                var39 += this.method524(var7, var42, this.field1585.field806) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1595 != null) {
                int var43 = this.field1595.method246(arg0);
                int var44 = this.field1586.method246(arg0);
                var40 = var40 * ((this.method524(var10, var44, this.field1595.field806) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1580[var45] != 0) {
                    int var46 = field1600[var45] + var12;
                    if (var46 < arg0) {
                        field1579[var46] += this.method524(field1601[var45], field1599[var45] * var40 >> 15, this.field1602.field806);
                        field1601[var45] += (field1598[var45] * var39 >> 16) + field1597[var45];
                    }
                }
            }
        }
        if (this.field1593 != null) {
            this.field1593.method244();
            this.field1592.method244();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1593.method246(arg0);
                int var18 = this.field1592.method246(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1593.field804 - this.field1593.field808) * var17 >> 8) + this.field1593.field808;
                } else {
                    var19 = ((this.field1593.field804 - this.field1593.field808) * var18 >> 8) + this.field1593.field808;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1579[var16] = 0;
                }
            }
        }
        if (this.field1581 > 0 && this.field1590 > 0) {
            int var20 = (int) ((double) this.field1581 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1579[var21] += field1579[var21 - var20] * this.field1590 / 100;
            }
        }
        if (this.field1584.field2766[0] > 0 || this.field1584.field2766[1] > 0) {
            this.field1594.method244();
            int var22 = this.field1594.method246(arg0 + 1);
            int var23 = this.field1584.method982(0, (float) var22 / 65536.0F);
            int var24 = this.field1584.method982(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1579[var23 + var25] * (long) class153.field2769 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1579[var23 + var25 - var36 - 1] * (long) class153.field2765[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1579[var25 - var37 - 1] * (long) class153.field2765[1][var37] >> 16);
                    }
                    field1579[var25] = var35;
                    var22 = this.field1594.method246(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1579[var23 + var25] * (long) class153.field2769 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1579[var23 + var25 - var33 - 1] * (long) class153.field2765[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1579[var25 - var34 - 1] * (long) class153.field2765[1][var34] >> 16);
                        }
                        field1579[var25] = var32;
                        var22 = this.field1594.method246(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1579[var23 + var25 - var29 - 1] * (long) class153.field2765[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1579[var25 - var30 - 1] * (long) class153.field2765[1][var30] >> 16);
                            }
                            field1579[var25] = var28;
                            this.field1594.method246(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1584.method982(0, (float) var22 / 65536.0F);
                    var24 = this.field1584.method982(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1579[var38] < -32768) {
                field1579[var38] = -32768;
            }
            if (field1579[var38] > 32767) {
                field1579[var38] = 32767;
            }
        }
        return field1579;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lra;)V")
    public final void method523(class185 arg0) {
        this.field1602 = new class37();
        this.field1602.method245(arg0);
        this.field1591 = new class37();
        this.field1591.method245(arg0);
        int var2 = arg0.method1243(3);
        if (var2 != 0) {
            arg0.field3432--;
            this.field1585 = new class37();
            this.field1585.method245(arg0);
            this.field1578 = new class37();
            this.field1578.method245(arg0);
        }
        int var3 = arg0.method1243(3);
        if (var3 != 0) {
            arg0.field3432--;
            this.field1595 = new class37();
            this.field1595.method245(arg0);
            this.field1586 = new class37();
            this.field1586.method245(arg0);
        }
        int var4 = arg0.method1243(3);
        if (var4 != 0) {
            arg0.field3432--;
            this.field1593 = new class37();
            this.field1593.method245(arg0);
            this.field1592 = new class37();
            this.field1592.method245(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1215((byte) 93);
            if (var6 == 0) {
                break;
            }
            this.field1580[var5] = var6;
            this.field1589[var5] = arg0.method1224(true);
            this.field1582[var5] = arg0.method1215((byte) 93);
        }
        this.field1581 = arg0.method1215((byte) 93);
        this.field1590 = arg0.method1215((byte) 93);
        this.field1588 = arg0.method1252(2);
        this.field1587 = arg0.method1252(2);
        this.field1584 = new class153();
        this.field1594 = new class37();
        this.field1584.method984(arg0, this.field1594);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I")
    private final int method524(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1596[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1583[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
    public static void method525() {
        field1579 = null;
        field1583 = null;
        field1596 = null;
        field1601 = null;
        field1600 = null;
        field1599 = null;
        field1598 = null;
        field1597 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1583[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1596 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1596[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1579 = new int[220500];
        field1598 = new int[5];
        field1599 = new int[5];
        field1600 = new int[5];
        field1597 = new int[5];
        field1601 = new int[5];
    }
}
