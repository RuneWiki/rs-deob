import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UFBSEXDM")
public class class51 {

    @OriginalMember(owner = "UFBSEXDM", name = "j", descriptor = "[I")
    private int[] field1501 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "k", descriptor = "[I")
    private int[] field1502 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "l", descriptor = "[I")
    private int[] field1503 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "n", descriptor = "I")
    private int field1505 = 100;

    @OriginalMember(owner = "UFBSEXDM", name = "q", descriptor = "I")
    public int field1508 = 500;

    @OriginalMember(owner = "UFBSEXDM", name = "a", descriptor = "Z")
    private static boolean field1492 = true;

    @OriginalMember(owner = "UFBSEXDM", name = "v", descriptor = "[I")
    private static int[] field1513 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "w", descriptor = "[I")
    private static int[] field1514 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "x", descriptor = "[I")
    private static int[] field1515 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "y", descriptor = "[I")
    private static int[] field1516 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "z", descriptor = "[I")
    private static int[] field1517 = new int[5];

    @OriginalMember(owner = "UFBSEXDM", name = "m", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "UFBSEXDM", name = "r", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "UFBSEXDM", name = "o", descriptor = "LLOQKYCGM;")
    private class26 field1506;

    @OriginalMember(owner = "UFBSEXDM", name = "b", descriptor = "LTMVRZUVH;")
    private class49 field1493;

    @OriginalMember(owner = "UFBSEXDM", name = "c", descriptor = "LTMVRZUVH;")
    private class49 field1494;

    @OriginalMember(owner = "UFBSEXDM", name = "d", descriptor = "LTMVRZUVH;")
    private class49 field1495;

    @OriginalMember(owner = "UFBSEXDM", name = "e", descriptor = "LTMVRZUVH;")
    private class49 field1496;

    @OriginalMember(owner = "UFBSEXDM", name = "f", descriptor = "LTMVRZUVH;")
    private class49 field1497;

    @OriginalMember(owner = "UFBSEXDM", name = "g", descriptor = "LTMVRZUVH;")
    private class49 field1498;

    @OriginalMember(owner = "UFBSEXDM", name = "h", descriptor = "LTMVRZUVH;")
    private class49 field1499;

    @OriginalMember(owner = "UFBSEXDM", name = "i", descriptor = "LTMVRZUVH;")
    private class49 field1500;

    @OriginalMember(owner = "UFBSEXDM", name = "p", descriptor = "LTMVRZUVH;")
    private class49 field1507;

    @OriginalMember(owner = "UFBSEXDM", name = "s", descriptor = "[I")
    private static int[] field1510;

    @OriginalMember(owner = "UFBSEXDM", name = "t", descriptor = "[I")
    private static int[] field1511;

    @OriginalMember(owner = "UFBSEXDM", name = "u", descriptor = "[I")
    private static int[] field1512;

    @OriginalMember(owner = "UFBSEXDM", name = "a", descriptor = "()V")
    public static final void method495() {
        field1511 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1511[var0] = 1;
            } else {
                field1511[var0] = -1;
            }
        }
        field1512 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1512[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1510 = new int[220500];
    }

    @OriginalMember(owner = "UFBSEXDM", name = "a", descriptor = "(II)[I")
    public final int[] method496(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1510[var3] = 0;
        }
        if (arg1 < 10) {
            return field1510;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1493.method490(field1492);
        this.field1494.method490(field1492);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1495 != null) {
            this.field1495.method490(field1492);
            this.field1496.method490(field1492);
            var6 = (int) ((double) (this.field1495.field1475 - this.field1495.field1474) * 32.768D / var4);
            var7 = (int) ((double) this.field1495.field1474 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1497 != null) {
            this.field1497.method490(field1492);
            this.field1498.method490(field1492);
            var9 = (int) ((double) (this.field1497.field1475 - this.field1497.field1474) * 32.768D / var4);
            var10 = (int) ((double) this.field1497.field1474 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1501[var12] != 0) {
                field1513[var12] = 0;
                field1514[var12] = (int) ((double) this.field1503[var12] * var4);
                field1515[var12] = (this.field1501[var12] << 14) / 100;
                field1516[var12] = (int) ((double) (this.field1493.field1475 - this.field1493.field1474) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1502[var12]) / var4);
                field1517[var12] = (int) ((double) this.field1493.field1474 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1493.method491(true, arg0);
            int var42 = this.field1494.method491(true, arg0);
            if (this.field1495 != null) {
                int var43 = this.field1495.method491(true, arg0);
                int var44 = this.field1496.method491(true, arg0);
                var41 += this.method497(var8, this.field1495.field1476, var44, -928) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1497 != null) {
                int var45 = this.field1497.method491(true, arg0);
                int var46 = this.field1498.method491(true, arg0);
                var42 = var42 * ((this.method497(var11, this.field1497.field1476, var46, -928) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1501[var47] != 0) {
                    int var48 = field1514[var47] + var13;
                    if (var48 < arg0) {
                        field1510[var48] += this.method497(field1513[var47], this.field1493.field1476, field1515[var47] * var42 >> 15, -928);
                        field1513[var47] += (field1516[var47] * var41 >> 16) + field1517[var47];
                    }
                }
            }
        }
        if (this.field1499 != null) {
            this.field1499.method490(field1492);
            this.field1500.method490(field1492);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1499.method491(true, arg0);
                int var19 = this.field1500.method491(true, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1499.field1475 - this.field1499.field1474) * var18 >> 8) + this.field1499.field1474;
                } else {
                    var20 = ((this.field1499.field1475 - this.field1499.field1474) * var19 >> 8) + this.field1499.field1474;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1510[var17] = 0;
                }
            }
        }
        if (this.field1504 > 0 && this.field1505 > 0) {
            int var21 = (int) ((double) this.field1504 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1510[var22] += field1510[var22 - var21] * this.field1505 / 100;
            }
        }
        if (this.field1506.field998[0] > 0 || this.field1506.field998[1] > 0) {
            this.field1507.method490(field1492);
            int var23 = this.field1507.method491(true, arg0 + 1);
            int var24 = this.field1506.method306((float) var23 / 65536.0F, 0, (byte) 19);
            int var25 = this.field1506.method306((float) var23 / 65536.0F, 1, (byte) 19);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1510[var24 + var26] * (long) class26.field1005 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1510[var24 + var26 - var38 - 1] * (long) class26.field1003[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1510[var26 - var39 - 1] * (long) class26.field1003[1][var39] >> 16);
                    }
                    field1510[var26] = var37;
                    var23 = this.field1507.method491(true, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1510[var24 + var26] * (long) class26.field1005 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1510[var24 + var26 - var35 - 1] * (long) class26.field1003[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1510[var26 - var36 - 1] * (long) class26.field1003[1][var36] >> 16);
                        }
                        field1510[var26] = var34;
                        var23 = this.field1507.method491(true, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1510[var24 + var26 - var31 - 1] * (long) class26.field1003[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1510[var26 - var32 - 1] * (long) class26.field1003[1][var32] >> 16);
                            }
                            field1510[var26] = var30;
                            this.field1507.method491(true, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1506.method306((float) var23 / 65536.0F, 0, (byte) 19);
                    var25 = this.field1506.method306((float) var23 / 65536.0F, 1, (byte) 19);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1510[var40] < -32768) {
                field1510[var40] = -32768;
            }
            if (field1510[var40] > 32767) {
                field1510[var40] = 32767;
            }
        }
        return field1510;
    }

    @OriginalMember(owner = "UFBSEXDM", name = "a", descriptor = "(IIII)I")
    private final int method497(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field1512[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field1511[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "UFBSEXDM", name = "a", descriptor = "(LGHHPHSRU;I)V")
    public final void method498(class14 arg0, int arg1) {
        this.field1493 = new class49();
        this.field1493.method488(arg0, 0);
        this.field1494 = new class49();
        this.field1494.method488(arg0, 0);
        int var3 = arg0.method202();
        if (var3 != 0) {
            arg0.field769--;
            this.field1495 = new class49();
            this.field1495.method488(arg0, 0);
            this.field1496 = new class49();
            this.field1496.method488(arg0, 0);
        }
        int var4 = arg0.method202();
        if (arg1 != 0) {
            field1492 = !field1492;
        }
        if (var4 != 0) {
            arg0.field769--;
            this.field1497 = new class49();
            this.field1497.method488(arg0, 0);
            this.field1498 = new class49();
            this.field1498.method488(arg0, 0);
        }
        int var5 = arg0.method202();
        if (var5 != 0) {
            arg0.field769--;
            this.field1499 = new class49();
            this.field1499.method488(arg0, 0);
            this.field1500 = new class49();
            this.field1500.method488(arg0, 0);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method216();
            if (var7 == 0) {
                break;
            }
            this.field1501[var6] = var7;
            this.field1502[var6] = arg0.method215();
            this.field1503[var6] = arg0.method216();
        }
        this.field1504 = arg0.method216();
        this.field1505 = arg0.method216();
        this.field1508 = arg0.method204();
        this.field1509 = arg0.method204();
        this.field1506 = new class26();
        this.field1507 = new class49();
        this.field1506.method307(95, this.field1507, arg0);
    }
}
