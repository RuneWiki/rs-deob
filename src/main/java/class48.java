import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SMALAPQM")
public class class48 {

    @OriginalMember(owner = "SMALAPQM", name = "a", descriptor = "I")
    private int field1356 = 897;

    @OriginalMember(owner = "SMALAPQM", name = "j", descriptor = "[I")
    private int[] field1365 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "k", descriptor = "[I")
    private int[] field1366 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "l", descriptor = "[I")
    private int[] field1367 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "n", descriptor = "I")
    private int field1369 = 100;

    @OriginalMember(owner = "SMALAPQM", name = "q", descriptor = "I")
    public int field1372 = 500;

    @OriginalMember(owner = "SMALAPQM", name = "v", descriptor = "[I")
    private static int[] field1377 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "w", descriptor = "[I")
    private static int[] field1378 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "x", descriptor = "[I")
    private static int[] field1379 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "y", descriptor = "[I")
    private static int[] field1380 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "z", descriptor = "[I")
    private static int[] field1381 = new int[5];

    @OriginalMember(owner = "SMALAPQM", name = "m", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "SMALAPQM", name = "r", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "SMALAPQM", name = "b", descriptor = "LAUPOWMGG;")
    private class1 field1357;

    @OriginalMember(owner = "SMALAPQM", name = "c", descriptor = "LAUPOWMGG;")
    private class1 field1358;

    @OriginalMember(owner = "SMALAPQM", name = "d", descriptor = "LAUPOWMGG;")
    private class1 field1359;

    @OriginalMember(owner = "SMALAPQM", name = "e", descriptor = "LAUPOWMGG;")
    private class1 field1360;

    @OriginalMember(owner = "SMALAPQM", name = "f", descriptor = "LAUPOWMGG;")
    private class1 field1361;

    @OriginalMember(owner = "SMALAPQM", name = "g", descriptor = "LAUPOWMGG;")
    private class1 field1362;

    @OriginalMember(owner = "SMALAPQM", name = "h", descriptor = "LAUPOWMGG;")
    private class1 field1363;

    @OriginalMember(owner = "SMALAPQM", name = "i", descriptor = "LAUPOWMGG;")
    private class1 field1364;

    @OriginalMember(owner = "SMALAPQM", name = "p", descriptor = "LAUPOWMGG;")
    private class1 field1371;

    @OriginalMember(owner = "SMALAPQM", name = "o", descriptor = "LPKLJDULJ;")
    private class41 field1370;

    @OriginalMember(owner = "SMALAPQM", name = "s", descriptor = "[I")
    private static int[] field1374;

    @OriginalMember(owner = "SMALAPQM", name = "t", descriptor = "[I")
    private static int[] field1375;

    @OriginalMember(owner = "SMALAPQM", name = "u", descriptor = "[I")
    private static int[] field1376;

    @OriginalMember(owner = "SMALAPQM", name = "a", descriptor = "()V")
    public static final void method444() {
        field1375 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1375[var0] = 1;
            } else {
                field1375[var0] = -1;
            }
        }
        field1376 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1376[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1374 = new int[220500];
    }

    @OriginalMember(owner = "SMALAPQM", name = "a", descriptor = "(II)[I")
    public final int[] method445(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1374[var3] = 0;
        }
        if (arg1 < 10) {
            return field1374;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1357.method3((byte) 1);
        this.field1358.method3((byte) 1);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1359 != null) {
            this.field1359.method3((byte) 1);
            this.field1360.method3((byte) 1);
            var6 = (int) ((double) (this.field1359.field7 - this.field1359.field6) * 32.768D / var4);
            var7 = (int) ((double) this.field1359.field6 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1361 != null) {
            this.field1361.method3((byte) 1);
            this.field1362.method3((byte) 1);
            var9 = (int) ((double) (this.field1361.field7 - this.field1361.field6) * 32.768D / var4);
            var10 = (int) ((double) this.field1361.field6 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1365[var12] != 0) {
                field1377[var12] = 0;
                field1378[var12] = (int) ((double) this.field1367[var12] * var4);
                field1379[var12] = (this.field1365[var12] << 14) / 100;
                field1380[var12] = (int) ((double) (this.field1357.field7 - this.field1357.field6) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1366[var12]) / var4);
                field1381[var12] = (int) ((double) this.field1357.field6 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1357.method4(false, arg0);
            int var42 = this.field1358.method4(false, arg0);
            if (this.field1359 != null) {
                int var43 = this.field1359.method4(false, arg0);
                int var44 = this.field1360.method4(false, arg0);
                var41 += this.method446((byte) -41, var44, var8, this.field1359.field8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1361 != null) {
                int var45 = this.field1361.method4(false, arg0);
                int var46 = this.field1362.method4(false, arg0);
                var42 = var42 * ((this.method446((byte) -41, var46, var11, this.field1361.field8) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1365[var47] != 0) {
                    int var48 = field1378[var47] + var13;
                    if (var48 < arg0) {
                        field1374[var48] += this.method446((byte) -41, field1379[var47] * var42 >> 15, field1377[var47], this.field1357.field8);
                        field1377[var47] += (field1380[var47] * var41 >> 16) + field1381[var47];
                    }
                }
            }
        }
        if (this.field1363 != null) {
            this.field1363.method3((byte) 1);
            this.field1364.method3((byte) 1);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1363.method4(false, arg0);
                int var19 = this.field1364.method4(false, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1363.field7 - this.field1363.field6) * var18 >> 8) + this.field1363.field6;
                } else {
                    var20 = ((this.field1363.field7 - this.field1363.field6) * var19 >> 8) + this.field1363.field6;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1374[var17] = 0;
                }
            }
        }
        if (this.field1368 > 0 && this.field1369 > 0) {
            int var21 = (int) ((double) this.field1368 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1374[var22] += field1374[var22 - var21] * this.field1369 / 100;
            }
        }
        if (this.field1370.field1209[0] > 0 || this.field1370.field1209[1] > 0) {
            this.field1371.method3((byte) 1);
            int var23 = this.field1371.method4(false, arg0 + 1);
            int var24 = this.field1370.method424((float) var23 / 65536.0F, 0, 0);
            int var25 = this.field1370.method424((float) var23 / 65536.0F, 1, 0);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1374[var24 + var26] * (long) class41.field1216 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1374[var24 + var26 - var38 - 1] * (long) class41.field1214[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1374[var26 - var39 - 1] * (long) class41.field1214[1][var39] >> 16);
                    }
                    field1374[var26] = var37;
                    var23 = this.field1371.method4(false, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1374[var24 + var26] * (long) class41.field1216 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1374[var24 + var26 - var35 - 1] * (long) class41.field1214[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1374[var26 - var36 - 1] * (long) class41.field1214[1][var36] >> 16);
                        }
                        field1374[var26] = var34;
                        var23 = this.field1371.method4(false, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1374[var24 + var26 - var31 - 1] * (long) class41.field1214[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1374[var26 - var32 - 1] * (long) class41.field1214[1][var32] >> 16);
                            }
                            field1374[var26] = var30;
                            this.field1371.method4(false, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1370.method424((float) var23 / 65536.0F, 0, 0);
                    var25 = this.field1370.method424((float) var23 / 65536.0F, 1, 0);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1374[var40] < -32768) {
                field1374[var40] = -32768;
            }
            if (field1374[var40] > 32767) {
                field1374[var40] = 32767;
            }
        }
        return field1374;
    }

    @OriginalMember(owner = "SMALAPQM", name = "a", descriptor = "(BIII)I")
    private final int method446(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -41) {
            return this.field1356;
        } else if (arg3 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg3 == 2) {
            return field1376[arg2 & 0x7FFF] * arg1 >> 14;
        } else if (arg3 == 3) {
            return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg3 == 4) {
            return field1375[arg2 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "SMALAPQM", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    public final void method447(boolean arg0, class35 arg1) {
        this.field1357 = new class1();
        if (arg0) {
            throw new NullPointerException();
        }
        this.field1357.method1(false, arg1);
        this.field1358 = new class1();
        this.field1358.method1(false, arg1);
        int var3 = arg1.method349();
        if (var3 != 0) {
            arg1.field1107--;
            this.field1359 = new class1();
            this.field1359.method1(false, arg1);
            this.field1360 = new class1();
            this.field1360.method1(false, arg1);
        }
        int var4 = arg1.method349();
        if (var4 != 0) {
            arg1.field1107--;
            this.field1361 = new class1();
            this.field1361.method1(false, arg1);
            this.field1362 = new class1();
            this.field1362.method1(false, arg1);
        }
        int var5 = arg1.method349();
        if (var5 != 0) {
            arg1.field1107--;
            this.field1363 = new class1();
            this.field1363.method1(false, arg1);
            this.field1364 = new class1();
            this.field1364.method1(false, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method363();
            if (var7 == 0) {
                break;
            }
            this.field1365[var6] = var7;
            this.field1366[var6] = arg1.method362();
            this.field1367[var6] = arg1.method363();
        }
        this.field1368 = arg1.method363();
        this.field1369 = arg1.method363();
        this.field1372 = arg1.method351();
        this.field1373 = arg1.method351();
        this.field1370 = new class41();
        this.field1371 = new class1();
        this.field1370.method425(0, arg1, this.field1371);
    }
}
