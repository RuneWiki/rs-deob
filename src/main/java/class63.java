import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class63 {

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "[I")
    private int[] field1182 = new int[5];

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    private int field1184 = 0;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public int field1181 = 0;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "[I")
    private int[] field1185 = new int[5];

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public int field1183 = 500;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "[I")
    private int[] field1191 = new int[5];

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    private int field1196 = 100;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "[I")
    private static int[] field1177 = new int[32768];

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "[I")
    private static int[] field1179;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "[I")
    private static int[] field1187;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "[I")
    private static int[] field1192;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "[I")
    private static int[] field1195;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "[I")
    private static int[] field1194;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "[I")
    private static int[] field1193;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "[I")
    private static int[] field1197;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Lbaa;")
    private class482 field1173;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Lbaa;")
    private class482 field1174;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "Lbaa;")
    private class482 field1175;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "Lbaa;")
    private class482 field1176;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "Lbaa;")
    private class482 field1180;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "Lbaa;")
    private class482 field1186;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "Lbaa;")
    private class482 field1188;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "Lbaa;")
    private class482 field1189;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "Lbaa;")
    private class482 field1190;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "Lmj;")
    private class606 field1178;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)[I")
    public final int[] method651(int arg0, int arg1) {
        class476.method2789(field1187, 0, arg0);
        if (arg1 < 10) {
            return field1187;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1189.method2809();
        this.field1175.method2809();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1173 != null) {
            this.field1173.method2809();
            this.field1186.method2809();
            var5 = (int) ((double) (this.field1173.field6856 - this.field1173.field6857) * 32.768D / var3);
            var6 = (int) ((double) this.field1173.field6857 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1188 != null) {
            this.field1188.method2809();
            this.field1174.method2809();
            var8 = (int) ((double) (this.field1188.field6856 - this.field1188.field6857) * 32.768D / var3);
            var9 = (int) ((double) this.field1188.field6857 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1182[var11] != 0) {
                field1195[var11] = 0;
                field1194[var11] = (int) ((double) this.field1185[var11] * var3);
                field1192[var11] = (this.field1182[var11] << 14) / 100;
                field1193[var11] = (int) ((double) (this.field1189.field6856 - this.field1189.field6857) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1191[var11]) / var3);
                field1197[var11] = (int) ((double) this.field1189.field6857 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1189.method2811(arg0);
            int var40 = this.field1175.method2811(arg0);
            if (this.field1173 != null) {
                int var41 = this.field1173.method2811(arg0);
                int var42 = this.field1186.method2811(arg0);
                var39 += this.method652(var7, var42, this.field1173.field6858) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1188 != null) {
                int var43 = this.field1188.method2811(arg0);
                int var44 = this.field1174.method2811(arg0);
                var40 = var40 * ((this.method652(var10, var44, this.field1188.field6858) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1182[var45] != 0) {
                    int var46 = field1194[var45] + var12;
                    if (var46 < arg0) {
                        field1187[var46] += this.method652(field1195[var45], field1192[var45] * var40 >> 15, this.field1189.field6858);
                        field1195[var45] += (field1193[var45] * var39 >> 16) + field1197[var45];
                    }
                }
            }
        }
        if (this.field1190 != null) {
            this.field1190.method2809();
            this.field1176.method2809();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1190.method2811(arg0);
                int var18 = this.field1176.method2811(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1190.field6856 - this.field1190.field6857) * var17 >> 8) + this.field1190.field6857;
                } else {
                    var19 = ((this.field1190.field6856 - this.field1190.field6857) * var18 >> 8) + this.field1190.field6857;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1187[var16] = 0;
                }
            }
        }
        if (this.field1184 > 0 && this.field1196 > 0) {
            int var20 = (int) ((double) this.field1184 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1187[var21] += field1187[var21 - var20] * this.field1196 / 100;
            }
        }
        if (this.field1178.field8549[0] > 0 || this.field1178.field8549[1] > 0) {
            this.field1180.method2809();
            int var22 = this.field1180.method2811(arg0 + 1);
            int var23 = this.field1178.method3406(0, (float) var22 / 65536.0F);
            int var24 = this.field1178.method3406(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1187[var23 + var25] * (long) class606.field8546 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1187[var23 + var25 - var36 - 1] * (long) class606.field8547[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1187[var25 - var37 - 1] * (long) class606.field8547[1][var37] >> 16);
                    }
                    field1187[var25] = var35;
                    var22 = this.field1180.method2811(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1187[var23 + var25] * (long) class606.field8546 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1187[var23 + var25 - var33 - 1] * (long) class606.field8547[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1187[var25 - var34 - 1] * (long) class606.field8547[1][var34] >> 16);
                        }
                        field1187[var25] = var32;
                        var22 = this.field1180.method2811(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1187[var23 + var25 - var29 - 1] * (long) class606.field8547[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1187[var25 - var30 - 1] * (long) class606.field8547[1][var30] >> 16);
                            }
                            field1187[var25] = var28;
                            this.field1180.method2811(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1178.method3406(0, (float) var22 / 65536.0F);
                    var24 = this.field1178.method3406(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1187[var38] < -32768) {
                field1187[var38] = -32768;
            }
            if (field1187[var38] > 32767) {
                field1187[var38] = 32767;
            }
        }
        return field1187;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I")
    private final int method652(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1179[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1177[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "()V")
    public static void method653() {
        field1187 = null;
        field1177 = null;
        field1179 = null;
        field1195 = null;
        field1194 = null;
        field1192 = null;
        field1193 = null;
        field1197 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lmo;)V")
    public final void method654(class695 arg0) {
        this.field1189 = new class482();
        this.field1189.method2812(arg0);
        this.field1175 = new class482();
        this.field1175.method2812(arg0);
        int var2 = arg0.method3826(false);
        if (var2 != 0) {
            arg0.field9761--;
            this.field1173 = new class482();
            this.field1173.method2812(arg0);
            this.field1186 = new class482();
            this.field1186.method2812(arg0);
        }
        int var3 = arg0.method3826(false);
        if (var3 != 0) {
            arg0.field9761--;
            this.field1188 = new class482();
            this.field1188.method2812(arg0);
            this.field1174 = new class482();
            this.field1174.method2812(arg0);
        }
        int var4 = arg0.method3826(false);
        if (var4 != 0) {
            arg0.field9761--;
            this.field1190 = new class482();
            this.field1190.method2812(arg0);
            this.field1176 = new class482();
            this.field1176.method2812(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3815(-32768);
            if (var6 == 0) {
                break;
            }
            this.field1182[var5] = var6;
            this.field1191[var5] = arg0.method3828(255);
            this.field1185[var5] = arg0.method3815(-32768);
        }
        this.field1184 = arg0.method3815(-32768);
        this.field1196 = arg0.method3815(-32768);
        this.field1183 = arg0.method3847((byte) 118);
        this.field1181 = arg0.method3847((byte) 118);
        this.field1178 = new class606();
        this.field1180 = new class482();
        this.field1178.method3407(arg0, this.field1180);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1177[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1179 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1179[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1187 = new int[220500];
        field1192 = new int[5];
        field1195 = new int[5];
        field1194 = new int[5];
        field1193 = new int[5];
        field1197 = new int[5];
    }
}
