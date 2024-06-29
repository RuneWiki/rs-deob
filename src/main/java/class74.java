import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class74 {

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
    private int[] field1400 = new int[5];

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    private int[] field1394 = new int[5];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    private int field1389 = 100;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    private int[] field1393 = new int[5];

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public int field1406 = 500;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public int field1407 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    private int field1391 = 0;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
    private static int[] field1404 = new int[32768];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    private static int[] field1392;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[I")
    private static int[] field1390;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "[I")
    private static int[] field1413;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[I")
    private static int[] field1410;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
    private static int[] field1411;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "[I")
    private static int[] field1412;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "[I")
    private static int[] field1409;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lme;")
    private class113 field1395;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lme;")
    private class113 field1397;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lme;")
    private class113 field1398;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lme;")
    private class113 field1399;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lme;")
    private class113 field1401;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lme;")
    private class113 field1402;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lme;")
    private class113 field1403;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lme;")
    private class113 field1405;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lme;")
    private class113 field1408;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Ltb;")
    private class173 field1396;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[I")
    public final int[] method457(int arg0, int arg1) {
        class97.method582(field1390, 0, arg0);
        if (arg1 < 10) {
            return field1390;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1399.method697();
        this.field1405.method697();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1395 != null) {
            this.field1395.method697();
            this.field1397.method697();
            var5 = (int) ((double) (this.field1395.field2062 - this.field1395.field2061) * 32.768D / var3);
            var6 = (int) ((double) this.field1395.field2061 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1408 != null) {
            this.field1408.method697();
            this.field1402.method697();
            var8 = (int) ((double) (this.field1408.field2062 - this.field1408.field2061) * 32.768D / var3);
            var9 = (int) ((double) this.field1408.field2061 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1400[var11] != 0) {
                field1410[var11] = 0;
                field1412[var11] = (int) ((double) this.field1393[var11] * var3);
                field1409[var11] = (this.field1400[var11] << 14) / 100;
                field1411[var11] = (int) ((double) (this.field1399.field2062 - this.field1399.field2061) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1394[var11]) / var3);
                field1413[var11] = (int) ((double) this.field1399.field2061 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1399.method696(arg0);
            int var40 = this.field1405.method696(arg0);
            if (this.field1395 != null) {
                int var41 = this.field1395.method696(arg0);
                int var42 = this.field1397.method696(arg0);
                var39 += this.method459(var7, var42, this.field1395.field2065) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1408 != null) {
                int var43 = this.field1408.method696(arg0);
                int var44 = this.field1402.method696(arg0);
                var40 = var40 * ((this.method459(var10, var44, this.field1408.field2065) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1400[var45] != 0) {
                    int var46 = field1412[var45] + var12;
                    if (var46 < arg0) {
                        field1390[var46] += this.method459(field1410[var45], field1409[var45] * var40 >> 15, this.field1399.field2065);
                        field1410[var45] += (field1411[var45] * var39 >> 16) + field1413[var45];
                    }
                }
            }
        }
        if (this.field1401 != null) {
            this.field1401.method697();
            this.field1403.method697();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1401.method696(arg0);
                int var18 = this.field1403.method696(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1401.field2062 - this.field1401.field2061) * var17 >> 8) + this.field1401.field2061;
                } else {
                    var19 = ((this.field1401.field2062 - this.field1401.field2061) * var18 >> 8) + this.field1401.field2061;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1390[var16] = 0;
                }
            }
        }
        if (this.field1391 > 0 && this.field1389 > 0) {
            int var20 = (int) ((double) this.field1391 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1390[var21] += field1390[var21 - var20] * this.field1389 / 100;
            }
        }
        if (this.field1396.field3344[0] > 0 || this.field1396.field3344[1] > 0) {
            this.field1398.method697();
            int var22 = this.field1398.method696(arg0 + 1);
            int var23 = this.field1396.method1153(0, (float) var22 / 65536.0F);
            int var24 = this.field1396.method1153(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1390[var23 + var25] * (long) class173.field3345 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1390[var23 + var25 - var36 - 1] * (long) class173.field3346[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1390[var25 - var37 - 1] * (long) class173.field3346[1][var37] >> 16);
                    }
                    field1390[var25] = var35;
                    var22 = this.field1398.method696(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1390[var23 + var25] * (long) class173.field3345 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1390[var23 + var25 - var33 - 1] * (long) class173.field3346[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1390[var25 - var34 - 1] * (long) class173.field3346[1][var34] >> 16);
                        }
                        field1390[var25] = var32;
                        var22 = this.field1398.method696(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1390[var23 + var25 - var29 - 1] * (long) class173.field3346[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1390[var25 - var30 - 1] * (long) class173.field3346[1][var30] >> 16);
                            }
                            field1390[var25] = var28;
                            this.field1398.method696(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1396.method1153(0, (float) var22 / 65536.0F);
                    var24 = this.field1396.method1153(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1390[var38] < -32768) {
                field1390[var38] = -32768;
            }
            if (field1390[var38] > 32767) {
                field1390[var38] = 32767;
            }
        }
        return field1390;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Loa;)V")
    public final void method458(class127 arg0) {
        this.field1399 = new class113();
        this.field1399.method695(arg0);
        this.field1405 = new class113();
        this.field1405.method695(arg0);
        int var2 = arg0.method819((byte) 22);
        if (var2 != 0) {
            arg0.field2346--;
            this.field1395 = new class113();
            this.field1395.method695(arg0);
            this.field1397 = new class113();
            this.field1397.method695(arg0);
        }
        int var3 = arg0.method819((byte) 22);
        if (var3 != 0) {
            arg0.field2346--;
            this.field1408 = new class113();
            this.field1408.method695(arg0);
            this.field1402 = new class113();
            this.field1402.method695(arg0);
        }
        int var4 = arg0.method819((byte) 22);
        if (var4 != 0) {
            arg0.field2346--;
            this.field1401 = new class113();
            this.field1401.method695(arg0);
            this.field1403 = new class113();
            this.field1403.method695(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method812(true);
            if (var6 == 0) {
                break;
            }
            this.field1400[var5] = var6;
            this.field1394[var5] = arg0.method807(-1465967912);
            this.field1393[var5] = arg0.method812(true);
        }
        this.field1391 = arg0.method812(true);
        this.field1389 = arg0.method812(true);
        this.field1406 = arg0.method785(true);
        this.field1407 = arg0.method785(true);
        this.field1396 = new class173();
        this.field1398 = new class113();
        this.field1396.method1152(arg0, this.field1398);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
    private final int method459(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1392[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1404[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public static void method460() {
        field1390 = null;
        field1404 = null;
        field1392 = null;
        field1410 = null;
        field1412 = null;
        field1409 = null;
        field1411 = null;
        field1413 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1404[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1392 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1392[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1390 = new int[220500];
        field1413 = new int[5];
        field1410 = new int[5];
        field1411 = new int[5];
        field1412 = new int[5];
        field1409 = new int[5];
    }
}
