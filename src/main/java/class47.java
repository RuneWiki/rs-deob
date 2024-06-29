import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class47 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
    private int[] field1126 = new int[5];

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
    private int[] field1131 = new int[5];

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public int field1142 = 0;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
    private int[] field1129 = new int[5];

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    private int field1143 = 0;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    private int field1140 = 100;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field1128 = 500;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[I")
    private static int[] field1137 = new int[32768];

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[I")
    private static int[] field1144;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[I")
    private static int[] field1139;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "[I")
    private static int[] field1145;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[I")
    private static int[] field1147;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
    private static int[] field1146;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "[I")
    private static int[] field1148;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "[I")
    private static int[] field1149;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lrd;")
    private class110 field1125;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lrd;")
    private class110 field1127;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lrd;")
    private class110 field1130;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lrd;")
    private class110 field1132;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lrd;")
    private class110 field1133;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lrd;")
    private class110 field1134;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lrd;")
    private class110 field1135;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lrd;")
    private class110 field1138;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lrd;")
    private class110 field1141;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lae;")
    private class6 field1136;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1137[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1144 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1144[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1139 = new int[220500];
        field1145 = new int[5];
        field1147 = new int[5];
        field1146 = new int[5];
        field1148 = new int[5];
        field1149 = new int[5];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V", line = 14)
    public static void method392() {
        field1139 = null;
        field1137 = null;
        field1144 = null;
        field1148 = null;
        field1146 = null;
        field1145 = null;
        field1147 = null;
        field1149 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lwd;)V", line = 31)
    public final void method393(class140 arg0) {
        this.field1141 = new class110();
        this.field1141.method836(arg0);
        this.field1125 = new class110();
        this.field1125.method836(arg0);
        int var2 = arg0.method1105(255);
        if (var2 != 0) {
            arg0.field3347--;
            this.field1127 = new class110();
            this.field1127.method836(arg0);
            this.field1135 = new class110();
            this.field1135.method836(arg0);
        }
        int var3 = arg0.method1105(255);
        if (var3 != 0) {
            arg0.field3347--;
            this.field1132 = new class110();
            this.field1132.method836(arg0);
            this.field1134 = new class110();
            this.field1134.method836(arg0);
        }
        int var4 = arg0.method1105(255);
        if (var4 != 0) {
            arg0.field3347--;
            this.field1138 = new class110();
            this.field1138.method836(arg0);
            this.field1130 = new class110();
            this.field1130.method836(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1103((byte) -2);
            if (var6 == 0) {
                break;
            }
            this.field1131[var5] = var6;
            this.field1129[var5] = arg0.method1113(-64);
            this.field1126[var5] = arg0.method1103((byte) 54);
        }
        this.field1143 = arg0.method1103((byte) -120);
        this.field1140 = arg0.method1103((byte) -109);
        this.field1128 = arg0.method1072(32);
        this.field1142 = arg0.method1072(126);
        this.field1136 = new class6();
        this.field1133 = new class110();
        this.field1136.method64(arg0, this.field1133);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[I", line = 101)
    public final int[] method394(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1139[var3] = 0;
        }
        if (arg1 < 10) {
            return field1139;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1141.method837();
        this.field1125.method837();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1127 != null) {
            this.field1127.method837();
            this.field1135.method837();
            var6 = (int) ((double) (this.field1127.field2523 - this.field1127.field2522) * 32.768D / var4);
            var7 = (int) ((double) this.field1127.field2522 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1132 != null) {
            this.field1132.method837();
            this.field1134.method837();
            var9 = (int) ((double) (this.field1132.field2523 - this.field1132.field2522) * 32.768D / var4);
            var10 = (int) ((double) this.field1132.field2522 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1131[var12] != 0) {
                field1148[var12] = 0;
                field1146[var12] = (int) ((double) this.field1126[var12] * var4);
                field1145[var12] = (this.field1131[var12] << 14) / 100;
                field1147[var12] = (int) ((double) (this.field1141.field2523 - this.field1141.field2522) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1129[var12]) / var4);
                field1149[var12] = (int) ((double) this.field1141.field2522 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field1141.method834(arg0);
            int var41 = this.field1125.method834(arg0);
            if (this.field1127 != null) {
                int var42 = this.field1127.method834(arg0);
                int var43 = this.field1135.method834(arg0);
                var40 += this.method395(var8, var43, this.field1127.field2525) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field1132 != null) {
                int var44 = this.field1132.method834(arg0);
                int var45 = this.field1134.method834(arg0);
                var41 = var41 * ((this.method395(var11, var45, this.field1132.field2525) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field1131[var46] != 0) {
                    int var47 = field1146[var46] + var13;
                    if (var47 < arg0) {
                        field1139[var47] += this.method395(field1148[var46], field1145[var46] * var41 >> 15, this.field1141.field2525);
                        field1148[var46] += (field1147[var46] * var40 >> 16) + field1149[var46];
                    }
                }
            }
        }
        if (this.field1138 != null) {
            this.field1138.method837();
            this.field1130.method837();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1138.method834(arg0);
                int var19 = this.field1130.method834(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1138.field2523 - this.field1138.field2522) * var18 >> 8) + this.field1138.field2522;
                } else {
                    var20 = ((this.field1138.field2523 - this.field1138.field2522) * var19 >> 8) + this.field1138.field2522;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1139[var17] = 0;
                }
            }
        }
        if (this.field1143 > 0 && this.field1140 > 0) {
            int var21 = (int) ((double) this.field1143 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1139[var22] += field1139[var22 - var21] * this.field1140 / 100;
            }
        }
        if (this.field1136.field141[0] > 0 || this.field1136.field141[1] > 0) {
            this.field1133.method837();
            int var23 = this.field1133.method834(arg0 + 1);
            int var24 = this.field1136.method66(0, (float) var23 / 65536.0F);
            int var25 = this.field1136.method66(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field1139[var24 + var26] * (long) class6.field142 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field1139[var24 + var26 - var37 - 1] * (long) class6.field137[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field1139[var26 - var38 - 1] * (long) class6.field137[1][var38] >> 16);
                    }
                    field1139[var26] = var36;
                    var23 = this.field1133.method834(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field1139[var24 + var26] * (long) class6.field142 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field1139[var24 + var26 - var34 - 1] * (long) class6.field137[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field1139[var26 - var35 - 1] * (long) class6.field137[1][var35] >> 16);
                        }
                        field1139[var26] = var33;
                        var23 = this.field1133.method834(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field1139[var24 + var26 - var30 - 1] * (long) class6.field137[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field1139[var26 - var31 - 1] * (long) class6.field137[1][var31] >> 16);
                            }
                            field1139[var26] = var29;
                            this.field1133.method834(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1136.method66(0, (float) var23 / 65536.0F);
                    var25 = this.field1136.method66(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field1139[var39] < -32768) {
                field1139[var39] = -32768;
            }
            if (field1139[var39] > 32767) {
                field1139[var39] = 32767;
            }
        }
        return field1139;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I", line = 387)
    private final int method395(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1144[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1137[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
