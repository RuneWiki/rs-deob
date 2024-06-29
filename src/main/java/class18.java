import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field286 = 500;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
    private int[] field295 = new int[5];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    private int[] field285 = new int[5];

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field287 = 0;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    private int field302 = 0;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
    private int[] field303 = new int[5];

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    private int field298 = 100;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    private static int[] field289 = new int[32768];

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
    private static int[] field291;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
    private static int[] field301;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "[I")
    private static int[] field305;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
    private static int[] field304;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "[I")
    private static int[] field306;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "[I")
    private static int[] field308;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "[I")
    private static int[] field309;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lwj;")
    private class269 field296;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lwo;")
    private class522 field288;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lwo;")
    private class522 field290;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Lwo;")
    private class522 field292;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lwo;")
    private class522 field293;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lwo;")
    private class522 field294;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lwo;")
    private class522 field297;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lwo;")
    private class522 field299;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lwo;")
    private class522 field300;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lwo;")
    private class522 field307;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field289[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field291 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field291[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field301 = new int[220500];
        field305 = new int[5];
        field304 = new int[5];
        field306 = new int[5];
        field308 = new int[5];
        field309 = new int[5];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lcu;)V", line = 14)
    public final void method144(class145 arg0) {
        this.field293 = new class522();
        this.field293.method3109(arg0);
        this.field294 = new class522();
        this.field294.method3109(arg0);
        int var2 = arg0.method1063((byte) -74);
        if (var2 != 0) {
            arg0.field2289--;
            this.field290 = new class522();
            this.field290.method3109(arg0);
            this.field288 = new class522();
            this.field288.method3109(arg0);
        }
        int var3 = arg0.method1063((byte) -77);
        if (var3 != 0) {
            arg0.field2289--;
            this.field300 = new class522();
            this.field300.method3109(arg0);
            this.field299 = new class522();
            this.field299.method3109(arg0);
        }
        int var4 = arg0.method1063((byte) 125);
        if (var4 != 0) {
            arg0.field2289--;
            this.field307 = new class522();
            this.field307.method3109(arg0);
            this.field297 = new class522();
            this.field297.method3109(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1119(86);
            if (var6 == 0) {
                break;
            }
            this.field285[var5] = var6;
            this.field303[var5] = arg0.method1107(false);
            this.field295[var5] = arg0.method1119(-92);
        }
        this.field302 = arg0.method1119(34);
        this.field298 = arg0.method1119(-93);
        this.field286 = arg0.method1069((byte) -34);
        this.field287 = arg0.method1069((byte) -83);
        this.field296 = new class269();
        this.field292 = new class522();
        this.field296.method1738(arg0, this.field292);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I", line = 75)
    private final int method145(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field291[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field289[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V", line = 96)
    public static void method146() {
        field301 = null;
        field289 = null;
        field291 = null;
        field305 = null;
        field304 = null;
        field308 = null;
        field306 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I", line = 106)
    public final int[] method147(int arg0, int arg1) {
        class73.method590(field301, 0, arg0);
        if (arg1 < 10) {
            return field301;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field293.method3110();
        this.field294.method3110();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field290 != null) {
            this.field290.method3110();
            this.field288.method3110();
            var5 = (int) ((double) (this.field290.field7743 - this.field290.field7741) * 32.768D / var3);
            var6 = (int) ((double) this.field290.field7741 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field300 != null) {
            this.field300.method3110();
            this.field299.method3110();
            var8 = (int) ((double) (this.field300.field7743 - this.field300.field7741) * 32.768D / var3);
            var9 = (int) ((double) this.field300.field7741 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field285[var11] != 0) {
                field305[var11] = 0;
                field304[var11] = (int) ((double) this.field295[var11] * var3);
                field308[var11] = (this.field285[var11] << 14) / 100;
                field306[var11] = (int) ((double) (this.field293.field7743 - this.field293.field7741) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field303[var11]) / var3);
                field309[var11] = (int) ((double) this.field293.field7741 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field293.method3112(arg0);
            int var40 = this.field294.method3112(arg0);
            if (this.field290 != null) {
                int var41 = this.field290.method3112(arg0);
                int var42 = this.field288.method3112(arg0);
                var39 += this.method145(var7, var42, this.field290.field7742) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field300 != null) {
                int var43 = this.field300.method3112(arg0);
                int var44 = this.field299.method3112(arg0);
                var40 = var40 * ((this.method145(var10, var44, this.field300.field7742) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field285[var45] != 0) {
                    int var46 = field304[var45] + var12;
                    if (var46 < arg0) {
                        field301[var46] += this.method145(field305[var45], field308[var45] * var40 >> 15, this.field293.field7742);
                        field305[var45] += (field306[var45] * var39 >> 16) + field309[var45];
                    }
                }
            }
        }
        if (this.field307 != null) {
            this.field307.method3110();
            this.field297.method3110();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field307.method3112(arg0);
                int var18 = this.field297.method3112(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field307.field7743 - this.field307.field7741) * var17 >> 8) + this.field307.field7741;
                } else {
                    var19 = ((this.field307.field7743 - this.field307.field7741) * var18 >> 8) + this.field307.field7741;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field301[var16] = 0;
                }
            }
        }
        if (this.field302 > 0 && this.field298 > 0) {
            int var20 = (int) ((double) this.field302 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field301[var21] += field301[var21 - var20] * this.field298 / 100;
            }
        }
        if (this.field296.field3877[0] > 0 || this.field296.field3877[1] > 0) {
            this.field292.method3110();
            int var22 = this.field292.method3112(arg0 + 1);
            int var23 = this.field296.method1741(0, (float) var22 / 65536.0F);
            int var24 = this.field296.method1741(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field301[var23 + var25] * (long) class269.field3879 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field301[var23 + var25 - var36 - 1] * (long) class269.field3874[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field301[var25 - var37 - 1] * (long) class269.field3874[1][var37] >> 16);
                    }
                    field301[var25] = var35;
                    var22 = this.field292.method3112(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field301[var23 + var25] * (long) class269.field3879 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field301[var23 + var25 - var33 - 1] * (long) class269.field3874[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field301[var25 - var34 - 1] * (long) class269.field3874[1][var34] >> 16);
                        }
                        field301[var25] = var32;
                        var22 = this.field292.method3112(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field301[var23 + var25 - var29 - 1] * (long) class269.field3874[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field301[var25 - var30 - 1] * (long) class269.field3874[1][var30] >> 16);
                            }
                            field301[var25] = var28;
                            this.field292.method3112(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field296.method1741(0, (float) var22 / 65536.0F);
                    var24 = this.field296.method1741(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field301[var38] < -32768) {
                field301[var38] = -32768;
            }
            if (field301[var38] > 32767) {
                field301[var38] = 32767;
            }
        }
        return field301;
    }
}
