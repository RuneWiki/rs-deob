import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public int field18 = 500;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    private int field20 = 0;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
    private int[] field25 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
    private int[] field24 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    private int field26 = 100;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "[I")
    private int[] field27 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public int field31 = 0;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
    private static int[] field32 = new int[32768];

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[I")
    private static int[] field22;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    private static int[] field21;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
    private static int[] field34;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[I")
    private static int[] field35;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "[I")
    private static int[] field37;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
    private static int[] field36;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[I")
    private static int[] field33;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Li;")
    private class237 field13;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Li;")
    private class237 field14;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Li;")
    private class237 field15;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Li;")
    private class237 field16;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Li;")
    private class237 field17;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Li;")
    private class237 field19;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Li;")
    private class237 field23;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Li;")
    private class237 field28;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Li;")
    private class237 field30;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lmf;")
    private class55 field29;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V", line = 16)
    public static void method8() {
        field21 = null;
        field32 = null;
        field22 = null;
        field34 = null;
        field33 = null;
        field37 = null;
        field35 = null;
        field36 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpi;)V", line = 36)
    public final void method9(class336 arg0) {
        this.field19 = new class237();
        this.field19.method1680(arg0);
        this.field16 = new class237();
        this.field16.method1680(arg0);
        int var2 = arg0.method2364(-9069);
        if (var2 != 0) {
            arg0.field5353--;
            this.field30 = new class237();
            this.field30.method1680(arg0);
            this.field23 = new class237();
            this.field23.method1680(arg0);
        }
        int var3 = arg0.method2364(-9069);
        if (var3 != 0) {
            arg0.field5353--;
            this.field28 = new class237();
            this.field28.method1680(arg0);
            this.field13 = new class237();
            this.field13.method1680(arg0);
        }
        int var4 = arg0.method2364(-9069);
        if (var4 != 0) {
            arg0.field5353--;
            this.field15 = new class237();
            this.field15.method1680(arg0);
            this.field17 = new class237();
            this.field17.method1680(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2314((byte) -48);
            if (var6 == 0) {
                break;
            }
            this.field25[var5] = var6;
            this.field27[var5] = arg0.method2321((byte) -62);
            this.field24[var5] = arg0.method2314((byte) -70);
        }
        this.field20 = arg0.method2314((byte) -48);
        this.field26 = arg0.method2314((byte) -35);
        this.field18 = arg0.method2339((byte) -46);
        this.field31 = arg0.method2339((byte) -46);
        this.field29 = new class55();
        this.field14 = new class237();
        this.field29.method494(arg0, this.field14);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I", line = 97)
    private final int method10(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field22[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field32[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method11(int arg0, int arg1) {
        class345.method2418(field21, 0, arg0);
        if (arg1 < 10) {
            return field21;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field19.method1678();
        this.field16.method1678();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field30 != null) {
            this.field30.method1678();
            this.field23.method1678();
            var5 = (int) ((double) (this.field30.field3887 - this.field30.field3885) * 32.768D / var3);
            var6 = (int) ((double) this.field30.field3885 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field28 != null) {
            this.field28.method1678();
            this.field13.method1678();
            var8 = (int) ((double) (this.field28.field3887 - this.field28.field3885) * 32.768D / var3);
            var9 = (int) ((double) this.field28.field3885 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field25[var11] != 0) {
                field34[var11] = 0;
                field33[var11] = (int) ((double) this.field24[var11] * var3);
                field37[var11] = (this.field25[var11] << 14) / 100;
                field35[var11] = (int) ((double) (this.field19.field3887 - this.field19.field3885) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field27[var11]) / var3);
                field36[var11] = (int) ((double) this.field19.field3885 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field19.method1679(arg0);
            int var14 = this.field16.method1679(arg0);
            if (this.field30 != null) {
                int var15 = this.field30.method1679(arg0);
                int var16 = this.field23.method1679(arg0);
                var13 += this.method10(var7, var16, this.field30.field3884) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field28 != null) {
                int var17 = this.field28.method1679(arg0);
                int var18 = this.field13.method1679(arg0);
                var14 = var14 * ((this.method10(var10, var18, this.field28.field3884) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field25[var19] != 0) {
                    int var20 = field33[var19] + var12;
                    if (var20 < arg0) {
                        field21[var20] += this.method10(field34[var19], field37[var19] * var14 >> 15, this.field19.field3884);
                        field34[var19] += (field35[var19] * var13 >> 16) + field36[var19];
                    }
                }
            }
        }
        if (this.field15 != null) {
            this.field15.method1678();
            this.field17.method1678();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field15.method1679(arg0);
                int var26 = this.field17.method1679(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field15.field3887 - this.field15.field3885) * var25 >> 8) + this.field15.field3885;
                } else {
                    var27 = ((this.field15.field3887 - this.field15.field3885) * var26 >> 8) + this.field15.field3885;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field21[var24] = 0;
                }
            }
        }
        if (this.field20 > 0 && this.field26 > 0) {
            int var28 = (int) ((double) this.field20 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field21[var29] += field21[var29 - var28] * this.field26 / 100;
            }
        }
        if (this.field29.field847[0] > 0 || this.field29.field847[1] > 0) {
            this.field14.method1678();
            int var30 = this.field14.method1679(arg0 + 1);
            int var31 = this.field29.method496(0, (float) var30 / 65536.0F);
            int var32 = this.field29.method496(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field21[var31 + var33] * (long) class55.field853 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field21[var31 + var33 - var36 - 1] * (long) class55.field852[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field21[var33 - var37 - 1] * (long) class55.field852[1][var37] >> 16);
                    }
                    field21[var33] = var35;
                    var30 = this.field14.method1679(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field21[var31 + var33] * (long) class55.field853 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field21[var31 + var33 - var40 - 1] * (long) class55.field852[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field21[var33 - var41 - 1] * (long) class55.field852[1][var41] >> 16);
                        }
                        field21[var33] = var39;
                        var30 = this.field14.method1679(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field21[var31 + var33 - var43 - 1] * (long) class55.field852[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field21[var33 - var44 - 1] * (long) class55.field852[1][var44] >> 16);
                            }
                            field21[var33] = var42;
                            this.field14.method1679(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field29.method496(0, (float) var30 / 65536.0F);
                    var32 = this.field29.method496(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field21[var46] < -32768) {
                field21[var46] = -32768;
            }
            if (field21[var46] > 32767) {
                field21[var46] = 32767;
            }
        }
        return field21;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field32[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field22 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field22[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field21 = new int[220500];
        field34 = new int[5];
        field35 = new int[5];
        field37 = new int[5];
        field36 = new int[5];
        field33 = new int[5];
    }
}
