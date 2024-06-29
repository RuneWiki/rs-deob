import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class99 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "[I")
    private int[] field1422 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public int field1431 = 0;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    private int field1432 = 0;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public int field1435 = 500;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "[I")
    private int[] field1440 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "[I")
    private int[] field1439 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    private int field1438 = 100;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "[I")
    private static int[] field1433 = new int[32768];

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    private static int[] field1426;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "[I")
    private static int[] field1437;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "[I")
    private static int[] field1442;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "[I")
    private static int[] field1443;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "[I")
    private static int[] field1444;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "[I")
    private static int[] field1441;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "[I")
    private static int[] field1446;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Lnc;")
    private class145 field1436;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lkg;")
    private class75 field1423;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lkg;")
    private class75 field1424;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "Lkg;")
    private class75 field1425;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Lkg;")
    private class75 field1427;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Lkg;")
    private class75 field1428;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Lkg;")
    private class75 field1429;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Lkg;")
    private class75 field1430;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Lkg;")
    private class75 field1434;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "Lkg;")
    private class75 field1445;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method668(int arg0, int arg1) {
        class187.method1249(field1437, 0, arg0);
        if (arg1 < 10) {
            return field1437;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1427.method504();
        this.field1429.method504();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1425 != null) {
            this.field1425.method504();
            this.field1434.method504();
            var5 = (int) ((double) (this.field1425.field1081 - this.field1425.field1076) * 32.768D / var3);
            var6 = (int) ((double) this.field1425.field1076 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1423 != null) {
            this.field1423.method504();
            this.field1430.method504();
            var8 = (int) ((double) (this.field1423.field1081 - this.field1423.field1076) * 32.768D / var3);
            var9 = (int) ((double) this.field1423.field1076 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1422[var11] != 0) {
                field1441[var11] = 0;
                field1444[var11] = (int) ((double) this.field1439[var11] * var3);
                field1446[var11] = (this.field1422[var11] << 14) / 100;
                field1443[var11] = (int) ((double) (this.field1427.field1081 - this.field1427.field1076) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1440[var11]) / var3);
                field1442[var11] = (int) ((double) this.field1427.field1076 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1427.method505(arg0);
            int var14 = this.field1429.method505(arg0);
            if (this.field1425 != null) {
                int var15 = this.field1425.method505(arg0);
                int var16 = this.field1434.method505(arg0);
                var13 += this.method669(var7, var16, this.field1425.field1079) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1423 != null) {
                int var17 = this.field1423.method505(arg0);
                int var18 = this.field1430.method505(arg0);
                var14 = var14 * ((this.method669(var10, var18, this.field1423.field1079) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1422[var19] != 0) {
                    int var20 = field1444[var19] + var12;
                    if (var20 < arg0) {
                        field1437[var20] += this.method669(field1441[var19], field1446[var19] * var14 >> 15, this.field1427.field1079);
                        field1441[var19] += (field1443[var19] * var13 >> 16) + field1442[var19];
                    }
                }
            }
        }
        if (this.field1445 != null) {
            this.field1445.method504();
            this.field1424.method504();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1445.method505(arg0);
                int var26 = this.field1424.method505(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1445.field1081 - this.field1445.field1076) * var25 >> 8) + this.field1445.field1076;
                } else {
                    var27 = ((this.field1445.field1081 - this.field1445.field1076) * var26 >> 8) + this.field1445.field1076;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1437[var24] = 0;
                }
            }
        }
        if (this.field1432 > 0 && this.field1438 > 0) {
            int var28 = (int) ((double) this.field1432 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1437[var29] += field1437[var29 - var28] * this.field1438 / 100;
            }
        }
        if (this.field1436.field2228[0] > 0 || this.field1436.field2228[1] > 0) {
            this.field1428.method504();
            int var30 = this.field1428.method505(arg0 + 1);
            int var31 = this.field1436.method914(0, (float) var30 / 65536.0F);
            int var32 = this.field1436.method914(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1437[var31 + var33] * (long) class145.field2230 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1437[var31 + var33 - var36 - 1] * (long) class145.field2223[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1437[var33 - var37 - 1] * (long) class145.field2223[1][var37] >> 16);
                    }
                    field1437[var33] = var35;
                    var30 = this.field1428.method505(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1437[var31 + var33] * (long) class145.field2230 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1437[var31 + var33 - var40 - 1] * (long) class145.field2223[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1437[var33 - var41 - 1] * (long) class145.field2223[1][var41] >> 16);
                        }
                        field1437[var33] = var39;
                        var30 = this.field1428.method505(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1437[var31 + var33 - var43 - 1] * (long) class145.field2223[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1437[var33 - var44 - 1] * (long) class145.field2223[1][var44] >> 16);
                            }
                            field1437[var33] = var42;
                            this.field1428.method505(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1436.method914(0, (float) var30 / 65536.0F);
                    var32 = this.field1436.method914(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1437[var46] < -32768) {
                field1437[var46] = -32768;
            }
            if (field1437[var46] > 32767) {
                field1437[var46] = 32767;
            }
        }
        return field1437;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)I", line = 294)
    private final int method669(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1426[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1433[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lhi;)V", line = 326)
    public final void method670(class291 arg0) {
        this.field1427 = new class75();
        this.field1427.method503(arg0);
        this.field1429 = new class75();
        this.field1429.method503(arg0);
        int var2 = arg0.method2011(-40);
        if (var2 != 0) {
            arg0.field4946--;
            this.field1425 = new class75();
            this.field1425.method503(arg0);
            this.field1434 = new class75();
            this.field1434.method503(arg0);
        }
        int var3 = arg0.method2011(-28);
        if (var3 != 0) {
            arg0.field4946--;
            this.field1423 = new class75();
            this.field1423.method503(arg0);
            this.field1430 = new class75();
            this.field1430.method503(arg0);
        }
        int var4 = arg0.method2011(-71);
        if (var4 != 0) {
            arg0.field4946--;
            this.field1445 = new class75();
            this.field1445.method503(arg0);
            this.field1424 = new class75();
            this.field1424.method503(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2013((byte) -20);
            if (var6 == 0) {
                break;
            }
            this.field1422[var5] = var6;
            this.field1440[var5] = arg0.method1961((byte) 120);
            this.field1439[var5] = arg0.method2013((byte) -20);
        }
        this.field1432 = arg0.method2013((byte) -20);
        this.field1438 = arg0.method2013((byte) -20);
        this.field1435 = arg0.method2021((byte) 74);
        this.field1431 = arg0.method2021((byte) 74);
        this.field1436 = new class145();
        this.field1428 = new class75();
        this.field1436.method911(arg0, this.field1428);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V", line = 397)
    public static void method671() {
        field1437 = null;
        field1433 = null;
        field1426 = null;
        field1441 = null;
        field1444 = null;
        field1446 = null;
        field1443 = null;
        field1442 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1433[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1426 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1426[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1437 = new int[220500];
        field1442 = new int[5];
        field1443 = new int[5];
        field1444 = new int[5];
        field1441 = new int[5];
        field1446 = new int[5];
    }
}
