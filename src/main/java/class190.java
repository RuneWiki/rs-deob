import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class190 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    private int[] field2766 = new int[5];

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public int field2770 = 0;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    private int field2768 = 0;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[I")
    private int[] field2773 = new int[5];

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field2771 = 500;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field2767 = 100;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[I")
    private int[] field2769 = new int[5];

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "[I")
    private static int[] field2777 = new int[32768];

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[I")
    private static int[] field2763;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "[I")
    private static int[] field2765;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "[I")
    private static int[] field2782;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[I")
    private static int[] field2781;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[I")
    private static int[] field2780;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[I")
    private static int[] field2784;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "[I")
    private static int[] field2785;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lan;")
    private class185 field2761;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lan;")
    private class185 field2762;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lan;")
    private class185 field2764;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lan;")
    private class185 field2772;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Lan;")
    private class185 field2774;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lan;")
    private class185 field2775;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lan;")
    private class185 field2776;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Lan;")
    private class185 field2779;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lan;")
    private class185 field2783;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Ljr;")
    private class362 field2778;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
    private final int method1265(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2763[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2777[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
    public static void method1266() {
        field2765 = null;
        field2777 = null;
        field2763 = null;
        field2781 = null;
        field2782 = null;
        field2785 = null;
        field2780 = null;
        field2784 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
    public final int[] method1267(int arg0, int arg1) {
        class442.method2595(field2765, 0, arg0);
        if (arg1 < 10) {
            return field2765;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2775.method1253();
        this.field2776.method1253();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2762 != null) {
            this.field2762.method1253();
            this.field2783.method1253();
            var5 = (int) ((double) (this.field2762.field2724 - this.field2762.field2726) * 32.768D / var3);
            var6 = (int) ((double) this.field2762.field2726 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2774 != null) {
            this.field2774.method1253();
            this.field2764.method1253();
            var8 = (int) ((double) (this.field2774.field2724 - this.field2774.field2726) * 32.768D / var3);
            var9 = (int) ((double) this.field2774.field2726 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2773[var11] != 0) {
                field2781[var11] = 0;
                field2782[var11] = (int) ((double) this.field2766[var11] * var3);
                field2785[var11] = (this.field2773[var11] << 14) / 100;
                field2780[var11] = (int) ((double) (this.field2775.field2724 - this.field2775.field2726) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2769[var11]) / var3);
                field2784[var11] = (int) ((double) this.field2775.field2726 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2775.method1255(arg0);
            int var40 = this.field2776.method1255(arg0);
            if (this.field2762 != null) {
                int var41 = this.field2762.method1255(arg0);
                int var42 = this.field2783.method1255(arg0);
                var39 += this.method1265(var7, var42, this.field2762.field2727) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2774 != null) {
                int var43 = this.field2774.method1255(arg0);
                int var44 = this.field2764.method1255(arg0);
                var40 = var40 * ((this.method1265(var10, var44, this.field2774.field2727) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2773[var45] != 0) {
                    int var46 = field2782[var45] + var12;
                    if (var46 < arg0) {
                        field2765[var46] += this.method1265(field2781[var45], field2785[var45] * var40 >> 15, this.field2775.field2727);
                        field2781[var45] += (field2780[var45] * var39 >> 16) + field2784[var45];
                    }
                }
            }
        }
        if (this.field2761 != null) {
            this.field2761.method1253();
            this.field2772.method1253();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2761.method1255(arg0);
                int var18 = this.field2772.method1255(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2761.field2724 - this.field2761.field2726) * var17 >> 8) + this.field2761.field2726;
                } else {
                    var19 = ((this.field2761.field2724 - this.field2761.field2726) * var18 >> 8) + this.field2761.field2726;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2765[var16] = 0;
                }
            }
        }
        if (this.field2768 > 0 && this.field2767 > 0) {
            int var20 = (int) ((double) this.field2768 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2765[var21] += field2765[var21 - var20] * this.field2767 / 100;
            }
        }
        if (this.field2778.field5534[0] > 0 || this.field2778.field5534[1] > 0) {
            this.field2779.method1253();
            int var22 = this.field2779.method1255(arg0 + 1);
            int var23 = this.field2778.method2159(0, (float) var22 / 65536.0F);
            int var24 = this.field2778.method2159(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2765[var23 + var25] * (long) class362.field5539 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2765[var23 + var25 - var36 - 1] * (long) class362.field5538[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2765[var25 - var37 - 1] * (long) class362.field5538[1][var37] >> 16);
                    }
                    field2765[var25] = var35;
                    var22 = this.field2779.method1255(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2765[var23 + var25] * (long) class362.field5539 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2765[var23 + var25 - var33 - 1] * (long) class362.field5538[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2765[var25 - var34 - 1] * (long) class362.field5538[1][var34] >> 16);
                        }
                        field2765[var25] = var32;
                        var22 = this.field2779.method1255(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2765[var23 + var25 - var29 - 1] * (long) class362.field5538[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2765[var25 - var30 - 1] * (long) class362.field5538[1][var30] >> 16);
                            }
                            field2765[var25] = var28;
                            this.field2779.method1255(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2778.method2159(0, (float) var22 / 65536.0F);
                    var24 = this.field2778.method2159(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2765[var38] < -32768) {
                field2765[var38] = -32768;
            }
            if (field2765[var38] > 32767) {
                field2765[var38] = 32767;
            }
        }
        return field2765;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lgk;)V")
    public final void method1268(class468 arg0) {
        this.field2775 = new class185();
        this.field2775.method1254(arg0);
        this.field2776 = new class185();
        this.field2776.method1254(arg0);
        int var2 = arg0.method2765(67);
        if (var2 != 0) {
            arg0.field6830--;
            this.field2762 = new class185();
            this.field2762.method1254(arg0);
            this.field2783 = new class185();
            this.field2783.method1254(arg0);
        }
        int var3 = arg0.method2765(49);
        if (var3 != 0) {
            arg0.field6830--;
            this.field2774 = new class185();
            this.field2774.method1254(arg0);
            this.field2764 = new class185();
            this.field2764.method1254(arg0);
        }
        int var4 = arg0.method2765(117);
        if (var4 != 0) {
            arg0.field6830--;
            this.field2761 = new class185();
            this.field2761.method1254(arg0);
            this.field2772 = new class185();
            this.field2772.method1254(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2724(255);
            if (var6 == 0) {
                break;
            }
            this.field2773[var5] = var6;
            this.field2769[var5] = arg0.method2758((byte) -16);
            this.field2766[var5] = arg0.method2724(255);
        }
        this.field2768 = arg0.method2724(255);
        this.field2767 = arg0.method2724(255);
        this.field2771 = arg0.method2727((byte) 43);
        this.field2770 = arg0.method2727((byte) 43);
        this.field2778 = new class362();
        this.field2779 = new class185();
        this.field2778.method2160(arg0, this.field2779);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2777[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2763 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2763[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2765 = new int[220500];
        field2782 = new int[5];
        field2781 = new int[5];
        field2780 = new int[5];
        field2784 = new int[5];
        field2785 = new int[5];
    }
}
