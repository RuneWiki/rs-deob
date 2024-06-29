import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field2480 = 500;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "[I")
    private int[] field2491 = new int[5];

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "[I")
    private int[] field2494 = new int[5];

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
    private int[] field2492 = new int[5];

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    private int field2496 = 0;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field2493 = 0;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    private int field2498 = 100;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
    private static int[] field2490 = new int[32768];

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[I")
    private static int[] field2497;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    private static int[] field2483;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "[I")
    private static int[] field2499;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "[I")
    private static int[] field2503;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[I")
    private static int[] field2500;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "[I")
    private static int[] field2501;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "[I")
    private static int[] field2502;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lud;")
    private class143 field2481;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lh;")
    private class49 field2479;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lh;")
    private class49 field2482;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lh;")
    private class49 field2484;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lh;")
    private class49 field2485;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lh;")
    private class49 field2486;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lh;")
    private class49 field2487;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lh;")
    private class49 field2488;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lh;")
    private class49 field2489;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lh;")
    private class49 field2495;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static void method853() {
        field2483 = null;
        field2490 = null;
        field2497 = null;
        field2503 = null;
        field2500 = null;
        field2502 = null;
        field2499 = null;
        field2501 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
    public final int[] method854(int arg0, int arg1) {
        class57.method503(field2483, 0, arg0);
        if (arg1 < 10) {
            return field2483;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2479.method413();
        this.field2485.method413();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2486 != null) {
            this.field2486.method413();
            this.field2484.method413();
            var5 = (int) ((double) (this.field2486.field1192 - this.field2486.field1188) * 32.768D / var3);
            var6 = (int) ((double) this.field2486.field1188 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2487 != null) {
            this.field2487.method413();
            this.field2488.method413();
            var8 = (int) ((double) (this.field2487.field1192 - this.field2487.field1188) * 32.768D / var3);
            var9 = (int) ((double) this.field2487.field1188 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2492[var11] != 0) {
                field2503[var11] = 0;
                field2500[var11] = (int) ((double) this.field2491[var11] * var3);
                field2502[var11] = (this.field2492[var11] << 14) / 100;
                field2499[var11] = (int) ((double) (this.field2479.field1192 - this.field2479.field1188) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2494[var11]) / var3);
                field2501[var11] = (int) ((double) this.field2479.field1188 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2479.method410(arg0);
            int var40 = this.field2485.method410(arg0);
            if (this.field2486 != null) {
                int var41 = this.field2486.method410(arg0);
                int var42 = this.field2484.method410(arg0);
                var39 += this.method855(var7, var42, this.field2486.field1189) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2487 != null) {
                int var43 = this.field2487.method410(arg0);
                int var44 = this.field2488.method410(arg0);
                var40 = var40 * ((this.method855(var10, var44, this.field2487.field1189) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2492[var45] != 0) {
                    int var46 = field2500[var45] + var12;
                    if (var46 < arg0) {
                        field2483[var46] += this.method855(field2503[var45], field2502[var45] * var40 >> 15, this.field2479.field1189);
                        field2503[var45] += (field2499[var45] * var39 >> 16) + field2501[var45];
                    }
                }
            }
        }
        if (this.field2495 != null) {
            this.field2495.method413();
            this.field2489.method413();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2495.method410(arg0);
                int var18 = this.field2489.method410(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2495.field1192 - this.field2495.field1188) * var17 >> 8) + this.field2495.field1188;
                } else {
                    var19 = ((this.field2495.field1192 - this.field2495.field1188) * var18 >> 8) + this.field2495.field1188;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2483[var16] = 0;
                }
            }
        }
        if (this.field2496 > 0 && this.field2498 > 0) {
            int var20 = (int) ((double) this.field2496 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2483[var21] += field2483[var21 - var20] * this.field2498 / 100;
            }
        }
        if (this.field2481.field3223[0] > 0 || this.field2481.field3223[1] > 0) {
            this.field2482.method413();
            int var22 = this.field2482.method410(arg0 + 1);
            int var23 = this.field2481.method1060(0, (float) var22 / 65536.0F);
            int var24 = this.field2481.method1060(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2483[var23 + var25] * (long) class143.field3229 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2483[var23 + var25 - var36 - 1] * (long) class143.field3225[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2483[var25 - var37 - 1] * (long) class143.field3225[1][var37] >> 16);
                    }
                    field2483[var25] = var35;
                    var22 = this.field2482.method410(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2483[var23 + var25] * (long) class143.field3229 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2483[var23 + var25 - var33 - 1] * (long) class143.field3225[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2483[var25 - var34 - 1] * (long) class143.field3225[1][var34] >> 16);
                        }
                        field2483[var25] = var32;
                        var22 = this.field2482.method410(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2483[var23 + var25 - var29 - 1] * (long) class143.field3225[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2483[var25 - var30 - 1] * (long) class143.field3225[1][var30] >> 16);
                            }
                            field2483[var25] = var28;
                            this.field2482.method410(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2481.method1060(0, (float) var22 / 65536.0F);
                    var24 = this.field2481.method1060(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2483[var38] < -32768) {
                field2483[var38] = -32768;
            }
            if (field2483[var38] > 32767) {
                field2483[var38] = 32767;
            }
        }
        return field2483;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
    private final int method855(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2497[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2490[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lpa;)V")
    public final void method856(class105 arg0) {
        this.field2479 = new class49();
        this.field2479.method412(arg0);
        this.field2485 = new class49();
        this.field2485.method412(arg0);
        int var2 = arg0.method831((byte) 76);
        if (var2 != 0) {
            arg0.field2404--;
            this.field2486 = new class49();
            this.field2486.method412(arg0);
            this.field2484 = new class49();
            this.field2484.method412(arg0);
        }
        int var3 = arg0.method831((byte) 76);
        if (var3 != 0) {
            arg0.field2404--;
            this.field2487 = new class49();
            this.field2487.method412(arg0);
            this.field2488 = new class49();
            this.field2488.method412(arg0);
        }
        int var4 = arg0.method831((byte) 76);
        if (var4 != 0) {
            arg0.field2404--;
            this.field2495 = new class49();
            this.field2495.method412(arg0);
            this.field2489 = new class49();
            this.field2489.method412(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method815((byte) 126);
            if (var6 == 0) {
                break;
            }
            this.field2492[var5] = var6;
            this.field2494[var5] = arg0.method788(-64);
            this.field2491[var5] = arg0.method815((byte) 125);
        }
        this.field2496 = arg0.method815((byte) 127);
        this.field2498 = arg0.method815((byte) 125);
        this.field2480 = arg0.method838((byte) 5);
        this.field2493 = arg0.method838((byte) 5);
        this.field2481 = new class143();
        this.field2482 = new class49();
        this.field2481.method1058(arg0, this.field2482);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2490[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2497 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2497[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2483 = new int[220500];
        field2499 = new int[5];
        field2503 = new int[5];
        field2500 = new int[5];
        field2501 = new int[5];
        field2502 = new int[5];
    }
}
