import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KMJDCQND")
public class class31 {

    @OriginalMember(owner = "KMJDCQND", name = "a", descriptor = "I")
    private int field1078 = 45903;

    @OriginalMember(owner = "KMJDCQND", name = "b", descriptor = "I")
    private int field1079 = -43;

    @OriginalMember(owner = "KMJDCQND", name = "k", descriptor = "[I")
    private int[] field1088 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "l", descriptor = "[I")
    private int[] field1089 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "m", descriptor = "[I")
    private int[] field1090 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "o", descriptor = "I")
    private int field1092 = 100;

    @OriginalMember(owner = "KMJDCQND", name = "r", descriptor = "I")
    public int field1095 = 500;

    @OriginalMember(owner = "KMJDCQND", name = "w", descriptor = "[I")
    private static int[] field1100 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "x", descriptor = "[I")
    private static int[] field1101 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "y", descriptor = "[I")
    private static int[] field1102 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "z", descriptor = "[I")
    private static int[] field1103 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "A", descriptor = "[I")
    private static int[] field1104 = new int[5];

    @OriginalMember(owner = "KMJDCQND", name = "n", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "KMJDCQND", name = "s", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "KMJDCQND", name = "c", descriptor = "LKMZLAUEV;")
    private class32 field1080;

    @OriginalMember(owner = "KMJDCQND", name = "d", descriptor = "LKMZLAUEV;")
    private class32 field1081;

    @OriginalMember(owner = "KMJDCQND", name = "e", descriptor = "LKMZLAUEV;")
    private class32 field1082;

    @OriginalMember(owner = "KMJDCQND", name = "f", descriptor = "LKMZLAUEV;")
    private class32 field1083;

    @OriginalMember(owner = "KMJDCQND", name = "g", descriptor = "LKMZLAUEV;")
    private class32 field1084;

    @OriginalMember(owner = "KMJDCQND", name = "h", descriptor = "LKMZLAUEV;")
    private class32 field1085;

    @OriginalMember(owner = "KMJDCQND", name = "i", descriptor = "LKMZLAUEV;")
    private class32 field1086;

    @OriginalMember(owner = "KMJDCQND", name = "j", descriptor = "LKMZLAUEV;")
    private class32 field1087;

    @OriginalMember(owner = "KMJDCQND", name = "q", descriptor = "LKMZLAUEV;")
    private class32 field1094;

    @OriginalMember(owner = "KMJDCQND", name = "p", descriptor = "LQEWPNZTS;")
    private class47 field1093;

    @OriginalMember(owner = "KMJDCQND", name = "t", descriptor = "[I")
    private static int[] field1097;

    @OriginalMember(owner = "KMJDCQND", name = "u", descriptor = "[I")
    private static int[] field1098;

    @OriginalMember(owner = "KMJDCQND", name = "v", descriptor = "[I")
    private static int[] field1099;

    @OriginalMember(owner = "KMJDCQND", name = "a", descriptor = "()V")
    public static final void method390() {
        field1098 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1098[var0] = 1;
            } else {
                field1098[var0] = -1;
            }
        }
        field1099 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1099[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1097 = new int[220500];
    }

    @OriginalMember(owner = "KMJDCQND", name = "a", descriptor = "(II)[I")
    public final int[] method391(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1097[var3] = 0;
        }
        if (arg1 < 10) {
            return field1097;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1080.method396(true);
        this.field1081.method396(true);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1082 != null) {
            this.field1082.method396(true);
            this.field1083.method396(true);
            var6 = (int) ((double) (this.field1082.field1110 - this.field1082.field1109) * 32.768D / var4);
            var7 = (int) ((double) this.field1082.field1109 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1084 != null) {
            this.field1084.method396(true);
            this.field1085.method396(true);
            var9 = (int) ((double) (this.field1084.field1110 - this.field1084.field1109) * 32.768D / var4);
            var10 = (int) ((double) this.field1084.field1109 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1088[var12] != 0) {
                field1100[var12] = 0;
                field1101[var12] = (int) ((double) this.field1090[var12] * var4);
                field1102[var12] = (this.field1088[var12] << 14) / 100;
                field1103[var12] = (int) ((double) (this.field1080.field1110 - this.field1080.field1109) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1089[var12]) / var4);
                field1104[var12] = (int) ((double) this.field1080.field1109 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1080.method397((byte) 2, arg0);
            int var42 = this.field1081.method397((byte) 2, arg0);
            if (this.field1082 != null) {
                int var43 = this.field1082.method397((byte) 2, arg0);
                int var44 = this.field1083.method397((byte) 2, arg0);
                var41 += this.method392(var8, -528, var44, this.field1082.field1111) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1084 != null) {
                int var45 = this.field1084.method397((byte) 2, arg0);
                int var46 = this.field1085.method397((byte) 2, arg0);
                var42 = var42 * ((this.method392(var11, -528, var46, this.field1084.field1111) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1088[var47] != 0) {
                    int var48 = field1101[var47] + var13;
                    if (var48 < arg0) {
                        field1097[var48] += this.method392(field1100[var47], -528, field1102[var47] * var42 >> 15, this.field1080.field1111);
                        field1100[var47] += (field1103[var47] * var41 >> 16) + field1104[var47];
                    }
                }
            }
        }
        if (this.field1086 != null) {
            this.field1086.method396(true);
            this.field1087.method396(true);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1086.method397((byte) 2, arg0);
                int var19 = this.field1087.method397((byte) 2, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1086.field1110 - this.field1086.field1109) * var18 >> 8) + this.field1086.field1109;
                } else {
                    var20 = ((this.field1086.field1110 - this.field1086.field1109) * var19 >> 8) + this.field1086.field1109;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1097[var17] = 0;
                }
            }
        }
        if (this.field1091 > 0 && this.field1092 > 0) {
            int var21 = (int) ((double) this.field1091 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1097[var22] += field1097[var22 - var21] * this.field1092 / 100;
            }
        }
        if (this.field1093.field1292[0] > 0 || this.field1093.field1292[1] > 0) {
            this.field1094.method396(true);
            int var23 = this.field1094.method397((byte) 2, arg0 + 1);
            int var24 = this.field1093.method498((float) var23 / 65536.0F, 0, -47883);
            int var25 = this.field1093.method498((float) var23 / 65536.0F, 1, -47883);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1097[var24 + var26] * (long) class47.field1299 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1097[var24 + var26 - var38 - 1] * (long) class47.field1297[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1097[var26 - var39 - 1] * (long) class47.field1297[1][var39] >> 16);
                    }
                    field1097[var26] = var37;
                    var23 = this.field1094.method397((byte) 2, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1097[var24 + var26] * (long) class47.field1299 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1097[var24 + var26 - var35 - 1] * (long) class47.field1297[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1097[var26 - var36 - 1] * (long) class47.field1297[1][var36] >> 16);
                        }
                        field1097[var26] = var34;
                        var23 = this.field1094.method397((byte) 2, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1097[var24 + var26 - var31 - 1] * (long) class47.field1297[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1097[var26 - var32 - 1] * (long) class47.field1297[1][var32] >> 16);
                            }
                            field1097[var26] = var30;
                            this.field1094.method397((byte) 2, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1093.method498((float) var23 / 65536.0F, 0, -47883);
                    var25 = this.field1093.method498((float) var23 / 65536.0F, 1, -47883);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1097[var40] < -32768) {
                field1097[var40] = -32768;
            }
            if (field1097[var40] > 32767) {
                field1097[var40] = 32767;
            }
        }
        return field1097;
    }

    @OriginalMember(owner = "KMJDCQND", name = "a", descriptor = "(IIII)I")
    private final int method392(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            return this.field1079;
        } else if (arg3 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg3 == 2) {
            return field1099[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg3 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg3 == 4) {
            return field1098[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KMJDCQND", name = "a", descriptor = "(LKHOMSBHW;I)V")
    public final void method393(class30 arg0, int arg1) {
        this.field1080 = new class32();
        this.field1080.method394(arg0, 1);
        this.field1081 = new class32();
        this.field1081.method394(arg0, 1);
        int var3 = arg0.method349();
        if (var3 != 0) {
            arg0.field1065--;
            this.field1082 = new class32();
            this.field1082.method394(arg0, 1);
            this.field1083 = new class32();
            this.field1083.method394(arg0, 1);
        }
        int var4 = arg0.method349();
        if (var4 != 0) {
            arg0.field1065--;
            this.field1084 = new class32();
            this.field1084.method394(arg0, 1);
            this.field1085 = new class32();
            this.field1085.method394(arg0, 1);
        }
        int var5 = arg0.method349();
        if (var5 != 0) {
            arg0.field1065--;
            this.field1086 = new class32();
            this.field1086.method394(arg0, 1);
            this.field1087 = new class32();
            this.field1087.method394(arg0, 1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method363();
            if (var7 == 0) {
                break;
            }
            this.field1088[var6] = var7;
            this.field1089[var6] = arg0.method362();
            this.field1090[var6] = arg0.method363();
        }
        this.field1091 = arg0.method363();
        this.field1092 = arg0.method363();
        this.field1095 = arg0.method351();
        this.field1096 = arg0.method351();
        if (arg1 != 1) {
            this.field1078 = -404;
        }
        this.field1093 = new class47();
        this.field1094 = new class32();
        this.field1093.method499(this.field1094, arg0, (byte) 7);
    }
}
