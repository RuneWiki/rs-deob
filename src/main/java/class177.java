import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class177 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    private int field3030 = 0;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field3028 = 500;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[I")
    private int[] field3038 = new int[5];

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public int field3036 = 0;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    private int field3029 = 100;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "[I")
    private int[] field3043 = new int[5];

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[I")
    private int[] field3035 = new int[5];

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
    private static int[] field3041 = new int[32768];

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
    private static int[] field3045;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "[I")
    private static int[] field3037;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[I")
    private static int[] field3048;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[I")
    private static int[] field3046;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
    private static int[] field3049;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[I")
    private static int[] field3050;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "[I")
    private static int[] field3051;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lni;")
    private class186 field3031;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lid;")
    private class214 field3027;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lid;")
    private class214 field3032;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lid;")
    private class214 field3033;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Lid;")
    private class214 field3034;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lid;")
    private class214 field3039;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Lid;")
    private class214 field3040;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lid;")
    private class214 field3042;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lid;")
    private class214 field3044;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lid;")
    private class214 field3047;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lji;)V")
    public final void method1191(class225 arg0) {
        this.field3040 = new class214();
        this.field3040.method1463(arg0);
        this.field3032 = new class214();
        this.field3032.method1463(arg0);
        int var2 = arg0.method1580(-52);
        if (var2 != 0) {
            arg0.field3996--;
            this.field3042 = new class214();
            this.field3042.method1463(arg0);
            this.field3034 = new class214();
            this.field3034.method1463(arg0);
        }
        int var3 = arg0.method1580(-25);
        if (var3 != 0) {
            arg0.field3996--;
            this.field3044 = new class214();
            this.field3044.method1463(arg0);
            this.field3039 = new class214();
            this.field3039.method1463(arg0);
        }
        int var4 = arg0.method1580(-108);
        if (var4 != 0) {
            arg0.field3996--;
            this.field3047 = new class214();
            this.field3047.method1463(arg0);
            this.field3033 = new class214();
            this.field3033.method1463(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1577(false);
            if (var6 == 0) {
                break;
            }
            this.field3043[var5] = var6;
            this.field3035[var5] = arg0.method1588(128);
            this.field3038[var5] = arg0.method1577(false);
        }
        this.field3030 = arg0.method1577(false);
        this.field3029 = arg0.method1577(false);
        this.field3028 = arg0.method1593(true);
        this.field3036 = arg0.method1593(true);
        this.field3031 = new class186();
        this.field3027 = new class214();
        this.field3031.method1258(arg0, this.field3027);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public static void method1192() {
        field3037 = null;
        field3041 = null;
        field3045 = null;
        field3049 = null;
        field3050 = null;
        field3046 = null;
        field3048 = null;
        field3051 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I")
    private final int method1193(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3045[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3041[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I")
    public final int[] method1194(int arg0, int arg1) {
        class58.method391(field3037, 0, arg0);
        if (arg1 < 10) {
            return field3037;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3040.method1461();
        this.field3032.method1461();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3042 != null) {
            this.field3042.method1461();
            this.field3034.method1461();
            var5 = (int) ((double) (this.field3042.field3781 - this.field3042.field3777) * 32.768D / var3);
            var6 = (int) ((double) this.field3042.field3777 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3044 != null) {
            this.field3044.method1461();
            this.field3039.method1461();
            var8 = (int) ((double) (this.field3044.field3781 - this.field3044.field3777) * 32.768D / var3);
            var9 = (int) ((double) this.field3044.field3777 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3043[var11] != 0) {
                field3049[var11] = 0;
                field3050[var11] = (int) ((double) this.field3038[var11] * var3);
                field3046[var11] = (this.field3043[var11] << 14) / 100;
                field3048[var11] = (int) ((double) (this.field3040.field3781 - this.field3040.field3777) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3035[var11]) / var3);
                field3051[var11] = (int) ((double) this.field3040.field3777 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3040.method1460(arg0);
            int var40 = this.field3032.method1460(arg0);
            if (this.field3042 != null) {
                int var41 = this.field3042.method1460(arg0);
                int var42 = this.field3034.method1460(arg0);
                var39 += this.method1193(var7, var42, this.field3042.field3780) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3044 != null) {
                int var43 = this.field3044.method1460(arg0);
                int var44 = this.field3039.method1460(arg0);
                var40 = var40 * ((this.method1193(var10, var44, this.field3044.field3780) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3043[var45] != 0) {
                    int var46 = field3050[var45] + var12;
                    if (var46 < arg0) {
                        field3037[var46] += this.method1193(field3049[var45], field3046[var45] * var40 >> 15, this.field3040.field3780);
                        field3049[var45] += (field3048[var45] * var39 >> 16) + field3051[var45];
                    }
                }
            }
        }
        if (this.field3047 != null) {
            this.field3047.method1461();
            this.field3033.method1461();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3047.method1460(arg0);
                int var18 = this.field3033.method1460(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3047.field3781 - this.field3047.field3777) * var17 >> 8) + this.field3047.field3777;
                } else {
                    var19 = ((this.field3047.field3781 - this.field3047.field3777) * var18 >> 8) + this.field3047.field3777;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3037[var16] = 0;
                }
            }
        }
        if (this.field3030 > 0 && this.field3029 > 0) {
            int var20 = (int) ((double) this.field3030 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3037[var21] += field3037[var21 - var20] * this.field3029 / 100;
            }
        }
        if (this.field3031.field3239[0] > 0 || this.field3031.field3239[1] > 0) {
            this.field3027.method1461();
            int var22 = this.field3027.method1460(arg0 + 1);
            int var23 = this.field3031.method1257(0, (float) var22 / 65536.0F);
            int var24 = this.field3031.method1257(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3037[var23 + var25] * (long) class186.field3243 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3037[var23 + var25 - var36 - 1] * (long) class186.field3241[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3037[var25 - var37 - 1] * (long) class186.field3241[1][var37] >> 16);
                    }
                    field3037[var25] = var35;
                    var22 = this.field3027.method1460(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3037[var23 + var25] * (long) class186.field3243 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3037[var23 + var25 - var33 - 1] * (long) class186.field3241[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3037[var25 - var34 - 1] * (long) class186.field3241[1][var34] >> 16);
                        }
                        field3037[var25] = var32;
                        var22 = this.field3027.method1460(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3037[var23 + var25 - var29 - 1] * (long) class186.field3241[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3037[var25 - var30 - 1] * (long) class186.field3241[1][var30] >> 16);
                            }
                            field3037[var25] = var28;
                            this.field3027.method1460(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3031.method1257(0, (float) var22 / 65536.0F);
                    var24 = this.field3031.method1257(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3037[var38] < -32768) {
                field3037[var38] = -32768;
            }
            if (field3037[var38] > 32767) {
                field3037[var38] = 32767;
            }
        }
        return field3037;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3041[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3045 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3045[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3037 = new int[220500];
        field3048 = new int[5];
        field3046 = new int[5];
        field3049 = new int[5];
        field3050 = new int[5];
        field3051 = new int[5];
    }
}
