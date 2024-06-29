import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class19 {

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "[I")
    private int[] field350 = new int[5];

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public int field347 = 500;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    private int field351 = 0;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "[I")
    private int[] field352 = new int[5];

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    private int field348 = 100;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public int field349 = 0;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "[I")
    private int[] field341 = new int[5];

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    private static int[] field339 = new int[32768];

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    private static int[] field338;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "[I")
    private static int[] field346;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "[I")
    private static int[] field357;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "[I")
    private static int[] field356;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "[I")
    private static int[] field355;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "[I")
    private static int[] field358;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "[I")
    private static int[] field359;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lof;")
    private class289 field335;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lof;")
    private class289 field336;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lof;")
    private class289 field337;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Lof;")
    private class289 field340;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Lof;")
    private class289 field342;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Lof;")
    private class289 field343;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Lof;")
    private class289 field344;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Lof;")
    private class289 field345;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "Lof;")
    private class289 field354;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "Lkh;")
    private class47 field353;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)I")
    private final int method149(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field338[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field339[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lfj;)V")
    public final void method150(class274 arg0) {
        this.field343 = new class289();
        this.field343.method1992(arg0);
        this.field345 = new class289();
        this.field345.method1992(arg0);
        int var2 = arg0.method1849(255);
        if (var2 != 0) {
            arg0.field4458--;
            this.field336 = new class289();
            this.field336.method1992(arg0);
            this.field335 = new class289();
            this.field335.method1992(arg0);
        }
        int var3 = arg0.method1849(255);
        if (var3 != 0) {
            arg0.field4458--;
            this.field337 = new class289();
            this.field337.method1992(arg0);
            this.field354 = new class289();
            this.field354.method1992(arg0);
        }
        int var4 = arg0.method1849(255);
        if (var4 != 0) {
            arg0.field4458--;
            this.field340 = new class289();
            this.field340.method1992(arg0);
            this.field344 = new class289();
            this.field344.method1992(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1863((byte) -111);
            if (var6 == 0) {
                break;
            }
            this.field352[var5] = var6;
            this.field341[var5] = arg0.method1816(-48);
            this.field350[var5] = arg0.method1863((byte) -118);
        }
        this.field351 = arg0.method1863((byte) 71);
        this.field348 = arg0.method1863((byte) 76);
        this.field347 = arg0.method1837(252);
        this.field349 = arg0.method1837(252);
        this.field353 = new class47();
        this.field342 = new class289();
        this.field353.method312(arg0, this.field342);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
    public static void method151() {
        field346 = null;
        field339 = null;
        field338 = null;
        field358 = null;
        field357 = null;
        field356 = null;
        field355 = null;
        field359 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I")
    public final int[] method152(int arg0, int arg1) {
        class282.method1922(field346, 0, arg0);
        if (arg1 < 10) {
            return field346;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field343.method1993();
        this.field345.method1993();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field336 != null) {
            this.field336.method1993();
            this.field335.method1993();
            var5 = (int) ((double) (this.field336.field4724 - this.field336.field4727) * 32.768D / var3);
            var6 = (int) ((double) this.field336.field4727 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field337 != null) {
            this.field337.method1993();
            this.field354.method1993();
            var8 = (int) ((double) (this.field337.field4724 - this.field337.field4727) * 32.768D / var3);
            var9 = (int) ((double) this.field337.field4727 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field352[var11] != 0) {
                field358[var11] = 0;
                field357[var11] = (int) ((double) this.field350[var11] * var3);
                field356[var11] = (this.field352[var11] << 14) / 100;
                field355[var11] = (int) ((double) (this.field343.field4724 - this.field343.field4727) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field341[var11]) / var3);
                field359[var11] = (int) ((double) this.field343.field4727 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field343.method1994(arg0);
            int var40 = this.field345.method1994(arg0);
            if (this.field336 != null) {
                int var41 = this.field336.method1994(arg0);
                int var42 = this.field335.method1994(arg0);
                var39 += this.method149(var7, var42, this.field336.field4729) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field337 != null) {
                int var43 = this.field337.method1994(arg0);
                int var44 = this.field354.method1994(arg0);
                var40 = var40 * ((this.method149(var10, var44, this.field337.field4729) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field352[var45] != 0) {
                    int var46 = field357[var45] + var12;
                    if (var46 < arg0) {
                        field346[var46] += this.method149(field358[var45], field356[var45] * var40 >> 15, this.field343.field4729);
                        field358[var45] += (field355[var45] * var39 >> 16) + field359[var45];
                    }
                }
            }
        }
        if (this.field340 != null) {
            this.field340.method1993();
            this.field344.method1993();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field340.method1994(arg0);
                int var18 = this.field344.method1994(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field340.field4724 - this.field340.field4727) * var17 >> 8) + this.field340.field4727;
                } else {
                    var19 = ((this.field340.field4724 - this.field340.field4727) * var18 >> 8) + this.field340.field4727;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field346[var16] = 0;
                }
            }
        }
        if (this.field351 > 0 && this.field348 > 0) {
            int var20 = (int) ((double) this.field351 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field346[var21] += field346[var21 - var20] * this.field348 / 100;
            }
        }
        if (this.field353.field700[0] > 0 || this.field353.field700[1] > 0) {
            this.field342.method1993();
            int var22 = this.field342.method1994(arg0 + 1);
            int var23 = this.field353.method307(0, (float) var22 / 65536.0F);
            int var24 = this.field353.method307(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field346[var23 + var25] * (long) class47.field694 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field346[var23 + var25 - var36 - 1] * (long) class47.field695[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field346[var25 - var37 - 1] * (long) class47.field695[1][var37] >> 16);
                    }
                    field346[var25] = var35;
                    var22 = this.field342.method1994(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field346[var23 + var25] * (long) class47.field694 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field346[var23 + var25 - var33 - 1] * (long) class47.field695[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field346[var25 - var34 - 1] * (long) class47.field695[1][var34] >> 16);
                        }
                        field346[var25] = var32;
                        var22 = this.field342.method1994(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field346[var23 + var25 - var29 - 1] * (long) class47.field695[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field346[var25 - var30 - 1] * (long) class47.field695[1][var30] >> 16);
                            }
                            field346[var25] = var28;
                            this.field342.method1994(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field353.method307(0, (float) var22 / 65536.0F);
                    var24 = this.field353.method307(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field346[var38] < -32768) {
                field346[var38] = -32768;
            }
            if (field346[var38] > 32767) {
                field346[var38] = 32767;
            }
        }
        return field346;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field339[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field338 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field338[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field346 = new int[220500];
        field357 = new int[5];
        field356 = new int[5];
        field355 = new int[5];
        field358 = new int[5];
        field359 = new int[5];
    }
}
