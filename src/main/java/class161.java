import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class161 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
    private int[] field2771 = new int[5];

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    private int field2776 = 100;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
    private int[] field2778 = new int[5];

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field2783 = 0;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[I")
    private int[] field2786 = new int[5];

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public int field2787 = 500;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    private int field2788 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[I")
    private static int[] field2777 = new int[32768];

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    private static int[] field2773;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
    private static int[] field2775;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "[I")
    private static int[] field2791;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "[I")
    private static int[] field2793;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[I")
    private static int[] field2790;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[I")
    private static int[] field2789;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "[I")
    private static int[] field2792;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lmg;")
    private class138 field2784;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lwb;")
    private class232 field2769;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lwb;")
    private class232 field2770;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lwb;")
    private class232 field2772;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lwb;")
    private class232 field2774;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lwb;")
    private class232 field2779;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lwb;")
    private class232 field2780;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lwb;")
    private class232 field2781;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lwb;")
    private class232 field2782;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lwb;")
    private class232 field2785;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)I")
    private final int method1040(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2773[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2777[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public static void method1041() {
        field2775 = null;
        field2777 = null;
        field2773 = null;
        field2791 = null;
        field2789 = null;
        field2793 = null;
        field2790 = null;
        field2792 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I")
    public final int[] method1042(int arg0, int arg1) {
        class18.method145(field2775, 0, arg0);
        if (arg1 < 10) {
            return field2775;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2785.method1516();
        this.field2772.method1516();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2774 != null) {
            this.field2774.method1516();
            this.field2779.method1516();
            var5 = (int) ((double) (this.field2774.field4337 - this.field2774.field4335) * 32.768D / var3);
            var6 = (int) ((double) this.field2774.field4335 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2769 != null) {
            this.field2769.method1516();
            this.field2770.method1516();
            var8 = (int) ((double) (this.field2769.field4337 - this.field2769.field4335) * 32.768D / var3);
            var9 = (int) ((double) this.field2769.field4335 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2771[var11] != 0) {
                field2791[var11] = 0;
                field2789[var11] = (int) ((double) this.field2786[var11] * var3);
                field2793[var11] = (this.field2771[var11] << 14) / 100;
                field2790[var11] = (int) ((double) (this.field2785.field4337 - this.field2785.field4335) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2778[var11]) / var3);
                field2792[var11] = (int) ((double) this.field2785.field4335 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2785.method1515(arg0);
            int var40 = this.field2772.method1515(arg0);
            if (this.field2774 != null) {
                int var41 = this.field2774.method1515(arg0);
                int var42 = this.field2779.method1515(arg0);
                var39 += this.method1040(var7, var42, this.field2774.field4336) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2769 != null) {
                int var43 = this.field2769.method1515(arg0);
                int var44 = this.field2770.method1515(arg0);
                var40 = var40 * ((this.method1040(var10, var44, this.field2769.field4336) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2771[var45] != 0) {
                    int var46 = field2789[var45] + var12;
                    if (var46 < arg0) {
                        field2775[var46] += this.method1040(field2791[var45], field2793[var45] * var40 >> 15, this.field2785.field4336);
                        field2791[var45] += (field2790[var45] * var39 >> 16) + field2792[var45];
                    }
                }
            }
        }
        if (this.field2781 != null) {
            this.field2781.method1516();
            this.field2782.method1516();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2781.method1515(arg0);
                int var18 = this.field2782.method1515(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2781.field4337 - this.field2781.field4335) * var17 >> 8) + this.field2781.field4335;
                } else {
                    var19 = ((this.field2781.field4337 - this.field2781.field4335) * var18 >> 8) + this.field2781.field4335;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2775[var16] = 0;
                }
            }
        }
        if (this.field2788 > 0 && this.field2776 > 0) {
            int var20 = (int) ((double) this.field2788 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2775[var21] += field2775[var21 - var20] * this.field2776 / 100;
            }
        }
        if (this.field2784.field2467[0] > 0 || this.field2784.field2467[1] > 0) {
            this.field2780.method1516();
            int var22 = this.field2780.method1515(arg0 + 1);
            int var23 = this.field2784.method925(0, (float) var22 / 65536.0F);
            int var24 = this.field2784.method925(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2775[var23 + var25] * (long) class138.field2464 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2775[var23 + var25 - var36 - 1] * (long) class138.field2466[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2775[var25 - var37 - 1] * (long) class138.field2466[1][var37] >> 16);
                    }
                    field2775[var25] = var35;
                    var22 = this.field2780.method1515(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2775[var23 + var25] * (long) class138.field2464 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2775[var23 + var25 - var33 - 1] * (long) class138.field2466[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2775[var25 - var34 - 1] * (long) class138.field2466[1][var34] >> 16);
                        }
                        field2775[var25] = var32;
                        var22 = this.field2780.method1515(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2775[var23 + var25 - var29 - 1] * (long) class138.field2466[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2775[var25 - var30 - 1] * (long) class138.field2466[1][var30] >> 16);
                            }
                            field2775[var25] = var28;
                            this.field2780.method1515(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2784.method925(0, (float) var22 / 65536.0F);
                    var24 = this.field2784.method925(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2775[var38] < -32768) {
                field2775[var38] = -32768;
            }
            if (field2775[var38] > 32767) {
                field2775[var38] = 32767;
            }
        }
        return field2775;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lfj;)V")
    public final void method1043(class66 arg0) {
        this.field2785 = new class232();
        this.field2785.method1514(arg0);
        this.field2772 = new class232();
        this.field2772.method1514(arg0);
        int var2 = arg0.method506(255);
        if (var2 != 0) {
            arg0.field1195--;
            this.field2774 = new class232();
            this.field2774.method1514(arg0);
            this.field2779 = new class232();
            this.field2779.method1514(arg0);
        }
        int var3 = arg0.method506(255);
        if (var3 != 0) {
            arg0.field1195--;
            this.field2769 = new class232();
            this.field2769.method1514(arg0);
            this.field2770 = new class232();
            this.field2770.method1514(arg0);
        }
        int var4 = arg0.method506(255);
        if (var4 != 0) {
            arg0.field1195--;
            this.field2781 = new class232();
            this.field2781.method1514(arg0);
            this.field2782 = new class232();
            this.field2782.method1514(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method530((byte) -63);
            if (var6 == 0) {
                break;
            }
            this.field2771[var5] = var6;
            this.field2778[var5] = arg0.method494((byte) 60);
            this.field2786[var5] = arg0.method530((byte) -113);
        }
        this.field2788 = arg0.method530((byte) -94);
        this.field2776 = arg0.method530((byte) -56);
        this.field2787 = arg0.method500(73);
        this.field2783 = arg0.method500(94);
        this.field2784 = new class138();
        this.field2780 = new class232();
        this.field2784.method928(arg0, this.field2780);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2777[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2773 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2773[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2775 = new int[220500];
        field2791 = new int[5];
        field2793 = new int[5];
        field2790 = new int[5];
        field2789 = new int[5];
        field2792 = new int[5];
    }
}
