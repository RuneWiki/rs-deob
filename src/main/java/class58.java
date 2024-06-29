import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VCSQFXER")
public class class58 {

    @OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "Z")
    private boolean field1512 = false;

    @OriginalMember(owner = "client!VCSQFXER", name = "j", descriptor = "[I")
    private int[] field1521 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "k", descriptor = "[I")
    private int[] field1522 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "l", descriptor = "[I")
    private int[] field1523 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "n", descriptor = "I")
    private int field1525 = 100;

    @OriginalMember(owner = "client!VCSQFXER", name = "q", descriptor = "I")
    public int field1528 = 500;

    @OriginalMember(owner = "client!VCSQFXER", name = "v", descriptor = "[I")
    private static int[] field1533 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "w", descriptor = "[I")
    private static int[] field1534 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "x", descriptor = "[I")
    private static int[] field1535 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "y", descriptor = "[I")
    private static int[] field1536 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "z", descriptor = "[I")
    private static int[] field1537 = new int[5];

    @OriginalMember(owner = "client!VCSQFXER", name = "m", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!VCSQFXER", name = "r", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!VCSQFXER", name = "b", descriptor = "LBJGBRRBX;")
    private class4 field1513;

    @OriginalMember(owner = "client!VCSQFXER", name = "c", descriptor = "LBJGBRRBX;")
    private class4 field1514;

    @OriginalMember(owner = "client!VCSQFXER", name = "d", descriptor = "LBJGBRRBX;")
    private class4 field1515;

    @OriginalMember(owner = "client!VCSQFXER", name = "e", descriptor = "LBJGBRRBX;")
    private class4 field1516;

    @OriginalMember(owner = "client!VCSQFXER", name = "f", descriptor = "LBJGBRRBX;")
    private class4 field1517;

    @OriginalMember(owner = "client!VCSQFXER", name = "g", descriptor = "LBJGBRRBX;")
    private class4 field1518;

    @OriginalMember(owner = "client!VCSQFXER", name = "h", descriptor = "LBJGBRRBX;")
    private class4 field1519;

    @OriginalMember(owner = "client!VCSQFXER", name = "i", descriptor = "LBJGBRRBX;")
    private class4 field1520;

    @OriginalMember(owner = "client!VCSQFXER", name = "p", descriptor = "LBJGBRRBX;")
    private class4 field1527;

    @OriginalMember(owner = "client!VCSQFXER", name = "o", descriptor = "LSTQKONHX;")
    private class51 field1526;

    @OriginalMember(owner = "client!VCSQFXER", name = "s", descriptor = "[I")
    private static int[] field1530;

    @OriginalMember(owner = "client!VCSQFXER", name = "t", descriptor = "[I")
    private static int[] field1531;

    @OriginalMember(owner = "client!VCSQFXER", name = "u", descriptor = "[I")
    private static int[] field1532;

    @OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "()V")
    public static final void method521() {
        field1531 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1531[var0] = 1;
            } else {
                field1531[var0] = -1;
            }
        }
        field1532 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1532[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1530 = new int[220500];
    }

    @OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "(II)[I")
    public final int[] method522(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1530[var3] = 0;
        }
        if (arg1 < 10) {
            return field1530;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1513.method93((byte) 6);
        this.field1514.method93((byte) 6);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1515 != null) {
            this.field1515.method93((byte) 6);
            this.field1516.method93((byte) 6);
            var6 = (int) ((double) (this.field1515.field69 - this.field1515.field68) * 32.768D / var4);
            var7 = (int) ((double) this.field1515.field68 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1517 != null) {
            this.field1517.method93((byte) 6);
            this.field1518.method93((byte) 6);
            var9 = (int) ((double) (this.field1517.field69 - this.field1517.field68) * 32.768D / var4);
            var10 = (int) ((double) this.field1517.field68 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1521[var12] != 0) {
                field1533[var12] = 0;
                field1534[var12] = (int) ((double) this.field1523[var12] * var4);
                field1535[var12] = (this.field1521[var12] << 14) / 100;
                field1536[var12] = (int) ((double) (this.field1513.field69 - this.field1513.field68) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1522[var12]) / var4);
                field1537[var12] = (int) ((double) this.field1513.field68 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1513.method94(true, arg0);
            int var42 = this.field1514.method94(true, arg0);
            if (this.field1515 != null) {
                int var43 = this.field1515.method94(true, arg0);
                int var44 = this.field1516.method94(true, arg0);
                var41 += this.method523(9, var8, var44, this.field1515.field70) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1517 != null) {
                int var45 = this.field1517.method94(true, arg0);
                int var46 = this.field1518.method94(true, arg0);
                var42 = var42 * ((this.method523(9, var11, var46, this.field1517.field70) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1521[var47] != 0) {
                    int var48 = field1534[var47] + var13;
                    if (var48 < arg0) {
                        field1530[var48] += this.method523(9, field1533[var47], field1535[var47] * var42 >> 15, this.field1513.field70);
                        field1533[var47] += (field1536[var47] * var41 >> 16) + field1537[var47];
                    }
                }
            }
        }
        if (this.field1519 != null) {
            this.field1519.method93((byte) 6);
            this.field1520.method93((byte) 6);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1519.method94(true, arg0);
                int var19 = this.field1520.method94(true, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1519.field69 - this.field1519.field68) * var18 >> 8) + this.field1519.field68;
                } else {
                    var20 = ((this.field1519.field69 - this.field1519.field68) * var19 >> 8) + this.field1519.field68;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1530[var17] = 0;
                }
            }
        }
        if (this.field1524 > 0 && this.field1525 > 0) {
            int var21 = (int) ((double) this.field1524 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1530[var22] += field1530[var22 - var21] * this.field1525 / 100;
            }
        }
        if (this.field1526.field1412[0] > 0 || this.field1526.field1412[1] > 0) {
            this.field1527.method93((byte) 6);
            int var23 = this.field1527.method94(true, arg0 + 1);
            int var24 = this.field1526.method512(0, (float) var23 / 65536.0F, 0);
            int var25 = this.field1526.method512(1, (float) var23 / 65536.0F, 0);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1530[var24 + var26] * (long) class51.field1419 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1530[var24 + var26 - var38 - 1] * (long) class51.field1417[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1530[var26 - var39 - 1] * (long) class51.field1417[1][var39] >> 16);
                    }
                    field1530[var26] = var37;
                    var23 = this.field1527.method94(true, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1530[var24 + var26] * (long) class51.field1419 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1530[var24 + var26 - var35 - 1] * (long) class51.field1417[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1530[var26 - var36 - 1] * (long) class51.field1417[1][var36] >> 16);
                        }
                        field1530[var26] = var34;
                        var23 = this.field1527.method94(true, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1530[var24 + var26 - var31 - 1] * (long) class51.field1417[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1530[var26 - var32 - 1] * (long) class51.field1417[1][var32] >> 16);
                            }
                            field1530[var26] = var30;
                            this.field1527.method94(true, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1526.method512(0, (float) var23 / 65536.0F, 0);
                    var25 = this.field1526.method512(1, (float) var23 / 65536.0F, 0);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1530[var40] < -32768) {
                field1530[var40] = -32768;
            }
            if (field1530[var40] > 32767) {
                field1530[var40] = 32767;
            }
        }
        return field1530;
    }

    @OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "(IIII)I")
    private final int method523(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 9 || arg0 > 9) {
            return 0;
        } else if (arg3 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg3 == 2) {
            return field1532[arg1 & 0x7FFF] * arg2 >> 14;
        } else if (arg3 == 3) {
            return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg3 == 4) {
            return field1531[arg1 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "(BLBFQIDHPO;)V")
    public final void method524(byte arg0, class3 arg1) {
        this.field1513 = new class4();
        this.field1513.method91((byte) -11, arg1);
        this.field1514 = new class4();
        this.field1514.method91((byte) -11, arg1);
        int var3 = arg1.method54();
        if (var3 != 0) {
            arg1.field50--;
            this.field1515 = new class4();
            this.field1515.method91((byte) -11, arg1);
            this.field1516 = new class4();
            this.field1516.method91((byte) -11, arg1);
        }
        int var4 = arg1.method54();
        if (var4 != 0) {
            arg1.field50--;
            this.field1517 = new class4();
            this.field1517.method91((byte) -11, arg1);
            this.field1518 = new class4();
            this.field1518.method91((byte) -11, arg1);
        }
        int var5 = arg1.method54();
        if (var5 != 0) {
            arg1.field50--;
            this.field1519 = new class4();
            this.field1519.method91((byte) -11, arg1);
            this.field1520 = new class4();
            this.field1520.method91((byte) -11, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method68();
            if (var7 == 0) {
                break;
            }
            this.field1521[var6] = var7;
            this.field1522[var6] = arg1.method67();
            this.field1523[var6] = arg1.method68();
        }
        if (arg0 != -11) {
            this.field1512 = !this.field1512;
        }
        this.field1524 = arg1.method68();
        this.field1525 = arg1.method68();
        this.field1528 = arg1.method56();
        this.field1529 = arg1.method56();
        this.field1526 = new class51();
        this.field1527 = new class4();
        this.field1526.method513(this.field1527, arg1, -585);
    }
}
