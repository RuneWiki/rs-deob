import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class708 {

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "[I")
    private int[] field9883 = new int[5];

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public int field9878 = 500;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    private int field9880 = 100;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "[I")
    private int[] field9888 = new int[5];

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public int field9881 = 0;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "[I")
    private int[] field9890 = new int[5];

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    private int field9884 = 0;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "[I")
    private static int[] field9887 = new int[32768];

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "[I")
    private static int[] field9896;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "[I")
    private static int[] field9882;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "[I")
    private static int[] field9898;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "[I")
    private static int[] field9897;

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "[I")
    private static int[] field9900;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "[I")
    private static int[] field9899;

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "[I")
    private static int[] field9901;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lgf;")
    private class258 field9877;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "Lgf;")
    private class258 field9879;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "Lgf;")
    private class258 field9885;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "Lgf;")
    private class258 field9886;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "Lgf;")
    private class258 field9889;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "Lgf;")
    private class258 field9892;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "Lgf;")
    private class258 field9893;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "Lgf;")
    private class258 field9894;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "Lgf;")
    private class258 field9895;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "Lum;")
    private class490 field9891;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)I")
    private final int method3902(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9896[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9887[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lji;)V")
    public final void method3903(class572 arg0) {
        this.field9895 = new class258();
        this.field9895.method1541(arg0);
        this.field9889 = new class258();
        this.field9889.method1541(arg0);
        int var2 = arg0.method3097((byte) 12);
        if (var2 != 0) {
            arg0.field7313--;
            this.field9894 = new class258();
            this.field9894.method1541(arg0);
            this.field9879 = new class258();
            this.field9879.method1541(arg0);
        }
        int var3 = arg0.method3097((byte) 12);
        if (var3 != 0) {
            arg0.field7313--;
            this.field9886 = new class258();
            this.field9886.method1541(arg0);
            this.field9893 = new class258();
            this.field9893.method1541(arg0);
        }
        int var4 = arg0.method3097((byte) 12);
        if (var4 != 0) {
            arg0.field7313--;
            this.field9877 = new class258();
            this.field9877.method1541(arg0);
            this.field9885 = new class258();
            this.field9885.method1541(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3033((byte) 91);
            if (var6 == 0) {
                break;
            }
            this.field9888[var5] = var6;
            this.field9890[var5] = arg0.method3085(4107);
            this.field9883[var5] = arg0.method3033((byte) 91);
        }
        this.field9884 = arg0.method3033((byte) 91);
        this.field9880 = arg0.method3033((byte) 91);
        this.field9878 = arg0.method3031(-1);
        this.field9881 = arg0.method3031(-1);
        this.field9891 = new class490();
        this.field9892 = new class258();
        this.field9891.method2663(arg0, this.field9892);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "()V")
    public static void method3904() {
        field9882 = null;
        field9887 = null;
        field9896 = null;
        field9901 = null;
        field9900 = null;
        field9899 = null;
        field9897 = null;
        field9898 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I")
    public final int[] method3905(int arg0, int arg1) {
        class70.method555(field9882, 0, arg0);
        if (arg1 < 10) {
            return field9882;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9895.method1539();
        this.field9889.method1539();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9894 != null) {
            this.field9894.method1539();
            this.field9879.method1539();
            var5 = (int) ((double) (this.field9894.field3298 - this.field9894.field3297) * 32.768D / var3);
            var6 = (int) ((double) this.field9894.field3297 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9886 != null) {
            this.field9886.method1539();
            this.field9893.method1539();
            var8 = (int) ((double) (this.field9886.field3298 - this.field9886.field3297) * 32.768D / var3);
            var9 = (int) ((double) this.field9886.field3297 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field9888[var11] != 0) {
                field9901[var11] = 0;
                field9900[var11] = (int) ((double) this.field9883[var11] * var3);
                field9899[var11] = (this.field9888[var11] << 14) / 100;
                field9897[var11] = (int) ((double) (this.field9895.field3298 - this.field9895.field3297) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9890[var11]) / var3);
                field9898[var11] = (int) ((double) this.field9895.field3297 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9895.method1538(arg0);
            int var40 = this.field9889.method1538(arg0);
            if (this.field9894 != null) {
                int var41 = this.field9894.method1538(arg0);
                int var42 = this.field9879.method1538(arg0);
                var39 += this.method3902(var7, var42, this.field9894.field3296) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9886 != null) {
                int var43 = this.field9886.method1538(arg0);
                int var44 = this.field9893.method1538(arg0);
                var40 = var40 * ((this.method3902(var10, var44, this.field9886.field3296) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field9888[var45] != 0) {
                    int var46 = field9900[var45] + var12;
                    if (var46 < arg0) {
                        field9882[var46] += this.method3902(field9901[var45], field9899[var45] * var40 >> 15, this.field9895.field3296);
                        field9901[var45] += (field9897[var45] * var39 >> 16) + field9898[var45];
                    }
                }
            }
        }
        if (this.field9877 != null) {
            this.field9877.method1539();
            this.field9885.method1539();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9877.method1538(arg0);
                int var18 = this.field9885.method1538(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9877.field3298 - this.field9877.field3297) * var17 >> 8) + this.field9877.field3297;
                } else {
                    var19 = ((this.field9877.field3298 - this.field9877.field3297) * var18 >> 8) + this.field9877.field3297;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9882[var16] = 0;
                }
            }
        }
        if (this.field9884 > 0 && this.field9880 > 0) {
            int var20 = (int) ((double) this.field9884 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9882[var21] += field9882[var21 - var20] * this.field9880 / 100;
            }
        }
        if (this.field9891.field6120[0] > 0 || this.field9891.field6120[1] > 0) {
            this.field9892.method1539();
            int var22 = this.field9892.method1538(arg0 + 1);
            int var23 = this.field9891.method2664(0, (float) var22 / 65536.0F);
            int var24 = this.field9891.method2664(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9882[var23 + var25] * (long) class490.field6121 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9882[var23 + var25 - var36 - 1] * (long) class490.field6117[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9882[var25 - var37 - 1] * (long) class490.field6117[1][var37] >> 16);
                    }
                    field9882[var25] = var35;
                    var22 = this.field9892.method1538(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9882[var23 + var25] * (long) class490.field6121 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9882[var23 + var25 - var33 - 1] * (long) class490.field6117[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9882[var25 - var34 - 1] * (long) class490.field6117[1][var34] >> 16);
                        }
                        field9882[var25] = var32;
                        var22 = this.field9892.method1538(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9882[var23 + var25 - var29 - 1] * (long) class490.field6117[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9882[var25 - var30 - 1] * (long) class490.field6117[1][var30] >> 16);
                            }
                            field9882[var25] = var28;
                            this.field9892.method1538(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field9891.method2664(0, (float) var22 / 65536.0F);
                    var24 = this.field9891.method2664(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9882[var38] < -32768) {
                field9882[var38] = -32768;
            }
            if (field9882[var38] > 32767) {
                field9882[var38] = 32767;
            }
        }
        return field9882;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9887[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9896 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9896[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9882 = new int[220500];
        field9898 = new int[5];
        field9897 = new int[5];
        field9900 = new int[5];
        field9899 = new int[5];
        field9901 = new int[5];
    }
}
