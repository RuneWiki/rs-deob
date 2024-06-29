import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class198 {

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "[I")
    private int[] field2784 = new int[5];

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "[I")
    private int[] field2790 = new int[5];

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "[I")
    private int[] field2793 = new int[5];

    @OriginalMember(owner = "client!sfa", name = "j", descriptor = "I")
    public int field2792 = 500;

    @OriginalMember(owner = "client!sfa", name = "i", descriptor = "I")
    private int field2791 = 100;

    @OriginalMember(owner = "client!sfa", name = "s", descriptor = "I")
    private int field2801 = 0;

    @OriginalMember(owner = "client!sfa", name = "u", descriptor = "I")
    public int field2803 = 0;

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "[I")
    private static int[] field2789 = new int[32768];

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "[I")
    private static int[] field2796;

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "[I")
    private static int[] field2794;

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "[I")
    private static int[] field2797;

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "[I")
    private static int[] field2799;

    @OriginalMember(owner = "client!sfa", name = "r", descriptor = "[I")
    private static int[] field2800;

    @OriginalMember(owner = "client!sfa", name = "x", descriptor = "[I")
    private static int[] field2806;

    @OriginalMember(owner = "client!sfa", name = "v", descriptor = "[I")
    private static int[] field2804;

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "Lpc;")
    private class280 field2795;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "Lmca;")
    private class40 field2783;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lmca;")
    private class40 field2785;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lmca;")
    private class40 field2786;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lmca;")
    private class40 field2787;

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "Lmca;")
    private class40 field2788;

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "Lmca;")
    private class40 field2798;

    @OriginalMember(owner = "client!sfa", name = "t", descriptor = "Lmca;")
    private class40 field2802;

    @OriginalMember(owner = "client!sfa", name = "w", descriptor = "Lmca;")
    private class40 field2805;

    @OriginalMember(owner = "client!sfa", name = "y", descriptor = "Lmca;")
    private class40 field2807;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2789[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2796 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2796[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2794 = new int[220500];
        field2797 = new int[5];
        field2799 = new int[5];
        field2800 = new int[5];
        field2806 = new int[5];
        field2804 = new int[5];
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)I", line = 14)
    private final int method1285(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2796[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2789[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V", line = 39)
    public static void method1286() {
        field2794 = null;
        field2789 = null;
        field2796 = null;
        field2800 = null;
        field2804 = null;
        field2799 = null;
        field2797 = null;
        field2806 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lgga;)V", line = 92)
    public final void method1287(class511 arg0) {
        this.field2807 = new class40();
        this.field2807.method320(arg0);
        this.field2805 = new class40();
        this.field2805.method320(arg0);
        int var2 = arg0.method3013(-96);
        if (var2 != 0) {
            arg0.field6962--;
            this.field2783 = new class40();
            this.field2783.method320(arg0);
            this.field2802 = new class40();
            this.field2802.method320(arg0);
        }
        int var3 = arg0.method3013(-120);
        if (var3 != 0) {
            arg0.field6962--;
            this.field2786 = new class40();
            this.field2786.method320(arg0);
            this.field2798 = new class40();
            this.field2798.method320(arg0);
        }
        int var4 = arg0.method3013(-122);
        if (var4 != 0) {
            arg0.field6962--;
            this.field2788 = new class40();
            this.field2788.method320(arg0);
            this.field2787 = new class40();
            this.field2787.method320(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3043(-31927);
            if (var6 == 0) {
                break;
            }
            this.field2790[var5] = var6;
            this.field2793[var5] = arg0.method3022((byte) 67);
            this.field2784[var5] = arg0.method3043(-31927);
        }
        this.field2801 = arg0.method3043(-31927);
        this.field2791 = arg0.method3043(-31927);
        this.field2792 = arg0.method3002(-1);
        this.field2803 = arg0.method3002(-1);
        this.field2795 = new class280();
        this.field2785 = new class40();
        this.field2795.method1830(arg0, this.field2785);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)[I", line = 176)
    public final int[] method1288(int arg0, int arg1) {
        class335.method2125(field2794, 0, arg0);
        if (arg1 < 10) {
            return field2794;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2807.method321();
        this.field2805.method321();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2783 != null) {
            this.field2783.method321();
            this.field2802.method321();
            var5 = (int) ((double) (this.field2783.field401 - this.field2783.field402) * 32.768D / var3);
            var6 = (int) ((double) this.field2783.field402 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2786 != null) {
            this.field2786.method321();
            this.field2798.method321();
            var8 = (int) ((double) (this.field2786.field401 - this.field2786.field402) * 32.768D / var3);
            var9 = (int) ((double) this.field2786.field402 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2790[var11] != 0) {
                field2800[var11] = 0;
                field2804[var11] = (int) ((double) this.field2784[var11] * var3);
                field2799[var11] = (this.field2790[var11] << 14) / 100;
                field2797[var11] = (int) ((double) (this.field2807.field401 - this.field2807.field402) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2793[var11]) / var3);
                field2806[var11] = (int) ((double) this.field2807.field402 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2807.method323(arg0);
            int var40 = this.field2805.method323(arg0);
            if (this.field2783 != null) {
                int var41 = this.field2783.method323(arg0);
                int var42 = this.field2802.method323(arg0);
                var39 += this.method1285(var7, var42, this.field2783.field403) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2786 != null) {
                int var43 = this.field2786.method323(arg0);
                int var44 = this.field2798.method323(arg0);
                var40 = var40 * ((this.method1285(var10, var44, this.field2786.field403) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2790[var45] != 0) {
                    int var46 = field2804[var45] + var12;
                    if (var46 < arg0) {
                        field2794[var46] += this.method1285(field2800[var45], field2799[var45] * var40 >> 15, this.field2807.field403);
                        field2800[var45] += (field2797[var45] * var39 >> 16) + field2806[var45];
                    }
                }
            }
        }
        if (this.field2788 != null) {
            this.field2788.method321();
            this.field2787.method321();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2788.method323(arg0);
                int var18 = this.field2787.method323(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2788.field401 - this.field2788.field402) * var17 >> 8) + this.field2788.field402;
                } else {
                    var19 = ((this.field2788.field401 - this.field2788.field402) * var18 >> 8) + this.field2788.field402;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2794[var16] = 0;
                }
            }
        }
        if (this.field2801 > 0 && this.field2791 > 0) {
            int var20 = (int) ((double) this.field2801 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2794[var21] += field2794[var21 - var20] * this.field2791 / 100;
            }
        }
        if (this.field2795.field4020[0] > 0 || this.field2795.field4020[1] > 0) {
            this.field2785.method321();
            int var22 = this.field2785.method323(arg0 + 1);
            int var23 = this.field2795.method1827(0, (float) var22 / 65536.0F);
            int var24 = this.field2795.method1827(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2794[var23 + var25] * (long) class280.field4019 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2794[var23 + var25 - var36 - 1] * (long) class280.field4022[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2794[var25 - var37 - 1] * (long) class280.field4022[1][var37] >> 16);
                    }
                    field2794[var25] = var35;
                    var22 = this.field2785.method323(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2794[var23 + var25] * (long) class280.field4019 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2794[var23 + var25 - var33 - 1] * (long) class280.field4022[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2794[var25 - var34 - 1] * (long) class280.field4022[1][var34] >> 16);
                        }
                        field2794[var25] = var32;
                        var22 = this.field2785.method323(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2794[var23 + var25 - var29 - 1] * (long) class280.field4022[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2794[var25 - var30 - 1] * (long) class280.field4022[1][var30] >> 16);
                            }
                            field2794[var25] = var28;
                            this.field2785.method323(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2795.method1827(0, (float) var22 / 65536.0F);
                    var24 = this.field2795.method1827(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2794[var38] < -32768) {
                field2794[var38] = -32768;
            }
            if (field2794[var38] > 32767) {
                field2794[var38] = 32767;
            }
        }
        return field2794;
    }
}
