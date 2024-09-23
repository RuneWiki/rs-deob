import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LQCMEXCE")
public class class38 {

    @OriginalMember(owner = "LQCMEXCE", name = "a", descriptor = "Z")
    private boolean field1103 = true;

    @OriginalMember(owner = "LQCMEXCE", name = "j", descriptor = "[I")
    private int[] field1112 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "k", descriptor = "[I")
    private int[] field1113 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "l", descriptor = "[I")
    private int[] field1114 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "n", descriptor = "I")
    private int field1116 = 100;

    @OriginalMember(owner = "LQCMEXCE", name = "q", descriptor = "I")
    public int field1119 = 500;

    @OriginalMember(owner = "LQCMEXCE", name = "v", descriptor = "[I")
    private static int[] field1124 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "w", descriptor = "[I")
    private static int[] field1125 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "x", descriptor = "[I")
    private static int[] field1126 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "y", descriptor = "[I")
    private static int[] field1127 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "z", descriptor = "[I")
    private static int[] field1128 = new int[5];

    @OriginalMember(owner = "LQCMEXCE", name = "m", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "LQCMEXCE", name = "r", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "LQCMEXCE", name = "b", descriptor = "LJDDBCSRY;")
    private class29 field1104;

    @OriginalMember(owner = "LQCMEXCE", name = "c", descriptor = "LJDDBCSRY;")
    private class29 field1105;

    @OriginalMember(owner = "LQCMEXCE", name = "d", descriptor = "LJDDBCSRY;")
    private class29 field1106;

    @OriginalMember(owner = "LQCMEXCE", name = "e", descriptor = "LJDDBCSRY;")
    private class29 field1107;

    @OriginalMember(owner = "LQCMEXCE", name = "f", descriptor = "LJDDBCSRY;")
    private class29 field1108;

    @OriginalMember(owner = "LQCMEXCE", name = "g", descriptor = "LJDDBCSRY;")
    private class29 field1109;

    @OriginalMember(owner = "LQCMEXCE", name = "h", descriptor = "LJDDBCSRY;")
    private class29 field1110;

    @OriginalMember(owner = "LQCMEXCE", name = "i", descriptor = "LJDDBCSRY;")
    private class29 field1111;

    @OriginalMember(owner = "LQCMEXCE", name = "p", descriptor = "LJDDBCSRY;")
    private class29 field1118;

    @OriginalMember(owner = "LQCMEXCE", name = "o", descriptor = "LQPCNAGNU;")
    private class56 field1117;

    @OriginalMember(owner = "LQCMEXCE", name = "s", descriptor = "[I")
    private static int[] field1121;

    @OriginalMember(owner = "LQCMEXCE", name = "t", descriptor = "[I")
    private static int[] field1122;

    @OriginalMember(owner = "LQCMEXCE", name = "u", descriptor = "[I")
    private static int[] field1123;

    @OriginalMember(owner = "LQCMEXCE", name = "a", descriptor = "()V")
    public static final void method310() {
        field1122 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1122[var0] = 1;
            } else {
                field1122[var0] = -1;
            }
        }
        field1123 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1123[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1121 = new int[220500];
    }

    @OriginalMember(owner = "LQCMEXCE", name = "a", descriptor = "(II)[I")
    public final int[] method311(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1121[var3] = 0;
        }
        if (arg1 < 10) {
            return field1121;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1104.method259(7);
        this.field1105.method259(7);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1106 != null) {
            this.field1106.method259(7);
            this.field1107.method259(7);
            var6 = (int) ((double) (this.field1106.field926 - this.field1106.field925) * 32.768D / var4);
            var7 = (int) ((double) this.field1106.field925 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1108 != null) {
            this.field1108.method259(7);
            this.field1109.method259(7);
            var9 = (int) ((double) (this.field1108.field926 - this.field1108.field925) * 32.768D / var4);
            var10 = (int) ((double) this.field1108.field925 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1112[var12] != 0) {
                field1124[var12] = 0;
                field1125[var12] = (int) ((double) this.field1114[var12] * var4);
                field1126[var12] = (this.field1112[var12] << 14) / 100;
                field1127[var12] = (int) ((double) (this.field1104.field926 - this.field1104.field925) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1113[var12]) / var4);
                field1128[var12] = (int) ((double) this.field1104.field925 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1104.method260((byte) 5, arg0);
            int var42 = this.field1105.method260((byte) 5, arg0);
            if (this.field1106 != null) {
                int var43 = this.field1106.method260((byte) 5, arg0);
                int var44 = this.field1107.method260((byte) 5, arg0);
                var41 += this.method312(-95, this.field1106.field927, var8, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1108 != null) {
                int var45 = this.field1108.method260((byte) 5, arg0);
                int var46 = this.field1109.method260((byte) 5, arg0);
                var42 = var42 * ((this.method312(-95, this.field1108.field927, var11, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1112[var47] != 0) {
                    int var48 = field1125[var47] + var13;
                    if (var48 < arg0) {
                        field1121[var48] += this.method312(-95, this.field1104.field927, field1124[var47], field1126[var47] * var42 >> 15);
                        field1124[var47] += (field1127[var47] * var41 >> 16) + field1128[var47];
                    }
                }
            }
        }
        if (this.field1110 != null) {
            this.field1110.method259(7);
            this.field1111.method259(7);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1110.method260((byte) 5, arg0);
                int var19 = this.field1111.method260((byte) 5, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1110.field926 - this.field1110.field925) * var18 >> 8) + this.field1110.field925;
                } else {
                    var20 = ((this.field1110.field926 - this.field1110.field925) * var19 >> 8) + this.field1110.field925;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1121[var17] = 0;
                }
            }
        }
        if (this.field1115 > 0 && this.field1116 > 0) {
            int var21 = (int) ((double) this.field1115 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1121[var22] += field1121[var22 - var21] * this.field1116 / 100;
            }
        }
        if (this.field1117.field1315[0] > 0 || this.field1117.field1315[1] > 0) {
            this.field1118.method259(7);
            int var23 = this.field1118.method260((byte) 5, arg0 + 1);
            int var24 = this.field1117.method351(0, -103, (float) var23 / 65536.0F);
            int var25 = this.field1117.method351(1, -103, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1121[var24 + var26] * (long) class56.field1322 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1121[var24 + var26 - var38 - 1] * (long) class56.field1320[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1121[var26 - var39 - 1] * (long) class56.field1320[1][var39] >> 16);
                    }
                    field1121[var26] = var37;
                    var23 = this.field1118.method260((byte) 5, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1121[var24 + var26] * (long) class56.field1322 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1121[var24 + var26 - var35 - 1] * (long) class56.field1320[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1121[var26 - var36 - 1] * (long) class56.field1320[1][var36] >> 16);
                        }
                        field1121[var26] = var34;
                        var23 = this.field1118.method260((byte) 5, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1121[var24 + var26 - var31 - 1] * (long) class56.field1320[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1121[var26 - var32 - 1] * (long) class56.field1320[1][var32] >> 16);
                            }
                            field1121[var26] = var30;
                            this.field1118.method260((byte) 5, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1117.method351(0, -103, (float) var23 / 65536.0F);
                    var25 = this.field1117.method351(1, -103, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1121[var40] < -32768) {
                field1121[var40] = -32768;
            }
            if (field1121[var40] > 32767) {
                field1121[var40] = 32767;
            }
        }
        return field1121;
    }

    @OriginalMember(owner = "LQCMEXCE", name = "a", descriptor = "(IIII)I")
    private final int method312(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            return 3;
        } else if (arg1 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg1 == 2) {
            return field1123[arg2 & 0x7FFF] * arg3 >> 14;
        } else if (arg1 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg1 == 4) {
            return field1122[arg2 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "LQCMEXCE", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    public final void method313(boolean arg0, class69 arg1) {
        this.field1104 = new class29();
        this.field1104.method257(this.field1103, arg1);
        this.field1105 = new class29();
        this.field1105.method257(this.field1103, arg1);
        int var3 = arg1.method465();
        if (!arg0) {
            throw new NullPointerException();
        }
        if (var3 != 0) {
            arg1.field1652--;
            this.field1106 = new class29();
            this.field1106.method257(this.field1103, arg1);
            this.field1107 = new class29();
            this.field1107.method257(this.field1103, arg1);
        }
        int var4 = arg1.method465();
        if (var4 != 0) {
            arg1.field1652--;
            this.field1108 = new class29();
            this.field1108.method257(this.field1103, arg1);
            this.field1109 = new class29();
            this.field1109.method257(this.field1103, arg1);
        }
        int var5 = arg1.method465();
        if (var5 != 0) {
            arg1.field1652--;
            this.field1110 = new class29();
            this.field1110.method257(this.field1103, arg1);
            this.field1111 = new class29();
            this.field1111.method257(this.field1103, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method479();
            if (var7 == 0) {
                break;
            }
            this.field1112[var6] = var7;
            this.field1113[var6] = arg1.method478();
            this.field1114[var6] = arg1.method479();
        }
        this.field1115 = arg1.method479();
        this.field1116 = arg1.method479();
        this.field1119 = arg1.method467();
        this.field1120 = arg1.method467();
        this.field1117 = new class56();
        this.field1118 = new class29();
        this.field1117.method352(this.field1118, 0, arg1);
    }
}
