import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class8 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    private int[] field105 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field109 = 0;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[I")
    private int[] field114 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public int field106 = 500;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public int field119 = 0;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    private int field113 = 100;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "[I")
    private int[] field121 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    private static int[] field103 = new int[32768];

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[I")
    private static int[] field110;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[I")
    private static int[] field102;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
    private static int[] field120;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "[I")
    private static int[] field115;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
    private static int[] field117;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    private static int[] field112;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[I")
    private static int[] field123;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lih;")
    private class144 field116;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lug;")
    private class209 field101;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lug;")
    private class209 field104;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lug;")
    private class209 field107;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lug;")
    private class209 field108;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lug;")
    private class209 field111;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lug;")
    private class209 field118;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lug;")
    private class209 field122;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lug;")
    private class209 field124;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lug;")
    private class209 field125;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lkh;)V", line = 7)
    public final void method64(class166 arg0) {
        this.field108 = new class209();
        this.field108.method1483(arg0);
        this.field125 = new class209();
        this.field125.method1483(arg0);
        int var2 = arg0.method1178(0);
        if (var2 != 0) {
            arg0.field2532--;
            this.field122 = new class209();
            this.field122.method1483(arg0);
            this.field118 = new class209();
            this.field118.method1483(arg0);
        }
        int var3 = arg0.method1178(0);
        if (var3 != 0) {
            arg0.field2532--;
            this.field111 = new class209();
            this.field111.method1483(arg0);
            this.field101 = new class209();
            this.field101.method1483(arg0);
        }
        int var4 = arg0.method1178(0);
        if (var4 != 0) {
            arg0.field2532--;
            this.field124 = new class209();
            this.field124.method1483(arg0);
            this.field107 = new class209();
            this.field107.method1483(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1145(128);
            if (var6 == 0) {
                break;
            }
            this.field105[var5] = var6;
            this.field121[var5] = arg0.method1173(-3979);
            this.field114[var5] = arg0.method1145(128);
        }
        this.field109 = arg0.method1145(128);
        this.field113 = arg0.method1145(128);
        this.field106 = arg0.method1151(-103);
        this.field119 = arg0.method1151(-65);
        this.field116 = new class144();
        this.field104 = new class209();
        this.field116.method1024(arg0, this.field104);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field103[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field110 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field110[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field102 = new int[220500];
        field120 = new int[5];
        field115 = new int[5];
        field117 = new int[5];
        field112 = new int[5];
        field123 = new int[5];
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V", line = 116)
    public static void method65() {
        field102 = null;
        field103 = null;
        field110 = null;
        field115 = null;
        field120 = null;
        field117 = null;
        field112 = null;
        field123 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I", line = 135)
    private final int method66(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field110[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field103[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)[I", line = 156)
    public final int[] method67(int arg0, int arg1) {
        class343.method2370(field102, 0, arg0);
        if (arg1 < 10) {
            return field102;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field108.method1485();
        this.field125.method1485();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field122 != null) {
            this.field122.method1485();
            this.field118.method1485();
            var5 = (int) ((double) (this.field122.field3201 - this.field122.field3197) * 32.768D / var3);
            var6 = (int) ((double) this.field122.field3197 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field111 != null) {
            this.field111.method1485();
            this.field101.method1485();
            var8 = (int) ((double) (this.field111.field3201 - this.field111.field3197) * 32.768D / var3);
            var9 = (int) ((double) this.field111.field3197 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field105[var11] != 0) {
                field115[var11] = 0;
                field120[var11] = (int) ((double) this.field114[var11] * var3);
                field117[var11] = (this.field105[var11] << 14) / 100;
                field112[var11] = (int) ((double) (this.field108.field3201 - this.field108.field3197) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field121[var11]) / var3);
                field123[var11] = (int) ((double) this.field108.field3197 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field108.method1484(arg0);
            int var14 = this.field125.method1484(arg0);
            if (this.field122 != null) {
                int var15 = this.field122.method1484(arg0);
                int var16 = this.field118.method1484(arg0);
                var13 += this.method66(var7, var16, this.field122.field3200) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field111 != null) {
                int var17 = this.field111.method1484(arg0);
                int var18 = this.field101.method1484(arg0);
                var14 = var14 * ((this.method66(var10, var18, this.field111.field3200) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field105[var19] != 0) {
                    int var20 = field120[var19] + var12;
                    if (var20 < arg0) {
                        field102[var20] += this.method66(field115[var19], field117[var19] * var14 >> 15, this.field108.field3200);
                        field115[var19] += (field112[var19] * var13 >> 16) + field123[var19];
                    }
                }
            }
        }
        if (this.field124 != null) {
            this.field124.method1485();
            this.field107.method1485();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field124.method1484(arg0);
                int var26 = this.field107.method1484(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field124.field3201 - this.field124.field3197) * var25 >> 8) + this.field124.field3197;
                } else {
                    var27 = ((this.field124.field3201 - this.field124.field3197) * var26 >> 8) + this.field124.field3197;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field102[var24] = 0;
                }
            }
        }
        if (this.field109 > 0 && this.field113 > 0) {
            int var28 = (int) ((double) this.field109 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field102[var29] += field102[var29 - var28] * this.field113 / 100;
            }
        }
        if (this.field116.field2230[0] > 0 || this.field116.field2230[1] > 0) {
            this.field104.method1485();
            int var30 = this.field104.method1484(arg0 + 1);
            int var31 = this.field116.method1020(0, (float) var30 / 65536.0F);
            int var32 = this.field116.method1020(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field102[var31 + var33] * (long) class144.field2228 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field102[var31 + var33 - var36 - 1] * (long) class144.field2233[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field102[var33 - var37 - 1] * (long) class144.field2233[1][var37] >> 16);
                    }
                    field102[var33] = var35;
                    var30 = this.field104.method1484(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field102[var31 + var33] * (long) class144.field2228 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field102[var31 + var33 - var40 - 1] * (long) class144.field2233[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field102[var33 - var41 - 1] * (long) class144.field2233[1][var41] >> 16);
                        }
                        field102[var33] = var39;
                        var30 = this.field104.method1484(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field102[var31 + var33 - var43 - 1] * (long) class144.field2233[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field102[var33 - var44 - 1] * (long) class144.field2233[1][var44] >> 16);
                            }
                            field102[var33] = var42;
                            this.field104.method1484(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field116.method1020(0, (float) var30 / 65536.0F);
                    var32 = this.field116.method1020(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field102[var46] < -32768) {
                field102[var46] = -32768;
            }
            if (field102[var46] > 32767) {
                field102[var46] = 32767;
            }
        }
        return field102;
    }
}
