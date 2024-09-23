import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RLHOXRLU")
public class class44 {

    @OriginalMember(owner = "RLHOXRLU", name = "a", descriptor = "Z")
    private boolean field1349 = true;

    @OriginalMember(owner = "RLHOXRLU", name = "b", descriptor = "I")
    private int field1350 = -132;

    @OriginalMember(owner = "RLHOXRLU", name = "l", descriptor = "[I")
    private int[] field1360 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "m", descriptor = "[I")
    private int[] field1361 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "n", descriptor = "[I")
    private int[] field1362 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "p", descriptor = "I")
    private int field1364 = 100;

    @OriginalMember(owner = "RLHOXRLU", name = "s", descriptor = "I")
    public int field1367 = 500;

    @OriginalMember(owner = "RLHOXRLU", name = "c", descriptor = "B")
    private static byte field1351 = 6;

    @OriginalMember(owner = "RLHOXRLU", name = "x", descriptor = "[I")
    private static int[] field1372 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "y", descriptor = "[I")
    private static int[] field1373 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "z", descriptor = "[I")
    private static int[] field1374 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "A", descriptor = "[I")
    private static int[] field1375 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "B", descriptor = "[I")
    private static int[] field1376 = new int[5];

    @OriginalMember(owner = "RLHOXRLU", name = "o", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "RLHOXRLU", name = "t", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "RLHOXRLU", name = "q", descriptor = "LRFLXBNRG;")
    private class42 field1365;

    @OriginalMember(owner = "RLHOXRLU", name = "d", descriptor = "LVJXKRAVR;")
    private class59 field1352;

    @OriginalMember(owner = "RLHOXRLU", name = "e", descriptor = "LVJXKRAVR;")
    private class59 field1353;

    @OriginalMember(owner = "RLHOXRLU", name = "f", descriptor = "LVJXKRAVR;")
    private class59 field1354;

    @OriginalMember(owner = "RLHOXRLU", name = "g", descriptor = "LVJXKRAVR;")
    private class59 field1355;

    @OriginalMember(owner = "RLHOXRLU", name = "h", descriptor = "LVJXKRAVR;")
    private class59 field1356;

    @OriginalMember(owner = "RLHOXRLU", name = "i", descriptor = "LVJXKRAVR;")
    private class59 field1357;

    @OriginalMember(owner = "RLHOXRLU", name = "j", descriptor = "LVJXKRAVR;")
    private class59 field1358;

    @OriginalMember(owner = "RLHOXRLU", name = "k", descriptor = "LVJXKRAVR;")
    private class59 field1359;

    @OriginalMember(owner = "RLHOXRLU", name = "r", descriptor = "LVJXKRAVR;")
    private class59 field1366;

    @OriginalMember(owner = "RLHOXRLU", name = "u", descriptor = "[I")
    private static int[] field1369;

    @OriginalMember(owner = "RLHOXRLU", name = "v", descriptor = "[I")
    private static int[] field1370;

    @OriginalMember(owner = "RLHOXRLU", name = "w", descriptor = "[I")
    private static int[] field1371;

    @OriginalMember(owner = "RLHOXRLU", name = "a", descriptor = "()V")
    public static final void method441() {
        field1370 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1370[var0] = 1;
            } else {
                field1370[var0] = -1;
            }
        }
        field1371 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1371[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1369 = new int[220500];
    }

    @OriginalMember(owner = "RLHOXRLU", name = "a", descriptor = "(II)[I")
    public final int[] method442(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1369[var3] = 0;
        }
        if (arg1 < 10) {
            return field1369;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1352.method566(0);
        this.field1353.method566(0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1354 != null) {
            this.field1354.method566(0);
            this.field1355.method566(0);
            var6 = (int) ((double) (this.field1354.field1594 - this.field1354.field1593) * 32.768D / var4);
            var7 = (int) ((double) this.field1354.field1593 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1356 != null) {
            this.field1356.method566(0);
            this.field1357.method566(0);
            var9 = (int) ((double) (this.field1356.field1594 - this.field1356.field1593) * 32.768D / var4);
            var10 = (int) ((double) this.field1356.field1593 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1360[var12] != 0) {
                field1372[var12] = 0;
                field1373[var12] = (int) ((double) this.field1362[var12] * var4);
                field1374[var12] = (this.field1360[var12] << 14) / 100;
                field1375[var12] = (int) ((double) (this.field1352.field1594 - this.field1352.field1593) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1361[var12]) / var4);
                field1376[var12] = (int) ((double) this.field1352.field1593 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1352.method567(field1351, arg0);
            int var42 = this.field1353.method567(field1351, arg0);
            if (this.field1354 != null) {
                int var43 = this.field1354.method567(field1351, arg0);
                int var44 = this.field1355.method567(field1351, arg0);
                var41 += this.method443(this.field1354.field1595, -803, var44, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1356 != null) {
                int var45 = this.field1356.method567(field1351, arg0);
                int var46 = this.field1357.method567(field1351, arg0);
                var42 = var42 * ((this.method443(this.field1356.field1595, -803, var46, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1360[var47] != 0) {
                    int var48 = field1373[var47] + var13;
                    if (var48 < arg0) {
                        field1369[var48] += this.method443(this.field1352.field1595, -803, field1374[var47] * var42 >> 15, field1372[var47]);
                        field1372[var47] += (field1375[var47] * var41 >> 16) + field1376[var47];
                    }
                }
            }
        }
        if (this.field1358 != null) {
            this.field1358.method566(0);
            this.field1359.method566(0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1358.method567(field1351, arg0);
                int var19 = this.field1359.method567(field1351, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1358.field1594 - this.field1358.field1593) * var18 >> 8) + this.field1358.field1593;
                } else {
                    var20 = ((this.field1358.field1594 - this.field1358.field1593) * var19 >> 8) + this.field1358.field1593;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1369[var17] = 0;
                }
            }
        }
        if (this.field1363 > 0 && this.field1364 > 0) {
            int var21 = (int) ((double) this.field1363 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1369[var22] += field1369[var22 - var21] * this.field1364 / 100;
            }
        }
        if (this.field1365.field1323[0] > 0 || this.field1365.field1323[1] > 0) {
            this.field1366.method566(0);
            int var23 = this.field1366.method567(field1351, arg0 + 1);
            int var24 = this.field1365.method439(-3907, 0, (float) var23 / 65536.0F);
            int var25 = this.field1365.method439(-3907, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1369[var24 + var26] * (long) class42.field1330 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1369[var24 + var26 - var38 - 1] * (long) class42.field1328[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1369[var26 - var39 - 1] * (long) class42.field1328[1][var39] >> 16);
                    }
                    field1369[var26] = var37;
                    var23 = this.field1366.method567(field1351, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1369[var24 + var26] * (long) class42.field1330 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1369[var24 + var26 - var35 - 1] * (long) class42.field1328[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1369[var26 - var36 - 1] * (long) class42.field1328[1][var36] >> 16);
                        }
                        field1369[var26] = var34;
                        var23 = this.field1366.method567(field1351, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1369[var24 + var26 - var31 - 1] * (long) class42.field1328[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1369[var26 - var32 - 1] * (long) class42.field1328[1][var32] >> 16);
                            }
                            field1369[var26] = var30;
                            this.field1366.method567(field1351, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1365.method439(-3907, 0, (float) var23 / 65536.0F);
                    var25 = this.field1365.method439(-3907, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1369[var40] < -32768) {
                field1369[var40] = -32768;
            }
            if (field1369[var40] > 32767) {
                field1369[var40] = 32767;
            }
        }
        return field1369;
    }

    @OriginalMember(owner = "RLHOXRLU", name = "a", descriptor = "(IIII)I")
    private final int method443(int arg0, int arg1, int arg2, int arg3) {
        while (arg1 >= 0) {
            this.field1350 = -8;
        }
        if (arg0 == 1) {
            if ((arg3 & 0x7FFF) < 16384) {
                return arg2;
            } else {
                return -arg2;
            }
        } else if (arg0 == 2) {
            return field1371[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg0 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg0 == 4) {
            return field1370[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "RLHOXRLU", name = "a", descriptor = "(LMLYYHULT;B)V")
    public final void method444(class30 arg0, byte arg1) {
        this.field1352 = new class59();
        this.field1352.method564(arg0, (byte) 2);
        this.field1353 = new class59();
        this.field1353.method564(arg0, (byte) 2);
        int var3 = arg0.method296();
        if (var3 != 0) {
            arg0.field1092--;
            this.field1354 = new class59();
            this.field1354.method564(arg0, (byte) 2);
            this.field1355 = new class59();
            this.field1355.method564(arg0, (byte) 2);
        }
        int var4 = arg0.method296();
        if (var4 != 0) {
            arg0.field1092--;
            this.field1356 = new class59();
            this.field1356.method564(arg0, (byte) 2);
            this.field1357 = new class59();
            this.field1357.method564(arg0, (byte) 2);
        }
        int var5 = arg0.method296();
        if (var5 != 0) {
            arg0.field1092--;
            this.field1358 = new class59();
            this.field1358.method564(arg0, (byte) 2);
            this.field1359 = new class59();
            this.field1359.method564(arg0, (byte) 2);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method310();
            if (var7 == 0) {
                break;
            }
            this.field1360[var6] = var7;
            this.field1361[var6] = arg0.method309();
            this.field1362[var6] = arg0.method310();
        }
        this.field1363 = arg0.method310();
        this.field1364 = arg0.method310();
        this.field1367 = arg0.method298();
        this.field1368 = arg0.method298();
        if (arg1 != 2) {
            this.field1349 = !this.field1349;
        }
        this.field1365 = new class42();
        this.field1366 = new class59();
        this.field1365.method440(10762, this.field1366, arg0);
    }
}
