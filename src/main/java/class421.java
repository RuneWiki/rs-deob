import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class421 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field5706 = 500;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    private int field5709 = 0;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    private int field5710 = 100;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public int field5714 = 0;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    private int[] field5717 = new int[5];

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
    private int[] field5712 = new int[5];

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
    private int[] field5722 = new int[5];

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
    private static int[] field5724 = new int[32768];

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "[I")
    private static int[] field5720;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
    private static int[] field5711;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "[I")
    private static int[] field5726;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
    private static int[] field5729;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
    private static int[] field5727;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "[I")
    private static int[] field5728;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "[I")
    private static int[] field5725;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Luf;")
    private class285 field5705;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Luf;")
    private class285 field5707;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Luf;")
    private class285 field5708;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Luf;")
    private class285 field5713;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Luf;")
    private class285 field5715;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Luf;")
    private class285 field5716;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Luf;")
    private class285 field5718;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Luf;")
    private class285 field5721;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Luf;")
    private class285 field5723;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Lpc;")
    private class438 field5719;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I")
    private final int method2494(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5720[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5724[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
    public final int[] method2495(int arg0, int arg1) {
        class380.method2335(field5711, 0, arg0);
        if (arg1 < 10) {
            return field5711;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5723.method1616();
        this.field5721.method1616();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5705 != null) {
            this.field5705.method1616();
            this.field5716.method1616();
            var5 = (int) ((double) (this.field5705.field3864 - this.field5705.field3866) * 32.768D / var3);
            var6 = (int) ((double) this.field5705.field3866 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5718 != null) {
            this.field5718.method1616();
            this.field5708.method1616();
            var8 = (int) ((double) (this.field5718.field3864 - this.field5718.field3866) * 32.768D / var3);
            var9 = (int) ((double) this.field5718.field3866 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5722[var11] != 0) {
                field5725[var11] = 0;
                field5726[var11] = (int) ((double) this.field5717[var11] * var3);
                field5728[var11] = (this.field5722[var11] << 14) / 100;
                field5729[var11] = (int) ((double) (this.field5723.field3864 - this.field5723.field3866) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5712[var11]) / var3);
                field5727[var11] = (int) ((double) this.field5723.field3866 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5723.method1614(arg0);
            int var40 = this.field5721.method1614(arg0);
            if (this.field5705 != null) {
                int var41 = this.field5705.method1614(arg0);
                int var42 = this.field5716.method1614(arg0);
                var39 += this.method2494(var7, var42, this.field5705.field3863) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5718 != null) {
                int var43 = this.field5718.method1614(arg0);
                int var44 = this.field5708.method1614(arg0);
                var40 = var40 * ((this.method2494(var10, var44, this.field5718.field3863) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5722[var45] != 0) {
                    int var46 = field5726[var45] + var12;
                    if (var46 < arg0) {
                        field5711[var46] += this.method2494(field5725[var45], field5728[var45] * var40 >> 15, this.field5723.field3863);
                        field5725[var45] += (field5729[var45] * var39 >> 16) + field5727[var45];
                    }
                }
            }
        }
        if (this.field5713 != null) {
            this.field5713.method1616();
            this.field5715.method1616();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5713.method1614(arg0);
                int var18 = this.field5715.method1614(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5713.field3864 - this.field5713.field3866) * var17 >> 8) + this.field5713.field3866;
                } else {
                    var19 = ((this.field5713.field3864 - this.field5713.field3866) * var18 >> 8) + this.field5713.field3866;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5711[var16] = 0;
                }
            }
        }
        if (this.field5709 > 0 && this.field5710 > 0) {
            int var20 = (int) ((double) this.field5709 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5711[var21] += field5711[var21 - var20] * this.field5710 / 100;
            }
        }
        if (this.field5719.field5943[0] > 0 || this.field5719.field5943[1] > 0) {
            this.field5707.method1616();
            int var22 = this.field5707.method1614(arg0 + 1);
            int var23 = this.field5719.method2579(0, (float) var22 / 65536.0F);
            int var24 = this.field5719.method2579(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5711[var23 + var25] * (long) class438.field5938 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5711[var23 + var25 - var36 - 1] * (long) class438.field5941[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5711[var25 - var37 - 1] * (long) class438.field5941[1][var37] >> 16);
                    }
                    field5711[var25] = var35;
                    var22 = this.field5707.method1614(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5711[var23 + var25] * (long) class438.field5938 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5711[var23 + var25 - var33 - 1] * (long) class438.field5941[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5711[var25 - var34 - 1] * (long) class438.field5941[1][var34] >> 16);
                        }
                        field5711[var25] = var32;
                        var22 = this.field5707.method1614(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5711[var23 + var25 - var29 - 1] * (long) class438.field5941[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5711[var25 - var30 - 1] * (long) class438.field5941[1][var30] >> 16);
                            }
                            field5711[var25] = var28;
                            this.field5707.method1614(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5719.method2579(0, (float) var22 / 65536.0F);
                    var24 = this.field5719.method2579(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5711[var38] < -32768) {
                field5711[var38] = -32768;
            }
            if (field5711[var38] > 32767) {
                field5711[var38] = 32767;
            }
        }
        return field5711;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
    public static void method2496() {
        field5711 = null;
        field5724 = null;
        field5720 = null;
        field5725 = null;
        field5726 = null;
        field5728 = null;
        field5729 = null;
        field5727 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lbt;)V")
    public final void method2497(class32 arg0) {
        this.field5723 = new class285();
        this.field5723.method1615(arg0);
        this.field5721 = new class285();
        this.field5721.method1615(arg0);
        int var2 = arg0.method201((byte) -128);
        if (var2 != 0) {
            arg0.field456--;
            this.field5705 = new class285();
            this.field5705.method1615(arg0);
            this.field5716 = new class285();
            this.field5716.method1615(arg0);
        }
        int var3 = arg0.method201((byte) -123);
        if (var3 != 0) {
            arg0.field456--;
            this.field5718 = new class285();
            this.field5718.method1615(arg0);
            this.field5708 = new class285();
            this.field5708.method1615(arg0);
        }
        int var4 = arg0.method201((byte) -110);
        if (var4 != 0) {
            arg0.field456--;
            this.field5713 = new class285();
            this.field5713.method1615(arg0);
            this.field5715 = new class285();
            this.field5715.method1615(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method203((byte) -126);
            if (var6 == 0) {
                break;
            }
            this.field5722[var5] = var6;
            this.field5712[var5] = arg0.method204((byte) -116);
            this.field5717[var5] = arg0.method203((byte) -127);
        }
        this.field5709 = arg0.method203((byte) -109);
        this.field5710 = arg0.method203((byte) -84);
        this.field5706 = arg0.method215((byte) 105);
        this.field5714 = arg0.method215((byte) 121);
        this.field5719 = new class438();
        this.field5707 = new class285();
        this.field5719.method2577(arg0, this.field5707);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5724[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5720 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5720[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5711 = new int[220500];
        field5726 = new int[5];
        field5729 = new int[5];
        field5727 = new int[5];
        field5728 = new int[5];
        field5725 = new int[5];
    }
}
