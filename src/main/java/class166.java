import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class166 {

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    private int field2662 = 100;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "[I")
    private int[] field2667 = new int[5];

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "[I")
    private int[] field2661 = new int[5];

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "[I")
    private int[] field2671 = new int[5];

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public int field2669 = 500;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    private int field2672 = 0;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public int field2663 = 0;

    @OriginalMember(owner = "client!faa", name = "t", descriptor = "[I")
    private static int[] field2680 = new int[32768];

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "[I")
    private static int[] field2679;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "[I")
    private static int[] field2664;

    @OriginalMember(owner = "client!faa", name = "v", descriptor = "[I")
    private static int[] field2682;

    @OriginalMember(owner = "client!faa", name = "w", descriptor = "[I")
    private static int[] field2683;

    @OriginalMember(owner = "client!faa", name = "y", descriptor = "[I")
    private static int[] field2685;

    @OriginalMember(owner = "client!faa", name = "x", descriptor = "[I")
    private static int[] field2684;

    @OriginalMember(owner = "client!faa", name = "u", descriptor = "[I")
    private static int[] field2681;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "Lmt;")
    private class419 field2665;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "Lmt;")
    private class419 field2666;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "Lmt;")
    private class419 field2670;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "Lmt;")
    private class419 field2673;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "Lmt;")
    private class419 field2674;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "Lmt;")
    private class419 field2675;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "Lmt;")
    private class419 field2676;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "Lmt;")
    private class419 field2677;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "Lmt;")
    private class419 field2678;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "Los;")
    private class468 field2668;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2680[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2679 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2679[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2664 = new int[220500];
        field2682 = new int[5];
        field2683 = new int[5];
        field2685 = new int[5];
        field2684 = new int[5];
        field2681 = new int[5];
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)I", line = 5)
    private final int method1294(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2679[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2680[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lfca;)V", line = 30)
    public final void method1295(class93 arg0) {
        this.field2670 = new class419();
        this.field2670.method2465(arg0);
        this.field2674 = new class419();
        this.field2674.method2465(arg0);
        int var2 = arg0.method793((byte) 76);
        if (var2 != 0) {
            arg0.field1442--;
            this.field2675 = new class419();
            this.field2675.method2465(arg0);
            this.field2678 = new class419();
            this.field2678.method2465(arg0);
        }
        int var3 = arg0.method793((byte) 54);
        if (var3 != 0) {
            arg0.field1442--;
            this.field2673 = new class419();
            this.field2673.method2465(arg0);
            this.field2666 = new class419();
            this.field2666.method2465(arg0);
        }
        int var4 = arg0.method793((byte) 18);
        if (var4 != 0) {
            arg0.field1442--;
            this.field2677 = new class419();
            this.field2677.method2465(arg0);
            this.field2665 = new class419();
            this.field2665.method2465(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method746(false);
            if (var6 == 0) {
                break;
            }
            this.field2661[var5] = var6;
            this.field2671[var5] = arg0.method742((byte) -13);
            this.field2667[var5] = arg0.method746(false);
        }
        this.field2672 = arg0.method746(false);
        this.field2662 = arg0.method746(false);
        this.field2669 = arg0.method763(-119);
        this.field2663 = arg0.method763(-18);
        this.field2668 = new class468();
        this.field2676 = new class419();
        this.field2668.method2689(arg0, this.field2676);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)[I", line = 92)
    public final int[] method1296(int arg0, int arg1) {
        class275.method1774(field2664, 0, arg0);
        if (arg1 < 10) {
            return field2664;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2670.method2466();
        this.field2674.method2466();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2675 != null) {
            this.field2675.method2466();
            this.field2678.method2466();
            var5 = (int) ((double) (this.field2675.field5714 - this.field2675.field5713) * 32.768D / var3);
            var6 = (int) ((double) this.field2675.field5713 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2673 != null) {
            this.field2673.method2466();
            this.field2666.method2466();
            var8 = (int) ((double) (this.field2673.field5714 - this.field2673.field5713) * 32.768D / var3);
            var9 = (int) ((double) this.field2673.field5713 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2661[var11] != 0) {
                field2682[var11] = 0;
                field2681[var11] = (int) ((double) this.field2667[var11] * var3);
                field2684[var11] = (this.field2661[var11] << 14) / 100;
                field2685[var11] = (int) ((double) (this.field2670.field5714 - this.field2670.field5713) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2671[var11]) / var3);
                field2683[var11] = (int) ((double) this.field2670.field5713 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2670.method2463(arg0);
            int var40 = this.field2674.method2463(arg0);
            if (this.field2675 != null) {
                int var41 = this.field2675.method2463(arg0);
                int var42 = this.field2678.method2463(arg0);
                var39 += this.method1294(var7, var42, this.field2675.field5715) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2673 != null) {
                int var43 = this.field2673.method2463(arg0);
                int var44 = this.field2666.method2463(arg0);
                var40 = var40 * ((this.method1294(var10, var44, this.field2673.field5715) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2661[var45] != 0) {
                    int var46 = field2681[var45] + var12;
                    if (var46 < arg0) {
                        field2664[var46] += this.method1294(field2682[var45], field2684[var45] * var40 >> 15, this.field2670.field5715);
                        field2682[var45] += (field2685[var45] * var39 >> 16) + field2683[var45];
                    }
                }
            }
        }
        if (this.field2677 != null) {
            this.field2677.method2466();
            this.field2665.method2466();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2677.method2463(arg0);
                int var18 = this.field2665.method2463(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2677.field5714 - this.field2677.field5713) * var17 >> 8) + this.field2677.field5713;
                } else {
                    var19 = ((this.field2677.field5714 - this.field2677.field5713) * var18 >> 8) + this.field2677.field5713;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2664[var16] = 0;
                }
            }
        }
        if (this.field2672 > 0 && this.field2662 > 0) {
            int var20 = (int) ((double) this.field2672 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2664[var21] += field2664[var21 - var20] * this.field2662 / 100;
            }
        }
        if (this.field2668.field6331[0] > 0 || this.field2668.field6331[1] > 0) {
            this.field2676.method2466();
            int var22 = this.field2676.method2463(arg0 + 1);
            int var23 = this.field2668.method2694(0, (float) var22 / 65536.0F);
            int var24 = this.field2668.method2694(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2664[var23 + var25] * (long) class468.field6334 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2664[var23 + var25 - var36 - 1] * (long) class468.field6335[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2664[var25 - var37 - 1] * (long) class468.field6335[1][var37] >> 16);
                    }
                    field2664[var25] = var35;
                    var22 = this.field2676.method2463(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2664[var23 + var25] * (long) class468.field6334 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2664[var23 + var25 - var33 - 1] * (long) class468.field6335[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2664[var25 - var34 - 1] * (long) class468.field6335[1][var34] >> 16);
                        }
                        field2664[var25] = var32;
                        var22 = this.field2676.method2463(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2664[var23 + var25 - var29 - 1] * (long) class468.field6335[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2664[var25 - var30 - 1] * (long) class468.field6335[1][var30] >> 16);
                            }
                            field2664[var25] = var28;
                            this.field2676.method2463(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2668.method2694(0, (float) var22 / 65536.0F);
                    var24 = this.field2668.method2694(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2664[var38] < -32768) {
                field2664[var38] = -32768;
            }
            if (field2664[var38] > 32767) {
                field2664[var38] = 32767;
            }
        }
        return field2664;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "()V", line = 388)
    public static void method1297() {
        field2664 = null;
        field2680 = null;
        field2679 = null;
        field2682 = null;
        field2681 = null;
        field2684 = null;
        field2685 = null;
        field2683 = null;
    }
}
