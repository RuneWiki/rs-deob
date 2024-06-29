import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public int field1465 = 0;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public int field1457 = 500;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    private int field1463 = 0;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
    private int[] field1467 = new int[5];

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
    private int[] field1470 = new int[5];

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    private int field1474 = 100;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "[I")
    private int[] field1473 = new int[5];

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
    private static int[] field1461 = new int[32768];

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
    private static int[] field1464;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
    private static int[] field1456;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[I")
    private static int[] field1476;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "[I")
    private static int[] field1475;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "[I")
    private static int[] field1477;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[I")
    private static int[] field1478;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    private static int[] field1479;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lse;")
    private class130 field1460;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lg;")
    private class43 field1455;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lg;")
    private class43 field1458;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lg;")
    private class43 field1459;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lg;")
    private class43 field1462;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lg;")
    private class43 field1466;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lg;")
    private class43 field1468;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lg;")
    private class43 field1469;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lg;")
    private class43 field1471;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lg;")
    private class43 field1472;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
    public static void method467() {
        field1456 = null;
        field1461 = null;
        field1464 = null;
        field1477 = null;
        field1476 = null;
        field1479 = null;
        field1478 = null;
        field1475 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
    private final int method468(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1464[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1461[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method469(int arg0, int arg1) {
        class11.method67(field1456, 0, arg0);
        if (arg1 < 10) {
            return field1456;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1462.method289();
        this.field1466.method289();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1468 != null) {
            this.field1468.method289();
            this.field1459.method289();
            var5 = (int) ((double) (this.field1468.field973 - this.field1468.field978) * 32.768D / var3);
            var6 = (int) ((double) this.field1468.field978 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1472 != null) {
            this.field1472.method289();
            this.field1469.method289();
            var8 = (int) ((double) (this.field1472.field973 - this.field1472.field978) * 32.768D / var3);
            var9 = (int) ((double) this.field1472.field978 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1473[var11] != 0) {
                field1477[var11] = 0;
                field1476[var11] = (int) ((double) this.field1467[var11] * var3);
                field1479[var11] = (this.field1473[var11] << 14) / 100;
                field1478[var11] = (int) ((double) (this.field1462.field973 - this.field1462.field978) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1470[var11]) / var3);
                field1475[var11] = (int) ((double) this.field1462.field978 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1462.method292(arg0);
            int var40 = this.field1466.method292(arg0);
            if (this.field1468 != null) {
                int var41 = this.field1468.method292(arg0);
                int var42 = this.field1459.method292(arg0);
                var39 += this.method468(var7, var42, this.field1468.field974) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1472 != null) {
                int var43 = this.field1472.method292(arg0);
                int var44 = this.field1469.method292(arg0);
                var40 = var40 * ((this.method468(var10, var44, this.field1472.field974) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1473[var45] != 0) {
                    int var46 = field1476[var45] + var12;
                    if (var46 < arg0) {
                        field1456[var46] += this.method468(field1477[var45], field1479[var45] * var40 >> 15, this.field1462.field974);
                        field1477[var45] += (field1478[var45] * var39 >> 16) + field1475[var45];
                    }
                }
            }
        }
        if (this.field1455 != null) {
            this.field1455.method289();
            this.field1458.method289();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1455.method292(arg0);
                int var18 = this.field1458.method292(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1455.field973 - this.field1455.field978) * var17 >> 8) + this.field1455.field978;
                } else {
                    var19 = ((this.field1455.field973 - this.field1455.field978) * var18 >> 8) + this.field1455.field978;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1456[var16] = 0;
                }
            }
        }
        if (this.field1463 > 0 && this.field1474 > 0) {
            int var20 = (int) ((double) this.field1463 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1456[var21] += field1456[var21 - var20] * this.field1474 / 100;
            }
        }
        if (this.field1460.field2996[0] > 0 || this.field1460.field2996[1] > 0) {
            this.field1471.method289();
            int var22 = this.field1471.method292(arg0 + 1);
            int var23 = this.field1460.method975(0, (float) var22 / 65536.0F);
            int var24 = this.field1460.method975(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1456[var23 + var25] * (long) class130.field2995 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1456[var23 + var25 - var36 - 1] * (long) class130.field2990[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1456[var25 - var37 - 1] * (long) class130.field2990[1][var37] >> 16);
                    }
                    field1456[var25] = var35;
                    var22 = this.field1471.method292(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1456[var23 + var25] * (long) class130.field2995 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1456[var23 + var25 - var33 - 1] * (long) class130.field2990[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1456[var25 - var34 - 1] * (long) class130.field2990[1][var34] >> 16);
                        }
                        field1456[var25] = var32;
                        var22 = this.field1471.method292(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1456[var23 + var25 - var29 - 1] * (long) class130.field2990[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1456[var25 - var30 - 1] * (long) class130.field2990[1][var30] >> 16);
                            }
                            field1456[var25] = var28;
                            this.field1471.method292(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1460.method975(0, (float) var22 / 65536.0F);
                    var24 = this.field1460.method975(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1456[var38] < -32768) {
                field1456[var38] = -32768;
            }
            if (field1456[var38] > 32767) {
                field1456[var38] = 32767;
            }
        }
        return field1456;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lne;)V")
    public final void method470(class95 arg0) {
        this.field1462 = new class43();
        this.field1462.method291(arg0);
        this.field1466 = new class43();
        this.field1466.method291(arg0);
        int var2 = arg0.method790((byte) 73);
        if (var2 != 0) {
            arg0.field2304--;
            this.field1468 = new class43();
            this.field1468.method291(arg0);
            this.field1459 = new class43();
            this.field1459.method291(arg0);
        }
        int var3 = arg0.method790((byte) 73);
        if (var3 != 0) {
            arg0.field2304--;
            this.field1472 = new class43();
            this.field1472.method291(arg0);
            this.field1469 = new class43();
            this.field1469.method291(arg0);
        }
        int var4 = arg0.method790((byte) 73);
        if (var4 != 0) {
            arg0.field2304--;
            this.field1455 = new class43();
            this.field1455.method291(arg0);
            this.field1458 = new class43();
            this.field1458.method291(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method759((byte) 124);
            if (var6 == 0) {
                break;
            }
            this.field1473[var5] = var6;
            this.field1470[var5] = arg0.method771(49152);
            this.field1467[var5] = arg0.method759((byte) 124);
        }
        this.field1463 = arg0.method759((byte) 123);
        this.field1474 = arg0.method759((byte) 124);
        this.field1457 = arg0.method795(1);
        this.field1465 = arg0.method795(1);
        this.field1460 = new class130();
        this.field1471 = new class43();
        this.field1460.method978(arg0, this.field1471);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1461[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1464 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1464[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1456 = new int[220500];
        field1476 = new int[5];
        field1475 = new int[5];
        field1477 = new int[5];
        field1478 = new int[5];
        field1479 = new int[5];
    }
}
