import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class60 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field1169 = 500;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[I")
    private int[] field1174 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    private int[] field1176 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[I")
    private int[] field1173 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    private int field1178 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    private int field1177 = 100;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public int field1186 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
    private static int[] field1168 = new int[32768];

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
    private static int[] field1175;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[I")
    private static int[] field1166;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[I")
    private static int[] field1183;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    private static int[] field1182;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "[I")
    private static int[] field1188;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "[I")
    private static int[] field1189;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "[I")
    private static int[] field1185;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lkl;")
    private class150 field1167;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lkl;")
    private class150 field1170;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lkl;")
    private class150 field1171;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lkl;")
    private class150 field1172;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lkl;")
    private class150 field1179;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lkl;")
    private class150 field1180;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lkl;")
    private class150 field1184;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lkl;")
    private class150 field1187;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Lkl;")
    private class150 field1190;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lhl;")
    private class74 field1181;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Loe;)V", line = 5)
    public final void method493(class146 arg0) {
        this.field1172 = new class150();
        this.field1172.method1074(arg0);
        this.field1170 = new class150();
        this.field1170.method1074(arg0);
        int var2 = arg0.method1005((byte) 122);
        if (var2 != 0) {
            arg0.field2435--;
            this.field1179 = new class150();
            this.field1179.method1074(arg0);
            this.field1171 = new class150();
            this.field1171.method1074(arg0);
        }
        int var3 = arg0.method1005((byte) 122);
        if (var3 != 0) {
            arg0.field2435--;
            this.field1167 = new class150();
            this.field1167.method1074(arg0);
            this.field1184 = new class150();
            this.field1184.method1074(arg0);
        }
        int var4 = arg0.method1005((byte) 122);
        if (var4 != 0) {
            arg0.field2435--;
            this.field1187 = new class150();
            this.field1187.method1074(arg0);
            this.field1180 = new class150();
            this.field1180.method1074(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1020(true);
            if (var6 == 0) {
                break;
            }
            this.field1176[var5] = var6;
            this.field1174[var5] = arg0.method1033(true);
            this.field1173[var5] = arg0.method1020(true);
        }
        this.field1178 = arg0.method1020(true);
        this.field1177 = arg0.method1020(true);
        this.field1169 = arg0.method989(90);
        this.field1186 = arg0.method989(92);
        this.field1181 = new class74();
        this.field1190 = new class150();
        this.field1181.method560(arg0, this.field1190);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I", line = 69)
    public final int[] method494(int arg0, int arg1) {
        class89.method684(field1166, 0, arg0);
        if (arg1 < 10) {
            return field1166;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1172.method1076();
        this.field1170.method1076();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1179 != null) {
            this.field1179.method1076();
            this.field1171.method1076();
            var5 = (int) ((double) (this.field1179.field2539 - this.field1179.field2542) * 32.768D / var3);
            var6 = (int) ((double) this.field1179.field2542 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1167 != null) {
            this.field1167.method1076();
            this.field1184.method1076();
            var8 = (int) ((double) (this.field1167.field2539 - this.field1167.field2542) * 32.768D / var3);
            var9 = (int) ((double) this.field1167.field2542 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1176[var11] != 0) {
                field1185[var11] = 0;
                field1188[var11] = (int) ((double) this.field1173[var11] * var3);
                field1189[var11] = (this.field1176[var11] << 14) / 100;
                field1183[var11] = (int) ((double) (this.field1172.field2539 - this.field1172.field2542) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1174[var11]) / var3);
                field1182[var11] = (int) ((double) this.field1172.field2542 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1172.method1077(arg0);
            int var14 = this.field1170.method1077(arg0);
            if (this.field1179 != null) {
                int var15 = this.field1179.method1077(arg0);
                int var16 = this.field1171.method1077(arg0);
                var13 += this.method496(var7, var16, this.field1179.field2538) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1167 != null) {
                int var17 = this.field1167.method1077(arg0);
                int var18 = this.field1184.method1077(arg0);
                var14 = var14 * ((this.method496(var10, var18, this.field1167.field2538) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1176[var19] != 0) {
                    int var20 = field1188[var19] + var12;
                    if (var20 < arg0) {
                        field1166[var20] += this.method496(field1185[var19], field1189[var19] * var14 >> 15, this.field1172.field2538);
                        field1185[var19] += (field1183[var19] * var13 >> 16) + field1182[var19];
                    }
                }
            }
        }
        if (this.field1187 != null) {
            this.field1187.method1076();
            this.field1180.method1076();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1187.method1077(arg0);
                int var26 = this.field1180.method1077(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1187.field2539 - this.field1187.field2542) * var25 >> 8) + this.field1187.field2542;
                } else {
                    var27 = ((this.field1187.field2539 - this.field1187.field2542) * var26 >> 8) + this.field1187.field2542;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1166[var24] = 0;
                }
            }
        }
        if (this.field1178 > 0 && this.field1177 > 0) {
            int var28 = (int) ((double) this.field1178 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1166[var29] += field1166[var29 - var28] * this.field1177 / 100;
            }
        }
        if (this.field1181.field1348[0] > 0 || this.field1181.field1348[1] > 0) {
            this.field1190.method1076();
            int var30 = this.field1190.method1077(arg0 + 1);
            int var31 = this.field1181.method562(0, (float) var30 / 65536.0F);
            int var32 = this.field1181.method562(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1166[var31 + var33] * (long) class74.field1349 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1166[var31 + var33 - var36 - 1] * (long) class74.field1346[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1166[var33 - var37 - 1] * (long) class74.field1346[1][var37] >> 16);
                    }
                    field1166[var33] = var35;
                    var30 = this.field1190.method1077(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1166[var31 + var33] * (long) class74.field1349 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1166[var31 + var33 - var40 - 1] * (long) class74.field1346[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1166[var33 - var41 - 1] * (long) class74.field1346[1][var41] >> 16);
                        }
                        field1166[var33] = var39;
                        var30 = this.field1190.method1077(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1166[var31 + var33 - var43 - 1] * (long) class74.field1346[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1166[var33 - var44 - 1] * (long) class74.field1346[1][var44] >> 16);
                            }
                            field1166[var33] = var42;
                            this.field1190.method1077(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1181.method562(0, (float) var30 / 65536.0F);
                    var32 = this.field1181.method562(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1166[var46] < -32768) {
                field1166[var46] = -32768;
            }
            if (field1166[var46] > 32767) {
                field1166[var46] = 32767;
            }
        }
        return field1166;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1168[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1175 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1175[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1166 = new int[220500];
        field1183 = new int[5];
        field1182 = new int[5];
        field1188 = new int[5];
        field1189 = new int[5];
        field1185 = new int[5];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 407)
    public static void method495() {
        field1166 = null;
        field1168 = null;
        field1175 = null;
        field1185 = null;
        field1188 = null;
        field1189 = null;
        field1183 = null;
        field1182 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)I", line = 430)
    private final int method496(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1175[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1168[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
