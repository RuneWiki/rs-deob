import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class74 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field1334 = 500;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field1341 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[I")
    private int[] field1329 = new int[5];

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    private int field1339 = 100;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    private int field1348 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[I")
    private int[] field1332 = new int[5];

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
    private int[] field1353 = new int[5];

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "[I")
    private static int[] field1342 = new int[32768];

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[I")
    private static int[] field1333;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[I")
    private static int[] field1335;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "[I")
    private static int[] field1346;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "[I")
    private static int[] field1344;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
    private static int[] field1345;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "[I")
    private static int[] field1347;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "[I")
    private static int[] field1351;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Ljk;")
    private class241 field1330;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljk;")
    private class241 field1336;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Ljk;")
    private class241 field1337;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Ljk;")
    private class241 field1338;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Ljk;")
    private class241 field1340;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "Ljk;")
    private class241 field1343;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Ljk;")
    private class241 field1349;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Ljk;")
    private class241 field1350;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Ljk;")
    private class241 field1352;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lie;")
    private class32 field1331;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
    public static void method625() {
        field1335 = null;
        field1342 = null;
        field1333 = null;
        field1351 = null;
        field1345 = null;
        field1344 = null;
        field1347 = null;
        field1346 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lfk;)V")
    public final void method626(class14 arg0) {
        this.field1337 = new class241();
        this.field1337.method1691(arg0);
        this.field1338 = new class241();
        this.field1338.method1691(arg0);
        int var2 = arg0.method200(255);
        if (var2 != 0) {
            arg0.field318--;
            this.field1343 = new class241();
            this.field1343.method1691(arg0);
            this.field1330 = new class241();
            this.field1330.method1691(arg0);
        }
        int var3 = arg0.method200(255);
        if (var3 != 0) {
            arg0.field318--;
            this.field1350 = new class241();
            this.field1350.method1691(arg0);
            this.field1352 = new class241();
            this.field1352.method1691(arg0);
        }
        int var4 = arg0.method200(255);
        if (var4 != 0) {
            arg0.field318--;
            this.field1336 = new class241();
            this.field1336.method1691(arg0);
            this.field1349 = new class241();
            this.field1349.method1691(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method202(95);
            if (var6 == 0) {
                break;
            }
            this.field1353[var5] = var6;
            this.field1332[var5] = arg0.method182(-24);
            this.field1329[var5] = arg0.method202(82);
        }
        this.field1348 = arg0.method202(36);
        this.field1339 = arg0.method202(60);
        this.field1334 = arg0.method161(4);
        this.field1341 = arg0.method161(4);
        this.field1331 = new class32();
        this.field1340 = new class241();
        this.field1331.method298(arg0, this.field1340);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
    public final int[] method627(int arg0, int arg1) {
        class43.method378(field1335, 0, arg0);
        if (arg1 < 10) {
            return field1335;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1337.method1688();
        this.field1338.method1688();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1343 != null) {
            this.field1343.method1688();
            this.field1330.method1688();
            var5 = (int) ((double) (this.field1343.field4153 - this.field1343.field4149) * 32.768D / var3);
            var6 = (int) ((double) this.field1343.field4149 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1350 != null) {
            this.field1350.method1688();
            this.field1352.method1688();
            var8 = (int) ((double) (this.field1350.field4153 - this.field1350.field4149) * 32.768D / var3);
            var9 = (int) ((double) this.field1350.field4149 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1353[var11] != 0) {
                field1351[var11] = 0;
                field1345[var11] = (int) ((double) this.field1329[var11] * var3);
                field1344[var11] = (this.field1353[var11] << 14) / 100;
                field1347[var11] = (int) ((double) (this.field1337.field4153 - this.field1337.field4149) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1332[var11]) / var3);
                field1346[var11] = (int) ((double) this.field1337.field4149 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1337.method1690(arg0);
            int var40 = this.field1338.method1690(arg0);
            if (this.field1343 != null) {
                int var41 = this.field1343.method1690(arg0);
                int var42 = this.field1330.method1690(arg0);
                var39 += this.method628(var7, var42, this.field1343.field4150) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1350 != null) {
                int var43 = this.field1350.method1690(arg0);
                int var44 = this.field1352.method1690(arg0);
                var40 = var40 * ((this.method628(var10, var44, this.field1350.field4150) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1353[var45] != 0) {
                    int var46 = field1345[var45] + var12;
                    if (var46 < arg0) {
                        field1335[var46] += this.method628(field1351[var45], field1344[var45] * var40 >> 15, this.field1337.field4150);
                        field1351[var45] += (field1347[var45] * var39 >> 16) + field1346[var45];
                    }
                }
            }
        }
        if (this.field1336 != null) {
            this.field1336.method1688();
            this.field1349.method1688();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1336.method1690(arg0);
                int var18 = this.field1349.method1690(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1336.field4153 - this.field1336.field4149) * var17 >> 8) + this.field1336.field4149;
                } else {
                    var19 = ((this.field1336.field4153 - this.field1336.field4149) * var18 >> 8) + this.field1336.field4149;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1335[var16] = 0;
                }
            }
        }
        if (this.field1348 > 0 && this.field1339 > 0) {
            int var20 = (int) ((double) this.field1348 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1335[var21] += field1335[var21 - var20] * this.field1339 / 100;
            }
        }
        if (this.field1331.field595[0] > 0 || this.field1331.field595[1] > 0) {
            this.field1340.method1688();
            int var22 = this.field1340.method1690(arg0 + 1);
            int var23 = this.field1331.method295(0, (float) var22 / 65536.0F);
            int var24 = this.field1331.method295(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1335[var23 + var25] * (long) class32.field588 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1335[var23 + var25 - var36 - 1] * (long) class32.field594[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1335[var25 - var37 - 1] * (long) class32.field594[1][var37] >> 16);
                    }
                    field1335[var25] = var35;
                    var22 = this.field1340.method1690(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1335[var23 + var25] * (long) class32.field588 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1335[var23 + var25 - var33 - 1] * (long) class32.field594[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1335[var25 - var34 - 1] * (long) class32.field594[1][var34] >> 16);
                        }
                        field1335[var25] = var32;
                        var22 = this.field1340.method1690(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1335[var23 + var25 - var29 - 1] * (long) class32.field594[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1335[var25 - var30 - 1] * (long) class32.field594[1][var30] >> 16);
                            }
                            field1335[var25] = var28;
                            this.field1340.method1690(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1331.method295(0, (float) var22 / 65536.0F);
                    var24 = this.field1331.method295(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1335[var38] < -32768) {
                field1335[var38] = -32768;
            }
            if (field1335[var38] > 32767) {
                field1335[var38] = 32767;
            }
        }
        return field1335;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)I")
    private final int method628(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1333[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1342[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1342[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1333 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1333[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1335 = new int[220500];
        field1346 = new int[5];
        field1344 = new int[5];
        field1345 = new int[5];
        field1347 = new int[5];
        field1351 = new int[5];
    }
}
