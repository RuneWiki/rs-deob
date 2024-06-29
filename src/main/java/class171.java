import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class171 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public int field3417 = 500;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    private int field3411 = 100;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
    private int[] field3418 = new int[5];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
    private int[] field3416 = new int[5];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    private int[] field3414 = new int[5];

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    private int field3424 = 0;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public int field3430 = 0;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[I")
    private static int[] field3421 = new int[32768];

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[I")
    private static int[] field3419;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[I")
    private static int[] field3426;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "[I")
    private static int[] field3431;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "[I")
    private static int[] field3427;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "[I")
    private static int[] field3429;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[I")
    private static int[] field3433;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
    private static int[] field3434;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lrc;")
    private class164 field3422;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lie;")
    private class85 field3410;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lie;")
    private class85 field3412;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lie;")
    private class85 field3413;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lie;")
    private class85 field3415;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lie;")
    private class85 field3420;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lie;")
    private class85 field3423;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lie;")
    private class85 field3425;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lie;")
    private class85 field3428;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Lie;")
    private class85 field3432;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public static void method1113() {
        field3426 = null;
        field3421 = null;
        field3419 = null;
        field3427 = null;
        field3431 = null;
        field3434 = null;
        field3429 = null;
        field3433 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lce;)V")
    public final void method1114(class26 arg0) {
        this.field3412 = new class85();
        this.field3412.method634(arg0);
        this.field3423 = new class85();
        this.field3423.method634(arg0);
        int var2 = arg0.method221(-77);
        if (var2 != 0) {
            arg0.field527--;
            this.field3415 = new class85();
            this.field3415.method634(arg0);
            this.field3432 = new class85();
            this.field3432.method634(arg0);
        }
        int var3 = arg0.method221(-127);
        if (var3 != 0) {
            arg0.field527--;
            this.field3425 = new class85();
            this.field3425.method634(arg0);
            this.field3410 = new class85();
            this.field3410.method634(arg0);
        }
        int var4 = arg0.method221(-112);
        if (var4 != 0) {
            arg0.field527--;
            this.field3413 = new class85();
            this.field3413.method634(arg0);
            this.field3420 = new class85();
            this.field3420.method634(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method259((byte) -88);
            if (var6 == 0) {
                break;
            }
            this.field3414[var5] = var6;
            this.field3416[var5] = arg0.method222(86);
            this.field3418[var5] = arg0.method259((byte) -58);
        }
        this.field3424 = arg0.method259((byte) -60);
        this.field3411 = arg0.method259((byte) -121);
        this.field3417 = arg0.method256((byte) -78);
        this.field3430 = arg0.method256((byte) -78);
        this.field3422 = new class164();
        this.field3428 = new class85();
        this.field3422.method1088(arg0, this.field3428);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    private final int method1115(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3419[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3421[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
    public final int[] method1116(int arg0, int arg1) {
        class156.method1049(field3426, 0, arg0);
        if (arg1 < 10) {
            return field3426;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3412.method635();
        this.field3423.method635();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3415 != null) {
            this.field3415.method635();
            this.field3432.method635();
            var5 = (int) ((double) (this.field3415.field1939 - this.field3415.field1944) * 32.768D / var3);
            var6 = (int) ((double) this.field3415.field1944 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3425 != null) {
            this.field3425.method635();
            this.field3410.method635();
            var8 = (int) ((double) (this.field3425.field1939 - this.field3425.field1944) * 32.768D / var3);
            var9 = (int) ((double) this.field3425.field1944 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3414[var11] != 0) {
                field3427[var11] = 0;
                field3431[var11] = (int) ((double) this.field3418[var11] * var3);
                field3434[var11] = (this.field3414[var11] << 14) / 100;
                field3429[var11] = (int) ((double) (this.field3412.field1939 - this.field3412.field1944) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3416[var11]) / var3);
                field3433[var11] = (int) ((double) this.field3412.field1944 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3412.method633(arg0);
            int var40 = this.field3423.method633(arg0);
            if (this.field3415 != null) {
                int var41 = this.field3415.method633(arg0);
                int var42 = this.field3432.method633(arg0);
                var39 += this.method1115(var7, var42, this.field3415.field1941) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3425 != null) {
                int var43 = this.field3425.method633(arg0);
                int var44 = this.field3410.method633(arg0);
                var40 = var40 * ((this.method1115(var10, var44, this.field3425.field1941) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3414[var45] != 0) {
                    int var46 = field3431[var45] + var12;
                    if (var46 < arg0) {
                        field3426[var46] += this.method1115(field3427[var45], field3434[var45] * var40 >> 15, this.field3412.field1941);
                        field3427[var45] += (field3429[var45] * var39 >> 16) + field3433[var45];
                    }
                }
            }
        }
        if (this.field3413 != null) {
            this.field3413.method635();
            this.field3420.method635();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3413.method633(arg0);
                int var18 = this.field3420.method633(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3413.field1939 - this.field3413.field1944) * var17 >> 8) + this.field3413.field1944;
                } else {
                    var19 = ((this.field3413.field1939 - this.field3413.field1944) * var18 >> 8) + this.field3413.field1944;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3426[var16] = 0;
                }
            }
        }
        if (this.field3424 > 0 && this.field3411 > 0) {
            int var20 = (int) ((double) this.field3424 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3426[var21] += field3426[var21 - var20] * this.field3411 / 100;
            }
        }
        if (this.field3422.field3318[0] > 0 || this.field3422.field3318[1] > 0) {
            this.field3428.method635();
            int var22 = this.field3428.method633(arg0 + 1);
            int var23 = this.field3422.method1084(0, (float) var22 / 65536.0F);
            int var24 = this.field3422.method1084(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3426[var23 + var25] * (long) class164.field3316 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3426[var23 + var25 - var36 - 1] * (long) class164.field3320[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3426[var25 - var37 - 1] * (long) class164.field3320[1][var37] >> 16);
                    }
                    field3426[var25] = var35;
                    var22 = this.field3428.method633(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3426[var23 + var25] * (long) class164.field3316 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3426[var23 + var25 - var33 - 1] * (long) class164.field3320[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3426[var25 - var34 - 1] * (long) class164.field3320[1][var34] >> 16);
                        }
                        field3426[var25] = var32;
                        var22 = this.field3428.method633(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3426[var23 + var25 - var29 - 1] * (long) class164.field3320[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3426[var25 - var30 - 1] * (long) class164.field3320[1][var30] >> 16);
                            }
                            field3426[var25] = var28;
                            this.field3428.method633(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3422.method1084(0, (float) var22 / 65536.0F);
                    var24 = this.field3422.method1084(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3426[var38] < -32768) {
                field3426[var38] = -32768;
            }
            if (field3426[var38] > 32767) {
                field3426[var38] = 32767;
            }
        }
        return field3426;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3421[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3419 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3419[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3426 = new int[220500];
        field3431 = new int[5];
        field3427 = new int[5];
        field3429 = new int[5];
        field3433 = new int[5];
        field3434 = new int[5];
    }
}
