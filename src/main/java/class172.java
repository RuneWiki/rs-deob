import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class172 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field2600 = 500;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "[I")
    private int[] field2608 = new int[5];

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public int field2611 = 0;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
    private int[] field2614 = new int[5];

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    private int field2613 = 100;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    private int[] field2607 = new int[5];

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    private int field2621 = 0;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "[I")
    private static int[] field2612 = new int[32768];

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    private static int[] field2605;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    private static int[] field2604;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[I")
    private static int[] field2615;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "[I")
    private static int[] field2618;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
    private static int[] field2616;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
    private static int[] field2619;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "[I")
    private static int[] field2622;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lcg;")
    private class168 field2598;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lcg;")
    private class168 field2599;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lcg;")
    private class168 field2601;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lcg;")
    private class168 field2602;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lcg;")
    private class168 field2603;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lcg;")
    private class168 field2609;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lcg;")
    private class168 field2610;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Lcg;")
    private class168 field2617;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lcg;")
    private class168 field2620;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lra;")
    private class238 field2606;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
    public static void method1060() {
        field2604 = null;
        field2612 = null;
        field2605 = null;
        field2616 = null;
        field2618 = null;
        field2622 = null;
        field2615 = null;
        field2619 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lfl;)V")
    public final void method1061(class248 arg0) {
        this.field2603 = new class168();
        this.field2603.method1049(arg0);
        this.field2599 = new class168();
        this.field2599.method1049(arg0);
        int var2 = arg0.method1593((byte) 27);
        if (var2 != 0) {
            arg0.field3748--;
            this.field2610 = new class168();
            this.field2610.method1049(arg0);
            this.field2617 = new class168();
            this.field2617.method1049(arg0);
        }
        int var3 = arg0.method1593((byte) 27);
        if (var3 != 0) {
            arg0.field3748--;
            this.field2609 = new class168();
            this.field2609.method1049(arg0);
            this.field2602 = new class168();
            this.field2602.method1049(arg0);
        }
        int var4 = arg0.method1593((byte) 27);
        if (var4 != 0) {
            arg0.field3748--;
            this.field2620 = new class168();
            this.field2620.method1049(arg0);
            this.field2598 = new class168();
            this.field2598.method1049(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1563((byte) 3);
            if (var6 == 0) {
                break;
            }
            this.field2608[var5] = var6;
            this.field2614[var5] = arg0.method1609(false);
            this.field2607[var5] = arg0.method1563((byte) 3);
        }
        this.field2621 = arg0.method1563((byte) 3);
        this.field2613 = arg0.method1563((byte) 3);
        this.field2600 = arg0.method1575(false);
        this.field2611 = arg0.method1575(false);
        this.field2606 = new class238();
        this.field2601 = new class168();
        this.field2606.method1508(arg0, this.field2601);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I")
    private final int method1062(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2605[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2612[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[I")
    public final int[] method1063(int arg0, int arg1) {
        class193.method1205(field2604, 0, arg0);
        if (arg1 < 10) {
            return field2604;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2603.method1047();
        this.field2599.method1047();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2610 != null) {
            this.field2610.method1047();
            this.field2617.method1047();
            var5 = (int) ((double) (this.field2610.field2572 - this.field2610.field2575) * 32.768D / var3);
            var6 = (int) ((double) this.field2610.field2575 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2609 != null) {
            this.field2609.method1047();
            this.field2602.method1047();
            var8 = (int) ((double) (this.field2609.field2572 - this.field2609.field2575) * 32.768D / var3);
            var9 = (int) ((double) this.field2609.field2575 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2608[var11] != 0) {
                field2616[var11] = 0;
                field2618[var11] = (int) ((double) this.field2607[var11] * var3);
                field2622[var11] = (this.field2608[var11] << 14) / 100;
                field2615[var11] = (int) ((double) (this.field2603.field2572 - this.field2603.field2575) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2614[var11]) / var3);
                field2619[var11] = (int) ((double) this.field2603.field2575 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2603.method1046(arg0);
            int var40 = this.field2599.method1046(arg0);
            if (this.field2610 != null) {
                int var41 = this.field2610.method1046(arg0);
                int var42 = this.field2617.method1046(arg0);
                var39 += this.method1062(var7, var42, this.field2610.field2573) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2609 != null) {
                int var43 = this.field2609.method1046(arg0);
                int var44 = this.field2602.method1046(arg0);
                var40 = var40 * ((this.method1062(var10, var44, this.field2609.field2573) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2608[var45] != 0) {
                    int var46 = field2618[var45] + var12;
                    if (var46 < arg0) {
                        field2604[var46] += this.method1062(field2616[var45], field2622[var45] * var40 >> 15, this.field2603.field2573);
                        field2616[var45] += (field2615[var45] * var39 >> 16) + field2619[var45];
                    }
                }
            }
        }
        if (this.field2620 != null) {
            this.field2620.method1047();
            this.field2598.method1047();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2620.method1046(arg0);
                int var18 = this.field2598.method1046(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2620.field2572 - this.field2620.field2575) * var17 >> 8) + this.field2620.field2575;
                } else {
                    var19 = ((this.field2620.field2572 - this.field2620.field2575) * var18 >> 8) + this.field2620.field2575;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2604[var16] = 0;
                }
            }
        }
        if (this.field2621 > 0 && this.field2613 > 0) {
            int var20 = (int) ((double) this.field2621 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2604[var21] += field2604[var21 - var20] * this.field2613 / 100;
            }
        }
        if (this.field2606.field3584[0] > 0 || this.field2606.field3584[1] > 0) {
            this.field2601.method1047();
            int var22 = this.field2601.method1046(arg0 + 1);
            int var23 = this.field2606.method1512(0, (float) var22 / 65536.0F);
            int var24 = this.field2606.method1512(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2604[var23 + var25] * (long) class238.field3589 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2604[var23 + var25 - var36 - 1] * (long) class238.field3585[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2604[var25 - var37 - 1] * (long) class238.field3585[1][var37] >> 16);
                    }
                    field2604[var25] = var35;
                    var22 = this.field2601.method1046(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2604[var23 + var25] * (long) class238.field3589 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2604[var23 + var25 - var33 - 1] * (long) class238.field3585[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2604[var25 - var34 - 1] * (long) class238.field3585[1][var34] >> 16);
                        }
                        field2604[var25] = var32;
                        var22 = this.field2601.method1046(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2604[var23 + var25 - var29 - 1] * (long) class238.field3585[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2604[var25 - var30 - 1] * (long) class238.field3585[1][var30] >> 16);
                            }
                            field2604[var25] = var28;
                            this.field2601.method1046(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2606.method1512(0, (float) var22 / 65536.0F);
                    var24 = this.field2606.method1512(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2604[var38] < -32768) {
                field2604[var38] = -32768;
            }
            if (field2604[var38] > 32767) {
                field2604[var38] = 32767;
            }
        }
        return field2604;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2612[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2605 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2605[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2604 = new int[220500];
        field2615 = new int[5];
        field2618 = new int[5];
        field2616 = new int[5];
        field2619 = new int[5];
        field2622 = new int[5];
    }
}
