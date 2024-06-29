import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class262 {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public int field4551 = 0;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[I")
    private int[] field4554 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public int field4552 = 500;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    private int field4555 = 0;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    private int field4556 = 100;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[I")
    private int[] field4560 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[I")
    private int[] field4559 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[I")
    private static int[] field4550 = new int[32768];

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[I")
    private static int[] field4553;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[I")
    private static int[] field4548;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
    private static int[] field4561;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "[I")
    private static int[] field4562;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[I")
    private static int[] field4564;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[I")
    private static int[] field4563;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "[I")
    private static int[] field4565;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lag;")
    private class187 field4547;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lgf;")
    private class28 field4541;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lgf;")
    private class28 field4542;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lgf;")
    private class28 field4543;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lgf;")
    private class28 field4544;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lgf;")
    private class28 field4545;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lgf;")
    private class28 field4546;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lgf;")
    private class28 field4549;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lgf;")
    private class28 field4557;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lgf;")
    private class28 field4558;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method1837(int arg0, int arg1) {
        class275.method1933(field4548, 0, arg0);
        if (arg1 < 10) {
            return field4548;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4558.method215();
        this.field4543.method215();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4544 != null) {
            this.field4544.method215();
            this.field4557.method215();
            var5 = (int) ((double) (this.field4544.field334 - this.field4544.field333) * 32.768D / var3);
            var6 = (int) ((double) this.field4544.field333 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4545 != null) {
            this.field4545.method215();
            this.field4546.method215();
            var8 = (int) ((double) (this.field4545.field334 - this.field4545.field333) * 32.768D / var3);
            var9 = (int) ((double) this.field4545.field333 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4559[var11] != 0) {
                field4564[var11] = 0;
                field4561[var11] = (int) ((double) this.field4554[var11] * var3);
                field4563[var11] = (this.field4559[var11] << 14) / 100;
                field4562[var11] = (int) ((double) (this.field4558.field334 - this.field4558.field333) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4560[var11]) / var3);
                field4565[var11] = (int) ((double) this.field4558.field333 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4558.method217(arg0);
            int var14 = this.field4543.method217(arg0);
            if (this.field4544 != null) {
                int var15 = this.field4544.method217(arg0);
                int var16 = this.field4557.method217(arg0);
                var13 += this.method1840(var7, var16, this.field4544.field332) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4545 != null) {
                int var17 = this.field4545.method217(arg0);
                int var18 = this.field4546.method217(arg0);
                var14 = var14 * ((this.method1840(var10, var18, this.field4545.field332) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4559[var19] != 0) {
                    int var20 = field4561[var19] + var12;
                    if (var20 < arg0) {
                        field4548[var20] += this.method1840(field4564[var19], field4563[var19] * var14 >> 15, this.field4558.field332);
                        field4564[var19] += (field4562[var19] * var13 >> 16) + field4565[var19];
                    }
                }
            }
        }
        if (this.field4541 != null) {
            this.field4541.method215();
            this.field4542.method215();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4541.method217(arg0);
                int var26 = this.field4542.method217(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4541.field334 - this.field4541.field333) * var25 >> 8) + this.field4541.field333;
                } else {
                    var27 = ((this.field4541.field334 - this.field4541.field333) * var26 >> 8) + this.field4541.field333;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4548[var24] = 0;
                }
            }
        }
        if (this.field4555 > 0 && this.field4556 > 0) {
            int var28 = (int) ((double) this.field4555 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4548[var29] += field4548[var29 - var28] * this.field4556 / 100;
            }
        }
        if (this.field4547.field3321[0] > 0 || this.field4547.field3321[1] > 0) {
            this.field4549.method215();
            int var30 = this.field4549.method217(arg0 + 1);
            int var31 = this.field4547.method1272(0, (float) var30 / 65536.0F);
            int var32 = this.field4547.method1272(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4548[var31 + var33] * (long) class187.field3322 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4548[var31 + var33 - var36 - 1] * (long) class187.field3319[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4548[var33 - var37 - 1] * (long) class187.field3319[1][var37] >> 16);
                    }
                    field4548[var33] = var35;
                    var30 = this.field4549.method217(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4548[var31 + var33] * (long) class187.field3322 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4548[var31 + var33 - var40 - 1] * (long) class187.field3319[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4548[var33 - var41 - 1] * (long) class187.field3319[1][var41] >> 16);
                        }
                        field4548[var33] = var39;
                        var30 = this.field4549.method217(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4548[var31 + var33 - var43 - 1] * (long) class187.field3319[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4548[var33 - var44 - 1] * (long) class187.field3319[1][var44] >> 16);
                            }
                            field4548[var33] = var42;
                            this.field4549.method217(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4547.method1272(0, (float) var30 / 65536.0F);
                    var32 = this.field4547.method1272(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4548[var46] < -32768) {
                field4548[var46] = -32768;
            }
            if (field4548[var46] > 32767) {
                field4548[var46] = 32767;
            }
        }
        return field4548;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lva;)V", line = 290)
    public final void method1838(class235 arg0) {
        this.field4558 = new class28();
        this.field4558.method216(arg0);
        this.field4543 = new class28();
        this.field4543.method216(arg0);
        int var2 = arg0.method1589(78);
        if (var2 != 0) {
            arg0.field4051--;
            this.field4544 = new class28();
            this.field4544.method216(arg0);
            this.field4557 = new class28();
            this.field4557.method216(arg0);
        }
        int var3 = arg0.method1589(114);
        if (var3 != 0) {
            arg0.field4051--;
            this.field4545 = new class28();
            this.field4545.method216(arg0);
            this.field4546 = new class28();
            this.field4546.method216(arg0);
        }
        int var4 = arg0.method1589(84);
        if (var4 != 0) {
            arg0.field4051--;
            this.field4541 = new class28();
            this.field4541.method216(arg0);
            this.field4542 = new class28();
            this.field4542.method216(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1613((byte) 89);
            if (var6 == 0) {
                break;
            }
            this.field4559[var5] = var6;
            this.field4560[var5] = arg0.method1572(42);
            this.field4554[var5] = arg0.method1613((byte) 33);
        }
        this.field4555 = arg0.method1613((byte) 111);
        this.field4556 = arg0.method1613((byte) 124);
        this.field4552 = arg0.method1615(-118);
        this.field4551 = arg0.method1615(42);
        this.field4547 = new class187();
        this.field4549 = new class28();
        this.field4547.method1269(arg0, this.field4549);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 362)
    public static void method1839() {
        field4548 = null;
        field4550 = null;
        field4553 = null;
        field4564 = null;
        field4561 = null;
        field4563 = null;
        field4562 = null;
        field4565 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I", line = 377)
    private final int method1840(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4553[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4550[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4550[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4553 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4553[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4548 = new int[220500];
        field4561 = new int[5];
        field4562 = new int[5];
        field4564 = new int[5];
        field4563 = new int[5];
        field4565 = new int[5];
    }
}
