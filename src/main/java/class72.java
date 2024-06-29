import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class72 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field1616 = 0;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    private int[] field1617 = new int[5];

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    private int[] field1619 = new int[5];

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field1631 = 500;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field1625 = 100;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    private int field1620 = 0;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "[I")
    private int[] field1634 = new int[5];

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "[I")
    private static int[] field1629 = new int[32768];

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[I")
    private static int[] field1633;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
    private static int[] field1626;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "[I")
    private static int[] field1635;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "[I")
    private static int[] field1638;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "[I")
    private static int[] field1637;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[I")
    private static int[] field1636;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "[I")
    private static int[] field1639;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lkh;")
    private class12 field1615;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lkh;")
    private class12 field1618;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lkh;")
    private class12 field1621;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lkh;")
    private class12 field1622;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lkh;")
    private class12 field1623;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lkh;")
    private class12 field1624;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lkh;")
    private class12 field1627;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lkh;")
    private class12 field1628;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lkh;")
    private class12 field1632;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lgf;")
    private class7 field1630;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
    public final int[] method665(int arg0, int arg1) {
        class26.method233(field1626, 0, arg0);
        if (arg1 < 10) {
            return field1626;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1623.method117();
        this.field1615.method117();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1618 != null) {
            this.field1618.method117();
            this.field1632.method117();
            var5 = (int) ((double) (this.field1618.field226 - this.field1618.field224) * 32.768D / var3);
            var6 = (int) ((double) this.field1618.field224 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1622 != null) {
            this.field1622.method117();
            this.field1627.method117();
            var8 = (int) ((double) (this.field1622.field226 - this.field1622.field224) * 32.768D / var3);
            var9 = (int) ((double) this.field1622.field224 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1634[var11] != 0) {
                field1639[var11] = 0;
                field1636[var11] = (int) ((double) this.field1617[var11] * var3);
                field1637[var11] = (this.field1634[var11] << 14) / 100;
                field1635[var11] = (int) ((double) (this.field1623.field226 - this.field1623.field224) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1619[var11]) / var3);
                field1638[var11] = (int) ((double) this.field1623.field224 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1623.method116(arg0);
            int var40 = this.field1615.method116(arg0);
            if (this.field1618 != null) {
                int var41 = this.field1618.method116(arg0);
                int var42 = this.field1632.method116(arg0);
                var39 += this.method666(var7, var42, this.field1618.field229) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1622 != null) {
                int var43 = this.field1622.method116(arg0);
                int var44 = this.field1627.method116(arg0);
                var40 = var40 * ((this.method666(var10, var44, this.field1622.field229) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1634[var45] != 0) {
                    int var46 = field1636[var45] + var12;
                    if (var46 < arg0) {
                        field1626[var46] += this.method666(field1639[var45], field1637[var45] * var40 >> 15, this.field1623.field229);
                        field1639[var45] += (field1635[var45] * var39 >> 16) + field1638[var45];
                    }
                }
            }
        }
        if (this.field1624 != null) {
            this.field1624.method117();
            this.field1628.method117();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1624.method116(arg0);
                int var18 = this.field1628.method116(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1624.field226 - this.field1624.field224) * var17 >> 8) + this.field1624.field224;
                } else {
                    var19 = ((this.field1624.field226 - this.field1624.field224) * var18 >> 8) + this.field1624.field224;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1626[var16] = 0;
                }
            }
        }
        if (this.field1620 > 0 && this.field1625 > 0) {
            int var20 = (int) ((double) this.field1620 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1626[var21] += field1626[var21 - var20] * this.field1625 / 100;
            }
        }
        if (this.field1630.field95[0] > 0 || this.field1630.field95[1] > 0) {
            this.field1621.method117();
            int var22 = this.field1621.method116(arg0 + 1);
            int var23 = this.field1630.method39(0, (float) var22 / 65536.0F);
            int var24 = this.field1630.method39(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1626[var23 + var25] * (long) class7.field100 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1626[var23 + var25 - var36 - 1] * (long) class7.field99[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1626[var25 - var37 - 1] * (long) class7.field99[1][var37] >> 16);
                    }
                    field1626[var25] = var35;
                    var22 = this.field1621.method116(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1626[var23 + var25] * (long) class7.field100 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1626[var23 + var25 - var33 - 1] * (long) class7.field99[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1626[var25 - var34 - 1] * (long) class7.field99[1][var34] >> 16);
                        }
                        field1626[var25] = var32;
                        var22 = this.field1621.method116(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1626[var23 + var25 - var29 - 1] * (long) class7.field99[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1626[var25 - var30 - 1] * (long) class7.field99[1][var30] >> 16);
                            }
                            field1626[var25] = var28;
                            this.field1621.method116(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1630.method39(0, (float) var22 / 65536.0F);
                    var24 = this.field1630.method39(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1626[var38] < -32768) {
                field1626[var38] = -32768;
            }
            if (field1626[var38] > 32767) {
                field1626[var38] = 32767;
            }
        }
        return field1626;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
    private final int method666(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1633[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1629[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Laa;)V")
    public final void method667(class8 arg0) {
        this.field1623 = new class12();
        this.field1623.method118(arg0);
        this.field1615 = new class12();
        this.field1615.method118(arg0);
        int var2 = arg0.method63((byte) 122);
        if (var2 != 0) {
            arg0.field146--;
            this.field1618 = new class12();
            this.field1618.method118(arg0);
            this.field1632 = new class12();
            this.field1632.method118(arg0);
        }
        int var3 = arg0.method63((byte) 90);
        if (var3 != 0) {
            arg0.field146--;
            this.field1622 = new class12();
            this.field1622.method118(arg0);
            this.field1627 = new class12();
            this.field1627.method118(arg0);
        }
        int var4 = arg0.method63((byte) 104);
        if (var4 != 0) {
            arg0.field146--;
            this.field1624 = new class12();
            this.field1624.method118(arg0);
            this.field1628 = new class12();
            this.field1628.method118(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method45(false);
            if (var6 == 0) {
                break;
            }
            this.field1634[var5] = var6;
            this.field1619[var5] = arg0.method82(128);
            this.field1617[var5] = arg0.method45(false);
        }
        this.field1620 = arg0.method45(false);
        this.field1625 = arg0.method45(false);
        this.field1631 = arg0.method65((byte) 116);
        this.field1616 = arg0.method65((byte) 120);
        this.field1630 = new class7();
        this.field1621 = new class12();
        this.field1630.method42(arg0, this.field1621);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static void method668() {
        field1626 = null;
        field1629 = null;
        field1633 = null;
        field1639 = null;
        field1636 = null;
        field1637 = null;
        field1635 = null;
        field1638 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1629[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1633 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1633[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1626 = new int[220500];
        field1635 = new int[5];
        field1638 = new int[5];
        field1637 = new int[5];
        field1636 = new int[5];
        field1639 = new int[5];
    }
}
