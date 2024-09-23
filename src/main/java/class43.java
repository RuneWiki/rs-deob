import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QGBENKJV")
public class class43 {

    @OriginalMember(owner = "QGBENKJV", name = "a", descriptor = "I")
    private int field1019 = -261;

    @OriginalMember(owner = "QGBENKJV", name = "b", descriptor = "I")
    private int field1020 = 1;

    @OriginalMember(owner = "QGBENKJV", name = "k", descriptor = "[I")
    private int[] field1029 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "l", descriptor = "[I")
    private int[] field1030 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "m", descriptor = "[I")
    private int[] field1031 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "o", descriptor = "I")
    private int field1033 = 100;

    @OriginalMember(owner = "QGBENKJV", name = "r", descriptor = "I")
    public int field1036 = 500;

    @OriginalMember(owner = "QGBENKJV", name = "w", descriptor = "[I")
    private static int[] field1041 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "x", descriptor = "[I")
    private static int[] field1042 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "y", descriptor = "[I")
    private static int[] field1043 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "z", descriptor = "[I")
    private static int[] field1044 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "A", descriptor = "[I")
    private static int[] field1045 = new int[5];

    @OriginalMember(owner = "QGBENKJV", name = "n", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "QGBENKJV", name = "s", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "QGBENKJV", name = "p", descriptor = "LKVKPXLHS;")
    private class28 field1034;

    @OriginalMember(owner = "QGBENKJV", name = "c", descriptor = "LRPKBYPNF;")
    private class48 field1021;

    @OriginalMember(owner = "QGBENKJV", name = "d", descriptor = "LRPKBYPNF;")
    private class48 field1022;

    @OriginalMember(owner = "QGBENKJV", name = "e", descriptor = "LRPKBYPNF;")
    private class48 field1023;

    @OriginalMember(owner = "QGBENKJV", name = "f", descriptor = "LRPKBYPNF;")
    private class48 field1024;

    @OriginalMember(owner = "QGBENKJV", name = "g", descriptor = "LRPKBYPNF;")
    private class48 field1025;

    @OriginalMember(owner = "QGBENKJV", name = "h", descriptor = "LRPKBYPNF;")
    private class48 field1026;

    @OriginalMember(owner = "QGBENKJV", name = "i", descriptor = "LRPKBYPNF;")
    private class48 field1027;

    @OriginalMember(owner = "QGBENKJV", name = "j", descriptor = "LRPKBYPNF;")
    private class48 field1028;

    @OriginalMember(owner = "QGBENKJV", name = "q", descriptor = "LRPKBYPNF;")
    private class48 field1035;

    @OriginalMember(owner = "QGBENKJV", name = "t", descriptor = "[I")
    private static int[] field1038;

    @OriginalMember(owner = "QGBENKJV", name = "u", descriptor = "[I")
    private static int[] field1039;

    @OriginalMember(owner = "QGBENKJV", name = "v", descriptor = "[I")
    private static int[] field1040;

    @OriginalMember(owner = "QGBENKJV", name = "a", descriptor = "()V")
    public static final void method381() {
        field1039 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1039[var0] = 1;
            } else {
                field1039[var0] = -1;
            }
        }
        field1040 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1040[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1038 = new int[220500];
    }

    @OriginalMember(owner = "QGBENKJV", name = "a", descriptor = "(II)[I")
    public final int[] method382(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1038[var3] = 0;
        }
        if (arg1 < 10) {
            return field1038;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1021.method475((byte) 9);
        this.field1022.method475((byte) 9);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1023 != null) {
            this.field1023.method475((byte) 9);
            this.field1024.method475((byte) 9);
            var6 = (int) ((double) (this.field1023.field1173 - this.field1023.field1172) * 32.768D / var4);
            var7 = (int) ((double) this.field1023.field1172 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1025 != null) {
            this.field1025.method475((byte) 9);
            this.field1026.method475((byte) 9);
            var9 = (int) ((double) (this.field1025.field1173 - this.field1025.field1172) * 32.768D / var4);
            var10 = (int) ((double) this.field1025.field1172 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1029[var12] != 0) {
                field1041[var12] = 0;
                field1042[var12] = (int) ((double) this.field1031[var12] * var4);
                field1043[var12] = (this.field1029[var12] << 14) / 100;
                field1044[var12] = (int) ((double) (this.field1021.field1173 - this.field1021.field1172) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1030[var12]) / var4);
                field1045[var12] = (int) ((double) this.field1021.field1172 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1021.method476(arg0, (byte) 123);
            int var42 = this.field1022.method476(arg0, (byte) 123);
            if (this.field1023 != null) {
                int var43 = this.field1023.method476(arg0, (byte) 123);
                int var44 = this.field1024.method476(arg0, (byte) 123);
                var41 += this.method383(this.field1023.field1174, (byte) 7, var8, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1025 != null) {
                int var45 = this.field1025.method476(arg0, (byte) 123);
                int var46 = this.field1026.method476(arg0, (byte) 123);
                var42 = var42 * ((this.method383(this.field1025.field1174, (byte) 7, var11, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1029[var47] != 0) {
                    int var48 = field1042[var47] + var13;
                    if (var48 < arg0) {
                        field1038[var48] += this.method383(this.field1021.field1174, (byte) 7, field1041[var47], field1043[var47] * var42 >> 15);
                        field1041[var47] += (field1044[var47] * var41 >> 16) + field1045[var47];
                    }
                }
            }
        }
        if (this.field1027 != null) {
            this.field1027.method475((byte) 9);
            this.field1028.method475((byte) 9);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1027.method476(arg0, (byte) 123);
                int var19 = this.field1028.method476(arg0, (byte) 123);
                int var20;
                if (var16) {
                    var20 = ((this.field1027.field1173 - this.field1027.field1172) * var18 >> 8) + this.field1027.field1172;
                } else {
                    var20 = ((this.field1027.field1173 - this.field1027.field1172) * var19 >> 8) + this.field1027.field1172;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1038[var17] = 0;
                }
            }
        }
        if (this.field1032 > 0 && this.field1033 > 0) {
            int var21 = (int) ((double) this.field1032 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1038[var22] += field1038[var22 - var21] * this.field1033 / 100;
            }
        }
        if (this.field1034.field837[0] > 0 || this.field1034.field837[1] > 0) {
            this.field1035.method475((byte) 9);
            int var23 = this.field1035.method476(arg0 + 1, (byte) 123);
            int var24 = this.field1034.method268(0, true, (float) var23 / 65536.0F);
            int var25 = this.field1034.method268(1, true, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1038[var24 + var26] * (long) class28.field844 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1038[var24 + var26 - var38 - 1] * (long) class28.field842[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1038[var26 - var39 - 1] * (long) class28.field842[1][var39] >> 16);
                    }
                    field1038[var26] = var37;
                    var23 = this.field1035.method476(arg0 + 1, (byte) 123);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1038[var24 + var26] * (long) class28.field844 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1038[var24 + var26 - var35 - 1] * (long) class28.field842[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1038[var26 - var36 - 1] * (long) class28.field842[1][var36] >> 16);
                        }
                        field1038[var26] = var34;
                        var23 = this.field1035.method476(arg0 + 1, (byte) 123);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1038[var24 + var26 - var31 - 1] * (long) class28.field842[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1038[var26 - var32 - 1] * (long) class28.field842[1][var32] >> 16);
                            }
                            field1038[var26] = var30;
                            this.field1035.method476(arg0 + 1, (byte) 123);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1034.method268(0, true, (float) var23 / 65536.0F);
                    var25 = this.field1034.method268(1, true, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1038[var40] < -32768) {
                field1038[var40] = -32768;
            }
            if (field1038[var40] > 32767) {
                field1038[var40] = 32767;
            }
        }
        return field1038;
    }

    @OriginalMember(owner = "QGBENKJV", name = "a", descriptor = "(IBII)I")
    private final int method383(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 7) {
            return this.field1020;
        }
        boolean var5 = false;
        if (arg0 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg0 == 2) {
            return field1040[arg2 & 0x7FFF] * arg3 >> 14;
        } else if (arg0 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg0 == 4) {
            return field1039[arg2 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "QGBENKJV", name = "a", descriptor = "(LMQZHAILV;I)V")
    public final void method384(class33 arg0, int arg1) {
        this.field1021 = new class48();
        this.field1021.method473(arg0, -261);
        this.field1022 = new class48();
        this.field1022.method473(arg0, -261);
        int var3 = arg0.method325();
        if (var3 != 0) {
            arg0.field945--;
            this.field1023 = new class48();
            this.field1023.method473(arg0, -261);
            this.field1024 = new class48();
            this.field1024.method473(arg0, -261);
        }
        int var4 = arg0.method325();
        if (var4 != 0) {
            arg0.field945--;
            this.field1025 = new class48();
            this.field1025.method473(arg0, -261);
            this.field1026 = new class48();
            this.field1026.method473(arg0, -261);
        }
        int var5 = arg0.method325();
        if (var5 != 0) {
            arg0.field945--;
            this.field1027 = new class48();
            this.field1027.method473(arg0, -261);
            this.field1028 = new class48();
            this.field1028.method473(arg0, -261);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method339();
            if (var7 == 0) {
                break;
            }
            this.field1029[var6] = var7;
            this.field1030[var6] = arg0.method338();
            this.field1031[var6] = arg0.method339();
        }
        this.field1032 = arg0.method339();
        this.field1033 = arg0.method339();
        this.field1036 = arg0.method327();
        this.field1037 = arg0.method327();
        this.field1034 = new class28();
        this.field1035 = new class48();
        while (arg1 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field1034.method269((byte) 2, this.field1035, arg0);
    }
}
