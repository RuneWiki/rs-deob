import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[I")
    private int[] field2646 = new int[5];

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public int field2655 = 0;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
    private int[] field2658 = new int[5];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field2652 = 500;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    private int field2649 = 0;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[I")
    private int[] field2661 = new int[5];

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    private int field2669 = 100;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    private static int[] field2648 = new int[32768];

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[I")
    private static int[] field2659;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "[I")
    private static int[] field2663;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "[I")
    private static int[] field2664;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[I")
    private static int[] field2666;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[I")
    private static int[] field2667;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[I")
    private static int[] field2668;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
    private static int[] field2665;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lic;")
    private class59 field2645;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lne;")
    private class95 field2647;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lne;")
    private class95 field2650;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lne;")
    private class95 field2651;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lne;")
    private class95 field2653;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lne;")
    private class95 field2654;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lne;")
    private class95 field2656;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lne;")
    private class95 field2657;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lne;")
    private class95 field2660;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lne;")
    private class95 field2662;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2648[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2659 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2659[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2663 = new int[220500];
        field2664 = new int[5];
        field2666 = new int[5];
        field2667 = new int[5];
        field2668 = new int[5];
        field2665 = new int[5];
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I", line = 12)
    public final int[] method939(int arg0, int arg1) {
        class41.method496(field2663, 0, arg0);
        if (arg1 < 10) {
            return field2663;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2662.method800();
        this.field2651.method800();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2660 != null) {
            this.field2660.method800();
            this.field2657.method800();
            var5 = (int) ((double) (this.field2660.field2212 - this.field2660.field2209) * 32.768D / var3);
            var6 = (int) ((double) this.field2660.field2209 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2650 != null) {
            this.field2650.method800();
            this.field2654.method800();
            var8 = (int) ((double) (this.field2650.field2212 - this.field2650.field2209) * 32.768D / var3);
            var9 = (int) ((double) this.field2650.field2209 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2661[var11] != 0) {
                field2666[var11] = 0;
                field2667[var11] = (int) ((double) this.field2658[var11] * var3);
                field2664[var11] = (this.field2661[var11] << 14) / 100;
                field2668[var11] = (int) ((double) (this.field2662.field2212 - this.field2662.field2209) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2646[var11]) / var3);
                field2665[var11] = (int) ((double) this.field2662.field2209 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2662.method801(arg0);
            int var40 = this.field2651.method801(arg0);
            if (this.field2660 != null) {
                int var41 = this.field2660.method801(arg0);
                int var42 = this.field2657.method801(arg0);
                var39 += this.method940(var7, var42, this.field2660.field2214) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2650 != null) {
                int var43 = this.field2650.method801(arg0);
                int var44 = this.field2654.method801(arg0);
                var40 = var40 * ((this.method940(var10, var44, this.field2650.field2214) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2661[var45] != 0) {
                    int var46 = field2667[var45] + var12;
                    if (var46 < arg0) {
                        field2663[var46] += this.method940(field2666[var45], field2664[var45] * var40 >> 15, this.field2662.field2214);
                        field2666[var45] += (field2668[var45] * var39 >> 16) + field2665[var45];
                    }
                }
            }
        }
        if (this.field2653 != null) {
            this.field2653.method800();
            this.field2656.method800();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2653.method801(arg0);
                int var18 = this.field2656.method801(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2653.field2212 - this.field2653.field2209) * var17 >> 8) + this.field2653.field2209;
                } else {
                    var19 = ((this.field2653.field2212 - this.field2653.field2209) * var18 >> 8) + this.field2653.field2209;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2663[var16] = 0;
                }
            }
        }
        if (this.field2649 > 0 && this.field2669 > 0) {
            int var20 = (int) ((double) this.field2649 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2663[var21] += field2663[var21 - var20] * this.field2669 / 100;
            }
        }
        if (this.field2645.field1449[0] > 0 || this.field2645.field1449[1] > 0) {
            this.field2647.method800();
            int var22 = this.field2647.method801(arg0 + 1);
            int var23 = this.field2645.method591(0, (float) var22 / 65536.0F);
            int var24 = this.field2645.method591(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2663[var23 + var25] * (long) class59.field1454 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2663[var23 + var25 - var36 - 1] * (long) class59.field1453[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2663[var25 - var37 - 1] * (long) class59.field1453[1][var37] >> 16);
                    }
                    field2663[var25] = var35;
                    var22 = this.field2647.method801(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2663[var23 + var25] * (long) class59.field1454 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2663[var23 + var25 - var33 - 1] * (long) class59.field1453[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2663[var25 - var34 - 1] * (long) class59.field1453[1][var34] >> 16);
                        }
                        field2663[var25] = var32;
                        var22 = this.field2647.method801(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2663[var23 + var25 - var29 - 1] * (long) class59.field1453[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2663[var25 - var30 - 1] * (long) class59.field1453[1][var30] >> 16);
                            }
                            field2663[var25] = var28;
                            this.field2647.method801(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2645.method591(0, (float) var22 / 65536.0F);
                    var24 = this.field2645.method591(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2663[var38] < -32768) {
                field2663[var38] = -32768;
            }
            if (field2663[var38] > 32767) {
                field2663[var38] = 32767;
            }
        }
        return field2663;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)I", line = 293)
    private final int method940(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2659[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2648[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V", line = 337)
    public static void method941() {
        field2663 = null;
        field2648 = null;
        field2659 = null;
        field2666 = null;
        field2667 = null;
        field2664 = null;
        field2668 = null;
        field2665 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ldc;)V", line = 355)
    public final void method942(class25 arg0) {
        this.field2662 = new class95();
        this.field2662.method799(arg0);
        this.field2651 = new class95();
        this.field2651.method799(arg0);
        int var2 = arg0.method322((byte) -50);
        if (var2 != 0) {
            arg0.field710--;
            this.field2660 = new class95();
            this.field2660.method799(arg0);
            this.field2657 = new class95();
            this.field2657.method799(arg0);
        }
        int var3 = arg0.method322((byte) -50);
        if (var3 != 0) {
            arg0.field710--;
            this.field2650 = new class95();
            this.field2650.method799(arg0);
            this.field2654 = new class95();
            this.field2654.method799(arg0);
        }
        int var4 = arg0.method322((byte) -50);
        if (var4 != 0) {
            arg0.field710--;
            this.field2653 = new class95();
            this.field2653.method799(arg0);
            this.field2656 = new class95();
            this.field2656.method799(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method324(false);
            if (var6 == 0) {
                break;
            }
            this.field2661[var5] = var6;
            this.field2646[var5] = arg0.method286((byte) -101);
            this.field2658[var5] = arg0.method324(false);
        }
        this.field2649 = arg0.method324(false);
        this.field2669 = arg0.method324(false);
        this.field2652 = arg0.method301(-4853);
        this.field2655 = arg0.method301(-4853);
        this.field2645 = new class59();
        this.field2647 = new class95();
        this.field2645.method589(arg0, this.field2647);
    }
}
