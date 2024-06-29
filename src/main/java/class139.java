import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class139 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
    private int[] field2514 = new int[5];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[I")
    private int[] field2522 = new int[5];

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[I")
    private int[] field2524 = new int[5];

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public int field2527 = 500;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public int field2526 = 0;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    private int field2515 = 0;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    private int field2528 = 100;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
    private static int[] field2530 = new int[32768];

    @OriginalMember(owner = "client!og", name = "o", descriptor = "[I")
    private static int[] field2525;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "[I")
    private static int[] field2529;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
    private static int[] field2531;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "[I")
    private static int[] field2532;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "[I")
    private static int[] field2534;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "[I")
    private static int[] field2533;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "[I")
    private static int[] field2535;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lrg;")
    private class166 field2523;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lff;")
    private class56 field2511;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lff;")
    private class56 field2512;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lff;")
    private class56 field2513;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lff;")
    private class56 field2516;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lff;")
    private class56 field2517;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lff;")
    private class56 field2518;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lff;")
    private class56 field2519;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Lff;")
    private class56 field2520;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lff;")
    private class56 field2521;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lka;)V")
    public final void method858(class97 arg0) {
        this.field2513 = new class56();
        this.field2513.method301(arg0);
        this.field2519 = new class56();
        this.field2519.method301(arg0);
        int var2 = arg0.method588((byte) -113);
        if (var2 != 0) {
            arg0.field1834--;
            this.field2516 = new class56();
            this.field2516.method301(arg0);
            this.field2518 = new class56();
            this.field2518.method301(arg0);
        }
        int var3 = arg0.method588((byte) -103);
        if (var3 != 0) {
            arg0.field1834--;
            this.field2511 = new class56();
            this.field2511.method301(arg0);
            this.field2517 = new class56();
            this.field2517.method301(arg0);
        }
        int var4 = arg0.method588((byte) -62);
        if (var4 != 0) {
            arg0.field1834--;
            this.field2512 = new class56();
            this.field2512.method301(arg0);
            this.field2520 = new class56();
            this.field2520.method301(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method582(-14590);
            if (var6 == 0) {
                break;
            }
            this.field2514[var5] = var6;
            this.field2522[var5] = arg0.method603(-1);
            this.field2524[var5] = arg0.method582(-14590);
        }
        this.field2515 = arg0.method582(-14590);
        this.field2528 = arg0.method582(-14590);
        this.field2527 = arg0.method611(false);
        this.field2526 = arg0.method611(false);
        this.field2523 = new class166();
        this.field2521 = new class56();
        this.field2523.method1031(arg0, this.field2521);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public static void method859() {
        field2529 = null;
        field2530 = null;
        field2525 = null;
        field2534 = null;
        field2532 = null;
        field2535 = null;
        field2531 = null;
        field2533 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
    private final int method860(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2525[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2530[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method861(int arg0, int arg1) {
        class93.method538(field2529, 0, arg0);
        if (arg1 < 10) {
            return field2529;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2513.method299();
        this.field2519.method299();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2516 != null) {
            this.field2516.method299();
            this.field2518.method299();
            var5 = (int) ((double) (this.field2516.field992 - this.field2516.field993) * 32.768D / var3);
            var6 = (int) ((double) this.field2516.field993 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2511 != null) {
            this.field2511.method299();
            this.field2517.method299();
            var8 = (int) ((double) (this.field2511.field992 - this.field2511.field993) * 32.768D / var3);
            var9 = (int) ((double) this.field2511.field993 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2514[var11] != 0) {
                field2534[var11] = 0;
                field2532[var11] = (int) ((double) this.field2524[var11] * var3);
                field2535[var11] = (this.field2514[var11] << 14) / 100;
                field2531[var11] = (int) ((double) (this.field2513.field992 - this.field2513.field993) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2522[var11]) / var3);
                field2533[var11] = (int) ((double) this.field2513.field993 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2513.method300(arg0);
            int var40 = this.field2519.method300(arg0);
            if (this.field2516 != null) {
                int var41 = this.field2516.method300(arg0);
                int var42 = this.field2518.method300(arg0);
                var39 += this.method860(var7, var42, this.field2516.field991) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2511 != null) {
                int var43 = this.field2511.method300(arg0);
                int var44 = this.field2517.method300(arg0);
                var40 = var40 * ((this.method860(var10, var44, this.field2511.field991) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2514[var45] != 0) {
                    int var46 = field2532[var45] + var12;
                    if (var46 < arg0) {
                        field2529[var46] += this.method860(field2534[var45], field2535[var45] * var40 >> 15, this.field2513.field991);
                        field2534[var45] += (field2531[var45] * var39 >> 16) + field2533[var45];
                    }
                }
            }
        }
        if (this.field2512 != null) {
            this.field2512.method299();
            this.field2520.method299();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2512.method300(arg0);
                int var18 = this.field2520.method300(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2512.field992 - this.field2512.field993) * var17 >> 8) + this.field2512.field993;
                } else {
                    var19 = ((this.field2512.field992 - this.field2512.field993) * var18 >> 8) + this.field2512.field993;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2529[var16] = 0;
                }
            }
        }
        if (this.field2515 > 0 && this.field2528 > 0) {
            int var20 = (int) ((double) this.field2515 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2529[var21] += field2529[var21 - var20] * this.field2528 / 100;
            }
        }
        if (this.field2523.field2982[0] > 0 || this.field2523.field2982[1] > 0) {
            this.field2521.method299();
            int var22 = this.field2521.method300(arg0 + 1);
            int var23 = this.field2523.method1026(0, (float) var22 / 65536.0F);
            int var24 = this.field2523.method1026(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2529[var23 + var25] * (long) class166.field2984 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2529[var23 + var25 - var36 - 1] * (long) class166.field2981[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2529[var25 - var37 - 1] * (long) class166.field2981[1][var37] >> 16);
                    }
                    field2529[var25] = var35;
                    var22 = this.field2521.method300(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2529[var23 + var25] * (long) class166.field2984 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2529[var23 + var25 - var33 - 1] * (long) class166.field2981[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2529[var25 - var34 - 1] * (long) class166.field2981[1][var34] >> 16);
                        }
                        field2529[var25] = var32;
                        var22 = this.field2521.method300(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2529[var23 + var25 - var29 - 1] * (long) class166.field2981[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2529[var25 - var30 - 1] * (long) class166.field2981[1][var30] >> 16);
                            }
                            field2529[var25] = var28;
                            this.field2521.method300(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2523.method1026(0, (float) var22 / 65536.0F);
                    var24 = this.field2523.method1026(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2529[var38] < -32768) {
                field2529[var38] = -32768;
            }
            if (field2529[var38] > 32767) {
                field2529[var38] = 32767;
            }
        }
        return field2529;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2530[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2525 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2525[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2529 = new int[220500];
        field2531 = new int[5];
        field2532 = new int[5];
        field2534 = new int[5];
        field2533 = new int[5];
        field2535 = new int[5];
    }
}
