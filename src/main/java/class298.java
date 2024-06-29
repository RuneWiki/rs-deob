import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class298 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
    private int[] field4363 = new int[5];

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    private int field4364 = 0;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field4366 = 0;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "[I")
    private int[] field4373 = new int[5];

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "[I")
    private int[] field4377 = new int[5];

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public int field4379 = 500;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    private int field4372 = 100;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
    private static int[] field4365 = new int[32768];

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "[I")
    private static int[] field4376;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
    private static int[] field4361;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "[I")
    private static int[] field4382;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "[I")
    private static int[] field4380;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "[I")
    private static int[] field4383;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "[I")
    private static int[] field4381;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "[I")
    private static int[] field4384;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lur;")
    private class381 field4369;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ljk;")
    private class456 field4360;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Ljk;")
    private class456 field4362;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljk;")
    private class456 field4367;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Ljk;")
    private class456 field4368;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Ljk;")
    private class456 field4370;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Ljk;")
    private class456 field4371;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Ljk;")
    private class456 field4374;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Ljk;")
    private class456 field4375;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Ljk;")
    private class456 field4378;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4365[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4376 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4376[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4361 = new int[220500];
        field4382 = new int[5];
        field4380 = new int[5];
        field4383 = new int[5];
        field4381 = new int[5];
        field4384 = new int[5];
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V", line = 5)
    public static void method1827() {
        field4361 = null;
        field4365 = null;
        field4376 = null;
        field4383 = null;
        field4384 = null;
        field4380 = null;
        field4382 = null;
        field4381 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lwm;)V", line = 17)
    public final void method1828(class403 arg0) {
        this.field4378 = new class456();
        this.field4378.method2672(arg0);
        this.field4374 = new class456();
        this.field4374.method2672(arg0);
        int var2 = arg0.method2357((byte) 127);
        if (var2 != 0) {
            arg0.field5665--;
            this.field4367 = new class456();
            this.field4367.method2672(arg0);
            this.field4360 = new class456();
            this.field4360.method2672(arg0);
        }
        int var3 = arg0.method2357((byte) 117);
        if (var3 != 0) {
            arg0.field5665--;
            this.field4362 = new class456();
            this.field4362.method2672(arg0);
            this.field4370 = new class456();
            this.field4370.method2672(arg0);
        }
        int var4 = arg0.method2357((byte) 117);
        if (var4 != 0) {
            arg0.field5665--;
            this.field4368 = new class456();
            this.field4368.method2672(arg0);
            this.field4375 = new class456();
            this.field4375.method2672(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2325(true);
            if (var6 == 0) {
                break;
            }
            this.field4363[var5] = var6;
            this.field4373[var5] = arg0.method2360(116);
            this.field4377[var5] = arg0.method2325(true);
        }
        this.field4364 = arg0.method2325(true);
        this.field4372 = arg0.method2325(true);
        this.field4379 = arg0.method2338(0);
        this.field4366 = arg0.method2338(0);
        this.field4369 = new class381();
        this.field4371 = new class456();
        this.field4369.method2217(arg0, this.field4371);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I", line = 103)
    private final int method1829(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4376[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4365[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I", line = 128)
    public final int[] method1830(int arg0, int arg1) {
        class182.method1136(field4361, 0, arg0);
        if (arg1 < 10) {
            return field4361;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4378.method2670();
        this.field4374.method2670();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4367 != null) {
            this.field4367.method2670();
            this.field4360.method2670();
            var5 = (int) ((double) (this.field4367.field6395 - this.field4367.field6397) * 32.768D / var3);
            var6 = (int) ((double) this.field4367.field6397 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4362 != null) {
            this.field4362.method2670();
            this.field4370.method2670();
            var8 = (int) ((double) (this.field4362.field6395 - this.field4362.field6397) * 32.768D / var3);
            var9 = (int) ((double) this.field4362.field6397 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4363[var11] != 0) {
                field4383[var11] = 0;
                field4384[var11] = (int) ((double) this.field4377[var11] * var3);
                field4380[var11] = (this.field4363[var11] << 14) / 100;
                field4382[var11] = (int) ((double) (this.field4378.field6395 - this.field4378.field6397) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4373[var11]) / var3);
                field4381[var11] = (int) ((double) this.field4378.field6397 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4378.method2669(arg0);
            int var40 = this.field4374.method2669(arg0);
            if (this.field4367 != null) {
                int var41 = this.field4367.method2669(arg0);
                int var42 = this.field4360.method2669(arg0);
                var39 += this.method1829(var7, var42, this.field4367.field6396) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4362 != null) {
                int var43 = this.field4362.method2669(arg0);
                int var44 = this.field4370.method2669(arg0);
                var40 = var40 * ((this.method1829(var10, var44, this.field4362.field6396) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4363[var45] != 0) {
                    int var46 = field4384[var45] + var12;
                    if (var46 < arg0) {
                        field4361[var46] += this.method1829(field4383[var45], field4380[var45] * var40 >> 15, this.field4378.field6396);
                        field4383[var45] += (field4382[var45] * var39 >> 16) + field4381[var45];
                    }
                }
            }
        }
        if (this.field4368 != null) {
            this.field4368.method2670();
            this.field4375.method2670();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4368.method2669(arg0);
                int var18 = this.field4375.method2669(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4368.field6395 - this.field4368.field6397) * var17 >> 8) + this.field4368.field6397;
                } else {
                    var19 = ((this.field4368.field6395 - this.field4368.field6397) * var18 >> 8) + this.field4368.field6397;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4361[var16] = 0;
                }
            }
        }
        if (this.field4364 > 0 && this.field4372 > 0) {
            int var20 = (int) ((double) this.field4364 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4361[var21] += field4361[var21 - var20] * this.field4372 / 100;
            }
        }
        if (this.field4369.field5372[0] > 0 || this.field4369.field5372[1] > 0) {
            this.field4371.method2670();
            int var22 = this.field4371.method2669(arg0 + 1);
            int var23 = this.field4369.method2214(0, (float) var22 / 65536.0F);
            int var24 = this.field4369.method2214(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4361[var23 + var25] * (long) class381.field5373 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4361[var23 + var25 - var36 - 1] * (long) class381.field5371[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4361[var25 - var37 - 1] * (long) class381.field5371[1][var37] >> 16);
                    }
                    field4361[var25] = var35;
                    var22 = this.field4371.method2669(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4361[var23 + var25] * (long) class381.field5373 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4361[var23 + var25 - var33 - 1] * (long) class381.field5371[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4361[var25 - var34 - 1] * (long) class381.field5371[1][var34] >> 16);
                        }
                        field4361[var25] = var32;
                        var22 = this.field4371.method2669(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4361[var23 + var25 - var29 - 1] * (long) class381.field5371[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4361[var25 - var30 - 1] * (long) class381.field5371[1][var30] >> 16);
                            }
                            field4361[var25] = var28;
                            this.field4371.method2669(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4369.method2214(0, (float) var22 / 65536.0F);
                    var24 = this.field4369.method2214(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4361[var38] < -32768) {
                field4361[var38] = -32768;
            }
            if (field4361[var38] > 32767) {
                field4361[var38] = 32767;
            }
        }
        return field4361;
    }
}
