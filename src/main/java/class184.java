import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class184 {

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
    private int[] field2612 = new int[5];

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "[I")
    private int[] field2620 = new int[5];

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public int field2629 = 500;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public int field2624 = 0;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "[I")
    private int[] field2632 = new int[5];

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    private int field2615 = 0;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    private int field2625 = 100;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
    private static int[] field2611 = new int[32768];

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "[I")
    private static int[] field2622;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "[I")
    private static int[] field2626;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "[I")
    private static int[] field2628;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "[I")
    private static int[] field2630;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "[I")
    private static int[] field2633;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "[I")
    private static int[] field2634;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "[I")
    private static int[] field2635;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "Lrq;")
    private class195 field2617;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Ldl;")
    private class39 field2613;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Ldl;")
    private class39 field2614;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Ldl;")
    private class39 field2616;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Ldl;")
    private class39 field2618;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Ldl;")
    private class39 field2619;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "Ldl;")
    private class39 field2621;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "Ldl;")
    private class39 field2623;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Ldl;")
    private class39 field2627;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Ldl;")
    private class39 field2631;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2611[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2622 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2622[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2626 = new int[220500];
        field2628 = new int[5];
        field2630 = new int[5];
        field2633 = new int[5];
        field2634 = new int[5];
        field2635 = new int[5];
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Llf;)V", line = 3)
    public final void method1321(class130 arg0) {
        this.field2618 = new class39();
        this.field2618.method255(arg0);
        this.field2631 = new class39();
        this.field2631.method255(arg0);
        int var2 = arg0.method837(true);
        if (var2 != 0) {
            arg0.field1880--;
            this.field2623 = new class39();
            this.field2623.method255(arg0);
            this.field2627 = new class39();
            this.field2627.method255(arg0);
        }
        int var3 = arg0.method837(true);
        if (var3 != 0) {
            arg0.field1880--;
            this.field2613 = new class39();
            this.field2613.method255(arg0);
            this.field2616 = new class39();
            this.field2616.method255(arg0);
        }
        int var4 = arg0.method837(true);
        if (var4 != 0) {
            arg0.field1880--;
            this.field2614 = new class39();
            this.field2614.method255(arg0);
            this.field2619 = new class39();
            this.field2619.method255(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method854(3944);
            if (var6 == 0) {
                break;
            }
            this.field2620[var5] = var6;
            this.field2632[var5] = arg0.method803(57);
            this.field2612[var5] = arg0.method854(3944);
        }
        this.field2615 = arg0.method854(3944);
        this.field2625 = arg0.method854(3944);
        this.field2629 = arg0.method798(false);
        this.field2624 = arg0.method798(false);
        this.field2617 = new class195();
        this.field2621 = new class39();
        this.field2617.method1390(arg0, this.field2621);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I", line = 116)
    public final int[] method1322(int arg0, int arg1) {
        class271.method1858(field2626, 0, arg0);
        if (arg1 < 10) {
            return field2626;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2618.method257();
        this.field2631.method257();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2623 != null) {
            this.field2623.method257();
            this.field2627.method257();
            var5 = (int) ((double) (this.field2623.field527 - this.field2623.field529) * 32.768D / var3);
            var6 = (int) ((double) this.field2623.field529 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2613 != null) {
            this.field2613.method257();
            this.field2616.method257();
            var8 = (int) ((double) (this.field2613.field527 - this.field2613.field529) * 32.768D / var3);
            var9 = (int) ((double) this.field2613.field529 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2620[var11] != 0) {
                field2633[var11] = 0;
                field2634[var11] = (int) ((double) this.field2612[var11] * var3);
                field2628[var11] = (this.field2620[var11] << 14) / 100;
                field2635[var11] = (int) ((double) (this.field2618.field527 - this.field2618.field529) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2632[var11]) / var3);
                field2630[var11] = (int) ((double) this.field2618.field529 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2618.method254(arg0);
            int var40 = this.field2631.method254(arg0);
            if (this.field2623 != null) {
                int var41 = this.field2623.method254(arg0);
                int var42 = this.field2627.method254(arg0);
                var39 += this.method1323(var7, var42, this.field2623.field526) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2613 != null) {
                int var43 = this.field2613.method254(arg0);
                int var44 = this.field2616.method254(arg0);
                var40 = var40 * ((this.method1323(var10, var44, this.field2613.field526) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2620[var45] != 0) {
                    int var46 = field2634[var45] + var12;
                    if (var46 < arg0) {
                        field2626[var46] += this.method1323(field2633[var45], field2628[var45] * var40 >> 15, this.field2618.field526);
                        field2633[var45] += (field2635[var45] * var39 >> 16) + field2630[var45];
                    }
                }
            }
        }
        if (this.field2614 != null) {
            this.field2614.method257();
            this.field2619.method257();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2614.method254(arg0);
                int var18 = this.field2619.method254(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2614.field527 - this.field2614.field529) * var17 >> 8) + this.field2614.field529;
                } else {
                    var19 = ((this.field2614.field527 - this.field2614.field529) * var18 >> 8) + this.field2614.field529;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2626[var16] = 0;
                }
            }
        }
        if (this.field2615 > 0 && this.field2625 > 0) {
            int var20 = (int) ((double) this.field2615 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2626[var21] += field2626[var21 - var20] * this.field2625 / 100;
            }
        }
        if (this.field2617.field2808[0] > 0 || this.field2617.field2808[1] > 0) {
            this.field2621.method257();
            int var22 = this.field2621.method254(arg0 + 1);
            int var23 = this.field2617.method1391(0, (float) var22 / 65536.0F);
            int var24 = this.field2617.method1391(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2626[var23 + var25] * (long) class195.field2803 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2626[var23 + var25 - var36 - 1] * (long) class195.field2809[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2626[var25 - var37 - 1] * (long) class195.field2809[1][var37] >> 16);
                    }
                    field2626[var25] = var35;
                    var22 = this.field2621.method254(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2626[var23 + var25] * (long) class195.field2803 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2626[var23 + var25 - var33 - 1] * (long) class195.field2809[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2626[var25 - var34 - 1] * (long) class195.field2809[1][var34] >> 16);
                        }
                        field2626[var25] = var32;
                        var22 = this.field2621.method254(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2626[var23 + var25 - var29 - 1] * (long) class195.field2809[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2626[var25 - var30 - 1] * (long) class195.field2809[1][var30] >> 16);
                            }
                            field2626[var25] = var28;
                            this.field2621.method254(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2617.method1391(0, (float) var22 / 65536.0F);
                    var24 = this.field2617.method1391(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2626[var38] < -32768) {
                field2626[var38] = -32768;
            }
            if (field2626[var38] > 32767) {
                field2626[var38] = 32767;
            }
        }
        return field2626;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)I", line = 418)
    private final int method1323(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2622[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2611[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "()V", line = 456)
    public static void method1324() {
        field2626 = null;
        field2611 = null;
        field2622 = null;
        field2633 = null;
        field2634 = null;
        field2628 = null;
        field2635 = null;
        field2630 = null;
    }
}
