import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UFAEFFVJ")
public class class58 {

    @OriginalMember(owner = "UFAEFFVJ", name = "a", descriptor = "Z")
    private boolean field1408 = true;

    @OriginalMember(owner = "UFAEFFVJ", name = "c", descriptor = "I")
    private int field1410 = -113;

    @OriginalMember(owner = "UFAEFFVJ", name = "l", descriptor = "[I")
    private int[] field1419 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "m", descriptor = "[I")
    private int[] field1420 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "n", descriptor = "[I")
    private int[] field1421 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "p", descriptor = "I")
    private int field1423 = 100;

    @OriginalMember(owner = "UFAEFFVJ", name = "s", descriptor = "I")
    public int field1426 = 500;

    @OriginalMember(owner = "UFAEFFVJ", name = "b", descriptor = "Z")
    private static boolean field1409 = true;

    @OriginalMember(owner = "UFAEFFVJ", name = "x", descriptor = "[I")
    private static int[] field1431 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "y", descriptor = "[I")
    private static int[] field1432 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "z", descriptor = "[I")
    private static int[] field1433 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "A", descriptor = "[I")
    private static int[] field1434 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "B", descriptor = "[I")
    private static int[] field1435 = new int[5];

    @OriginalMember(owner = "UFAEFFVJ", name = "o", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "UFAEFFVJ", name = "t", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "UFAEFFVJ", name = "q", descriptor = "LIIXKZWNC;")
    private class32 field1424;

    @OriginalMember(owner = "UFAEFFVJ", name = "d", descriptor = "LVQRBOQUI;")
    private class67 field1411;

    @OriginalMember(owner = "UFAEFFVJ", name = "e", descriptor = "LVQRBOQUI;")
    private class67 field1412;

    @OriginalMember(owner = "UFAEFFVJ", name = "f", descriptor = "LVQRBOQUI;")
    private class67 field1413;

    @OriginalMember(owner = "UFAEFFVJ", name = "g", descriptor = "LVQRBOQUI;")
    private class67 field1414;

    @OriginalMember(owner = "UFAEFFVJ", name = "h", descriptor = "LVQRBOQUI;")
    private class67 field1415;

    @OriginalMember(owner = "UFAEFFVJ", name = "i", descriptor = "LVQRBOQUI;")
    private class67 field1416;

    @OriginalMember(owner = "UFAEFFVJ", name = "j", descriptor = "LVQRBOQUI;")
    private class67 field1417;

    @OriginalMember(owner = "UFAEFFVJ", name = "k", descriptor = "LVQRBOQUI;")
    private class67 field1418;

    @OriginalMember(owner = "UFAEFFVJ", name = "r", descriptor = "LVQRBOQUI;")
    private class67 field1425;

    @OriginalMember(owner = "UFAEFFVJ", name = "u", descriptor = "[I")
    private static int[] field1428;

    @OriginalMember(owner = "UFAEFFVJ", name = "v", descriptor = "[I")
    private static int[] field1429;

    @OriginalMember(owner = "UFAEFFVJ", name = "w", descriptor = "[I")
    private static int[] field1430;

    @OriginalMember(owner = "UFAEFFVJ", name = "a", descriptor = "()V")
    public static final void method502() {
        field1429 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1429[var0] = 1;
            } else {
                field1429[var0] = -1;
            }
        }
        field1430 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1430[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1428 = new int[220500];
    }

    @OriginalMember(owner = "UFAEFFVJ", name = "a", descriptor = "(II)[I")
    public final int[] method503(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1428[var3] = 0;
        }
        if (arg1 < 10) {
            return field1428;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1411.method580(-867);
        this.field1412.method580(-867);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1413 != null) {
            this.field1413.method580(-867);
            this.field1414.method580(-867);
            var6 = (int) ((double) (this.field1413.field1684 - this.field1413.field1683) * 32.768D / var4);
            var7 = (int) ((double) this.field1413.field1683 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1415 != null) {
            this.field1415.method580(-867);
            this.field1416.method580(-867);
            var9 = (int) ((double) (this.field1415.field1684 - this.field1415.field1683) * 32.768D / var4);
            var10 = (int) ((double) this.field1415.field1683 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1419[var12] != 0) {
                field1431[var12] = 0;
                field1432[var12] = (int) ((double) this.field1421[var12] * var4);
                field1433[var12] = (this.field1419[var12] << 14) / 100;
                field1434[var12] = (int) ((double) (this.field1411.field1684 - this.field1411.field1683) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1420[var12]) / var4);
                field1435[var12] = (int) ((double) this.field1411.field1683 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1411.method581(false, arg0);
            int var42 = this.field1412.method581(false, arg0);
            if (this.field1413 != null) {
                int var43 = this.field1413.method581(false, arg0);
                int var44 = this.field1414.method581(false, arg0);
                var41 += this.method504(var44, var8, this.field1413.field1685, 843) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1415 != null) {
                int var45 = this.field1415.method581(false, arg0);
                int var46 = this.field1416.method581(false, arg0);
                var42 = var42 * ((this.method504(var46, var11, this.field1415.field1685, 843) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1419[var47] != 0) {
                    int var48 = field1432[var47] + var13;
                    if (var48 < arg0) {
                        field1428[var48] += this.method504(field1433[var47] * var42 >> 15, field1431[var47], this.field1411.field1685, 843);
                        field1431[var47] += (field1434[var47] * var41 >> 16) + field1435[var47];
                    }
                }
            }
        }
        if (this.field1417 != null) {
            this.field1417.method580(-867);
            this.field1418.method580(-867);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1417.method581(false, arg0);
                int var19 = this.field1418.method581(false, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1417.field1684 - this.field1417.field1683) * var18 >> 8) + this.field1417.field1683;
                } else {
                    var20 = ((this.field1417.field1684 - this.field1417.field1683) * var19 >> 8) + this.field1417.field1683;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1428[var17] = 0;
                }
            }
        }
        if (this.field1422 > 0 && this.field1423 > 0) {
            int var21 = (int) ((double) this.field1422 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1428[var22] += field1428[var22 - var21] * this.field1423 / 100;
            }
        }
        if (this.field1424.field1079[0] > 0 || this.field1424.field1079[1] > 0) {
            this.field1425.method580(-867);
            int var23 = this.field1425.method581(false, arg0 + 1);
            int var24 = this.field1424.method397((float) var23 / 65536.0F, field1409, 0);
            int var25 = this.field1424.method397((float) var23 / 65536.0F, field1409, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1428[var24 + var26] * (long) class32.field1086 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1428[var24 + var26 - var38 - 1] * (long) class32.field1084[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1428[var26 - var39 - 1] * (long) class32.field1084[1][var39] >> 16);
                    }
                    field1428[var26] = var37;
                    var23 = this.field1425.method581(false, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1428[var24 + var26] * (long) class32.field1086 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1428[var24 + var26 - var35 - 1] * (long) class32.field1084[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1428[var26 - var36 - 1] * (long) class32.field1084[1][var36] >> 16);
                        }
                        field1428[var26] = var34;
                        var23 = this.field1425.method581(false, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1428[var24 + var26 - var31 - 1] * (long) class32.field1084[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1428[var26 - var32 - 1] * (long) class32.field1084[1][var32] >> 16);
                            }
                            field1428[var26] = var30;
                            this.field1425.method581(false, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1424.method397((float) var23 / 65536.0F, field1409, 0);
                    var25 = this.field1424.method397((float) var23 / 65536.0F, field1409, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1428[var40] < -32768) {
                field1428[var40] = -32768;
            }
            if (field1428[var40] > 32767) {
                field1428[var40] = 32767;
            }
        }
        return field1428;
    }

    @OriginalMember(owner = "UFAEFFVJ", name = "a", descriptor = "(IIII)I")
    private final int method504(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            return 4;
        } else if (arg2 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg2 == 2) {
            return field1430[arg1 & 0x7FFF] * arg0 >> 14;
        } else if (arg2 == 3) {
            return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg2 == 4) {
            return field1429[arg1 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "UFAEFFVJ", name = "a", descriptor = "(BLCKBTFRZM;)V")
    public final void method505(byte arg0, class5 arg1) {
        this.field1411 = new class67();
        this.field1411.method578((byte) -18, arg1);
        this.field1412 = new class67();
        this.field1412.method578((byte) -18, arg1);
        int var3 = arg1.method44();
        if (arg0 != -18) {
            this.field1408 = !this.field1408;
        }
        if (var3 != 0) {
            arg1.field123--;
            this.field1413 = new class67();
            this.field1413.method578((byte) -18, arg1);
            this.field1414 = new class67();
            this.field1414.method578((byte) -18, arg1);
        }
        int var4 = arg1.method44();
        if (var4 != 0) {
            arg1.field123--;
            this.field1415 = new class67();
            this.field1415.method578((byte) -18, arg1);
            this.field1416 = new class67();
            this.field1416.method578((byte) -18, arg1);
        }
        int var5 = arg1.method44();
        if (var5 != 0) {
            arg1.field123--;
            this.field1417 = new class67();
            this.field1417.method578((byte) -18, arg1);
            this.field1418 = new class67();
            this.field1418.method578((byte) -18, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method58();
            if (var7 == 0) {
                break;
            }
            this.field1419[var6] = var7;
            this.field1420[var6] = arg1.method57();
            this.field1421[var6] = arg1.method58();
        }
        this.field1422 = arg1.method58();
        this.field1423 = arg1.method58();
        this.field1426 = arg1.method46();
        this.field1427 = arg1.method46();
        this.field1424 = new class32();
        this.field1425 = new class67();
        this.field1424.method398(this.field1425, this.field1410, arg1);
    }
}
