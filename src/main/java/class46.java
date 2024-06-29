import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OZEEIHVG")
public class class46 {

    @OriginalMember(owner = "client!OZEEIHVG", name = "k", descriptor = "[I")
    private int[] field1337 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "l", descriptor = "[I")
    private int[] field1338 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "m", descriptor = "[I")
    private int[] field1339 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "o", descriptor = "I")
    private int field1341 = 100;

    @OriginalMember(owner = "client!OZEEIHVG", name = "r", descriptor = "I")
    public int field1344 = 500;

    @OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "I")
    private static int field1327 = 48306;

    @OriginalMember(owner = "client!OZEEIHVG", name = "w", descriptor = "[I")
    private static int[] field1349 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "x", descriptor = "[I")
    private static int[] field1350 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "y", descriptor = "[I")
    private static int[] field1351 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "z", descriptor = "[I")
    private static int[] field1352 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "A", descriptor = "[I")
    private static int[] field1353 = new int[5];

    @OriginalMember(owner = "client!OZEEIHVG", name = "b", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!OZEEIHVG", name = "n", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!OZEEIHVG", name = "s", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!OZEEIHVG", name = "c", descriptor = "LSHSBXUIJ;")
    private class54 field1329;

    @OriginalMember(owner = "client!OZEEIHVG", name = "d", descriptor = "LSHSBXUIJ;")
    private class54 field1330;

    @OriginalMember(owner = "client!OZEEIHVG", name = "e", descriptor = "LSHSBXUIJ;")
    private class54 field1331;

    @OriginalMember(owner = "client!OZEEIHVG", name = "f", descriptor = "LSHSBXUIJ;")
    private class54 field1332;

    @OriginalMember(owner = "client!OZEEIHVG", name = "g", descriptor = "LSHSBXUIJ;")
    private class54 field1333;

    @OriginalMember(owner = "client!OZEEIHVG", name = "h", descriptor = "LSHSBXUIJ;")
    private class54 field1334;

    @OriginalMember(owner = "client!OZEEIHVG", name = "i", descriptor = "LSHSBXUIJ;")
    private class54 field1335;

    @OriginalMember(owner = "client!OZEEIHVG", name = "j", descriptor = "LSHSBXUIJ;")
    private class54 field1336;

    @OriginalMember(owner = "client!OZEEIHVG", name = "q", descriptor = "LSHSBXUIJ;")
    private class54 field1343;

    @OriginalMember(owner = "client!OZEEIHVG", name = "p", descriptor = "LVLRTJGOX;")
    private class64 field1342;

    @OriginalMember(owner = "client!OZEEIHVG", name = "t", descriptor = "[I")
    private static int[] field1346;

    @OriginalMember(owner = "client!OZEEIHVG", name = "u", descriptor = "[I")
    private static int[] field1347;

    @OriginalMember(owner = "client!OZEEIHVG", name = "v", descriptor = "[I")
    private static int[] field1348;

    @OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "()V")
    public static final void method415() {
        field1347 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1347[var0] = 1;
            } else {
                field1347[var0] = -1;
            }
        }
        field1348 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1348[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1346 = new int[220500];
    }

    @OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "(II)[I")
    public final int[] method416(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1346[var3] = 0;
        }
        if (arg1 < 10) {
            return field1346;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1329.method495(-560);
        this.field1330.method495(-560);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1331 != null) {
            this.field1331.method495(-560);
            this.field1332.method495(-560);
            var6 = (int) ((double) (this.field1331.field1557 - this.field1331.field1556) * 32.768D / var4);
            var7 = (int) ((double) this.field1331.field1556 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1333 != null) {
            this.field1333.method495(-560);
            this.field1334.method495(-560);
            var9 = (int) ((double) (this.field1333.field1557 - this.field1333.field1556) * 32.768D / var4);
            var10 = (int) ((double) this.field1333.field1556 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1337[var12] != 0) {
                field1349[var12] = 0;
                field1350[var12] = (int) ((double) this.field1339[var12] * var4);
                field1351[var12] = (this.field1337[var12] << 14) / 100;
                field1352[var12] = (int) ((double) (this.field1329.field1557 - this.field1329.field1556) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1338[var12]) / var4);
                field1353[var12] = (int) ((double) this.field1329.field1556 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1329.method496(arg0, -16419);
            int var42 = this.field1330.method496(arg0, -16419);
            if (this.field1331 != null) {
                int var43 = this.field1331.method496(arg0, -16419);
                int var44 = this.field1332.method496(arg0, -16419);
                var41 += this.method417(var44, this.field1331.field1558, var8, 216) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1333 != null) {
                int var45 = this.field1333.method496(arg0, -16419);
                int var46 = this.field1334.method496(arg0, -16419);
                var42 = var42 * ((this.method417(var46, this.field1333.field1558, var11, 216) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1337[var47] != 0) {
                    int var48 = field1350[var47] + var13;
                    if (var48 < arg0) {
                        field1346[var48] += this.method417(field1351[var47] * var42 >> 15, this.field1329.field1558, field1349[var47], 216);
                        field1349[var47] += (field1352[var47] * var41 >> 16) + field1353[var47];
                    }
                }
            }
        }
        if (this.field1335 != null) {
            this.field1335.method495(-560);
            this.field1336.method495(-560);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1335.method496(arg0, -16419);
                int var19 = this.field1336.method496(arg0, -16419);
                int var20;
                if (var16) {
                    var20 = ((this.field1335.field1557 - this.field1335.field1556) * var18 >> 8) + this.field1335.field1556;
                } else {
                    var20 = ((this.field1335.field1557 - this.field1335.field1556) * var19 >> 8) + this.field1335.field1556;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1346[var17] = 0;
                }
            }
        }
        if (this.field1340 > 0 && this.field1341 > 0) {
            int var21 = (int) ((double) this.field1340 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1346[var22] += field1346[var22 - var21] * this.field1341 / 100;
            }
        }
        if (this.field1342.field1657[0] > 0 || this.field1342.field1657[1] > 0) {
            this.field1343.method495(-560);
            int var23 = this.field1343.method496(arg0 + 1, -16419);
            int var24 = this.field1342.method559(0, (float) var23 / 65536.0F, field1327);
            int var25 = this.field1342.method559(1, (float) var23 / 65536.0F, field1327);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1346[var24 + var26] * (long) class64.field1664 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1346[var24 + var26 - var38 - 1] * (long) class64.field1662[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1346[var26 - var39 - 1] * (long) class64.field1662[1][var39] >> 16);
                    }
                    field1346[var26] = var37;
                    var23 = this.field1343.method496(arg0 + 1, -16419);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1346[var24 + var26] * (long) class64.field1664 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1346[var24 + var26 - var35 - 1] * (long) class64.field1662[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1346[var26 - var36 - 1] * (long) class64.field1662[1][var36] >> 16);
                        }
                        field1346[var26] = var34;
                        var23 = this.field1343.method496(arg0 + 1, -16419);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1346[var24 + var26 - var31 - 1] * (long) class64.field1662[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1346[var26 - var32 - 1] * (long) class64.field1662[1][var32] >> 16);
                            }
                            field1346[var26] = var30;
                            this.field1343.method496(arg0 + 1, -16419);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1342.method559(0, (float) var23 / 65536.0F, field1327);
                    var25 = this.field1342.method559(1, (float) var23 / 65536.0F, field1327);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1346[var40] < -32768) {
                field1346[var40] = -32768;
            }
            if (field1346[var40] > 32767) {
                field1346[var40] = 32767;
            }
        }
        return field1346;
    }

    @OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "(IIII)I")
    private final int method417(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 55 / arg3;
        if (arg1 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg1 == 2) {
            return field1348[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg1 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg1 == 4) {
            return field1347[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "(ILRGCGKKUR;)V")
    public final void method418(int arg0, class53 arg1) {
        this.field1329 = new class54();
        this.field1329.method493(5, arg1);
        this.field1330 = new class54();
        this.field1330.method493(5, arg1);
        int var3 = arg1.method455();
        if (var3 != 0) {
            arg1.field1539--;
            this.field1331 = new class54();
            this.field1331.method493(5, arg1);
            this.field1332 = new class54();
            this.field1332.method493(5, arg1);
        }
        int var4 = arg1.method455();
        if (var4 != 0) {
            arg1.field1539--;
            this.field1333 = new class54();
            this.field1333.method493(5, arg1);
            this.field1334 = new class54();
            this.field1334.method493(5, arg1);
        }
        int var5 = arg1.method455();
        if (var5 != 0) {
            arg1.field1539--;
            this.field1335 = new class54();
            this.field1335.method493(5, arg1);
            this.field1336 = new class54();
            this.field1336.method493(5, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method469();
            if (var7 == 0) {
                break;
            }
            this.field1337[var6] = var7;
            this.field1338[var6] = arg1.method468();
            this.field1339[var6] = arg1.method469();
        }
        this.field1340 = arg1.method469();
        this.field1341 = arg1.method469();
        this.field1344 = arg1.method457();
        this.field1345 = arg1.method457();
        this.field1342 = new class64();
        this.field1343 = new class54();
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
        this.field1342.method560(arg1, this.field1343, this.field1328);
    }
}
