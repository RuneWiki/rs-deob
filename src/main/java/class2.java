import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    private int field16 = 0;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
    private int[] field25 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public int field21 = 500;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    private int[] field23 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public int field30 = 0;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
    private int[] field27 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    private int field31 = 100;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
    private static int[] field17 = new int[32768];

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
    private static int[] field26;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[I")
    private static int[] field24;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
    private static int[] field34;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
    private static int[] field36;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[I")
    private static int[] field35;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "[I")
    private static int[] field39;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[I")
    private static int[] field37;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lpj;")
    private class194 field15;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lpj;")
    private class194 field18;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lpj;")
    private class194 field19;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lpj;")
    private class194 field20;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lpj;")
    private class194 field28;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lpj;")
    private class194 field29;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lpj;")
    private class194 field32;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lpj;")
    private class194 field33;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Lpj;")
    private class194 field38;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lfh;")
    private class212 field22;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V", line = 3)
    public static void method4() {
        field24 = null;
        field17 = null;
        field26 = null;
        field35 = null;
        field39 = null;
        field34 = null;
        field36 = null;
        field37 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I", line = 47)
    private final int method5(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field26[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field17[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field17[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field26 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field26[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field24 = new int[220500];
        field34 = new int[5];
        field36 = new int[5];
        field35 = new int[5];
        field39 = new int[5];
        field37 = new int[5];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I", line = 106)
    public final int[] method6(int arg0, int arg1) {
        class86.method511(field24, 0, arg0);
        if (arg1 < 10) {
            return field24;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field20.method1351();
        this.field33.method1351();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field15 != null) {
            this.field15.method1351();
            this.field18.method1351();
            var5 = (int) ((double) (this.field15.field2783 - this.field15.field2785) * 32.768D / var3);
            var6 = (int) ((double) this.field15.field2785 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field38 != null) {
            this.field38.method1351();
            this.field32.method1351();
            var8 = (int) ((double) (this.field38.field2783 - this.field38.field2785) * 32.768D / var3);
            var9 = (int) ((double) this.field38.field2785 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field27[var11] != 0) {
                field35[var11] = 0;
                field39[var11] = (int) ((double) this.field25[var11] * var3);
                field34[var11] = (this.field27[var11] << 14) / 100;
                field36[var11] = (int) ((double) (this.field20.field2783 - this.field20.field2785) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field23[var11]) / var3);
                field37[var11] = (int) ((double) this.field20.field2785 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field20.method1350(arg0);
            int var14 = this.field33.method1350(arg0);
            if (this.field15 != null) {
                int var15 = this.field15.method1350(arg0);
                int var16 = this.field18.method1350(arg0);
                var13 += this.method5(var7, var16, this.field15.field2787) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field38 != null) {
                int var17 = this.field38.method1350(arg0);
                int var18 = this.field32.method1350(arg0);
                var14 = var14 * ((this.method5(var10, var18, this.field38.field2787) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field27[var19] != 0) {
                    int var20 = field39[var19] + var12;
                    if (var20 < arg0) {
                        field24[var20] += this.method5(field35[var19], field34[var19] * var14 >> 15, this.field20.field2787);
                        field35[var19] += (field36[var19] * var13 >> 16) + field37[var19];
                    }
                }
            }
        }
        if (this.field28 != null) {
            this.field28.method1351();
            this.field19.method1351();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field28.method1350(arg0);
                int var26 = this.field19.method1350(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field28.field2783 - this.field28.field2785) * var25 >> 8) + this.field28.field2785;
                } else {
                    var27 = ((this.field28.field2783 - this.field28.field2785) * var26 >> 8) + this.field28.field2785;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field24[var24] = 0;
                }
            }
        }
        if (this.field16 > 0 && this.field31 > 0) {
            int var28 = (int) ((double) this.field16 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field24[var29] += field24[var29 - var28] * this.field31 / 100;
            }
        }
        if (this.field22.field2988[0] > 0 || this.field22.field2988[1] > 0) {
            this.field29.method1351();
            int var30 = this.field29.method1350(arg0 + 1);
            int var31 = this.field22.method1453(0, (float) var30 / 65536.0F);
            int var32 = this.field22.method1453(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field24[var31 + var33] * (long) class212.field2995 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field24[var31 + var33 - var36 - 1] * (long) class212.field2991[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field24[var33 - var37 - 1] * (long) class212.field2991[1][var37] >> 16);
                    }
                    field24[var33] = var35;
                    var30 = this.field29.method1350(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field24[var31 + var33] * (long) class212.field2995 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field24[var31 + var33 - var40 - 1] * (long) class212.field2991[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field24[var33 - var41 - 1] * (long) class212.field2991[1][var41] >> 16);
                        }
                        field24[var33] = var39;
                        var30 = this.field29.method1350(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field24[var31 + var33 - var43 - 1] * (long) class212.field2991[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field24[var33 - var44 - 1] * (long) class212.field2991[1][var44] >> 16);
                            }
                            field24[var33] = var42;
                            this.field29.method1350(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field22.method1453(0, (float) var30 / 65536.0F);
                    var32 = this.field22.method1453(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field24[var46] < -32768) {
                field24[var46] = -32768;
            }
            if (field24[var46] > 32767) {
                field24[var46] = 32767;
            }
        }
        return field24;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lp;)V", line = 395)
    public final void method7(class107 arg0) {
        this.field20 = new class194();
        this.field20.method1348(arg0);
        this.field33 = new class194();
        this.field33.method1348(arg0);
        int var2 = arg0.method661(-1);
        if (var2 != 0) {
            arg0.field1400--;
            this.field15 = new class194();
            this.field15.method1348(arg0);
            this.field18 = new class194();
            this.field18.method1348(arg0);
        }
        int var3 = arg0.method661(-1);
        if (var3 != 0) {
            arg0.field1400--;
            this.field38 = new class194();
            this.field38.method1348(arg0);
            this.field32 = new class194();
            this.field32.method1348(arg0);
        }
        int var4 = arg0.method661(-1);
        if (var4 != 0) {
            arg0.field1400--;
            this.field28 = new class194();
            this.field28.method1348(arg0);
            this.field19 = new class194();
            this.field19.method1348(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method643(-14205);
            if (var6 == 0) {
                break;
            }
            this.field27[var5] = var6;
            this.field23[var5] = arg0.method650(-62);
            this.field25[var5] = arg0.method643(-14205);
        }
        this.field16 = arg0.method643(-14205);
        this.field31 = arg0.method643(-14205);
        this.field21 = arg0.method624(14612);
        this.field30 = arg0.method624(14612);
        this.field22 = new class212();
        this.field29 = new class194();
        this.field22.method1452(arg0, this.field29);
    }
}
