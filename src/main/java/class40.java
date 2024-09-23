import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LLJZJXBB")
public class class40 {

    @OriginalMember(owner = "LLJZJXBB", name = "a", descriptor = "Z")
    private boolean field1145 = true;

    @OriginalMember(owner = "LLJZJXBB", name = "j", descriptor = "[I")
    private int[] field1154 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "k", descriptor = "[I")
    private int[] field1155 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "l", descriptor = "[I")
    private int[] field1156 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "n", descriptor = "I")
    private int field1158 = 100;

    @OriginalMember(owner = "LLJZJXBB", name = "q", descriptor = "I")
    public int field1161 = 500;

    @OriginalMember(owner = "LLJZJXBB", name = "v", descriptor = "[I")
    private static int[] field1166 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "w", descriptor = "[I")
    private static int[] field1167 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "x", descriptor = "[I")
    private static int[] field1168 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "y", descriptor = "[I")
    private static int[] field1169 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "z", descriptor = "[I")
    private static int[] field1170 = new int[5];

    @OriginalMember(owner = "LLJZJXBB", name = "m", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "LLJZJXBB", name = "r", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "LLJZJXBB", name = "b", descriptor = "LUPKVWWFD;")
    private class61 field1146;

    @OriginalMember(owner = "LLJZJXBB", name = "c", descriptor = "LUPKVWWFD;")
    private class61 field1147;

    @OriginalMember(owner = "LLJZJXBB", name = "d", descriptor = "LUPKVWWFD;")
    private class61 field1148;

    @OriginalMember(owner = "LLJZJXBB", name = "e", descriptor = "LUPKVWWFD;")
    private class61 field1149;

    @OriginalMember(owner = "LLJZJXBB", name = "f", descriptor = "LUPKVWWFD;")
    private class61 field1150;

    @OriginalMember(owner = "LLJZJXBB", name = "g", descriptor = "LUPKVWWFD;")
    private class61 field1151;

    @OriginalMember(owner = "LLJZJXBB", name = "h", descriptor = "LUPKVWWFD;")
    private class61 field1152;

    @OriginalMember(owner = "LLJZJXBB", name = "i", descriptor = "LUPKVWWFD;")
    private class61 field1153;

    @OriginalMember(owner = "LLJZJXBB", name = "p", descriptor = "LUPKVWWFD;")
    private class61 field1160;

    @OriginalMember(owner = "LLJZJXBB", name = "o", descriptor = "LYSFPJPXV;")
    private class69 field1159;

    @OriginalMember(owner = "LLJZJXBB", name = "s", descriptor = "[I")
    private static int[] field1163;

    @OriginalMember(owner = "LLJZJXBB", name = "t", descriptor = "[I")
    private static int[] field1164;

    @OriginalMember(owner = "LLJZJXBB", name = "u", descriptor = "[I")
    private static int[] field1165;

    @OriginalMember(owner = "LLJZJXBB", name = "a", descriptor = "()V")
    public static final void method465() {
        field1164 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1164[var0] = 1;
            } else {
                field1164[var0] = -1;
            }
        }
        field1165 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1165[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1163 = new int[220500];
    }

    @OriginalMember(owner = "LLJZJXBB", name = "a", descriptor = "(II)[I")
    public final int[] method466(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1163[var3] = 0;
        }
        if (arg1 < 10) {
            return field1163;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1146.method551((byte) 3);
        this.field1147.method551((byte) 3);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1148 != null) {
            this.field1148.method551((byte) 3);
            this.field1149.method551((byte) 3);
            var6 = (int) ((double) (this.field1148.field1560 - this.field1148.field1559) * 32.768D / var4);
            var7 = (int) ((double) this.field1148.field1559 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1150 != null) {
            this.field1150.method551((byte) 3);
            this.field1151.method551((byte) 3);
            var9 = (int) ((double) (this.field1150.field1560 - this.field1150.field1559) * 32.768D / var4);
            var10 = (int) ((double) this.field1150.field1559 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1154[var12] != 0) {
                field1166[var12] = 0;
                field1167[var12] = (int) ((double) this.field1156[var12] * var4);
                field1168[var12] = (this.field1154[var12] << 14) / 100;
                field1169[var12] = (int) ((double) (this.field1146.field1560 - this.field1146.field1559) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1155[var12]) / var4);
                field1170[var12] = (int) ((double) this.field1146.field1559 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1146.method552(arg0, 202);
            int var42 = this.field1147.method552(arg0, 202);
            if (this.field1148 != null) {
                int var43 = this.field1148.method552(arg0, 202);
                int var44 = this.field1149.method552(arg0, 202);
                var41 += this.method467(var44, this.field1148.field1561, 28202, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1150 != null) {
                int var45 = this.field1150.method552(arg0, 202);
                int var46 = this.field1151.method552(arg0, 202);
                var42 = var42 * ((this.method467(var46, this.field1150.field1561, 28202, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1154[var47] != 0) {
                    int var48 = field1167[var47] + var13;
                    if (var48 < arg0) {
                        field1163[var48] += this.method467(field1168[var47] * var42 >> 15, this.field1146.field1561, 28202, field1166[var47]);
                        field1166[var47] += (field1169[var47] * var41 >> 16) + field1170[var47];
                    }
                }
            }
        }
        if (this.field1152 != null) {
            this.field1152.method551((byte) 3);
            this.field1153.method551((byte) 3);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1152.method552(arg0, 202);
                int var19 = this.field1153.method552(arg0, 202);
                int var20;
                if (var16) {
                    var20 = ((this.field1152.field1560 - this.field1152.field1559) * var18 >> 8) + this.field1152.field1559;
                } else {
                    var20 = ((this.field1152.field1560 - this.field1152.field1559) * var19 >> 8) + this.field1152.field1559;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1163[var17] = 0;
                }
            }
        }
        if (this.field1157 > 0 && this.field1158 > 0) {
            int var21 = (int) ((double) this.field1157 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1163[var22] += field1163[var22 - var21] * this.field1158 / 100;
            }
        }
        if (this.field1159.field1680[0] > 0 || this.field1159.field1680[1] > 0) {
            this.field1160.method551((byte) 3);
            int var23 = this.field1160.method552(arg0 + 1, 202);
            int var24 = this.field1159.method586(4, 0, (float) var23 / 65536.0F);
            int var25 = this.field1159.method586(4, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1163[var24 + var26] * (long) class69.field1687 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1163[var24 + var26 - var38 - 1] * (long) class69.field1685[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1163[var26 - var39 - 1] * (long) class69.field1685[1][var39] >> 16);
                    }
                    field1163[var26] = var37;
                    var23 = this.field1160.method552(arg0 + 1, 202);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1163[var24 + var26] * (long) class69.field1687 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1163[var24 + var26 - var35 - 1] * (long) class69.field1685[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1163[var26 - var36 - 1] * (long) class69.field1685[1][var36] >> 16);
                        }
                        field1163[var26] = var34;
                        var23 = this.field1160.method552(arg0 + 1, 202);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1163[var24 + var26 - var31 - 1] * (long) class69.field1685[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1163[var26 - var32 - 1] * (long) class69.field1685[1][var32] >> 16);
                            }
                            field1163[var26] = var30;
                            this.field1160.method552(arg0 + 1, 202);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1159.method586(4, 0, (float) var23 / 65536.0F);
                    var25 = this.field1159.method586(4, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1163[var40] < -32768) {
                field1163[var40] = -32768;
            }
            if (field1163[var40] > 32767) {
                field1163[var40] = 32767;
            }
        }
        return field1163;
    }

    @OriginalMember(owner = "LLJZJXBB", name = "a", descriptor = "(IIII)I")
    private final int method467(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 28202) {
            this.field1145 = !this.field1145;
        }
        if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg1 == 2) {
            return field1165[arg3 & 0x7FFF] * arg0 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg1 == 4) {
            return field1164[arg3 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "LLJZJXBB", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    public final void method468(class15 arg0, boolean arg1) {
        this.field1146 = new class61();
        this.field1146.method549(arg0, true);
        this.field1147 = new class61();
        this.field1147.method549(arg0, true);
        int var3 = arg0.method261();
        if (var3 != 0) {
            arg0.field709--;
            this.field1148 = new class61();
            this.field1148.method549(arg0, true);
            this.field1149 = new class61();
            this.field1149.method549(arg0, true);
        }
        int var4 = arg0.method261();
        if (!arg1) {
            this.field1145 = !this.field1145;
        }
        if (var4 != 0) {
            arg0.field709--;
            this.field1150 = new class61();
            this.field1150.method549(arg0, true);
            this.field1151 = new class61();
            this.field1151.method549(arg0, true);
        }
        int var5 = arg0.method261();
        if (var5 != 0) {
            arg0.field709--;
            this.field1152 = new class61();
            this.field1152.method549(arg0, true);
            this.field1153 = new class61();
            this.field1153.method549(arg0, true);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method275();
            if (var7 == 0) {
                break;
            }
            this.field1154[var6] = var7;
            this.field1155[var6] = arg0.method274();
            this.field1156[var6] = arg0.method275();
        }
        this.field1157 = arg0.method275();
        this.field1158 = arg0.method275();
        this.field1161 = arg0.method263();
        this.field1162 = arg0.method263();
        this.field1159 = new class69();
        this.field1160 = new class61();
        this.field1159.method587(arg0, 792, this.field1160);
    }
}
