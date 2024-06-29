import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class645 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
    private int[] field9353 = new int[5];

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public int field9359 = 0;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "[I")
    private int[] field9361 = new int[5];

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public int field9354 = 500;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "[I")
    private int[] field9349 = new int[5];

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    private int field9365 = 0;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    private int field9367 = 100;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "[I")
    private static int[] field9366 = new int[32768];

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "[I")
    private static int[] field9351;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "[I")
    private static int[] field9356;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "[I")
    private static int[] field9368;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "[I")
    private static int[] field9369;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "[I")
    private static int[] field9371;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "[I")
    private static int[] field9373;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "[I")
    private static int[] field9372;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "Lraa;")
    private class624 field9352;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "Lraa;")
    private class624 field9355;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "Lraa;")
    private class624 field9357;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Lraa;")
    private class624 field9358;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "Lraa;")
    private class624 field9360;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "Lraa;")
    private class624 field9362;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "Lraa;")
    private class624 field9363;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "Lraa;")
    private class624 field9364;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "Lraa;")
    private class624 field9370;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "Log;")
    private class98 field9350;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)I")
    private final int method3727(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9351[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9366[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)[I")
    public final int[] method3728(int arg0, int arg1) {
        class473.method2878(field9356, 0, arg0);
        if (arg1 < 10) {
            return field9356;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9352.method3644();
        this.field9363.method3644();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9360 != null) {
            this.field9360.method3644();
            this.field9358.method3644();
            var5 = (int) ((double) (this.field9360.field9145 - this.field9360.field9147) * 32.768D / var3);
            var6 = (int) ((double) this.field9360.field9147 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9355 != null) {
            this.field9355.method3644();
            this.field9364.method3644();
            var8 = (int) ((double) (this.field9355.field9145 - this.field9355.field9147) * 32.768D / var3);
            var9 = (int) ((double) this.field9355.field9147 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field9349[var11] != 0) {
                field9369[var11] = 0;
                field9372[var11] = (int) ((double) this.field9353[var11] * var3);
                field9373[var11] = (this.field9349[var11] << 14) / 100;
                field9368[var11] = (int) ((double) (this.field9352.field9145 - this.field9352.field9147) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9361[var11]) / var3);
                field9371[var11] = (int) ((double) this.field9352.field9147 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9352.method3646(arg0);
            int var40 = this.field9363.method3646(arg0);
            if (this.field9360 != null) {
                int var41 = this.field9360.method3646(arg0);
                int var42 = this.field9358.method3646(arg0);
                var39 += this.method3727(var7, var42, this.field9360.field9144) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9355 != null) {
                int var43 = this.field9355.method3646(arg0);
                int var44 = this.field9364.method3646(arg0);
                var40 = var40 * ((this.method3727(var10, var44, this.field9355.field9144) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field9349[var45] != 0) {
                    int var46 = field9372[var45] + var12;
                    if (var46 < arg0) {
                        field9356[var46] += this.method3727(field9369[var45], field9373[var45] * var40 >> 15, this.field9352.field9144);
                        field9369[var45] += (field9368[var45] * var39 >> 16) + field9371[var45];
                    }
                }
            }
        }
        if (this.field9362 != null) {
            this.field9362.method3644();
            this.field9357.method3644();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9362.method3646(arg0);
                int var18 = this.field9357.method3646(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9362.field9145 - this.field9362.field9147) * var17 >> 8) + this.field9362.field9147;
                } else {
                    var19 = ((this.field9362.field9145 - this.field9362.field9147) * var18 >> 8) + this.field9362.field9147;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9356[var16] = 0;
                }
            }
        }
        if (this.field9365 > 0 && this.field9367 > 0) {
            int var20 = (int) ((double) this.field9365 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9356[var21] += field9356[var21 - var20] * this.field9367 / 100;
            }
        }
        if (this.field9350.field1219[0] > 0 || this.field9350.field1219[1] > 0) {
            this.field9370.method3644();
            int var22 = this.field9370.method3646(arg0 + 1);
            int var23 = this.field9350.method571(0, (float) var22 / 65536.0F);
            int var24 = this.field9350.method571(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9356[var23 + var25] * (long) class98.field1221 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9356[var23 + var25 - var36 - 1] * (long) class98.field1223[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9356[var25 - var37 - 1] * (long) class98.field1223[1][var37] >> 16);
                    }
                    field9356[var25] = var35;
                    var22 = this.field9370.method3646(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9356[var23 + var25] * (long) class98.field1221 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9356[var23 + var25 - var33 - 1] * (long) class98.field1223[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9356[var25 - var34 - 1] * (long) class98.field1223[1][var34] >> 16);
                        }
                        field9356[var25] = var32;
                        var22 = this.field9370.method3646(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9356[var23 + var25 - var29 - 1] * (long) class98.field1223[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9356[var25 - var30 - 1] * (long) class98.field1223[1][var30] >> 16);
                            }
                            field9356[var25] = var28;
                            this.field9370.method3646(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field9350.method571(0, (float) var22 / 65536.0F);
                    var24 = this.field9350.method571(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9356[var38] < -32768) {
                field9356[var38] = -32768;
            }
            if (field9356[var38] > 32767) {
                field9356[var38] = 32767;
            }
        }
        return field9356;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lps;)V")
    public final void method3729(class428 arg0) {
        this.field9352 = new class624();
        this.field9352.method3645(arg0);
        this.field9363 = new class624();
        this.field9363.method3645(arg0);
        int var2 = arg0.method2561((byte) -76);
        if (var2 != 0) {
            arg0.field6221--;
            this.field9360 = new class624();
            this.field9360.method3645(arg0);
            this.field9358 = new class624();
            this.field9358.method3645(arg0);
        }
        int var3 = arg0.method2561((byte) -126);
        if (var3 != 0) {
            arg0.field6221--;
            this.field9355 = new class624();
            this.field9355.method3645(arg0);
            this.field9364 = new class624();
            this.field9364.method3645(arg0);
        }
        int var4 = arg0.method2561((byte) 124);
        if (var4 != 0) {
            arg0.field6221--;
            this.field9362 = new class624();
            this.field9362.method3645(arg0);
            this.field9357 = new class624();
            this.field9357.method3645(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2573(-14319);
            if (var6 == 0) {
                break;
            }
            this.field9349[var5] = var6;
            this.field9361[var5] = arg0.method2594((byte) -21);
            this.field9353[var5] = arg0.method2573(-14319);
        }
        this.field9365 = arg0.method2573(-14319);
        this.field9367 = arg0.method2573(-14319);
        this.field9354 = arg0.method2620(70);
        this.field9359 = arg0.method2620(44);
        this.field9350 = new class98();
        this.field9370 = new class624();
        this.field9350.method573(arg0, this.field9370);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "()V")
    public static void method3730() {
        field9356 = null;
        field9366 = null;
        field9351 = null;
        field9369 = null;
        field9372 = null;
        field9373 = null;
        field9368 = null;
        field9371 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9366[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9351 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9351[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9356 = new int[220500];
        field9368 = new int[5];
        field9369 = new int[5];
        field9371 = new int[5];
        field9373 = new int[5];
        field9372 = new int[5];
    }
}
