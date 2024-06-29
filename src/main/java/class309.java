import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class309 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    private int field5245 = 100;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
    private int[] field5251 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field5248 = 500;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[I")
    private int[] field5259 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int field5258 = 0;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
    private int[] field5253 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public int field5255 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
    private static int[] field5247 = new int[32768];

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "[I")
    private static int[] field5261;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
    private static int[] field5262;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "[I")
    private static int[] field5265;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "[I")
    private static int[] field5264;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "[I")
    private static int[] field5267;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "[I")
    private static int[] field5266;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
    private static int[] field5268;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lii;")
    private class201 field5263;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lpb;")
    private class71 field5244;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lpb;")
    private class71 field5246;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lpb;")
    private class71 field5249;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lpb;")
    private class71 field5250;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lpb;")
    private class71 field5252;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lpb;")
    private class71 field5254;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lpb;")
    private class71 field5256;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lpb;")
    private class71 field5257;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lpb;")
    private class71 field5260;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V", line = 3)
    public static void method2104() {
        field5262 = null;
        field5247 = null;
        field5261 = null;
        field5268 = null;
        field5266 = null;
        field5264 = null;
        field5267 = null;
        field5265 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lja;)V", line = 17)
    public final void method2105(class60 arg0) {
        this.field5260 = new class71();
        this.field5260.method592(arg0);
        this.field5254 = new class71();
        this.field5254.method592(arg0);
        int var2 = arg0.method501(0);
        if (var2 != 0) {
            arg0.field1012--;
            this.field5246 = new class71();
            this.field5246.method592(arg0);
            this.field5252 = new class71();
            this.field5252.method592(arg0);
        }
        int var3 = arg0.method501(0);
        if (var3 != 0) {
            arg0.field1012--;
            this.field5250 = new class71();
            this.field5250.method592(arg0);
            this.field5244 = new class71();
            this.field5244.method592(arg0);
        }
        int var4 = arg0.method501(0);
        if (var4 != 0) {
            arg0.field1012--;
            this.field5256 = new class71();
            this.field5256.method592(arg0);
            this.field5249 = new class71();
            this.field5249.method592(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method504(-89);
            if (var6 == 0) {
                break;
            }
            this.field5259[var5] = var6;
            this.field5253[var5] = arg0.method531(true);
            this.field5251[var5] = arg0.method504(-30);
        }
        this.field5258 = arg0.method504(-47);
        this.field5245 = arg0.method504(-53);
        this.field5248 = arg0.method485((byte) -2);
        this.field5255 = arg0.method485((byte) -2);
        this.field5263 = new class201();
        this.field5257 = new class71();
        this.field5263.method1494(arg0, this.field5257);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method2106(int arg0, int arg1) {
        class231.method1690(field5262, 0, arg0);
        if (arg1 < 10) {
            return field5262;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5260.method595();
        this.field5254.method595();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5246 != null) {
            this.field5246.method595();
            this.field5252.method595();
            var5 = (int) ((double) (this.field5246.field1203 - this.field5246.field1206) * 32.768D / var3);
            var6 = (int) ((double) this.field5246.field1206 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5250 != null) {
            this.field5250.method595();
            this.field5244.method595();
            var8 = (int) ((double) (this.field5250.field1203 - this.field5250.field1206) * 32.768D / var3);
            var9 = (int) ((double) this.field5250.field1206 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5259[var11] != 0) {
                field5268[var11] = 0;
                field5266[var11] = (int) ((double) this.field5251[var11] * var3);
                field5264[var11] = (this.field5259[var11] << 14) / 100;
                field5267[var11] = (int) ((double) (this.field5260.field1203 - this.field5260.field1206) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5253[var11]) / var3);
                field5265[var11] = (int) ((double) this.field5260.field1206 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field5260.method594(arg0);
            int var14 = this.field5254.method594(arg0);
            if (this.field5246 != null) {
                int var15 = this.field5246.method594(arg0);
                int var16 = this.field5252.method594(arg0);
                var13 += this.method2107(var7, var16, this.field5246.field1207) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field5250 != null) {
                int var17 = this.field5250.method594(arg0);
                int var18 = this.field5244.method594(arg0);
                var14 = var14 * ((this.method2107(var10, var18, this.field5250.field1207) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field5259[var19] != 0) {
                    int var20 = field5266[var19] + var12;
                    if (var20 < arg0) {
                        field5262[var20] += this.method2107(field5268[var19], field5264[var19] * var14 >> 15, this.field5260.field1207);
                        field5268[var19] += (field5267[var19] * var13 >> 16) + field5265[var19];
                    }
                }
            }
        }
        if (this.field5256 != null) {
            this.field5256.method595();
            this.field5249.method595();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field5256.method594(arg0);
                int var26 = this.field5249.method594(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field5256.field1203 - this.field5256.field1206) * var25 >> 8) + this.field5256.field1206;
                } else {
                    var27 = ((this.field5256.field1203 - this.field5256.field1206) * var26 >> 8) + this.field5256.field1206;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field5262[var24] = 0;
                }
            }
        }
        if (this.field5258 > 0 && this.field5245 > 0) {
            int var28 = (int) ((double) this.field5258 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field5262[var29] += field5262[var29 - var28] * this.field5245 / 100;
            }
        }
        if (this.field5263.field3393[0] > 0 || this.field5263.field3393[1] > 0) {
            this.field5257.method595();
            int var30 = this.field5257.method594(arg0 + 1);
            int var31 = this.field5263.method1493(0, (float) var30 / 65536.0F);
            int var32 = this.field5263.method1493(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field5262[var31 + var33] * (long) class201.field3392 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field5262[var31 + var33 - var36 - 1] * (long) class201.field3397[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field5262[var33 - var37 - 1] * (long) class201.field3397[1][var37] >> 16);
                    }
                    field5262[var33] = var35;
                    var30 = this.field5257.method594(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field5262[var31 + var33] * (long) class201.field3392 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field5262[var31 + var33 - var40 - 1] * (long) class201.field3397[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field5262[var33 - var41 - 1] * (long) class201.field3397[1][var41] >> 16);
                        }
                        field5262[var33] = var39;
                        var30 = this.field5257.method594(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field5262[var31 + var33 - var43 - 1] * (long) class201.field3397[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field5262[var33 - var44 - 1] * (long) class201.field3397[1][var44] >> 16);
                            }
                            field5262[var33] = var42;
                            this.field5257.method594(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field5263.method1493(0, (float) var30 / 65536.0F);
                    var32 = this.field5263.method1493(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field5262[var46] < -32768) {
                field5262[var46] = -32768;
            }
            if (field5262[var46] > 32767) {
                field5262[var46] = 32767;
            }
        }
        return field5262;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I", line = 381)
    private final int method2107(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5261[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5247[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5247[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5261 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5261[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5262 = new int[220500];
        field5265 = new int[5];
        field5264 = new int[5];
        field5267 = new int[5];
        field5266 = new int[5];
        field5268 = new int[5];
    }
}
