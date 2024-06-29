import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class89 {

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field1342 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public int field1340 = 500;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
    private int[] field1347 = new int[5];

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    private int field1351 = 100;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "[I")
    private int[] field1358 = new int[5];

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
    private int[] field1356 = new int[5];

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public int field1348 = 0;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
    private static int[] field1346 = new int[32768];

    @OriginalMember(owner = "client!al", name = "p", descriptor = "[I")
    private static int[] field1355;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "[I")
    private static int[] field1359;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "[I")
    private static int[] field1361;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
    private static int[] field1360;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "[I")
    private static int[] field1362;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "[I")
    private static int[] field1364;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "[I")
    private static int[] field1363;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lbc;")
    private class339 field1341;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Lfd;")
    private class493 field1343;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lfd;")
    private class493 field1344;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lfd;")
    private class493 field1345;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lfd;")
    private class493 field1349;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Lfd;")
    private class493 field1350;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Lfd;")
    private class493 field1352;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lfd;")
    private class493 field1353;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Lfd;")
    private class493 field1354;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Lfd;")
    private class493 field1357;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
    private final int method707(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1355[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1346[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Leh;)V")
    public final void method708(class335 arg0) {
        this.field1350 = new class493();
        this.field1350.method2748(arg0);
        this.field1343 = new class493();
        this.field1343.method2748(arg0);
        int var2 = arg0.method2034(255);
        if (var2 != 0) {
            arg0.field4619--;
            this.field1354 = new class493();
            this.field1354.method2748(arg0);
            this.field1353 = new class493();
            this.field1353.method2748(arg0);
        }
        int var3 = arg0.method2034(255);
        if (var3 != 0) {
            arg0.field4619--;
            this.field1349 = new class493();
            this.field1349.method2748(arg0);
            this.field1352 = new class493();
            this.field1352.method2748(arg0);
        }
        int var4 = arg0.method2034(255);
        if (var4 != 0) {
            arg0.field4619--;
            this.field1345 = new class493();
            this.field1345.method2748(arg0);
            this.field1357 = new class493();
            this.field1357.method2748(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1997(-129);
            if (var6 == 0) {
                break;
            }
            this.field1358[var5] = var6;
            this.field1356[var5] = arg0.method2026(-9399);
            this.field1347[var5] = arg0.method1997(-129);
        }
        this.field1342 = arg0.method1997(-129);
        this.field1351 = arg0.method1997(-129);
        this.field1340 = arg0.method2001((byte) -83);
        this.field1348 = arg0.method2001((byte) -83);
        this.field1341 = new class339();
        this.field1344 = new class493();
        this.field1341.method2058(arg0, this.field1344);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V")
    public static void method709() {
        field1359 = null;
        field1346 = null;
        field1355 = null;
        field1364 = null;
        field1361 = null;
        field1362 = null;
        field1360 = null;
        field1363 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)[I")
    public final int[] method710(int arg0, int arg1) {
        class83.method683(field1359, 0, arg0);
        if (arg1 < 10) {
            return field1359;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1350.method2749();
        this.field1343.method2749();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1354 != null) {
            this.field1354.method2749();
            this.field1353.method2749();
            var5 = (int) ((double) (this.field1354.field6634 - this.field1354.field6636) * 32.768D / var3);
            var6 = (int) ((double) this.field1354.field6636 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1349 != null) {
            this.field1349.method2749();
            this.field1352.method2749();
            var8 = (int) ((double) (this.field1349.field6634 - this.field1349.field6636) * 32.768D / var3);
            var9 = (int) ((double) this.field1349.field6636 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1358[var11] != 0) {
                field1364[var11] = 0;
                field1361[var11] = (int) ((double) this.field1347[var11] * var3);
                field1362[var11] = (this.field1358[var11] << 14) / 100;
                field1360[var11] = (int) ((double) (this.field1350.field6634 - this.field1350.field6636) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1356[var11]) / var3);
                field1363[var11] = (int) ((double) this.field1350.field6636 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1350.method2751(arg0);
            int var40 = this.field1343.method2751(arg0);
            if (this.field1354 != null) {
                int var41 = this.field1354.method2751(arg0);
                int var42 = this.field1353.method2751(arg0);
                var39 += this.method707(var7, var42, this.field1354.field6638) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1349 != null) {
                int var43 = this.field1349.method2751(arg0);
                int var44 = this.field1352.method2751(arg0);
                var40 = var40 * ((this.method707(var10, var44, this.field1349.field6638) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1358[var45] != 0) {
                    int var46 = field1361[var45] + var12;
                    if (var46 < arg0) {
                        field1359[var46] += this.method707(field1364[var45], field1362[var45] * var40 >> 15, this.field1350.field6638);
                        field1364[var45] += (field1360[var45] * var39 >> 16) + field1363[var45];
                    }
                }
            }
        }
        if (this.field1345 != null) {
            this.field1345.method2749();
            this.field1357.method2749();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1345.method2751(arg0);
                int var18 = this.field1357.method2751(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1345.field6634 - this.field1345.field6636) * var17 >> 8) + this.field1345.field6636;
                } else {
                    var19 = ((this.field1345.field6634 - this.field1345.field6636) * var18 >> 8) + this.field1345.field6636;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1359[var16] = 0;
                }
            }
        }
        if (this.field1342 > 0 && this.field1351 > 0) {
            int var20 = (int) ((double) this.field1342 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1359[var21] += field1359[var21 - var20] * this.field1351 / 100;
            }
        }
        if (this.field1341.field4685[0] > 0 || this.field1341.field4685[1] > 0) {
            this.field1344.method2749();
            int var22 = this.field1344.method2751(arg0 + 1);
            int var23 = this.field1341.method2057(0, (float) var22 / 65536.0F);
            int var24 = this.field1341.method2057(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1359[var23 + var25] * (long) class339.field4686 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1359[var23 + var25 - var36 - 1] * (long) class339.field4689[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1359[var25 - var37 - 1] * (long) class339.field4689[1][var37] >> 16);
                    }
                    field1359[var25] = var35;
                    var22 = this.field1344.method2751(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1359[var23 + var25] * (long) class339.field4686 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1359[var23 + var25 - var33 - 1] * (long) class339.field4689[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1359[var25 - var34 - 1] * (long) class339.field4689[1][var34] >> 16);
                        }
                        field1359[var25] = var32;
                        var22 = this.field1344.method2751(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1359[var23 + var25 - var29 - 1] * (long) class339.field4689[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1359[var25 - var30 - 1] * (long) class339.field4689[1][var30] >> 16);
                            }
                            field1359[var25] = var28;
                            this.field1344.method2751(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1341.method2057(0, (float) var22 / 65536.0F);
                    var24 = this.field1341.method2057(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1359[var38] < -32768) {
                field1359[var38] = -32768;
            }
            if (field1359[var38] > 32767) {
                field1359[var38] = 32767;
            }
        }
        return field1359;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1346[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1355 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1355[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1359 = new int[220500];
        field1361 = new int[5];
        field1360 = new int[5];
        field1362 = new int[5];
        field1364 = new int[5];
        field1363 = new int[5];
    }
}
