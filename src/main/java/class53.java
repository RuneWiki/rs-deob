import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QCXYCZNF")
public class class53 {

    @OriginalMember(owner = "QCXYCZNF", name = "a", descriptor = "I")
    private int field1132 = 4;

    @OriginalMember(owner = "QCXYCZNF", name = "j", descriptor = "[I")
    private int[] field1141 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "k", descriptor = "[I")
    private int[] field1142 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "l", descriptor = "[I")
    private int[] field1143 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "n", descriptor = "I")
    private int field1145 = 100;

    @OriginalMember(owner = "QCXYCZNF", name = "q", descriptor = "I")
    public int field1148 = 500;

    @OriginalMember(owner = "QCXYCZNF", name = "v", descriptor = "[I")
    private static int[] field1153 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "w", descriptor = "[I")
    private static int[] field1154 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "x", descriptor = "[I")
    private static int[] field1155 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "y", descriptor = "[I")
    private static int[] field1156 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "z", descriptor = "[I")
    private static int[] field1157 = new int[5];

    @OriginalMember(owner = "QCXYCZNF", name = "m", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "QCXYCZNF", name = "r", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "QCXYCZNF", name = "o", descriptor = "LLNMFPXZK;")
    private class38 field1146;

    @OriginalMember(owner = "QCXYCZNF", name = "b", descriptor = "LSSKEPHYP;")
    private class60 field1133;

    @OriginalMember(owner = "QCXYCZNF", name = "c", descriptor = "LSSKEPHYP;")
    private class60 field1134;

    @OriginalMember(owner = "QCXYCZNF", name = "d", descriptor = "LSSKEPHYP;")
    private class60 field1135;

    @OriginalMember(owner = "QCXYCZNF", name = "e", descriptor = "LSSKEPHYP;")
    private class60 field1136;

    @OriginalMember(owner = "QCXYCZNF", name = "f", descriptor = "LSSKEPHYP;")
    private class60 field1137;

    @OriginalMember(owner = "QCXYCZNF", name = "g", descriptor = "LSSKEPHYP;")
    private class60 field1138;

    @OriginalMember(owner = "QCXYCZNF", name = "h", descriptor = "LSSKEPHYP;")
    private class60 field1139;

    @OriginalMember(owner = "QCXYCZNF", name = "i", descriptor = "LSSKEPHYP;")
    private class60 field1140;

    @OriginalMember(owner = "QCXYCZNF", name = "p", descriptor = "LSSKEPHYP;")
    private class60 field1147;

    @OriginalMember(owner = "QCXYCZNF", name = "s", descriptor = "[I")
    private static int[] field1150;

    @OriginalMember(owner = "QCXYCZNF", name = "t", descriptor = "[I")
    private static int[] field1151;

    @OriginalMember(owner = "QCXYCZNF", name = "u", descriptor = "[I")
    private static int[] field1152;

    @OriginalMember(owner = "QCXYCZNF", name = "a", descriptor = "()V")
    public static final void method413() {
        field1151 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1151[var0] = 1;
            } else {
                field1151[var0] = -1;
            }
        }
        field1152 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1152[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1150 = new int[220500];
    }

    @OriginalMember(owner = "QCXYCZNF", name = "a", descriptor = "(II)[I")
    public final int[] method414(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1150[var3] = 0;
        }
        if (arg1 < 10) {
            return field1150;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1133.method481(-580);
        this.field1134.method481(-580);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1135 != null) {
            this.field1135.method481(-580);
            this.field1136.method481(-580);
            var6 = (int) ((double) (this.field1135.field1377 - this.field1135.field1376) * 32.768D / var4);
            var7 = (int) ((double) this.field1135.field1376 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1137 != null) {
            this.field1137.method481(-580);
            this.field1138.method481(-580);
            var9 = (int) ((double) (this.field1137.field1377 - this.field1137.field1376) * 32.768D / var4);
            var10 = (int) ((double) this.field1137.field1376 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1141[var12] != 0) {
                field1153[var12] = 0;
                field1154[var12] = (int) ((double) this.field1143[var12] * var4);
                field1155[var12] = (this.field1141[var12] << 14) / 100;
                field1156[var12] = (int) ((double) (this.field1133.field1377 - this.field1133.field1376) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1142[var12]) / var4);
                field1157[var12] = (int) ((double) this.field1133.field1376 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1133.method482(arg0, true);
            int var42 = this.field1134.method482(arg0, true);
            if (this.field1135 != null) {
                int var43 = this.field1135.method482(arg0, true);
                int var44 = this.field1136.method482(arg0, true);
                var41 += this.method415(true, this.field1135.field1378, var8, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1137 != null) {
                int var45 = this.field1137.method482(arg0, true);
                int var46 = this.field1138.method482(arg0, true);
                var42 = var42 * ((this.method415(true, this.field1137.field1378, var11, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1141[var47] != 0) {
                    int var48 = field1154[var47] + var13;
                    if (var48 < arg0) {
                        field1150[var48] += this.method415(true, this.field1133.field1378, field1153[var47], field1155[var47] * var42 >> 15);
                        field1153[var47] += (field1156[var47] * var41 >> 16) + field1157[var47];
                    }
                }
            }
        }
        if (this.field1139 != null) {
            this.field1139.method481(-580);
            this.field1140.method481(-580);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1139.method482(arg0, true);
                int var19 = this.field1140.method482(arg0, true);
                int var20;
                if (var16) {
                    var20 = ((this.field1139.field1377 - this.field1139.field1376) * var18 >> 8) + this.field1139.field1376;
                } else {
                    var20 = ((this.field1139.field1377 - this.field1139.field1376) * var19 >> 8) + this.field1139.field1376;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1150[var17] = 0;
                }
            }
        }
        if (this.field1144 > 0 && this.field1145 > 0) {
            int var21 = (int) ((double) this.field1144 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1150[var22] += field1150[var22 - var21] * this.field1145 / 100;
            }
        }
        if (this.field1146.field977[0] > 0 || this.field1146.field977[1] > 0) {
            this.field1147.method481(-580);
            int var23 = this.field1147.method482(arg0 + 1, true);
            int var24 = this.field1146.method366((float) var23 / 65536.0F, 0, 0);
            int var25 = this.field1146.method366((float) var23 / 65536.0F, 1, 0);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1150[var24 + var26] * (long) class38.field984 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1150[var24 + var26 - var38 - 1] * (long) class38.field982[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1150[var26 - var39 - 1] * (long) class38.field982[1][var39] >> 16);
                    }
                    field1150[var26] = var37;
                    var23 = this.field1147.method482(arg0 + 1, true);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1150[var24 + var26] * (long) class38.field984 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1150[var24 + var26 - var35 - 1] * (long) class38.field982[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1150[var26 - var36 - 1] * (long) class38.field982[1][var36] >> 16);
                        }
                        field1150[var26] = var34;
                        var23 = this.field1147.method482(arg0 + 1, true);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1150[var24 + var26 - var31 - 1] * (long) class38.field982[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1150[var26 - var32 - 1] * (long) class38.field982[1][var32] >> 16);
                            }
                            field1150[var26] = var30;
                            this.field1147.method482(arg0 + 1, true);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1146.method366((float) var23 / 65536.0F, 0, 0);
                    var25 = this.field1146.method366((float) var23 / 65536.0F, 1, 0);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1150[var40] < -32768) {
                field1150[var40] = -32768;
            }
            if (field1150[var40] > 32767) {
                field1150[var40] = 32767;
            }
        }
        return field1150;
    }

    @OriginalMember(owner = "QCXYCZNF", name = "a", descriptor = "(ZIII)I")
    private final int method415(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field1132 = 298;
        }
        if (arg1 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg1 == 2) {
            return field1152[arg2 & 0x7FFF] * arg3 >> 14;
        } else if (arg1 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg1 == 4) {
            return field1151[arg2 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "QCXYCZNF", name = "a", descriptor = "(LJHKSAGUC;I)V")
    public final void method416(class31 arg0, int arg1) {
        this.field1133 = new class60();
        this.field1133.method479(arg0, 0);
        this.field1134 = new class60();
        this.field1134.method479(arg0, 0);
        int var3 = arg0.method306();
        if (var3 != 0) {
            arg0.field901--;
            this.field1135 = new class60();
            this.field1135.method479(arg0, 0);
            this.field1136 = new class60();
            this.field1136.method479(arg0, 0);
        }
        int var4 = arg0.method306();
        if (var4 != 0) {
            arg0.field901--;
            this.field1137 = new class60();
            this.field1137.method479(arg0, 0);
            this.field1138 = new class60();
            this.field1138.method479(arg0, 0);
        }
        int var5 = arg0.method306();
        if (var5 != 0) {
            arg0.field901--;
            this.field1139 = new class60();
            this.field1139.method479(arg0, 0);
            this.field1140 = new class60();
            this.field1140.method479(arg0, 0);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method320();
            if (var7 == 0) {
                break;
            }
            this.field1141[var6] = var7;
            this.field1142[var6] = arg0.method319();
            this.field1143[var6] = arg0.method320();
        }
        this.field1144 = arg0.method320();
        this.field1145 = arg0.method320();
        this.field1148 = arg0.method308();
        this.field1149 = arg0.method308();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1146 = new class38();
        this.field1147 = new class60();
        this.field1146.method367(this.field1147, 0, arg0);
    }
}
