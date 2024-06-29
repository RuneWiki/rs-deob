import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class210 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[I")
    private int[] field3264 = new int[5];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
    private int[] field3265 = new int[5];

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public int field3275 = 0;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    private int field3269 = 100;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    private int field3274 = 0;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public int field3278 = 500;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "[I")
    private int[] field3284 = new int[5];

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "[I")
    private static int[] field3280 = new int[32768];

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
    private static int[] field3267;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[I")
    private static int[] field3279;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "[I")
    private static int[] field3283;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[I")
    private static int[] field3286;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "[I")
    private static int[] field3288;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "[I")
    private static int[] field3285;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "[I")
    private static int[] field3287;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Ldd;")
    private class133 field3266;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Ldd;")
    private class133 field3270;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Ldd;")
    private class133 field3271;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Ldd;")
    private class133 field3272;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ldd;")
    private class133 field3273;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Ldd;")
    private class133 field3276;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Ldd;")
    private class133 field3277;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Ldd;")
    private class133 field3281;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Ldd;")
    private class133 field3282;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lig;")
    private class9 field3268;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
    public static void method1415() {
        field3279 = null;
        field3280 = null;
        field3267 = null;
        field3287 = null;
        field3288 = null;
        field3286 = null;
        field3283 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I")
    private final int method1416(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3267[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3280[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I")
    public final int[] method1417(int arg0, int arg1) {
        class196.method1359(field3279, 0, arg0);
        if (arg1 < 10) {
            return field3279;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3266.method906();
        this.field3271.method906();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3273 != null) {
            this.field3273.method906();
            this.field3270.method906();
            var5 = (int) ((double) (this.field3273.field1936 - this.field3273.field1939) * 32.768D / var3);
            var6 = (int) ((double) this.field3273.field1939 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3277 != null) {
            this.field3277.method906();
            this.field3281.method906();
            var8 = (int) ((double) (this.field3277.field1936 - this.field3277.field1939) * 32.768D / var3);
            var9 = (int) ((double) this.field3277.field1939 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3264[var11] != 0) {
                field3287[var11] = 0;
                field3288[var11] = (int) ((double) this.field3284[var11] * var3);
                field3286[var11] = (this.field3264[var11] << 14) / 100;
                field3283[var11] = (int) ((double) (this.field3266.field1936 - this.field3266.field1939) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3265[var11]) / var3);
                field3285[var11] = (int) ((double) this.field3266.field1939 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3266.method904(arg0);
            int var40 = this.field3271.method904(arg0);
            if (this.field3273 != null) {
                int var41 = this.field3273.method904(arg0);
                int var42 = this.field3270.method904(arg0);
                var39 += this.method1416(var7, var42, this.field3273.field1940) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3277 != null) {
                int var43 = this.field3277.method904(arg0);
                int var44 = this.field3281.method904(arg0);
                var40 = var40 * ((this.method1416(var10, var44, this.field3277.field1940) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3264[var45] != 0) {
                    int var46 = field3288[var45] + var12;
                    if (var46 < arg0) {
                        field3279[var46] += this.method1416(field3287[var45], field3286[var45] * var40 >> 15, this.field3266.field1940);
                        field3287[var45] += (field3283[var45] * var39 >> 16) + field3285[var45];
                    }
                }
            }
        }
        if (this.field3276 != null) {
            this.field3276.method906();
            this.field3272.method906();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3276.method904(arg0);
                int var18 = this.field3272.method904(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3276.field1936 - this.field3276.field1939) * var17 >> 8) + this.field3276.field1939;
                } else {
                    var19 = ((this.field3276.field1936 - this.field3276.field1939) * var18 >> 8) + this.field3276.field1939;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3279[var16] = 0;
                }
            }
        }
        if (this.field3274 > 0 && this.field3269 > 0) {
            int var20 = (int) ((double) this.field3274 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3279[var21] += field3279[var21 - var20] * this.field3269 / 100;
            }
        }
        if (this.field3268.field134[0] > 0 || this.field3268.field134[1] > 0) {
            this.field3282.method906();
            int var22 = this.field3282.method904(arg0 + 1);
            int var23 = this.field3268.method59(0, (float) var22 / 65536.0F);
            int var24 = this.field3268.method59(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3279[var23 + var25] * (long) class9.field133 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3279[var23 + var25 - var36 - 1] * (long) class9.field128[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3279[var25 - var37 - 1] * (long) class9.field128[1][var37] >> 16);
                    }
                    field3279[var25] = var35;
                    var22 = this.field3282.method904(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3279[var23 + var25] * (long) class9.field133 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3279[var23 + var25 - var33 - 1] * (long) class9.field128[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3279[var25 - var34 - 1] * (long) class9.field128[1][var34] >> 16);
                        }
                        field3279[var25] = var32;
                        var22 = this.field3282.method904(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3279[var23 + var25 - var29 - 1] * (long) class9.field128[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3279[var25 - var30 - 1] * (long) class9.field128[1][var30] >> 16);
                            }
                            field3279[var25] = var28;
                            this.field3282.method904(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3268.method59(0, (float) var22 / 65536.0F);
                    var24 = this.field3268.method59(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3279[var38] < -32768) {
                field3279[var38] = -32768;
            }
            if (field3279[var38] > 32767) {
                field3279[var38] = 32767;
            }
        }
        return field3279;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Llj;)V")
    public final void method1418(class25 arg0) {
        this.field3266 = new class133();
        this.field3266.method907(arg0);
        this.field3271 = new class133();
        this.field3271.method907(arg0);
        int var2 = arg0.method201(255);
        if (var2 != 0) {
            arg0.field349--;
            this.field3273 = new class133();
            this.field3273.method907(arg0);
            this.field3270 = new class133();
            this.field3270.method907(arg0);
        }
        int var3 = arg0.method201(255);
        if (var3 != 0) {
            arg0.field349--;
            this.field3277 = new class133();
            this.field3277.method907(arg0);
            this.field3281 = new class133();
            this.field3281.method907(arg0);
        }
        int var4 = arg0.method201(255);
        if (var4 != 0) {
            arg0.field349--;
            this.field3276 = new class133();
            this.field3276.method907(arg0);
            this.field3272 = new class133();
            this.field3272.method907(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method192((byte) -20);
            if (var6 == 0) {
                break;
            }
            this.field3264[var5] = var6;
            this.field3265[var5] = arg0.method168(-110);
            this.field3284[var5] = arg0.method192((byte) -20);
        }
        this.field3274 = arg0.method192((byte) -20);
        this.field3269 = arg0.method192((byte) -20);
        this.field3278 = arg0.method190(-3);
        this.field3275 = arg0.method190(-3);
        this.field3268 = new class9();
        this.field3282 = new class133();
        this.field3268.method56(arg0, this.field3282);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3280[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3267 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3267[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3279 = new int[220500];
        field3283 = new int[5];
        field3286 = new int[5];
        field3288 = new int[5];
        field3285 = new int[5];
        field3287 = new int[5];
    }
}
