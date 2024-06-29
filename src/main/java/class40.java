import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PJPXFVTH")
public class class40 {

    @OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "I")
    private int field1118 = 987;

    @OriginalMember(owner = "client!PJPXFVTH", name = "b", descriptor = "Z")
    private boolean field1119 = true;

    @OriginalMember(owner = "client!PJPXFVTH", name = "k", descriptor = "[I")
    private int[] field1128 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "l", descriptor = "[I")
    private int[] field1129 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "m", descriptor = "[I")
    private int[] field1130 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "o", descriptor = "I")
    private int field1132 = 100;

    @OriginalMember(owner = "client!PJPXFVTH", name = "r", descriptor = "I")
    public int field1135 = 500;

    @OriginalMember(owner = "client!PJPXFVTH", name = "w", descriptor = "[I")
    private static int[] field1140 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "x", descriptor = "[I")
    private static int[] field1141 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "y", descriptor = "[I")
    private static int[] field1142 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "z", descriptor = "[I")
    private static int[] field1143 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "A", descriptor = "[I")
    private static int[] field1144 = new int[5];

    @OriginalMember(owner = "client!PJPXFVTH", name = "n", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!PJPXFVTH", name = "s", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!PJPXFVTH", name = "c", descriptor = "LLSSFLBMP;")
    private class32 field1120;

    @OriginalMember(owner = "client!PJPXFVTH", name = "d", descriptor = "LLSSFLBMP;")
    private class32 field1121;

    @OriginalMember(owner = "client!PJPXFVTH", name = "e", descriptor = "LLSSFLBMP;")
    private class32 field1122;

    @OriginalMember(owner = "client!PJPXFVTH", name = "f", descriptor = "LLSSFLBMP;")
    private class32 field1123;

    @OriginalMember(owner = "client!PJPXFVTH", name = "g", descriptor = "LLSSFLBMP;")
    private class32 field1124;

    @OriginalMember(owner = "client!PJPXFVTH", name = "h", descriptor = "LLSSFLBMP;")
    private class32 field1125;

    @OriginalMember(owner = "client!PJPXFVTH", name = "i", descriptor = "LLSSFLBMP;")
    private class32 field1126;

    @OriginalMember(owner = "client!PJPXFVTH", name = "j", descriptor = "LLSSFLBMP;")
    private class32 field1127;

    @OriginalMember(owner = "client!PJPXFVTH", name = "q", descriptor = "LLSSFLBMP;")
    private class32 field1134;

    @OriginalMember(owner = "client!PJPXFVTH", name = "p", descriptor = "LQPYZEWVW;")
    private class43 field1133;

    @OriginalMember(owner = "client!PJPXFVTH", name = "t", descriptor = "[I")
    private static int[] field1137;

    @OriginalMember(owner = "client!PJPXFVTH", name = "u", descriptor = "[I")
    private static int[] field1138;

    @OriginalMember(owner = "client!PJPXFVTH", name = "v", descriptor = "[I")
    private static int[] field1139;

    @OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "()V")
    public static final void method385() {
        field1138 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1138[var0] = 1;
            } else {
                field1138[var0] = -1;
            }
        }
        field1139 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1139[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1137 = new int[220500];
    }

    @OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "(II)[I")
    public final int[] method386(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1137[var3] = 0;
        }
        if (arg1 < 10) {
            return field1137;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1120.method325(false);
        this.field1121.method325(false);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1122 != null) {
            this.field1122.method325(false);
            this.field1123.method325(false);
            var6 = (int) ((double) (this.field1122.field949 - this.field1122.field948) * 32.768D / var4);
            var7 = (int) ((double) this.field1122.field948 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1124 != null) {
            this.field1124.method325(false);
            this.field1125.method325(false);
            var9 = (int) ((double) (this.field1124.field949 - this.field1124.field948) * 32.768D / var4);
            var10 = (int) ((double) this.field1124.field948 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1128[var12] != 0) {
                field1140[var12] = 0;
                field1141[var12] = (int) ((double) this.field1130[var12] * var4);
                field1142[var12] = (this.field1128[var12] << 14) / 100;
                field1143[var12] = (int) ((double) (this.field1120.field949 - this.field1120.field948) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1129[var12]) / var4);
                field1144[var12] = (int) ((double) this.field1120.field948 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1120.method326(arg0, (byte) -2);
            int var42 = this.field1121.method326(arg0, (byte) -2);
            if (this.field1122 != null) {
                int var43 = this.field1122.method326(arg0, (byte) -2);
                int var44 = this.field1123.method326(arg0, (byte) -2);
                var41 += this.method387(38792, this.field1122.field950, var44, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1124 != null) {
                int var45 = this.field1124.method326(arg0, (byte) -2);
                int var46 = this.field1125.method326(arg0, (byte) -2);
                var42 = var42 * ((this.method387(38792, this.field1124.field950, var46, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1128[var47] != 0) {
                    int var48 = field1141[var47] + var13;
                    if (var48 < arg0) {
                        field1137[var48] += this.method387(38792, this.field1120.field950, field1142[var47] * var42 >> 15, field1140[var47]);
                        field1140[var47] += (field1143[var47] * var41 >> 16) + field1144[var47];
                    }
                }
            }
        }
        if (this.field1126 != null) {
            this.field1126.method325(false);
            this.field1127.method325(false);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1126.method326(arg0, (byte) -2);
                int var19 = this.field1127.method326(arg0, (byte) -2);
                int var20;
                if (var16) {
                    var20 = ((this.field1126.field949 - this.field1126.field948) * var18 >> 8) + this.field1126.field948;
                } else {
                    var20 = ((this.field1126.field949 - this.field1126.field948) * var19 >> 8) + this.field1126.field948;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1137[var17] = 0;
                }
            }
        }
        if (this.field1131 > 0 && this.field1132 > 0) {
            int var21 = (int) ((double) this.field1131 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1137[var22] += field1137[var22 - var21] * this.field1132 / 100;
            }
        }
        if (this.field1133.field1190[0] > 0 || this.field1133.field1190[1] > 0) {
            this.field1134.method325(false);
            int var23 = this.field1134.method326(arg0 + 1, (byte) -2);
            int var24 = this.field1133.method395(-846, (float) var23 / 65536.0F, 0);
            int var25 = this.field1133.method395(-846, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1137[var24 + var26] * (long) class43.field1197 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1137[var24 + var26 - var38 - 1] * (long) class43.field1195[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1137[var26 - var39 - 1] * (long) class43.field1195[1][var39] >> 16);
                    }
                    field1137[var26] = var37;
                    var23 = this.field1134.method326(arg0 + 1, (byte) -2);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1137[var24 + var26] * (long) class43.field1197 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1137[var24 + var26 - var35 - 1] * (long) class43.field1195[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1137[var26 - var36 - 1] * (long) class43.field1195[1][var36] >> 16);
                        }
                        field1137[var26] = var34;
                        var23 = this.field1134.method326(arg0 + 1, (byte) -2);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1137[var24 + var26 - var31 - 1] * (long) class43.field1195[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1137[var26 - var32 - 1] * (long) class43.field1195[1][var32] >> 16);
                            }
                            field1137[var26] = var30;
                            this.field1134.method326(arg0 + 1, (byte) -2);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1133.method395(-846, (float) var23 / 65536.0F, 0);
                    var25 = this.field1133.method395(-846, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1137[var40] < -32768) {
                field1137[var40] = -32768;
            }
            if (field1137[var40] > 32767) {
                field1137[var40] = 32767;
            }
        }
        return field1137;
    }

    @OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "(IIII)I")
    private final int method387(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 38792) {
            this.field1118 = 415;
        }
        if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field1139[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field1138[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "(ILWNCFPLWV;)V")
    public final void method388(int arg0, class63 arg1) {
        this.field1120 = new class32();
        this.field1120.method323(-934, arg1);
        this.field1121 = new class32();
        this.field1121.method323(-934, arg1);
        int var3 = arg1.method502();
        if (var3 != 0) {
            arg1.field1571--;
            this.field1122 = new class32();
            this.field1122.method323(-934, arg1);
            this.field1123 = new class32();
            this.field1123.method323(-934, arg1);
        }
        int var4 = arg1.method502();
        while (arg0 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (var4 != 0) {
            arg1.field1571--;
            this.field1124 = new class32();
            this.field1124.method323(-934, arg1);
            this.field1125 = new class32();
            this.field1125.method323(-934, arg1);
        }
        int var5 = arg1.method502();
        if (var5 != 0) {
            arg1.field1571--;
            this.field1126 = new class32();
            this.field1126.method323(-934, arg1);
            this.field1127 = new class32();
            this.field1127.method323(-934, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method516();
            if (var7 == 0) {
                break;
            }
            this.field1128[var6] = var7;
            this.field1129[var6] = arg1.method515();
            this.field1130[var6] = arg1.method516();
        }
        this.field1131 = arg1.method516();
        this.field1132 = arg1.method516();
        this.field1135 = arg1.method504();
        this.field1136 = arg1.method504();
        this.field1133 = new class43();
        this.field1134 = new class32();
        this.field1133.method396(this.field1134, arg1, this.field1119);
    }
}
