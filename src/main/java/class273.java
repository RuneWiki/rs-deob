import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class273 {

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field3524 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private int field3522 = 100;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
    private int[] field3528 = new int[5];

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "[I")
    private int[] field3533 = new int[5];

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    private int field3531 = 0;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
    private int[] field3527 = new int[5];

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public int field3540 = 500;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
    private static int[] field3525 = new int[32768];

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
    private static int[] field3532;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
    private static int[] field3534;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "[I")
    private static int[] field3537;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "[I")
    private static int[] field3538;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[I")
    private static int[] field3539;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "[I")
    private static int[] field3542;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "[I")
    private static int[] field3541;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lnb;")
    private class199 field3526;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lqs;")
    private class44 field3518;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lqs;")
    private class44 field3519;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lqs;")
    private class44 field3520;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lqs;")
    private class44 field3521;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lqs;")
    private class44 field3523;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lqs;")
    private class44 field3529;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lqs;")
    private class44 field3530;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lqs;")
    private class44 field3535;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lqs;")
    private class44 field3536;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
    private final int method1717(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3532[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3525[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public static void method1718() {
        field3534 = null;
        field3525 = null;
        field3532 = null;
        field3538 = null;
        field3537 = null;
        field3541 = null;
        field3539 = null;
        field3542 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lbg;)V")
    public final void method1719(class242 arg0) {
        this.field3523 = new class44();
        this.field3523.method265(arg0);
        this.field3535 = new class44();
        this.field3535.method265(arg0);
        int var2 = arg0.method1563(-128);
        if (var2 != 0) {
            arg0.field3211--;
            this.field3518 = new class44();
            this.field3518.method265(arg0);
            this.field3520 = new class44();
            this.field3520.method265(arg0);
        }
        int var3 = arg0.method1563(-128);
        if (var3 != 0) {
            arg0.field3211--;
            this.field3519 = new class44();
            this.field3519.method265(arg0);
            this.field3530 = new class44();
            this.field3530.method265(arg0);
        }
        int var4 = arg0.method1563(-128);
        if (var4 != 0) {
            arg0.field3211--;
            this.field3521 = new class44();
            this.field3521.method265(arg0);
            this.field3536 = new class44();
            this.field3536.method265(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1559((byte) -55);
            if (var6 == 0) {
                break;
            }
            this.field3533[var5] = var6;
            this.field3527[var5] = arg0.method1553(false);
            this.field3528[var5] = arg0.method1559((byte) -45);
        }
        this.field3531 = arg0.method1559((byte) -118);
        this.field3522 = arg0.method1559((byte) -101);
        this.field3540 = arg0.method1587((byte) -102);
        this.field3524 = arg0.method1587((byte) -102);
        this.field3526 = new class199();
        this.field3529 = new class44();
        this.field3526.method1231(arg0, this.field3529);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
    public final int[] method1720(int arg0, int arg1) {
        class114.method668(field3534, 0, arg0);
        if (arg1 < 10) {
            return field3534;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3523.method264();
        this.field3535.method264();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3518 != null) {
            this.field3518.method264();
            this.field3520.method264();
            var5 = (int) ((double) (this.field3518.field517 - this.field3518.field518) * 32.768D / var3);
            var6 = (int) ((double) this.field3518.field518 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3519 != null) {
            this.field3519.method264();
            this.field3530.method264();
            var8 = (int) ((double) (this.field3519.field517 - this.field3519.field518) * 32.768D / var3);
            var9 = (int) ((double) this.field3519.field518 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3533[var11] != 0) {
                field3538[var11] = 0;
                field3537[var11] = (int) ((double) this.field3528[var11] * var3);
                field3541[var11] = (this.field3533[var11] << 14) / 100;
                field3539[var11] = (int) ((double) (this.field3523.field517 - this.field3523.field518) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3527[var11]) / var3);
                field3542[var11] = (int) ((double) this.field3523.field518 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3523.method266(arg0);
            int var40 = this.field3535.method266(arg0);
            if (this.field3518 != null) {
                int var41 = this.field3518.method266(arg0);
                int var42 = this.field3520.method266(arg0);
                var39 += this.method1717(var7, var42, this.field3518.field515) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3519 != null) {
                int var43 = this.field3519.method266(arg0);
                int var44 = this.field3530.method266(arg0);
                var40 = var40 * ((this.method1717(var10, var44, this.field3519.field515) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3533[var45] != 0) {
                    int var46 = field3537[var45] + var12;
                    if (var46 < arg0) {
                        field3534[var46] += this.method1717(field3538[var45], field3541[var45] * var40 >> 15, this.field3523.field515);
                        field3538[var45] += (field3539[var45] * var39 >> 16) + field3542[var45];
                    }
                }
            }
        }
        if (this.field3521 != null) {
            this.field3521.method264();
            this.field3536.method264();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3521.method266(arg0);
                int var18 = this.field3536.method266(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3521.field517 - this.field3521.field518) * var17 >> 8) + this.field3521.field518;
                } else {
                    var19 = ((this.field3521.field517 - this.field3521.field518) * var18 >> 8) + this.field3521.field518;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3534[var16] = 0;
                }
            }
        }
        if (this.field3531 > 0 && this.field3522 > 0) {
            int var20 = (int) ((double) this.field3531 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3534[var21] += field3534[var21 - var20] * this.field3522 / 100;
            }
        }
        if (this.field3526.field2349[0] > 0 || this.field3526.field2349[1] > 0) {
            this.field3529.method264();
            int var22 = this.field3529.method266(arg0 + 1);
            int var23 = this.field3526.method1230(0, (float) var22 / 65536.0F);
            int var24 = this.field3526.method1230(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3534[var23 + var25] * (long) class199.field2347 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3534[var23 + var25 - var36 - 1] * (long) class199.field2353[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3534[var25 - var37 - 1] * (long) class199.field2353[1][var37] >> 16);
                    }
                    field3534[var25] = var35;
                    var22 = this.field3529.method266(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3534[var23 + var25] * (long) class199.field2347 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3534[var23 + var25 - var33 - 1] * (long) class199.field2353[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3534[var25 - var34 - 1] * (long) class199.field2353[1][var34] >> 16);
                        }
                        field3534[var25] = var32;
                        var22 = this.field3529.method266(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3534[var23 + var25 - var29 - 1] * (long) class199.field2353[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3534[var25 - var30 - 1] * (long) class199.field2353[1][var30] >> 16);
                            }
                            field3534[var25] = var28;
                            this.field3529.method266(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3526.method1230(0, (float) var22 / 65536.0F);
                    var24 = this.field3526.method1230(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3534[var38] < -32768) {
                field3534[var38] = -32768;
            }
            if (field3534[var38] > 32767) {
                field3534[var38] = 32767;
            }
        }
        return field3534;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3525[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3532 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3532[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3534 = new int[220500];
        field3537 = new int[5];
        field3538 = new int[5];
        field3539 = new int[5];
        field3542 = new int[5];
        field3541 = new int[5];
    }
}
