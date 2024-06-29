import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class213 {

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
    private int[] field3402 = new int[5];

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    private int field3399 = 100;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public int field3411 = 500;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[I")
    private int[] field3412 = new int[5];

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public int field3414 = 0;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    private int field3415 = 0;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
    private int[] field3403 = new int[5];

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
    private static int[] field3396 = new int[32768];

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    private static int[] field3395;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    private static int[] field3391;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[I")
    private static int[] field3404;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "[I")
    private static int[] field3408;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[I")
    private static int[] field3413;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[I")
    private static int[] field3406;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[I")
    private static int[] field3405;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lce;")
    private class234 field3392;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lce;")
    private class234 field3394;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lce;")
    private class234 field3397;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lce;")
    private class234 field3398;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lce;")
    private class234 field3400;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lce;")
    private class234 field3401;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Lce;")
    private class234 field3407;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Lce;")
    private class234 field3409;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lce;")
    private class234 field3410;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lii;")
    private class279 field3393;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
    public final int[] method1496(int arg0, int arg1) {
        class158.method1046(field3391, 0, arg0);
        if (arg1 < 10) {
            return field3391;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3398.method1627();
        this.field3397.method1627();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3392 != null) {
            this.field3392.method1627();
            this.field3394.method1627();
            var5 = (int) ((double) (this.field3392.field3713 - this.field3392.field3716) * 32.768D / var3);
            var6 = (int) ((double) this.field3392.field3716 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3401 != null) {
            this.field3401.method1627();
            this.field3407.method1627();
            var8 = (int) ((double) (this.field3401.field3713 - this.field3401.field3716) * 32.768D / var3);
            var9 = (int) ((double) this.field3401.field3716 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3402[var11] != 0) {
                field3404[var11] = 0;
                field3408[var11] = (int) ((double) this.field3403[var11] * var3);
                field3405[var11] = (this.field3402[var11] << 14) / 100;
                field3406[var11] = (int) ((double) (this.field3398.field3713 - this.field3398.field3716) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3412[var11]) / var3);
                field3413[var11] = (int) ((double) this.field3398.field3716 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3398.method1628(arg0);
            int var40 = this.field3397.method1628(arg0);
            if (this.field3392 != null) {
                int var41 = this.field3392.method1628(arg0);
                int var42 = this.field3394.method1628(arg0);
                var39 += this.method1497(var7, var42, this.field3392.field3712) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3401 != null) {
                int var43 = this.field3401.method1628(arg0);
                int var44 = this.field3407.method1628(arg0);
                var40 = var40 * ((this.method1497(var10, var44, this.field3401.field3712) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3402[var45] != 0) {
                    int var46 = field3408[var45] + var12;
                    if (var46 < arg0) {
                        field3391[var46] += this.method1497(field3404[var45], field3405[var45] * var40 >> 15, this.field3398.field3712);
                        field3404[var45] += (field3406[var45] * var39 >> 16) + field3413[var45];
                    }
                }
            }
        }
        if (this.field3409 != null) {
            this.field3409.method1627();
            this.field3410.method1627();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3409.method1628(arg0);
                int var18 = this.field3410.method1628(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3409.field3713 - this.field3409.field3716) * var17 >> 8) + this.field3409.field3716;
                } else {
                    var19 = ((this.field3409.field3713 - this.field3409.field3716) * var18 >> 8) + this.field3409.field3716;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3391[var16] = 0;
                }
            }
        }
        if (this.field3415 > 0 && this.field3399 > 0) {
            int var20 = (int) ((double) this.field3415 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3391[var21] += field3391[var21 - var20] * this.field3399 / 100;
            }
        }
        if (this.field3393.field4629[0] > 0 || this.field3393.field4629[1] > 0) {
            this.field3400.method1627();
            int var22 = this.field3400.method1628(arg0 + 1);
            int var23 = this.field3393.method1942(0, (float) var22 / 65536.0F);
            int var24 = this.field3393.method1942(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3391[var23 + var25] * (long) class279.field4627 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3391[var23 + var25 - var36 - 1] * (long) class279.field4622[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3391[var25 - var37 - 1] * (long) class279.field4622[1][var37] >> 16);
                    }
                    field3391[var25] = var35;
                    var22 = this.field3400.method1628(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3391[var23 + var25] * (long) class279.field4627 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3391[var23 + var25 - var33 - 1] * (long) class279.field4622[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3391[var25 - var34 - 1] * (long) class279.field4622[1][var34] >> 16);
                        }
                        field3391[var25] = var32;
                        var22 = this.field3400.method1628(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3391[var23 + var25 - var29 - 1] * (long) class279.field4622[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3391[var25 - var30 - 1] * (long) class279.field4622[1][var30] >> 16);
                            }
                            field3391[var25] = var28;
                            this.field3400.method1628(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3393.method1942(0, (float) var22 / 65536.0F);
                    var24 = this.field3393.method1942(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3391[var38] < -32768) {
                field3391[var38] = -32768;
            }
            if (field3391[var38] > 32767) {
                field3391[var38] = 32767;
            }
        }
        return field3391;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
    private final int method1497(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3395[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3396[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V")
    public static void method1498() {
        field3391 = null;
        field3396 = null;
        field3395 = null;
        field3404 = null;
        field3408 = null;
        field3405 = null;
        field3406 = null;
        field3413 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lma;)V")
    public final void method1499(class202 arg0) {
        this.field3398 = new class234();
        this.field3398.method1630(arg0);
        this.field3397 = new class234();
        this.field3397.method1630(arg0);
        int var2 = arg0.method1420((byte) 0);
        if (var2 != 0) {
            arg0.field3272--;
            this.field3392 = new class234();
            this.field3392.method1630(arg0);
            this.field3394 = new class234();
            this.field3394.method1630(arg0);
        }
        int var3 = arg0.method1420((byte) 0);
        if (var3 != 0) {
            arg0.field3272--;
            this.field3401 = new class234();
            this.field3401.method1630(arg0);
            this.field3407 = new class234();
            this.field3407.method1630(arg0);
        }
        int var4 = arg0.method1420((byte) 0);
        if (var4 != 0) {
            arg0.field3272--;
            this.field3409 = new class234();
            this.field3409.method1630(arg0);
            this.field3410 = new class234();
            this.field3410.method1630(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1450(-64);
            if (var6 == 0) {
                break;
            }
            this.field3402[var5] = var6;
            this.field3412[var5] = arg0.method1415(false);
            this.field3403[var5] = arg0.method1450(-92);
        }
        this.field3415 = arg0.method1450(-65);
        this.field3399 = arg0.method1450(-64);
        this.field3411 = arg0.method1419(93);
        this.field3414 = arg0.method1419(124);
        this.field3393 = new class279();
        this.field3400 = new class234();
        this.field3393.method1946(arg0, this.field3400);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3396[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3395 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3395[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3391 = new int[220500];
        field3404 = new int[5];
        field3408 = new int[5];
        field3413 = new int[5];
        field3406 = new int[5];
        field3405 = new int[5];
    }
}
