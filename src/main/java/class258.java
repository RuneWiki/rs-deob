import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class258 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    private int[] field4437 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    private int field4439 = 100;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    private int field4443 = 0;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    private int[] field4441 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field4445 = 500;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[I")
    private int[] field4457 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field4440 = 0;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "[I")
    private static int[] field4446 = new int[32768];

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "[I")
    private static int[] field4444;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[I")
    private static int[] field4434;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[I")
    private static int[] field4447;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[I")
    private static int[] field4455;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
    private static int[] field4452;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
    private static int[] field4456;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "[I")
    private static int[] field4450;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ldk;")
    private class202 field4435;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Ldk;")
    private class202 field4436;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Ldk;")
    private class202 field4438;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Ldk;")
    private class202 field4448;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Ldk;")
    private class202 field4449;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Ldk;")
    private class202 field4451;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Ldk;")
    private class202 field4453;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Ldk;")
    private class202 field4454;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Ldk;")
    private class202 field4458;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lak;")
    private class300 field4442;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V", line = 7)
    public static void method1814() {
        field4434 = null;
        field4446 = null;
        field4444 = null;
        field4452 = null;
        field4450 = null;
        field4456 = null;
        field4455 = null;
        field4447 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I", line = 29)
    private final int method1815(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4444[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4446[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4446[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4444 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4444[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4434 = new int[220500];
        field4447 = new int[5];
        field4455 = new int[5];
        field4452 = new int[5];
        field4456 = new int[5];
        field4450 = new int[5];
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I", line = 95)
    public final int[] method1816(int arg0, int arg1) {
        class224.method1541(field4434, 0, arg0);
        if (arg1 < 10) {
            return field4434;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4448.method1407();
        this.field4436.method1407();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4435 != null) {
            this.field4435.method1407();
            this.field4454.method1407();
            var5 = (int) ((double) (this.field4435.field3573 - this.field4435.field3572) * 32.768D / var3);
            var6 = (int) ((double) this.field4435.field3572 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4438 != null) {
            this.field4438.method1407();
            this.field4451.method1407();
            var8 = (int) ((double) (this.field4438.field3573 - this.field4438.field3572) * 32.768D / var3);
            var9 = (int) ((double) this.field4438.field3572 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4437[var11] != 0) {
                field4452[var11] = 0;
                field4450[var11] = (int) ((double) this.field4441[var11] * var3);
                field4456[var11] = (this.field4437[var11] << 14) / 100;
                field4455[var11] = (int) ((double) (this.field4448.field3573 - this.field4448.field3572) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4457[var11]) / var3);
                field4447[var11] = (int) ((double) this.field4448.field3572 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4448.method1406(arg0);
            int var14 = this.field4436.method1406(arg0);
            if (this.field4435 != null) {
                int var15 = this.field4435.method1406(arg0);
                int var16 = this.field4454.method1406(arg0);
                var13 += this.method1815(var7, var16, this.field4435.field3575) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4438 != null) {
                int var17 = this.field4438.method1406(arg0);
                int var18 = this.field4451.method1406(arg0);
                var14 = var14 * ((this.method1815(var10, var18, this.field4438.field3575) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4437[var19] != 0) {
                    int var20 = field4450[var19] + var12;
                    if (var20 < arg0) {
                        field4434[var20] += this.method1815(field4452[var19], field4456[var19] * var14 >> 15, this.field4448.field3575);
                        field4452[var19] += (field4455[var19] * var13 >> 16) + field4447[var19];
                    }
                }
            }
        }
        if (this.field4449 != null) {
            this.field4449.method1407();
            this.field4458.method1407();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4449.method1406(arg0);
                int var26 = this.field4458.method1406(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4449.field3573 - this.field4449.field3572) * var25 >> 8) + this.field4449.field3572;
                } else {
                    var27 = ((this.field4449.field3573 - this.field4449.field3572) * var26 >> 8) + this.field4449.field3572;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4434[var24] = 0;
                }
            }
        }
        if (this.field4443 > 0 && this.field4439 > 0) {
            int var28 = (int) ((double) this.field4443 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4434[var29] += field4434[var29 - var28] * this.field4439 / 100;
            }
        }
        if (this.field4442.field5099[0] > 0 || this.field4442.field5099[1] > 0) {
            this.field4453.method1407();
            int var30 = this.field4453.method1406(arg0 + 1);
            int var31 = this.field4442.method2048(0, (float) var30 / 65536.0F);
            int var32 = this.field4442.method2048(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4434[var31 + var33] * (long) class300.field5101 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4434[var31 + var33 - var36 - 1] * (long) class300.field5105[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4434[var33 - var37 - 1] * (long) class300.field5105[1][var37] >> 16);
                    }
                    field4434[var33] = var35;
                    var30 = this.field4453.method1406(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4434[var31 + var33] * (long) class300.field5101 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4434[var31 + var33 - var40 - 1] * (long) class300.field5105[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4434[var33 - var41 - 1] * (long) class300.field5105[1][var41] >> 16);
                        }
                        field4434[var33] = var39;
                        var30 = this.field4453.method1406(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4434[var31 + var33 - var43 - 1] * (long) class300.field5105[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4434[var33 - var44 - 1] * (long) class300.field5105[1][var44] >> 16);
                            }
                            field4434[var33] = var42;
                            this.field4453.method1406(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4442.method2048(0, (float) var30 / 65536.0F);
                    var32 = this.field4442.method2048(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4434[var46] < -32768) {
                field4434[var46] = -32768;
            }
            if (field4434[var46] > 32767) {
                field4434[var46] = 32767;
            }
        }
        return field4434;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lbg;)V", line = 384)
    public final void method1817(class194 arg0) {
        this.field4448 = new class202();
        this.field4448.method1409(arg0);
        this.field4436 = new class202();
        this.field4436.method1409(arg0);
        int var2 = arg0.method1325(7627);
        if (var2 != 0) {
            arg0.field3380--;
            this.field4435 = new class202();
            this.field4435.method1409(arg0);
            this.field4454 = new class202();
            this.field4454.method1409(arg0);
        }
        int var3 = arg0.method1325(7627);
        if (var3 != 0) {
            arg0.field3380--;
            this.field4438 = new class202();
            this.field4438.method1409(arg0);
            this.field4451 = new class202();
            this.field4451.method1409(arg0);
        }
        int var4 = arg0.method1325(7627);
        if (var4 != 0) {
            arg0.field3380--;
            this.field4449 = new class202();
            this.field4449.method1409(arg0);
            this.field4458 = new class202();
            this.field4458.method1409(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1345((byte) 39);
            if (var6 == 0) {
                break;
            }
            this.field4437[var5] = var6;
            this.field4457[var5] = arg0.method1317(128);
            this.field4441[var5] = arg0.method1345((byte) 96);
        }
        this.field4443 = arg0.method1345((byte) 99);
        this.field4439 = arg0.method1345((byte) 61);
        this.field4445 = arg0.method1308(-123);
        this.field4440 = arg0.method1308(-99);
        this.field4442 = new class300();
        this.field4453 = new class202();
        this.field4442.method2045(arg0, this.field4453);
    }
}
