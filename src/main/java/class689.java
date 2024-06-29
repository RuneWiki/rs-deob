import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class689 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    private int field9761 = 0;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public int field9766 = 0;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public int field9770 = 500;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    private int[] field9763 = new int[5];

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
    private int[] field9771 = new int[5];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field9759 = 100;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "[I")
    private int[] field9782 = new int[5];

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
    private static int[] field9769 = new int[32768];

    @OriginalMember(owner = "client!si", name = "r", descriptor = "[I")
    private static int[] field9776;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[I")
    private static int[] field9772;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[I")
    private static int[] field9778;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "[I")
    private static int[] field9779;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[I")
    private static int[] field9781;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[I")
    private static int[] field9780;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "[I")
    private static int[] field9783;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lcq;")
    private class220 field9760;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lcq;")
    private class220 field9762;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lcq;")
    private class220 field9764;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lcq;")
    private class220 field9765;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lcq;")
    private class220 field9767;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lcq;")
    private class220 field9768;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Lcq;")
    private class220 field9773;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Lcq;")
    private class220 field9774;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Lcq;")
    private class220 field9775;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Lmi;")
    private class668 field9777;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9769[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9776 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9776[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9772 = new int[220500];
        field9778 = new int[5];
        field9779 = new int[5];
        field9781 = new int[5];
        field9780 = new int[5];
        field9783 = new int[5];
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lsl;)V", line = 16)
    public final void method3898(class479 arg0) {
        this.field9767 = new class220();
        this.field9767.method1547(arg0);
        this.field9774 = new class220();
        this.field9774.method1547(arg0);
        int var2 = arg0.method2886(true);
        if (var2 != 0) {
            arg0.field6864--;
            this.field9760 = new class220();
            this.field9760.method1547(arg0);
            this.field9765 = new class220();
            this.field9765.method1547(arg0);
        }
        int var3 = arg0.method2886(true);
        if (var3 != 0) {
            arg0.field6864--;
            this.field9764 = new class220();
            this.field9764.method1547(arg0);
            this.field9773 = new class220();
            this.field9773.method1547(arg0);
        }
        int var4 = arg0.method2886(true);
        if (var4 != 0) {
            arg0.field6864--;
            this.field9775 = new class220();
            this.field9775.method1547(arg0);
            this.field9762 = new class220();
            this.field9762.method1547(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2889(-18098);
            if (var6 == 0) {
                break;
            }
            this.field9782[var5] = var6;
            this.field9763[var5] = arg0.method2925(-64);
            this.field9771[var5] = arg0.method2889(-18098);
        }
        this.field9761 = arg0.method2889(-18098);
        this.field9759 = arg0.method2889(-18098);
        this.field9770 = arg0.method2882(-1);
        this.field9766 = arg0.method2882(-1);
        this.field9777 = new class668();
        this.field9768 = new class220();
        this.field9777.method3811(arg0, this.field9768);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I", line = 78)
    public final int[] method3899(int arg0, int arg1) {
        class85.method681(field9772, 0, arg0);
        if (arg1 < 10) {
            return field9772;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9767.method1549();
        this.field9774.method1549();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9760 != null) {
            this.field9760.method1549();
            this.field9765.method1549();
            var5 = (int) ((double) (this.field9760.field3269 - this.field9760.field3271) * 32.768D / var3);
            var6 = (int) ((double) this.field9760.field3271 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9764 != null) {
            this.field9764.method1549();
            this.field9773.method1549();
            var8 = (int) ((double) (this.field9764.field3269 - this.field9764.field3271) * 32.768D / var3);
            var9 = (int) ((double) this.field9764.field3271 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field9782[var11] != 0) {
                field9779[var11] = 0;
                field9781[var11] = (int) ((double) this.field9771[var11] * var3);
                field9778[var11] = (this.field9782[var11] << 14) / 100;
                field9780[var11] = (int) ((double) (this.field9767.field3269 - this.field9767.field3271) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9763[var11]) / var3);
                field9783[var11] = (int) ((double) this.field9767.field3271 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9767.method1548(arg0);
            int var40 = this.field9774.method1548(arg0);
            if (this.field9760 != null) {
                int var41 = this.field9760.method1548(arg0);
                int var42 = this.field9765.method1548(arg0);
                var39 += this.method3900(var7, var42, this.field9760.field3267) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9764 != null) {
                int var43 = this.field9764.method1548(arg0);
                int var44 = this.field9773.method1548(arg0);
                var40 = var40 * ((this.method3900(var10, var44, this.field9764.field3267) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field9782[var45] != 0) {
                    int var46 = field9781[var45] + var12;
                    if (var46 < arg0) {
                        field9772[var46] += this.method3900(field9779[var45], field9778[var45] * var40 >> 15, this.field9767.field3267);
                        field9779[var45] += (field9780[var45] * var39 >> 16) + field9783[var45];
                    }
                }
            }
        }
        if (this.field9775 != null) {
            this.field9775.method1549();
            this.field9762.method1549();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9775.method1548(arg0);
                int var18 = this.field9762.method1548(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9775.field3269 - this.field9775.field3271) * var17 >> 8) + this.field9775.field3271;
                } else {
                    var19 = ((this.field9775.field3269 - this.field9775.field3271) * var18 >> 8) + this.field9775.field3271;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9772[var16] = 0;
                }
            }
        }
        if (this.field9761 > 0 && this.field9759 > 0) {
            int var20 = (int) ((double) this.field9761 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9772[var21] += field9772[var21 - var20] * this.field9759 / 100;
            }
        }
        if (this.field9777.field9533[0] > 0 || this.field9777.field9533[1] > 0) {
            this.field9768.method1549();
            int var22 = this.field9768.method1548(arg0 + 1);
            int var23 = this.field9777.method3815(0, (float) var22 / 65536.0F);
            int var24 = this.field9777.method3815(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9772[var23 + var25] * (long) class668.field9529 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9772[var23 + var25 - var36 - 1] * (long) class668.field9534[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9772[var25 - var37 - 1] * (long) class668.field9534[1][var37] >> 16);
                    }
                    field9772[var25] = var35;
                    var22 = this.field9768.method1548(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9772[var23 + var25] * (long) class668.field9529 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9772[var23 + var25 - var33 - 1] * (long) class668.field9534[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9772[var25 - var34 - 1] * (long) class668.field9534[1][var34] >> 16);
                        }
                        field9772[var25] = var32;
                        var22 = this.field9768.method1548(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9772[var23 + var25 - var29 - 1] * (long) class668.field9534[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9772[var25 - var30 - 1] * (long) class668.field9534[1][var30] >> 16);
                            }
                            field9772[var25] = var28;
                            this.field9768.method1548(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field9777.method3815(0, (float) var22 / 65536.0F);
                    var24 = this.field9777.method3815(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9772[var38] < -32768) {
                field9772[var38] = -32768;
            }
            if (field9772[var38] > 32767) {
                field9772[var38] = 32767;
            }
        }
        return field9772;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I", line = 375)
    private final int method3900(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9776[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9769[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 440)
    public static void method3901() {
        field9772 = null;
        field9769 = null;
        field9776 = null;
        field9779 = null;
        field9781 = null;
        field9778 = null;
        field9780 = null;
        field9783 = null;
    }
}
