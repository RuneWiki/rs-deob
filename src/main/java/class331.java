import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class331 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public int field5410 = 0;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    private int field5415 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public int field5413 = 500;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[I")
    private int[] field5416 = new int[5];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    private int field5420 = 100;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    private int[] field5417 = new int[5];

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[I")
    private int[] field5412 = new int[5];

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[I")
    private static int[] field5414 = new int[32768];

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "[I")
    private static int[] field5404;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
    private static int[] field5405;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    private static int[] field5426;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
    private static int[] field5427;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
    private static int[] field5424;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    private static int[] field5428;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[I")
    private static int[] field5423;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Lmb;")
    private class273 field5406;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Lmb;")
    private class273 field5407;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lmb;")
    private class273 field5408;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Lmb;")
    private class273 field5411;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lmb;")
    private class273 field5418;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Lmb;")
    private class273 field5419;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lmb;")
    private class273 field5421;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lmb;")
    private class273 field5422;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lmb;")
    private class273 field5425;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lcr;")
    private class600 field5409;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5414[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5404 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5404[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5405 = new int[220500];
        field5426 = new int[5];
        field5427 = new int[5];
        field5424 = new int[5];
        field5428 = new int[5];
        field5423 = new int[5];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method2801(int arg0, int arg1) {
        class405.method3260(field5405, 0, arg0);
        if (arg1 < 10) {
            return field5405;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5422.method2347();
        this.field5411.method2347();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5419 != null) {
            this.field5419.method2347();
            this.field5406.method2347();
            var5 = (int) ((double) (this.field5419.field4384 - this.field5419.field4382) * 32.768D / var3);
            var6 = (int) ((double) this.field5419.field4382 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5408 != null) {
            this.field5408.method2347();
            this.field5425.method2347();
            var8 = (int) ((double) (this.field5408.field4384 - this.field5408.field4382) * 32.768D / var3);
            var9 = (int) ((double) this.field5408.field4382 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5416[var11] != 0) {
                field5427[var11] = 0;
                field5424[var11] = (int) ((double) this.field5412[var11] * var3);
                field5423[var11] = (this.field5416[var11] << 14) / 100;
                field5428[var11] = (int) ((double) (this.field5422.field4384 - this.field5422.field4382) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5417[var11]) / var3);
                field5426[var11] = (int) ((double) this.field5422.field4382 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5422.method2350(arg0);
            int var40 = this.field5411.method2350(arg0);
            if (this.field5419 != null) {
                int var41 = this.field5419.method2350(arg0);
                int var42 = this.field5406.method2350(arg0);
                var39 += this.method2803(var7, var42, this.field5419.field4385) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5408 != null) {
                int var43 = this.field5408.method2350(arg0);
                int var44 = this.field5425.method2350(arg0);
                var40 = var40 * ((this.method2803(var10, var44, this.field5408.field4385) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5416[var45] != 0) {
                    int var46 = field5424[var45] + var12;
                    if (var46 < arg0) {
                        field5405[var46] += this.method2803(field5427[var45], field5423[var45] * var40 >> 15, this.field5422.field4385);
                        field5427[var45] += (field5428[var45] * var39 >> 16) + field5426[var45];
                    }
                }
            }
        }
        if (this.field5418 != null) {
            this.field5418.method2347();
            this.field5421.method2347();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5418.method2350(arg0);
                int var18 = this.field5421.method2350(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5418.field4384 - this.field5418.field4382) * var17 >> 8) + this.field5418.field4382;
                } else {
                    var19 = ((this.field5418.field4384 - this.field5418.field4382) * var18 >> 8) + this.field5418.field4382;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5405[var16] = 0;
                }
            }
        }
        if (this.field5415 > 0 && this.field5420 > 0) {
            int var20 = (int) ((double) this.field5415 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5405[var21] += field5405[var21 - var20] * this.field5420 / 100;
            }
        }
        if (this.field5409.field8693[0] > 0 || this.field5409.field8693[1] > 0) {
            this.field5407.method2347();
            int var22 = this.field5407.method2350(arg0 + 1);
            int var23 = this.field5409.method4403(0, (float) var22 / 65536.0F);
            int var24 = this.field5409.method4403(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5405[var23 + var25] * (long) class600.field8695 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5405[var23 + var25 - var36 - 1] * (long) class600.field8689[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5405[var25 - var37 - 1] * (long) class600.field8689[1][var37] >> 16);
                    }
                    field5405[var25] = var35;
                    var22 = this.field5407.method2350(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5405[var23 + var25] * (long) class600.field8695 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5405[var23 + var25 - var33 - 1] * (long) class600.field8689[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5405[var25 - var34 - 1] * (long) class600.field8689[1][var34] >> 16);
                        }
                        field5405[var25] = var32;
                        var22 = this.field5407.method2350(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5405[var23 + var25 - var29 - 1] * (long) class600.field8689[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5405[var25 - var30 - 1] * (long) class600.field8689[1][var30] >> 16);
                            }
                            field5405[var25] = var28;
                            this.field5407.method2350(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5409.method4403(0, (float) var22 / 65536.0F);
                    var24 = this.field5409.method4403(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5405[var38] < -32768) {
                field5405[var38] = -32768;
            }
            if (field5405[var38] > 32767) {
                field5405[var38] = 32767;
            }
        }
        return field5405;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lwq;)V", line = 291)
    public final void method2802(class176 arg0) {
        this.field5422 = new class273();
        this.field5422.method2348(arg0);
        this.field5411 = new class273();
        this.field5411.method2348(arg0);
        int var2 = arg0.method1645((byte) -89);
        if (var2 != 0) {
            arg0.field2799--;
            this.field5419 = new class273();
            this.field5419.method2348(arg0);
            this.field5406 = new class273();
            this.field5406.method2348(arg0);
        }
        int var3 = arg0.method1645((byte) -88);
        if (var3 != 0) {
            arg0.field2799--;
            this.field5408 = new class273();
            this.field5408.method2348(arg0);
            this.field5425 = new class273();
            this.field5425.method2348(arg0);
        }
        int var4 = arg0.method1645((byte) -104);
        if (var4 != 0) {
            arg0.field2799--;
            this.field5418 = new class273();
            this.field5418.method2348(arg0);
            this.field5421 = new class273();
            this.field5421.method2348(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1660(false);
            if (var6 == 0) {
                break;
            }
            this.field5416[var5] = var6;
            this.field5417[var5] = arg0.method1627(true);
            this.field5412[var5] = arg0.method1660(false);
        }
        this.field5415 = arg0.method1660(false);
        this.field5420 = arg0.method1660(false);
        this.field5413 = arg0.method1687((byte) -49);
        this.field5410 = arg0.method1687((byte) -52);
        this.field5409 = new class600();
        this.field5407 = new class273();
        this.field5409.method4399(arg0, this.field5407);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)I", line = 378)
    private final int method2803(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5404[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5414[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V", line = 433)
    public static void method2804() {
        field5405 = null;
        field5414 = null;
        field5404 = null;
        field5427 = null;
        field5424 = null;
        field5423 = null;
        field5428 = null;
        field5426 = null;
    }
}
