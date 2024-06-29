import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class704 {

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public int field9863 = 500;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    private int field9859 = 100;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    private int field9860 = 0;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "[I")
    private int[] field9864 = new int[5];

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "I")
    public int field9868 = 0;

    @OriginalMember(owner = "client!iha", name = "y", descriptor = "[I")
    private int[] field9880 = new int[5];

    @OriginalMember(owner = "client!iha", name = "s", descriptor = "[I")
    private int[] field9874 = new int[5];

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "[I")
    private static int[] field9869 = new int[32768];

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "[I")
    private static int[] field9856;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "[I")
    private static int[] field9862;

    @OriginalMember(owner = "client!iha", name = "u", descriptor = "[I")
    private static int[] field9876;

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "[I")
    private static int[] field9872;

    @OriginalMember(owner = "client!iha", name = "r", descriptor = "[I")
    private static int[] field9873;

    @OriginalMember(owner = "client!iha", name = "w", descriptor = "[I")
    private static int[] field9878;

    @OriginalMember(owner = "client!iha", name = "x", descriptor = "[I")
    private static int[] field9879;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "Lpr;")
    private class333 field9857;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "Lpr;")
    private class333 field9858;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "Lpr;")
    private class333 field9861;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "Lpr;")
    private class333 field9865;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "Lpr;")
    private class333 field9866;

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "Lpr;")
    private class333 field9867;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "Lpr;")
    private class333 field9871;

    @OriginalMember(owner = "client!iha", name = "t", descriptor = "Lpr;")
    private class333 field9875;

    @OriginalMember(owner = "client!iha", name = "v", descriptor = "Lpr;")
    private class333 field9877;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "Ljb;")
    private class750 field9870;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9869[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9856 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9856[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9862 = new int[220500];
        field9876 = new int[5];
        field9872 = new int[5];
        field9873 = new int[5];
        field9878 = new int[5];
        field9879 = new int[5];
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)I", line = 18)
    private final int method3937(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9856[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9869[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "()V", line = 54)
    public static void method3938() {
        field9862 = null;
        field9869 = null;
        field9856 = null;
        field9873 = null;
        field9876 = null;
        field9872 = null;
        field9878 = null;
        field9879 = null;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lol;)V", line = 94)
    public final void method3939(class431 arg0) {
        this.field9877 = new class333();
        this.field9877.method2047(arg0);
        this.field9867 = new class333();
        this.field9867.method2047(arg0);
        int var2 = arg0.method2557(14929);
        if (var2 != 0) {
            arg0.field5983--;
            this.field9858 = new class333();
            this.field9858.method2047(arg0);
            this.field9865 = new class333();
            this.field9865.method2047(arg0);
        }
        int var3 = arg0.method2557(14929);
        if (var3 != 0) {
            arg0.field5983--;
            this.field9866 = new class333();
            this.field9866.method2047(arg0);
            this.field9875 = new class333();
            this.field9875.method2047(arg0);
        }
        int var4 = arg0.method2557(14929);
        if (var4 != 0) {
            arg0.field5983--;
            this.field9861 = new class333();
            this.field9861.method2047(arg0);
            this.field9857 = new class333();
            this.field9857.method2047(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2527((byte) -24);
            if (var6 == 0) {
                break;
            }
            this.field9880[var5] = var6;
            this.field9874[var5] = arg0.method2573((byte) 28);
            this.field9864[var5] = arg0.method2527((byte) -24);
        }
        this.field9860 = arg0.method2527((byte) -24);
        this.field9859 = arg0.method2527((byte) -24);
        this.field9863 = arg0.method2565((byte) -86);
        this.field9868 = arg0.method2565((byte) -91);
        this.field9870 = new class750();
        this.field9871 = new class333();
        this.field9870.method4128(arg0, this.field9871);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)[I", line = 159)
    public final int[] method3940(int arg0, int arg1) {
        class171.method1260(field9862, 0, arg0);
        if (arg1 < 10) {
            return field9862;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9877.method2044();
        this.field9867.method2044();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9858 != null) {
            this.field9858.method2044();
            this.field9865.method2044();
            var5 = (int) ((double) (this.field9858.field4723 - this.field9858.field4727) * 32.768D / var3);
            var6 = (int) ((double) this.field9858.field4727 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9866 != null) {
            this.field9866.method2044();
            this.field9875.method2044();
            var8 = (int) ((double) (this.field9866.field4723 - this.field9866.field4727) * 32.768D / var3);
            var9 = (int) ((double) this.field9866.field4727 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field9880[var11] != 0) {
                field9873[var11] = 0;
                field9876[var11] = (int) ((double) this.field9864[var11] * var3);
                field9872[var11] = (this.field9880[var11] << 14) / 100;
                field9878[var11] = (int) ((double) (this.field9877.field4723 - this.field9877.field4727) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9874[var11]) / var3);
                field9879[var11] = (int) ((double) this.field9877.field4727 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9877.method2046(arg0);
            int var40 = this.field9867.method2046(arg0);
            if (this.field9858 != null) {
                int var41 = this.field9858.method2046(arg0);
                int var42 = this.field9865.method2046(arg0);
                var39 += this.method3937(var7, var42, this.field9858.field4726) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9866 != null) {
                int var43 = this.field9866.method2046(arg0);
                int var44 = this.field9875.method2046(arg0);
                var40 = var40 * ((this.method3937(var10, var44, this.field9866.field4726) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field9880[var45] != 0) {
                    int var46 = field9876[var45] + var12;
                    if (var46 < arg0) {
                        field9862[var46] += this.method3937(field9873[var45], field9872[var45] * var40 >> 15, this.field9877.field4726);
                        field9873[var45] += (field9878[var45] * var39 >> 16) + field9879[var45];
                    }
                }
            }
        }
        if (this.field9861 != null) {
            this.field9861.method2044();
            this.field9857.method2044();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9861.method2046(arg0);
                int var18 = this.field9857.method2046(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9861.field4723 - this.field9861.field4727) * var17 >> 8) + this.field9861.field4727;
                } else {
                    var19 = ((this.field9861.field4723 - this.field9861.field4727) * var18 >> 8) + this.field9861.field4727;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9862[var16] = 0;
                }
            }
        }
        if (this.field9860 > 0 && this.field9859 > 0) {
            int var20 = (int) ((double) this.field9860 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9862[var21] += field9862[var21 - var20] * this.field9859 / 100;
            }
        }
        if (this.field9870.field10411[0] > 0 || this.field9870.field10411[1] > 0) {
            this.field9871.method2044();
            int var22 = this.field9871.method2046(arg0 + 1);
            int var23 = this.field9870.method4125(0, (float) var22 / 65536.0F);
            int var24 = this.field9870.method4125(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9862[var23 + var25] * (long) class750.field10407 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9862[var23 + var25 - var36 - 1] * (long) class750.field10409[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9862[var25 - var37 - 1] * (long) class750.field10409[1][var37] >> 16);
                    }
                    field9862[var25] = var35;
                    var22 = this.field9871.method2046(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9862[var23 + var25] * (long) class750.field10407 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9862[var23 + var25 - var33 - 1] * (long) class750.field10409[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9862[var25 - var34 - 1] * (long) class750.field10409[1][var34] >> 16);
                        }
                        field9862[var25] = var32;
                        var22 = this.field9871.method2046(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9862[var23 + var25 - var29 - 1] * (long) class750.field10409[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9862[var25 - var30 - 1] * (long) class750.field10409[1][var30] >> 16);
                            }
                            field9862[var25] = var28;
                            this.field9871.method2046(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field9870.method4125(0, (float) var22 / 65536.0F);
                    var24 = this.field9870.method4125(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9862[var38] < -32768) {
                field9862[var38] = -32768;
            }
            if (field9862[var38] > 32767) {
                field9862[var38] = 32767;
            }
        }
        return field9862;
    }
}
