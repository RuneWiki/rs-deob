import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class251 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field4382 = 100;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    private int[] field4380 = new int[5];

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public int field4395 = 0;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field4386 = 500;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
    private int[] field4383 = new int[5];

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field4390 = 0;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
    private int[] field4384 = new int[5];

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "[I")
    private static int[] field4398 = new int[32768];

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
    private static int[] field4388;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
    private static int[] field4381;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "[I")
    private static int[] field4399;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "[I")
    private static int[] field4404;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
    private static int[] field4402;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[I")
    private static int[] field4401;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[I")
    private static int[] field4400;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lq;")
    private class24 field4385;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lq;")
    private class24 field4387;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lq;")
    private class24 field4389;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lq;")
    private class24 field4391;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lq;")
    private class24 field4392;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lq;")
    private class24 field4393;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lq;")
    private class24 field4394;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lq;")
    private class24 field4396;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Lq;")
    private class24 field4403;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lwj;")
    private class28 field4397;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvf;)V")
    public final void method1712(class230 arg0) {
        this.field4385 = new class24();
        this.field4385.method208(arg0);
        this.field4394 = new class24();
        this.field4394.method208(arg0);
        int var2 = arg0.method1516((byte) 82);
        if (var2 != 0) {
            arg0.field3933--;
            this.field4387 = new class24();
            this.field4387.method208(arg0);
            this.field4393 = new class24();
            this.field4393.method208(arg0);
        }
        int var3 = arg0.method1516((byte) 82);
        if (var3 != 0) {
            arg0.field3933--;
            this.field4389 = new class24();
            this.field4389.method208(arg0);
            this.field4392 = new class24();
            this.field4392.method208(arg0);
        }
        int var4 = arg0.method1516((byte) 82);
        if (var4 != 0) {
            arg0.field3933--;
            this.field4403 = new class24();
            this.field4403.method208(arg0);
            this.field4391 = new class24();
            this.field4391.method208(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1517(false);
            if (var6 == 0) {
                break;
            }
            this.field4380[var5] = var6;
            this.field4384[var5] = arg0.method1536((byte) 6);
            this.field4383[var5] = arg0.method1517(false);
        }
        this.field4390 = arg0.method1517(false);
        this.field4382 = arg0.method1517(false);
        this.field4386 = arg0.method1535(2);
        this.field4395 = arg0.method1535(2);
        this.field4397 = new class28();
        this.field4396 = new class24();
        this.field4397.method235(arg0, this.field4396);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    public static void method1713() {
        field4381 = null;
        field4398 = null;
        field4388 = null;
        field4404 = null;
        field4401 = null;
        field4399 = null;
        field4402 = null;
        field4400 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[I")
    public final int[] method1714(int arg0, int arg1) {
        class252.method1716(field4381, 0, arg0);
        if (arg1 < 10) {
            return field4381;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4385.method207();
        this.field4394.method207();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4387 != null) {
            this.field4387.method207();
            this.field4393.method207();
            var5 = (int) ((double) (this.field4387.field416 - this.field4387.field414) * 32.768D / var3);
            var6 = (int) ((double) this.field4387.field414 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4389 != null) {
            this.field4389.method207();
            this.field4392.method207();
            var8 = (int) ((double) (this.field4389.field416 - this.field4389.field414) * 32.768D / var3);
            var9 = (int) ((double) this.field4389.field414 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4380[var11] != 0) {
                field4404[var11] = 0;
                field4401[var11] = (int) ((double) this.field4383[var11] * var3);
                field4399[var11] = (this.field4380[var11] << 14) / 100;
                field4402[var11] = (int) ((double) (this.field4385.field416 - this.field4385.field414) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4384[var11]) / var3);
                field4400[var11] = (int) ((double) this.field4385.field414 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4385.method210(arg0);
            int var40 = this.field4394.method210(arg0);
            if (this.field4387 != null) {
                int var41 = this.field4387.method210(arg0);
                int var42 = this.field4393.method210(arg0);
                var39 += this.method1715(var7, var42, this.field4387.field415) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4389 != null) {
                int var43 = this.field4389.method210(arg0);
                int var44 = this.field4392.method210(arg0);
                var40 = var40 * ((this.method1715(var10, var44, this.field4389.field415) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4380[var45] != 0) {
                    int var46 = field4401[var45] + var12;
                    if (var46 < arg0) {
                        field4381[var46] += this.method1715(field4404[var45], field4399[var45] * var40 >> 15, this.field4385.field415);
                        field4404[var45] += (field4402[var45] * var39 >> 16) + field4400[var45];
                    }
                }
            }
        }
        if (this.field4403 != null) {
            this.field4403.method207();
            this.field4391.method207();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4403.method210(arg0);
                int var18 = this.field4391.method210(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4403.field416 - this.field4403.field414) * var17 >> 8) + this.field4403.field414;
                } else {
                    var19 = ((this.field4403.field416 - this.field4403.field414) * var18 >> 8) + this.field4403.field414;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4381[var16] = 0;
                }
            }
        }
        if (this.field4390 > 0 && this.field4382 > 0) {
            int var20 = (int) ((double) this.field4390 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4381[var21] += field4381[var21 - var20] * this.field4382 / 100;
            }
        }
        if (this.field4397.field483[0] > 0 || this.field4397.field483[1] > 0) {
            this.field4396.method207();
            int var22 = this.field4396.method210(arg0 + 1);
            int var23 = this.field4397.method234(0, (float) var22 / 65536.0F);
            int var24 = this.field4397.method234(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4381[var23 + var25] * (long) class28.field486 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4381[var23 + var25 - var36 - 1] * (long) class28.field489[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4381[var25 - var37 - 1] * (long) class28.field489[1][var37] >> 16);
                    }
                    field4381[var25] = var35;
                    var22 = this.field4396.method210(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4381[var23 + var25] * (long) class28.field486 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4381[var23 + var25 - var33 - 1] * (long) class28.field489[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4381[var25 - var34 - 1] * (long) class28.field489[1][var34] >> 16);
                        }
                        field4381[var25] = var32;
                        var22 = this.field4396.method210(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4381[var23 + var25 - var29 - 1] * (long) class28.field489[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4381[var25 - var30 - 1] * (long) class28.field489[1][var30] >> 16);
                            }
                            field4381[var25] = var28;
                            this.field4396.method210(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4397.method234(0, (float) var22 / 65536.0F);
                    var24 = this.field4397.method234(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4381[var38] < -32768) {
                field4381[var38] = -32768;
            }
            if (field4381[var38] > 32767) {
                field4381[var38] = 32767;
            }
        }
        return field4381;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)I")
    private final int method1715(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4388[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4398[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4398[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4388 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4388[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4381 = new int[220500];
        field4399 = new int[5];
        field4404 = new int[5];
        field4402 = new int[5];
        field4401 = new int[5];
        field4400 = new int[5];
    }
}
