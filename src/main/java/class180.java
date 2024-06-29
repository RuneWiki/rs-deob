import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class180 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "[I")
    private int[] field2635 = new int[5];

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public int field2638 = 500;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "[I")
    private int[] field2641 = new int[5];

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public int field2646 = 0;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    private int field2651 = 100;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    private int field2645 = 0;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "[I")
    private int[] field2656 = new int[5];

    @OriginalMember(owner = "client!up", name = "d", descriptor = "[I")
    private static int[] field2637 = new int[32768];

    @OriginalMember(owner = "client!up", name = "k", descriptor = "[I")
    private static int[] field2644;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "[I")
    private static int[] field2649;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "[I")
    private static int[] field2652;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "[I")
    private static int[] field2653;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "[I")
    private static int[] field2654;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "[I")
    private static int[] field2655;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "[I")
    private static int[] field2658;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "Lpr;")
    private class311 field2657;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lbs;")
    private class482 field2634;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Lbs;")
    private class482 field2636;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lbs;")
    private class482 field2639;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lbs;")
    private class482 field2640;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "Lbs;")
    private class482 field2642;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "Lbs;")
    private class482 field2643;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Lbs;")
    private class482 field2647;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "Lbs;")
    private class482 field2648;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "Lbs;")
    private class482 field2650;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2637[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2644 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2644[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2649 = new int[220500];
        field2652 = new int[5];
        field2653 = new int[5];
        field2654 = new int[5];
        field2655 = new int[5];
        field2658 = new int[5];
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lsi;)V", line = 3)
    public final void method1155(class391 arg0) {
        this.field2648 = new class482();
        this.field2648.method2827(arg0);
        this.field2647 = new class482();
        this.field2647.method2827(arg0);
        int var2 = arg0.method2348(-2);
        if (var2 != 0) {
            arg0.field5719--;
            this.field2650 = new class482();
            this.field2650.method2827(arg0);
            this.field2643 = new class482();
            this.field2643.method2827(arg0);
        }
        int var3 = arg0.method2348(-2);
        if (var3 != 0) {
            arg0.field5719--;
            this.field2636 = new class482();
            this.field2636.method2827(arg0);
            this.field2634 = new class482();
            this.field2634.method2827(arg0);
        }
        int var4 = arg0.method2348(-2);
        if (var4 != 0) {
            arg0.field5719--;
            this.field2639 = new class482();
            this.field2639.method2827(arg0);
            this.field2642 = new class482();
            this.field2642.method2827(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2332(2);
            if (var6 == 0) {
                break;
            }
            this.field2641[var5] = var6;
            this.field2656[var5] = arg0.method2354((byte) -54);
            this.field2635[var5] = arg0.method2332(2);
        }
        this.field2645 = arg0.method2332(2);
        this.field2651 = arg0.method2332(2);
        this.field2638 = arg0.method2353((byte) 101);
        this.field2646 = arg0.method2353((byte) 110);
        this.field2657 = new class311();
        this.field2640 = new class482();
        this.field2657.method1801(arg0, this.field2640);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III)I", line = 84)
    private final int method1156(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2644[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2637[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I", line = 108)
    public final int[] method1157(int arg0, int arg1) {
        class91.method682(field2649, 0, arg0);
        if (arg1 < 10) {
            return field2649;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2648.method2830();
        this.field2647.method2830();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2650 != null) {
            this.field2650.method2830();
            this.field2643.method2830();
            var5 = (int) ((double) (this.field2650.field7035 - this.field2650.field7036) * 32.768D / var3);
            var6 = (int) ((double) this.field2650.field7036 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2636 != null) {
            this.field2636.method2830();
            this.field2634.method2830();
            var8 = (int) ((double) (this.field2636.field7035 - this.field2636.field7036) * 32.768D / var3);
            var9 = (int) ((double) this.field2636.field7036 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2641[var11] != 0) {
                field2654[var11] = 0;
                field2652[var11] = (int) ((double) this.field2635[var11] * var3);
                field2658[var11] = (this.field2641[var11] << 14) / 100;
                field2655[var11] = (int) ((double) (this.field2648.field7035 - this.field2648.field7036) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2656[var11]) / var3);
                field2653[var11] = (int) ((double) this.field2648.field7036 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2648.method2828(arg0);
            int var40 = this.field2647.method2828(arg0);
            if (this.field2650 != null) {
                int var41 = this.field2650.method2828(arg0);
                int var42 = this.field2643.method2828(arg0);
                var39 += this.method1156(var7, var42, this.field2650.field7032) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2636 != null) {
                int var43 = this.field2636.method2828(arg0);
                int var44 = this.field2634.method2828(arg0);
                var40 = var40 * ((this.method1156(var10, var44, this.field2636.field7032) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2641[var45] != 0) {
                    int var46 = field2652[var45] + var12;
                    if (var46 < arg0) {
                        field2649[var46] += this.method1156(field2654[var45], field2658[var45] * var40 >> 15, this.field2648.field7032);
                        field2654[var45] += (field2655[var45] * var39 >> 16) + field2653[var45];
                    }
                }
            }
        }
        if (this.field2639 != null) {
            this.field2639.method2830();
            this.field2642.method2830();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2639.method2828(arg0);
                int var18 = this.field2642.method2828(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2639.field7035 - this.field2639.field7036) * var17 >> 8) + this.field2639.field7036;
                } else {
                    var19 = ((this.field2639.field7035 - this.field2639.field7036) * var18 >> 8) + this.field2639.field7036;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2649[var16] = 0;
                }
            }
        }
        if (this.field2645 > 0 && this.field2651 > 0) {
            int var20 = (int) ((double) this.field2645 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2649[var21] += field2649[var21 - var20] * this.field2651 / 100;
            }
        }
        if (this.field2657.field4242[0] > 0 || this.field2657.field4242[1] > 0) {
            this.field2640.method2830();
            int var22 = this.field2640.method2828(arg0 + 1);
            int var23 = this.field2657.method1804(0, (float) var22 / 65536.0F);
            int var24 = this.field2657.method1804(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2649[var23 + var25] * (long) class311.field4241 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2649[var23 + var25 - var36 - 1] * (long) class311.field4238[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2649[var25 - var37 - 1] * (long) class311.field4238[1][var37] >> 16);
                    }
                    field2649[var25] = var35;
                    var22 = this.field2640.method2828(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2649[var23 + var25] * (long) class311.field4241 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2649[var23 + var25 - var33 - 1] * (long) class311.field4238[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2649[var25 - var34 - 1] * (long) class311.field4238[1][var34] >> 16);
                        }
                        field2649[var25] = var32;
                        var22 = this.field2640.method2828(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2649[var23 + var25 - var29 - 1] * (long) class311.field4238[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2649[var25 - var30 - 1] * (long) class311.field4238[1][var30] >> 16);
                            }
                            field2649[var25] = var28;
                            this.field2640.method2828(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2657.method1804(0, (float) var22 / 65536.0F);
                    var24 = this.field2657.method1804(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2649[var38] < -32768) {
                field2649[var38] = -32768;
            }
            if (field2649[var38] > 32767) {
                field2649[var38] = 32767;
            }
        }
        return field2649;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "()V", line = 400)
    public static void method1158() {
        field2649 = null;
        field2637 = null;
        field2644 = null;
        field2654 = null;
        field2652 = null;
        field2658 = null;
        field2655 = null;
        field2653 = null;
    }
}
