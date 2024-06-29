import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UXJRWLQU")
public class class57 {

    @OriginalMember(owner = "client!UXJRWLQU", name = "j", descriptor = "[I")
    private int[] field1461 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "k", descriptor = "[I")
    private int[] field1462 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "l", descriptor = "[I")
    private int[] field1463 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "n", descriptor = "I")
    private int field1465 = 100;

    @OriginalMember(owner = "client!UXJRWLQU", name = "q", descriptor = "I")
    public int field1468 = 500;

    @OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "I")
    private static int field1452 = 60;

    @OriginalMember(owner = "client!UXJRWLQU", name = "v", descriptor = "[I")
    private static int[] field1473 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "w", descriptor = "[I")
    private static int[] field1474 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "x", descriptor = "[I")
    private static int[] field1475 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "y", descriptor = "[I")
    private static int[] field1476 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "z", descriptor = "[I")
    private static int[] field1477 = new int[5];

    @OriginalMember(owner = "client!UXJRWLQU", name = "m", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!UXJRWLQU", name = "r", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!UXJRWLQU", name = "o", descriptor = "LKEQJLHXN;")
    private class28 field1466;

    @OriginalMember(owner = "client!UXJRWLQU", name = "b", descriptor = "LZBHVITZX;")
    private class67 field1453;

    @OriginalMember(owner = "client!UXJRWLQU", name = "c", descriptor = "LZBHVITZX;")
    private class67 field1454;

    @OriginalMember(owner = "client!UXJRWLQU", name = "d", descriptor = "LZBHVITZX;")
    private class67 field1455;

    @OriginalMember(owner = "client!UXJRWLQU", name = "e", descriptor = "LZBHVITZX;")
    private class67 field1456;

    @OriginalMember(owner = "client!UXJRWLQU", name = "f", descriptor = "LZBHVITZX;")
    private class67 field1457;

    @OriginalMember(owner = "client!UXJRWLQU", name = "g", descriptor = "LZBHVITZX;")
    private class67 field1458;

    @OriginalMember(owner = "client!UXJRWLQU", name = "h", descriptor = "LZBHVITZX;")
    private class67 field1459;

    @OriginalMember(owner = "client!UXJRWLQU", name = "i", descriptor = "LZBHVITZX;")
    private class67 field1460;

    @OriginalMember(owner = "client!UXJRWLQU", name = "p", descriptor = "LZBHVITZX;")
    private class67 field1467;

    @OriginalMember(owner = "client!UXJRWLQU", name = "s", descriptor = "[I")
    private static int[] field1470;

    @OriginalMember(owner = "client!UXJRWLQU", name = "t", descriptor = "[I")
    private static int[] field1471;

    @OriginalMember(owner = "client!UXJRWLQU", name = "u", descriptor = "[I")
    private static int[] field1472;

    @OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "()V")
    public static final void method532() {
        field1471 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1471[var0] = 1;
            } else {
                field1471[var0] = -1;
            }
        }
        field1472 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1472[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1470 = new int[220500];
    }

    @OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "(II)[I")
    public final int[] method533(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1470[var3] = 0;
        }
        if (arg1 < 10) {
            return field1470;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1453.method579((byte) 2);
        this.field1454.method579((byte) 2);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1455 != null) {
            this.field1455.method579((byte) 2);
            this.field1456.method579((byte) 2);
            var6 = (int) ((double) (this.field1455.field1626 - this.field1455.field1625) * 32.768D / var4);
            var7 = (int) ((double) this.field1455.field1625 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1457 != null) {
            this.field1457.method579((byte) 2);
            this.field1458.method579((byte) 2);
            var9 = (int) ((double) (this.field1457.field1626 - this.field1457.field1625) * 32.768D / var4);
            var10 = (int) ((double) this.field1457.field1625 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1461[var12] != 0) {
                field1473[var12] = 0;
                field1474[var12] = (int) ((double) this.field1463[var12] * var4);
                field1475[var12] = (this.field1461[var12] << 14) / 100;
                field1476[var12] = (int) ((double) (this.field1453.field1626 - this.field1453.field1625) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1462[var12]) / var4);
                field1477[var12] = (int) ((double) this.field1453.field1625 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1453.method580(arg0, -783);
            int var42 = this.field1454.method580(arg0, -783);
            if (this.field1455 != null) {
                int var43 = this.field1455.method580(arg0, -783);
                int var44 = this.field1456.method580(arg0, -783);
                var41 += this.method534(var44, this.field1455.field1627, field1452, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1457 != null) {
                int var45 = this.field1457.method580(arg0, -783);
                int var46 = this.field1458.method580(arg0, -783);
                var42 = var42 * ((this.method534(var46, this.field1457.field1627, field1452, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1461[var47] != 0) {
                    int var48 = field1474[var47] + var13;
                    if (var48 < arg0) {
                        field1470[var48] += this.method534(field1475[var47] * var42 >> 15, this.field1453.field1627, field1452, field1473[var47]);
                        field1473[var47] += (field1476[var47] * var41 >> 16) + field1477[var47];
                    }
                }
            }
        }
        if (this.field1459 != null) {
            this.field1459.method579((byte) 2);
            this.field1460.method579((byte) 2);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1459.method580(arg0, -783);
                int var19 = this.field1460.method580(arg0, -783);
                int var20;
                if (var16) {
                    var20 = ((this.field1459.field1626 - this.field1459.field1625) * var18 >> 8) + this.field1459.field1625;
                } else {
                    var20 = ((this.field1459.field1626 - this.field1459.field1625) * var19 >> 8) + this.field1459.field1625;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1470[var17] = 0;
                }
            }
        }
        if (this.field1464 > 0 && this.field1465 > 0) {
            int var21 = (int) ((double) this.field1464 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1470[var22] += field1470[var22 - var21] * this.field1465 / 100;
            }
        }
        if (this.field1466.field995[0] > 0 || this.field1466.field995[1] > 0) {
            this.field1467.method579((byte) 2);
            int var23 = this.field1467.method580(arg0 + 1, -783);
            int var24 = this.field1466.method350((float) var23 / 65536.0F, 0, false);
            int var25 = this.field1466.method350((float) var23 / 65536.0F, 1, false);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1470[var24 + var26] * (long) class28.field1002 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1470[var24 + var26 - var38 - 1] * (long) class28.field1000[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1470[var26 - var39 - 1] * (long) class28.field1000[1][var39] >> 16);
                    }
                    field1470[var26] = var37;
                    var23 = this.field1467.method580(arg0 + 1, -783);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1470[var24 + var26] * (long) class28.field1002 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1470[var24 + var26 - var35 - 1] * (long) class28.field1000[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1470[var26 - var36 - 1] * (long) class28.field1000[1][var36] >> 16);
                        }
                        field1470[var26] = var34;
                        var23 = this.field1467.method580(arg0 + 1, -783);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1470[var24 + var26 - var31 - 1] * (long) class28.field1000[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1470[var26 - var32 - 1] * (long) class28.field1000[1][var32] >> 16);
                            }
                            field1470[var26] = var30;
                            this.field1467.method580(arg0 + 1, -783);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1466.method350((float) var23 / 65536.0F, 0, false);
                    var25 = this.field1466.method350((float) var23 / 65536.0F, 1, false);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1470[var40] < -32768) {
                field1470[var40] = -32768;
            }
            if (field1470[var40] > 32767) {
                field1470[var40] = 32767;
            }
        }
        return field1470;
    }

    @OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "(IIII)I")
    private final int method534(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            return field1452;
        } else if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg1 == 2) {
            return field1472[arg3 & 0x7FFF] * arg0 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg1 == 4) {
            return field1471[arg3 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "(LLBBVYYXO;B)V")
    public final void method535(class32 arg0, byte arg1) {
        this.field1453 = new class67();
        if (arg1 != 59) {
            throw new NullPointerException();
        }
        this.field1453.method577(arg0, (byte) 59);
        this.field1454 = new class67();
        this.field1454.method577(arg0, (byte) 59);
        int var3 = arg0.method369();
        if (var3 != 0) {
            arg0.field1032--;
            this.field1455 = new class67();
            this.field1455.method577(arg0, (byte) 59);
            this.field1456 = new class67();
            this.field1456.method577(arg0, (byte) 59);
        }
        int var4 = arg0.method369();
        if (var4 != 0) {
            arg0.field1032--;
            this.field1457 = new class67();
            this.field1457.method577(arg0, (byte) 59);
            this.field1458 = new class67();
            this.field1458.method577(arg0, (byte) 59);
        }
        int var5 = arg0.method369();
        if (var5 != 0) {
            arg0.field1032--;
            this.field1459 = new class67();
            this.field1459.method577(arg0, (byte) 59);
            this.field1460 = new class67();
            this.field1460.method577(arg0, (byte) 59);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method383();
            if (var7 == 0) {
                break;
            }
            this.field1461[var6] = var7;
            this.field1462[var6] = arg0.method382();
            this.field1463[var6] = arg0.method383();
        }
        this.field1464 = arg0.method383();
        this.field1465 = arg0.method383();
        this.field1468 = arg0.method371();
        this.field1469 = arg0.method371();
        this.field1466 = new class28();
        this.field1467 = new class67();
        this.field1466.method351(false, arg0, this.field1467);
    }
}
