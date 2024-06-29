import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class176 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    private int field2423 = 100;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
    private int[] field2431 = new int[5];

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "[I")
    private int[] field2430 = new int[5];

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[I")
    private int[] field2427 = new int[5];

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public int field2433 = 500;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field2436 = 0;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public int field2439 = 0;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
    private static int[] field2438 = new int[32768];

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "[I")
    private static int[] field2435;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "[I")
    private static int[] field2429;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[I")
    private static int[] field2441;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
    private static int[] field2440;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[I")
    private static int[] field2442;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[I")
    private static int[] field2443;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[I")
    private static int[] field2444;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lmp;")
    private class23 field2425;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lcp;")
    private class410 field2420;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lcp;")
    private class410 field2421;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lcp;")
    private class410 field2422;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lcp;")
    private class410 field2424;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lcp;")
    private class410 field2426;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Lcp;")
    private class410 field2428;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lcp;")
    private class410 field2432;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Lcp;")
    private class410 field2434;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Lcp;")
    private class410 field2437;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2438[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2435 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2435[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2429 = new int[220500];
        field2441 = new int[5];
        field2440 = new int[5];
        field2442 = new int[5];
        field2443 = new int[5];
        field2444 = new int[5];
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I", line = 14)
    private final int method1223(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2435[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2438[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V", line = 35)
    public static void method1224() {
        field2429 = null;
        field2438 = null;
        field2435 = null;
        field2444 = null;
        field2443 = null;
        field2442 = null;
        field2441 = null;
        field2440 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I", line = 48)
    public final int[] method1225(int arg0, int arg1) {
        class224.method1544(field2429, 0, arg0);
        if (arg1 < 10) {
            return field2429;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2432.method2547();
        this.field2420.method2547();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2428 != null) {
            this.field2428.method2547();
            this.field2434.method2547();
            var5 = (int) ((double) (this.field2428.field5889 - this.field2428.field5893) * 32.768D / var3);
            var6 = (int) ((double) this.field2428.field5893 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2426 != null) {
            this.field2426.method2547();
            this.field2422.method2547();
            var8 = (int) ((double) (this.field2426.field5889 - this.field2426.field5893) * 32.768D / var3);
            var9 = (int) ((double) this.field2426.field5893 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2431[var11] != 0) {
                field2444[var11] = 0;
                field2443[var11] = (int) ((double) this.field2427[var11] * var3);
                field2442[var11] = (this.field2431[var11] << 14) / 100;
                field2441[var11] = (int) ((double) (this.field2432.field5889 - this.field2432.field5893) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2430[var11]) / var3);
                field2440[var11] = (int) ((double) this.field2432.field5893 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2432.method2544(arg0);
            int var40 = this.field2420.method2544(arg0);
            if (this.field2428 != null) {
                int var41 = this.field2428.method2544(arg0);
                int var42 = this.field2434.method2544(arg0);
                var39 += this.method1223(var7, var42, this.field2428.field5892) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2426 != null) {
                int var43 = this.field2426.method2544(arg0);
                int var44 = this.field2422.method2544(arg0);
                var40 = var40 * ((this.method1223(var10, var44, this.field2426.field5892) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2431[var45] != 0) {
                    int var46 = field2443[var45] + var12;
                    if (var46 < arg0) {
                        field2429[var46] += this.method1223(field2444[var45], field2442[var45] * var40 >> 15, this.field2432.field5892);
                        field2444[var45] += (field2441[var45] * var39 >> 16) + field2440[var45];
                    }
                }
            }
        }
        if (this.field2437 != null) {
            this.field2437.method2547();
            this.field2421.method2547();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2437.method2544(arg0);
                int var18 = this.field2421.method2544(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2437.field5889 - this.field2437.field5893) * var17 >> 8) + this.field2437.field5893;
                } else {
                    var19 = ((this.field2437.field5889 - this.field2437.field5893) * var18 >> 8) + this.field2437.field5893;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2429[var16] = 0;
                }
            }
        }
        if (this.field2436 > 0 && this.field2423 > 0) {
            int var20 = (int) ((double) this.field2436 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2429[var21] += field2429[var21 - var20] * this.field2423 / 100;
            }
        }
        if (this.field2425.field328[0] > 0 || this.field2425.field328[1] > 0) {
            this.field2424.method2547();
            int var22 = this.field2424.method2544(arg0 + 1);
            int var23 = this.field2425.method243(0, (float) var22 / 65536.0F);
            int var24 = this.field2425.method243(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2429[var23 + var25] * (long) class23.field325 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2429[var23 + var25 - var36 - 1] * (long) class23.field326[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2429[var25 - var37 - 1] * (long) class23.field326[1][var37] >> 16);
                    }
                    field2429[var25] = var35;
                    var22 = this.field2424.method2544(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2429[var23 + var25] * (long) class23.field325 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2429[var23 + var25 - var33 - 1] * (long) class23.field326[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2429[var25 - var34 - 1] * (long) class23.field326[1][var34] >> 16);
                        }
                        field2429[var25] = var32;
                        var22 = this.field2424.method2544(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2429[var23 + var25 - var29 - 1] * (long) class23.field326[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2429[var25 - var30 - 1] * (long) class23.field326[1][var30] >> 16);
                            }
                            field2429[var25] = var28;
                            this.field2424.method2544(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2425.method243(0, (float) var22 / 65536.0F);
                    var24 = this.field2425.method243(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2429[var38] < -32768) {
                field2429[var38] = -32768;
            }
            if (field2429[var38] > 32767) {
                field2429[var38] = 32767;
            }
        }
        return field2429;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lat;)V", line = 332)
    public final void method1226(class256 arg0) {
        this.field2432 = new class410();
        this.field2432.method2546(arg0);
        this.field2420 = new class410();
        this.field2420.method2546(arg0);
        int var2 = arg0.method1738((byte) 125);
        if (var2 != 0) {
            arg0.field3762--;
            this.field2428 = new class410();
            this.field2428.method2546(arg0);
            this.field2434 = new class410();
            this.field2434.method2546(arg0);
        }
        int var3 = arg0.method1738((byte) -85);
        if (var3 != 0) {
            arg0.field3762--;
            this.field2426 = new class410();
            this.field2426.method2546(arg0);
            this.field2422 = new class410();
            this.field2422.method2546(arg0);
        }
        int var4 = arg0.method1738((byte) 114);
        if (var4 != 0) {
            arg0.field3762--;
            this.field2437 = new class410();
            this.field2437.method2546(arg0);
            this.field2421 = new class410();
            this.field2421.method2546(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1740(128);
            if (var6 == 0) {
                break;
            }
            this.field2431[var5] = var6;
            this.field2430[var5] = arg0.method1716(-9657);
            this.field2427[var5] = arg0.method1740(128);
        }
        this.field2436 = arg0.method1740(128);
        this.field2423 = arg0.method1740(128);
        this.field2433 = arg0.method1767(1930493576);
        this.field2439 = arg0.method1767(1930493576);
        this.field2425 = new class23();
        this.field2424 = new class410();
        this.field2425.method246(arg0, this.field2424);
    }
}
