import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class197 {

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[I")
    private int[] field3881 = new int[5];

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public int field3877 = 500;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
    private int[] field3876 = new int[5];

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    private int field3879 = 100;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    private int field3886 = 0;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public int field3887 = 0;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
    private int[] field3884 = new int[5];

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[I")
    private static int[] field3890 = new int[32768];

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[I")
    private static int[] field3885;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
    private static int[] field3874;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[I")
    private static int[] field3895;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "[I")
    private static int[] field3897;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "[I")
    private static int[] field3891;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
    private static int[] field3892;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "[I")
    private static int[] field3898;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lcd;")
    private class25 field3875;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Lcd;")
    private class25 field3878;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Lcd;")
    private class25 field3880;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lcd;")
    private class25 field3883;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lcd;")
    private class25 field3888;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lcd;")
    private class25 field3889;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Lcd;")
    private class25 field3893;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Lcd;")
    private class25 field3894;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Lcd;")
    private class25 field3896;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lhe;")
    private class70 field3882;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljg;)V")
    public final void method1290(class89 arg0) {
        this.field3894 = new class25();
        this.field3894.method123(arg0);
        this.field3896 = new class25();
        this.field3896.method123(arg0);
        int var2 = arg0.method538((byte) -56);
        if (var2 != 0) {
            arg0.field1727--;
            this.field3888 = new class25();
            this.field3888.method123(arg0);
            this.field3883 = new class25();
            this.field3883.method123(arg0);
        }
        int var3 = arg0.method538((byte) 117);
        if (var3 != 0) {
            arg0.field1727--;
            this.field3889 = new class25();
            this.field3889.method123(arg0);
            this.field3893 = new class25();
            this.field3893.method123(arg0);
        }
        int var4 = arg0.method538((byte) 99);
        if (var4 != 0) {
            arg0.field1727--;
            this.field3880 = new class25();
            this.field3880.method123(arg0);
            this.field3878 = new class25();
            this.field3878.method123(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method533((byte) 75);
            if (var6 == 0) {
                break;
            }
            this.field3876[var5] = var6;
            this.field3881[var5] = arg0.method566(117);
            this.field3884[var5] = arg0.method533((byte) 75);
        }
        this.field3886 = arg0.method533((byte) 75);
        this.field3879 = arg0.method533((byte) 75);
        this.field3877 = arg0.method555(-1113627096);
        this.field3887 = arg0.method555(-1113627096);
        this.field3882 = new class70();
        this.field3875 = new class25();
        this.field3882.method429(arg0, this.field3875);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
    private final int method1291(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3885[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3890[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
    public static void method1292() {
        field3874 = null;
        field3890 = null;
        field3885 = null;
        field3892 = null;
        field3891 = null;
        field3897 = null;
        field3898 = null;
        field3895 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I")
    public final int[] method1293(int arg0, int arg1) {
        class42.method232(field3874, 0, arg0);
        if (arg1 < 10) {
            return field3874;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3894.method125();
        this.field3896.method125();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3888 != null) {
            this.field3888.method125();
            this.field3883.method125();
            var5 = (int) ((double) (this.field3888.field462 - this.field3888.field465) * 32.768D / var3);
            var6 = (int) ((double) this.field3888.field465 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3889 != null) {
            this.field3889.method125();
            this.field3893.method125();
            var8 = (int) ((double) (this.field3889.field462 - this.field3889.field465) * 32.768D / var3);
            var9 = (int) ((double) this.field3889.field465 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3876[var11] != 0) {
                field3892[var11] = 0;
                field3891[var11] = (int) ((double) this.field3884[var11] * var3);
                field3897[var11] = (this.field3876[var11] << 14) / 100;
                field3898[var11] = (int) ((double) (this.field3894.field462 - this.field3894.field465) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3881[var11]) / var3);
                field3895[var11] = (int) ((double) this.field3894.field465 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3894.method124(arg0);
            int var40 = this.field3896.method124(arg0);
            if (this.field3888 != null) {
                int var41 = this.field3888.method124(arg0);
                int var42 = this.field3883.method124(arg0);
                var39 += this.method1291(var7, var42, this.field3888.field466) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3889 != null) {
                int var43 = this.field3889.method124(arg0);
                int var44 = this.field3893.method124(arg0);
                var40 = var40 * ((this.method1291(var10, var44, this.field3889.field466) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3876[var45] != 0) {
                    int var46 = field3891[var45] + var12;
                    if (var46 < arg0) {
                        field3874[var46] += this.method1291(field3892[var45], field3897[var45] * var40 >> 15, this.field3894.field466);
                        field3892[var45] += (field3898[var45] * var39 >> 16) + field3895[var45];
                    }
                }
            }
        }
        if (this.field3880 != null) {
            this.field3880.method125();
            this.field3878.method125();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3880.method124(arg0);
                int var18 = this.field3878.method124(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3880.field462 - this.field3880.field465) * var17 >> 8) + this.field3880.field465;
                } else {
                    var19 = ((this.field3880.field462 - this.field3880.field465) * var18 >> 8) + this.field3880.field465;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3874[var16] = 0;
                }
            }
        }
        if (this.field3886 > 0 && this.field3879 > 0) {
            int var20 = (int) ((double) this.field3886 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3874[var21] += field3874[var21 - var20] * this.field3879 / 100;
            }
        }
        if (this.field3882.field1387[0] > 0 || this.field3882.field1387[1] > 0) {
            this.field3875.method125();
            int var22 = this.field3875.method124(arg0 + 1);
            int var23 = this.field3882.method434(0, (float) var22 / 65536.0F);
            int var24 = this.field3882.method434(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3874[var23 + var25] * (long) class70.field1388 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3874[var23 + var25 - var36 - 1] * (long) class70.field1391[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3874[var25 - var37 - 1] * (long) class70.field1391[1][var37] >> 16);
                    }
                    field3874[var25] = var35;
                    var22 = this.field3875.method124(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3874[var23 + var25] * (long) class70.field1388 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3874[var23 + var25 - var33 - 1] * (long) class70.field1391[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3874[var25 - var34 - 1] * (long) class70.field1391[1][var34] >> 16);
                        }
                        field3874[var25] = var32;
                        var22 = this.field3875.method124(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3874[var23 + var25 - var29 - 1] * (long) class70.field1391[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3874[var25 - var30 - 1] * (long) class70.field1391[1][var30] >> 16);
                            }
                            field3874[var25] = var28;
                            this.field3875.method124(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3882.method434(0, (float) var22 / 65536.0F);
                    var24 = this.field3882.method434(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3874[var38] < -32768) {
                field3874[var38] = -32768;
            }
            if (field3874[var38] > 32767) {
                field3874[var38] = 32767;
            }
        }
        return field3874;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3890[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3885 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3885[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3874 = new int[220500];
        field3895 = new int[5];
        field3897 = new int[5];
        field3891 = new int[5];
        field3892 = new int[5];
        field3898 = new int[5];
    }
}
