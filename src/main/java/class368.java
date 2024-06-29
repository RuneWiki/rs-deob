import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class368 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
    private int[] field5373 = new int[5];

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public int field5374 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public int field5371 = 500;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[I")
    private int[] field5370 = new int[5];

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    private int field5382 = 0;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    private int field5389 = 100;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "[I")
    private int[] field5380 = new int[5];

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[I")
    private static int[] field5379 = new int[32768];

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[I")
    private static int[] field5376;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
    private static int[] field5377;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "[I")
    private static int[] field5390;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "[I")
    private static int[] field5391;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[I")
    private static int[] field5392;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[I")
    private static int[] field5393;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "[I")
    private static int[] field5394;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lmq;")
    private class296 field5375;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ljh;")
    private class89 field5372;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Ljh;")
    private class89 field5378;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Ljh;")
    private class89 field5381;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Ljh;")
    private class89 field5383;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Ljh;")
    private class89 field5384;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Ljh;")
    private class89 field5385;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Ljh;")
    private class89 field5386;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Ljh;")
    private class89 field5387;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Ljh;")
    private class89 field5388;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5379[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5376 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5376[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5377 = new int[220500];
        field5390 = new int[5];
        field5391 = new int[5];
        field5392 = new int[5];
        field5393 = new int[5];
        field5394 = new int[5];
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 14)
    public static void method2321() {
        field5377 = null;
        field5379 = null;
        field5376 = null;
        field5394 = null;
        field5391 = null;
        field5393 = null;
        field5390 = null;
        field5392 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method2322(int arg0, int arg1) {
        class408.method2572(field5377, 0, arg0);
        if (arg1 < 10) {
            return field5377;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5384.method485();
        this.field5385.method485();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5388 != null) {
            this.field5388.method485();
            this.field5378.method485();
            var5 = (int) ((double) (this.field5388.field1000 - this.field5388.field997) * 32.768D / var3);
            var6 = (int) ((double) this.field5388.field997 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5383 != null) {
            this.field5383.method485();
            this.field5386.method485();
            var8 = (int) ((double) (this.field5383.field1000 - this.field5383.field997) * 32.768D / var3);
            var9 = (int) ((double) this.field5383.field997 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5380[var11] != 0) {
                field5394[var11] = 0;
                field5391[var11] = (int) ((double) this.field5370[var11] * var3);
                field5393[var11] = (this.field5380[var11] << 14) / 100;
                field5390[var11] = (int) ((double) (this.field5384.field1000 - this.field5384.field997) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5373[var11]) / var3);
                field5392[var11] = (int) ((double) this.field5384.field997 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5384.method483(arg0);
            int var40 = this.field5385.method483(arg0);
            if (this.field5388 != null) {
                int var41 = this.field5388.method483(arg0);
                int var42 = this.field5378.method483(arg0);
                var39 += this.method2323(var7, var42, this.field5388.field999) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5383 != null) {
                int var43 = this.field5383.method483(arg0);
                int var44 = this.field5386.method483(arg0);
                var40 = var40 * ((this.method2323(var10, var44, this.field5383.field999) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5380[var45] != 0) {
                    int var46 = field5391[var45] + var12;
                    if (var46 < arg0) {
                        field5377[var46] += this.method2323(field5394[var45], field5393[var45] * var40 >> 15, this.field5384.field999);
                        field5394[var45] += (field5390[var45] * var39 >> 16) + field5392[var45];
                    }
                }
            }
        }
        if (this.field5381 != null) {
            this.field5381.method485();
            this.field5387.method485();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5381.method483(arg0);
                int var18 = this.field5387.method483(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5381.field1000 - this.field5381.field997) * var17 >> 8) + this.field5381.field997;
                } else {
                    var19 = ((this.field5381.field1000 - this.field5381.field997) * var18 >> 8) + this.field5381.field997;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5377[var16] = 0;
                }
            }
        }
        if (this.field5382 > 0 && this.field5389 > 0) {
            int var20 = (int) ((double) this.field5382 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5377[var21] += field5377[var21 - var20] * this.field5389 / 100;
            }
        }
        if (this.field5375.field4224[0] > 0 || this.field5375.field4224[1] > 0) {
            this.field5372.method485();
            int var22 = this.field5372.method483(arg0 + 1);
            int var23 = this.field5375.method1874(0, (float) var22 / 65536.0F);
            int var24 = this.field5375.method1874(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5377[var23 + var25] * (long) class296.field4230 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5377[var23 + var25 - var36 - 1] * (long) class296.field4223[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5377[var25 - var37 - 1] * (long) class296.field4223[1][var37] >> 16);
                    }
                    field5377[var25] = var35;
                    var22 = this.field5372.method483(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5377[var23 + var25] * (long) class296.field4230 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5377[var23 + var25 - var33 - 1] * (long) class296.field4223[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5377[var25 - var34 - 1] * (long) class296.field4223[1][var34] >> 16);
                        }
                        field5377[var25] = var32;
                        var22 = this.field5372.method483(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5377[var23 + var25 - var29 - 1] * (long) class296.field4223[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5377[var25 - var30 - 1] * (long) class296.field4223[1][var30] >> 16);
                            }
                            field5377[var25] = var28;
                            this.field5372.method483(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5375.method1874(0, (float) var22 / 65536.0F);
                    var24 = this.field5375.method1874(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5377[var38] < -32768) {
                field5377[var38] = -32768;
            }
            if (field5377[var38] > 32767) {
                field5377[var38] = 32767;
            }
        }
        return field5377;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I", line = 333)
    private final int method2323(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5376[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5379[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lbk;)V", line = 400)
    public final void method2324(class211 arg0) {
        this.field5384 = new class89();
        this.field5384.method484(arg0);
        this.field5385 = new class89();
        this.field5385.method484(arg0);
        int var2 = arg0.method1342((byte) -128);
        if (var2 != 0) {
            arg0.field2888--;
            this.field5388 = new class89();
            this.field5388.method484(arg0);
            this.field5378 = new class89();
            this.field5378.method484(arg0);
        }
        int var3 = arg0.method1342((byte) -128);
        if (var3 != 0) {
            arg0.field2888--;
            this.field5383 = new class89();
            this.field5383.method484(arg0);
            this.field5386 = new class89();
            this.field5386.method484(arg0);
        }
        int var4 = arg0.method1342((byte) -127);
        if (var4 != 0) {
            arg0.field2888--;
            this.field5381 = new class89();
            this.field5381.method484(arg0);
            this.field5387 = new class89();
            this.field5387.method484(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1376(128);
            if (var6 == 0) {
                break;
            }
            this.field5380[var5] = var6;
            this.field5373[var5] = arg0.method1364(82);
            this.field5370[var5] = arg0.method1376(128);
        }
        this.field5382 = arg0.method1376(128);
        this.field5389 = arg0.method1376(128);
        this.field5371 = arg0.method1355(32136);
        this.field5374 = arg0.method1355(32136);
        this.field5375 = new class296();
        this.field5372 = new class89();
        this.field5375.method1872(arg0, this.field5372);
    }
}
