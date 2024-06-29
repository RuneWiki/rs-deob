import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class258 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
    private int[] field4462 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
    private int[] field4459 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public int field4468 = 500;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "[I")
    private int[] field4474 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public int field4466 = 0;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    private int field4465 = 100;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    private int field4477 = 0;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
    private static int[] field4464 = new int[32768];

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[I")
    private static int[] field4473;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[I")
    private static int[] field4460;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "[I")
    private static int[] field4478;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[I")
    private static int[] field4480;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "[I")
    private static int[] field4481;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "[I")
    private static int[] field4482;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "[I")
    private static int[] field4479;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Leh;")
    private class147 field4458;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Leh;")
    private class147 field4461;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Leh;")
    private class147 field4463;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Leh;")
    private class147 field4467;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Leh;")
    private class147 field4469;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Leh;")
    private class147 field4471;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Leh;")
    private class147 field4472;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Leh;")
    private class147 field4475;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Leh;")
    private class147 field4476;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Lbh;")
    private class18 field4470;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lra;)V", line = 8)
    public final void method1815(class41 arg0) {
        this.field4458 = new class147();
        this.field4458.method1073(arg0);
        this.field4461 = new class147();
        this.field4461.method1073(arg0);
        int var2 = arg0.method357(false);
        if (var2 != 0) {
            arg0.field738--;
            this.field4469 = new class147();
            this.field4469.method1073(arg0);
            this.field4472 = new class147();
            this.field4472.method1073(arg0);
        }
        int var3 = arg0.method357(false);
        if (var3 != 0) {
            arg0.field738--;
            this.field4467 = new class147();
            this.field4467.method1073(arg0);
            this.field4475 = new class147();
            this.field4475.method1073(arg0);
        }
        int var4 = arg0.method357(false);
        if (var4 != 0) {
            arg0.field738--;
            this.field4463 = new class147();
            this.field4463.method1073(arg0);
            this.field4476 = new class147();
            this.field4476.method1073(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method354((byte) -124);
            if (var6 == 0) {
                break;
            }
            this.field4459[var5] = var6;
            this.field4474[var5] = arg0.method364(-49152);
            this.field4462[var5] = arg0.method354((byte) 20);
        }
        this.field4477 = arg0.method354((byte) 51);
        this.field4465 = arg0.method354((byte) 49);
        this.field4468 = arg0.method346(-16);
        this.field4466 = arg0.method346(-16);
        this.field4470 = new class18();
        this.field4471 = new class147();
        this.field4470.method115(arg0, this.field4471);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I", line = 69)
    private final int method1816(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4473[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4464[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 91)
    public static void method1817() {
        field4460 = null;
        field4464 = null;
        field4473 = null;
        field4478 = null;
        field4480 = null;
        field4482 = null;
        field4481 = null;
        field4479 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I", line = 103)
    public final int[] method1818(int arg0, int arg1) {
        class299.method2089(field4460, 0, arg0);
        if (arg1 < 10) {
            return field4460;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4458.method1075();
        this.field4461.method1075();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4469 != null) {
            this.field4469.method1075();
            this.field4472.method1075();
            var5 = (int) ((double) (this.field4469.field2581 - this.field4469.field2579) * 32.768D / var3);
            var6 = (int) ((double) this.field4469.field2579 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4467 != null) {
            this.field4467.method1075();
            this.field4475.method1075();
            var8 = (int) ((double) (this.field4467.field2581 - this.field4467.field2579) * 32.768D / var3);
            var9 = (int) ((double) this.field4467.field2579 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4459[var11] != 0) {
                field4478[var11] = 0;
                field4480[var11] = (int) ((double) this.field4462[var11] * var3);
                field4482[var11] = (this.field4459[var11] << 14) / 100;
                field4481[var11] = (int) ((double) (this.field4458.field2581 - this.field4458.field2579) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4474[var11]) / var3);
                field4479[var11] = (int) ((double) this.field4458.field2579 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4458.method1072(arg0);
            int var14 = this.field4461.method1072(arg0);
            if (this.field4469 != null) {
                int var15 = this.field4469.method1072(arg0);
                int var16 = this.field4472.method1072(arg0);
                var13 += this.method1816(var7, var16, this.field4469.field2584) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4467 != null) {
                int var17 = this.field4467.method1072(arg0);
                int var18 = this.field4475.method1072(arg0);
                var14 = var14 * ((this.method1816(var10, var18, this.field4467.field2584) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4459[var19] != 0) {
                    int var20 = field4480[var19] + var12;
                    if (var20 < arg0) {
                        field4460[var20] += this.method1816(field4478[var19], field4482[var19] * var14 >> 15, this.field4458.field2584);
                        field4478[var19] += (field4481[var19] * var13 >> 16) + field4479[var19];
                    }
                }
            }
        }
        if (this.field4463 != null) {
            this.field4463.method1075();
            this.field4476.method1075();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4463.method1072(arg0);
                int var26 = this.field4476.method1072(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4463.field2581 - this.field4463.field2579) * var25 >> 8) + this.field4463.field2579;
                } else {
                    var27 = ((this.field4463.field2581 - this.field4463.field2579) * var26 >> 8) + this.field4463.field2579;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4460[var24] = 0;
                }
            }
        }
        if (this.field4477 > 0 && this.field4465 > 0) {
            int var28 = (int) ((double) this.field4477 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4460[var29] += field4460[var29 - var28] * this.field4465 / 100;
            }
        }
        if (this.field4470.field246[0] > 0 || this.field4470.field246[1] > 0) {
            this.field4471.method1075();
            int var30 = this.field4471.method1072(arg0 + 1);
            int var31 = this.field4470.method113(0, (float) var30 / 65536.0F);
            int var32 = this.field4470.method113(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4460[var31 + var33] * (long) class18.field253 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4460[var31 + var33 - var36 - 1] * (long) class18.field252[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4460[var33 - var37 - 1] * (long) class18.field252[1][var37] >> 16);
                    }
                    field4460[var33] = var35;
                    var30 = this.field4471.method1072(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4460[var31 + var33] * (long) class18.field253 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4460[var31 + var33 - var40 - 1] * (long) class18.field252[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4460[var33 - var41 - 1] * (long) class18.field252[1][var41] >> 16);
                        }
                        field4460[var33] = var39;
                        var30 = this.field4471.method1072(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4460[var31 + var33 - var43 - 1] * (long) class18.field252[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4460[var33 - var44 - 1] * (long) class18.field252[1][var44] >> 16);
                            }
                            field4460[var33] = var42;
                            this.field4471.method1072(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4470.method113(0, (float) var30 / 65536.0F);
                    var32 = this.field4470.method113(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4460[var46] < -32768) {
                field4460[var46] = -32768;
            }
            if (field4460[var46] > 32767) {
                field4460[var46] = 32767;
            }
        }
        return field4460;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4464[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4473 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4473[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4460 = new int[220500];
        field4478 = new int[5];
        field4480 = new int[5];
        field4481 = new int[5];
        field4482 = new int[5];
        field4479 = new int[5];
    }
}
