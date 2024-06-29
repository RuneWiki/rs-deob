import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class361 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field5715 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field5720 = 500;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    private int field5718 = 100;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[I")
    private int[] field5713 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    private int[] field5724 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    private int field5725 = 0;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
    private int[] field5736 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
    private static int[] field5722 = new int[32768];

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
    private static int[] field5726;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[I")
    private static int[] field5728;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "[I")
    private static int[] field5732;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
    private static int[] field5731;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "[I")
    private static int[] field5733;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[I")
    private static int[] field5730;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
    private static int[] field5734;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lpn;")
    private class155 field5723;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Lcb;")
    private class80 field5712;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lcb;")
    private class80 field5714;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lcb;")
    private class80 field5716;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lcb;")
    private class80 field5717;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lcb;")
    private class80 field5719;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lcb;")
    private class80 field5721;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lcb;")
    private class80 field5727;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Lcb;")
    private class80 field5729;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lcb;")
    private class80 field5735;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I", line = 5)
    private final int method2532(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5726[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5722[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lqm;)V", line = 56)
    public final void method2533(class227 arg0) {
        this.field5719 = new class80();
        this.field5719.method658(arg0);
        this.field5729 = new class80();
        this.field5729.method658(arg0);
        int var2 = arg0.method1720((byte) -30);
        if (var2 != 0) {
            arg0.field3760--;
            this.field5716 = new class80();
            this.field5716.method658(arg0);
            this.field5721 = new class80();
            this.field5721.method658(arg0);
        }
        int var3 = arg0.method1720((byte) -39);
        if (var3 != 0) {
            arg0.field3760--;
            this.field5717 = new class80();
            this.field5717.method658(arg0);
            this.field5735 = new class80();
            this.field5735.method658(arg0);
        }
        int var4 = arg0.method1720((byte) -7);
        if (var4 != 0) {
            arg0.field3760--;
            this.field5712 = new class80();
            this.field5712.method658(arg0);
            this.field5714 = new class80();
            this.field5714.method658(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1708((byte) 103);
            if (var6 == 0) {
                break;
            }
            this.field5724[var5] = var6;
            this.field5713[var5] = arg0.method1716((byte) 120);
            this.field5736[var5] = arg0.method1708((byte) 103);
        }
        this.field5725 = arg0.method1708((byte) 103);
        this.field5718 = arg0.method1708((byte) 103);
        this.field5720 = arg0.method1765(true);
        this.field5715 = arg0.method1765(true);
        this.field5723 = new class155();
        this.field5727 = new class80();
        this.field5723.method1213(arg0, this.field5727);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V", line = 116)
    public static void method2534() {
        field5728 = null;
        field5722 = null;
        field5726 = null;
        field5732 = null;
        field5734 = null;
        field5730 = null;
        field5733 = null;
        field5731 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I", line = 131)
    public final int[] method2535(int arg0, int arg1) {
        class242.method1847(field5728, 0, arg0);
        if (arg1 < 10) {
            return field5728;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5719.method656();
        this.field5729.method656();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5716 != null) {
            this.field5716.method656();
            this.field5721.method656();
            var5 = (int) ((double) (this.field5716.field1377 - this.field5716.field1374) * 32.768D / var3);
            var6 = (int) ((double) this.field5716.field1374 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5717 != null) {
            this.field5717.method656();
            this.field5735.method656();
            var8 = (int) ((double) (this.field5717.field1377 - this.field5717.field1374) * 32.768D / var3);
            var9 = (int) ((double) this.field5717.field1374 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5724[var11] != 0) {
                field5732[var11] = 0;
                field5734[var11] = (int) ((double) this.field5736[var11] * var3);
                field5730[var11] = (this.field5724[var11] << 14) / 100;
                field5733[var11] = (int) ((double) (this.field5719.field1377 - this.field5719.field1374) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5713[var11]) / var3);
                field5731[var11] = (int) ((double) this.field5719.field1374 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field5719.method657(arg0);
            int var14 = this.field5729.method657(arg0);
            if (this.field5716 != null) {
                int var15 = this.field5716.method657(arg0);
                int var16 = this.field5721.method657(arg0);
                var13 += this.method2532(var7, var16, this.field5716.field1378) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field5717 != null) {
                int var17 = this.field5717.method657(arg0);
                int var18 = this.field5735.method657(arg0);
                var14 = var14 * ((this.method2532(var10, var18, this.field5717.field1378) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field5724[var19] != 0) {
                    int var20 = field5734[var19] + var12;
                    if (var20 < arg0) {
                        field5728[var20] += this.method2532(field5732[var19], field5730[var19] * var14 >> 15, this.field5719.field1378);
                        field5732[var19] += (field5733[var19] * var13 >> 16) + field5731[var19];
                    }
                }
            }
        }
        if (this.field5712 != null) {
            this.field5712.method656();
            this.field5714.method656();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field5712.method657(arg0);
                int var26 = this.field5714.method657(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field5712.field1377 - this.field5712.field1374) * var25 >> 8) + this.field5712.field1374;
                } else {
                    var27 = ((this.field5712.field1377 - this.field5712.field1374) * var26 >> 8) + this.field5712.field1374;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field5728[var24] = 0;
                }
            }
        }
        if (this.field5725 > 0 && this.field5718 > 0) {
            int var28 = (int) ((double) this.field5725 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field5728[var29] += field5728[var29 - var28] * this.field5718 / 100;
            }
        }
        if (this.field5723.field2461[0] > 0 || this.field5723.field2461[1] > 0) {
            this.field5727.method656();
            int var30 = this.field5727.method657(arg0 + 1);
            int var31 = this.field5723.method1214(0, (float) var30 / 65536.0F);
            int var32 = this.field5723.method1214(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field5728[var31 + var33] * (long) class155.field2466 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field5728[var31 + var33 - var36 - 1] * (long) class155.field2462[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field5728[var33 - var37 - 1] * (long) class155.field2462[1][var37] >> 16);
                    }
                    field5728[var33] = var35;
                    var30 = this.field5727.method657(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field5728[var31 + var33] * (long) class155.field2466 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field5728[var31 + var33 - var40 - 1] * (long) class155.field2462[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field5728[var33 - var41 - 1] * (long) class155.field2462[1][var41] >> 16);
                        }
                        field5728[var33] = var39;
                        var30 = this.field5727.method657(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field5728[var31 + var33 - var43 - 1] * (long) class155.field2462[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field5728[var33 - var44 - 1] * (long) class155.field2462[1][var44] >> 16);
                            }
                            field5728[var33] = var42;
                            this.field5727.method657(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field5723.method1214(0, (float) var30 / 65536.0F);
                    var32 = this.field5723.method1214(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field5728[var46] < -32768) {
                field5728[var46] = -32768;
            }
            if (field5728[var46] > 32767) {
                field5728[var46] = 32767;
            }
        }
        return field5728;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5722[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5726 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5726[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5728 = new int[220500];
        field5732 = new int[5];
        field5731 = new int[5];
        field5733 = new int[5];
        field5730 = new int[5];
        field5734 = new int[5];
    }
}
