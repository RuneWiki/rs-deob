import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class87 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    private int field1508 = 0;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
    private int[] field1514 = new int[5];

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public int field1513 = 500;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public int field1516 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[I")
    private int[] field1507 = new int[5];

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    private int field1524 = 100;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "[I")
    private int[] field1525 = new int[5];

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "[I")
    private static int[] field1526 = new int[32768];

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
    private static int[] field1515;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
    private static int[] field1520;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "[I")
    private static int[] field1528;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "[I")
    private static int[] field1529;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "[I")
    private static int[] field1530;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "[I")
    private static int[] field1527;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "[I")
    private static int[] field1531;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Llg;")
    private class126 field1509;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Llg;")
    private class126 field1510;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Llg;")
    private class126 field1512;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Llg;")
    private class126 field1517;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Llg;")
    private class126 field1518;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Llg;")
    private class126 field1519;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Llg;")
    private class126 field1521;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Llg;")
    private class126 field1522;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Llg;")
    private class126 field1523;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lqa;")
    private class175 field1511;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lkd;)V")
    public final void method542(class112 arg0) {
        this.field1523 = new class126();
        this.field1523.method829(arg0);
        this.field1510 = new class126();
        this.field1510.method829(arg0);
        int var2 = arg0.method716(-1308);
        if (var2 != 0) {
            arg0.field2133--;
            this.field1518 = new class126();
            this.field1518.method829(arg0);
            this.field1522 = new class126();
            this.field1522.method829(arg0);
        }
        int var3 = arg0.method716(-1308);
        if (var3 != 0) {
            arg0.field2133--;
            this.field1509 = new class126();
            this.field1509.method829(arg0);
            this.field1519 = new class126();
            this.field1519.method829(arg0);
        }
        int var4 = arg0.method716(-1308);
        if (var4 != 0) {
            arg0.field2133--;
            this.field1517 = new class126();
            this.field1517.method829(arg0);
            this.field1512 = new class126();
            this.field1512.method829(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method754(4695);
            if (var6 == 0) {
                break;
            }
            this.field1525[var5] = var6;
            this.field1507[var5] = arg0.method735(false);
            this.field1514[var5] = arg0.method754(4695);
        }
        this.field1508 = arg0.method754(4695);
        this.field1524 = arg0.method754(4695);
        this.field1513 = arg0.method739(-128);
        this.field1516 = arg0.method739(-14);
        this.field1511 = new class175();
        this.field1521 = new class126();
        this.field1511.method1142(arg0, this.field1521);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public static void method543() {
        field1520 = null;
        field1526 = null;
        field1515 = null;
        field1531 = null;
        field1528 = null;
        field1530 = null;
        field1529 = null;
        field1527 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
    public final int[] method544(int arg0, int arg1) {
        class80.method494(field1520, 0, arg0);
        if (arg1 < 10) {
            return field1520;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1523.method832();
        this.field1510.method832();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1518 != null) {
            this.field1518.method832();
            this.field1522.method832();
            var5 = (int) ((double) (this.field1518.field2346 - this.field1518.field2341) * 32.768D / var3);
            var6 = (int) ((double) this.field1518.field2341 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1509 != null) {
            this.field1509.method832();
            this.field1519.method832();
            var8 = (int) ((double) (this.field1509.field2346 - this.field1509.field2341) * 32.768D / var3);
            var9 = (int) ((double) this.field1509.field2341 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1525[var11] != 0) {
                field1531[var11] = 0;
                field1528[var11] = (int) ((double) this.field1514[var11] * var3);
                field1530[var11] = (this.field1525[var11] << 14) / 100;
                field1529[var11] = (int) ((double) (this.field1523.field2346 - this.field1523.field2341) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1507[var11]) / var3);
                field1527[var11] = (int) ((double) this.field1523.field2341 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1523.method830(arg0);
            int var40 = this.field1510.method830(arg0);
            if (this.field1518 != null) {
                int var41 = this.field1518.method830(arg0);
                int var42 = this.field1522.method830(arg0);
                var39 += this.method545(var7, var42, this.field1518.field2342) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1509 != null) {
                int var43 = this.field1509.method830(arg0);
                int var44 = this.field1519.method830(arg0);
                var40 = var40 * ((this.method545(var10, var44, this.field1509.field2342) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1525[var45] != 0) {
                    int var46 = field1528[var45] + var12;
                    if (var46 < arg0) {
                        field1520[var46] += this.method545(field1531[var45], field1530[var45] * var40 >> 15, this.field1523.field2342);
                        field1531[var45] += (field1529[var45] * var39 >> 16) + field1527[var45];
                    }
                }
            }
        }
        if (this.field1517 != null) {
            this.field1517.method832();
            this.field1512.method832();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1517.method830(arg0);
                int var18 = this.field1512.method830(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1517.field2346 - this.field1517.field2341) * var17 >> 8) + this.field1517.field2341;
                } else {
                    var19 = ((this.field1517.field2346 - this.field1517.field2341) * var18 >> 8) + this.field1517.field2341;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1520[var16] = 0;
                }
            }
        }
        if (this.field1508 > 0 && this.field1524 > 0) {
            int var20 = (int) ((double) this.field1508 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1520[var21] += field1520[var21 - var20] * this.field1524 / 100;
            }
        }
        if (this.field1511.field3262[0] > 0 || this.field1511.field3262[1] > 0) {
            this.field1521.method832();
            int var22 = this.field1521.method830(arg0 + 1);
            int var23 = this.field1511.method1143(0, (float) var22 / 65536.0F);
            int var24 = this.field1511.method1143(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1520[var23 + var25] * (long) class175.field3256 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1520[var23 + var25 - var36 - 1] * (long) class175.field3263[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1520[var25 - var37 - 1] * (long) class175.field3263[1][var37] >> 16);
                    }
                    field1520[var25] = var35;
                    var22 = this.field1521.method830(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1520[var23 + var25] * (long) class175.field3256 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1520[var23 + var25 - var33 - 1] * (long) class175.field3263[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1520[var25 - var34 - 1] * (long) class175.field3263[1][var34] >> 16);
                        }
                        field1520[var25] = var32;
                        var22 = this.field1521.method830(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1520[var23 + var25 - var29 - 1] * (long) class175.field3263[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1520[var25 - var30 - 1] * (long) class175.field3263[1][var30] >> 16);
                            }
                            field1520[var25] = var28;
                            this.field1521.method830(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1511.method1143(0, (float) var22 / 65536.0F);
                    var24 = this.field1511.method1143(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1520[var38] < -32768) {
                field1520[var38] = -32768;
            }
            if (field1520[var38] > 32767) {
                field1520[var38] = 32767;
            }
        }
        return field1520;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I")
    private final int method545(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1515[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1526[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1526[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1515 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1515[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1520 = new int[220500];
        field1528 = new int[5];
        field1529 = new int[5];
        field1530 = new int[5];
        field1527 = new int[5];
        field1531 = new int[5];
    }
}
