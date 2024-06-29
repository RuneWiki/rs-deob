import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class18 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
    private int[] field266 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    private int field270 = 0;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
    private int[] field276 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public int field277 = 0;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
    private int[] field281 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public int field288 = 500;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private int field287 = 100;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
    private static int[] field268 = new int[32768];

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    private static int[] field269;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[I")
    private static int[] field264;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
    private static int[] field282;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
    private static int[] field280;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
    private static int[] field285;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[I")
    private static int[] field286;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
    private static int[] field283;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lng;")
    private class154 field272;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lod;")
    private class24 field265;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lod;")
    private class24 field267;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lod;")
    private class24 field271;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lod;")
    private class24 field273;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Lod;")
    private class24 field274;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lod;")
    private class24 field275;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lod;")
    private class24 field278;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lod;")
    private class24 field279;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lod;")
    private class24 field284;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method101(int arg0, int arg1) {
        class234.method1626(field264, 0, arg0);
        if (arg1 < 10) {
            return field264;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field271.method179();
        this.field274.method179();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field278 != null) {
            this.field278.method179();
            this.field275.method179();
            var5 = (int) ((double) (this.field278.field424 - this.field278.field427) * 32.768D / var3);
            var6 = (int) ((double) this.field278.field427 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field265 != null) {
            this.field265.method179();
            this.field273.method179();
            var8 = (int) ((double) (this.field265.field424 - this.field265.field427) * 32.768D / var3);
            var9 = (int) ((double) this.field265.field427 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field281[var11] != 0) {
                field282[var11] = 0;
                field286[var11] = (int) ((double) this.field276[var11] * var3);
                field283[var11] = (this.field281[var11] << 14) / 100;
                field280[var11] = (int) ((double) (this.field271.field424 - this.field271.field427) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field266[var11]) / var3);
                field285[var11] = (int) ((double) this.field271.field427 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field271.method177(arg0);
            int var14 = this.field274.method177(arg0);
            if (this.field278 != null) {
                int var15 = this.field278.method177(arg0);
                int var16 = this.field275.method177(arg0);
                var13 += this.method102(var7, var16, this.field278.field429) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field265 != null) {
                int var17 = this.field265.method177(arg0);
                int var18 = this.field273.method177(arg0);
                var14 = var14 * ((this.method102(var10, var18, this.field265.field429) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field281[var19] != 0) {
                    int var20 = field286[var19] + var12;
                    if (var20 < arg0) {
                        field264[var20] += this.method102(field282[var19], field283[var19] * var14 >> 15, this.field271.field429);
                        field282[var19] += (field280[var19] * var13 >> 16) + field285[var19];
                    }
                }
            }
        }
        if (this.field279 != null) {
            this.field279.method179();
            this.field267.method179();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field279.method177(arg0);
                int var26 = this.field267.method177(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field279.field424 - this.field279.field427) * var25 >> 8) + this.field279.field427;
                } else {
                    var27 = ((this.field279.field424 - this.field279.field427) * var26 >> 8) + this.field279.field427;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field264[var24] = 0;
                }
            }
        }
        if (this.field270 > 0 && this.field287 > 0) {
            int var28 = (int) ((double) this.field270 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field264[var29] += field264[var29 - var28] * this.field287 / 100;
            }
        }
        if (this.field272.field2604[0] > 0 || this.field272.field2604[1] > 0) {
            this.field284.method179();
            int var30 = this.field284.method177(arg0 + 1);
            int var31 = this.field272.method1198(0, (float) var30 / 65536.0F);
            int var32 = this.field272.method1198(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field264[var31 + var33] * (long) class154.field2603 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field264[var31 + var33 - var36 - 1] * (long) class154.field2607[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field264[var33 - var37 - 1] * (long) class154.field2607[1][var37] >> 16);
                    }
                    field264[var33] = var35;
                    var30 = this.field284.method177(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field264[var31 + var33] * (long) class154.field2603 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field264[var31 + var33 - var40 - 1] * (long) class154.field2607[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field264[var33 - var41 - 1] * (long) class154.field2607[1][var41] >> 16);
                        }
                        field264[var33] = var39;
                        var30 = this.field284.method177(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field264[var31 + var33 - var43 - 1] * (long) class154.field2607[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field264[var33 - var44 - 1] * (long) class154.field2607[1][var44] >> 16);
                            }
                            field264[var33] = var42;
                            this.field284.method177(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field272.method1198(0, (float) var30 / 65536.0F);
                    var32 = this.field272.method1198(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field264[var46] < -32768) {
                field264[var46] = -32768;
            }
            if (field264[var46] > 32767) {
                field264[var46] = 32767;
            }
        }
        return field264;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I", line = 309)
    private final int method102(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field269[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field268[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lsd;)V", line = 337)
    public final void method103(class26 arg0) {
        this.field271 = new class24();
        this.field271.method178(arg0);
        this.field274 = new class24();
        this.field274.method178(arg0);
        int var2 = arg0.method226(255);
        if (var2 != 0) {
            arg0.field478--;
            this.field278 = new class24();
            this.field278.method178(arg0);
            this.field275 = new class24();
            this.field275.method178(arg0);
        }
        int var3 = arg0.method226(255);
        if (var3 != 0) {
            arg0.field478--;
            this.field265 = new class24();
            this.field265.method178(arg0);
            this.field273 = new class24();
            this.field273.method178(arg0);
        }
        int var4 = arg0.method226(255);
        if (var4 != 0) {
            arg0.field478--;
            this.field279 = new class24();
            this.field279.method178(arg0);
            this.field267 = new class24();
            this.field267.method178(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method195((byte) 120);
            if (var6 == 0) {
                break;
            }
            this.field281[var5] = var6;
            this.field266[var5] = arg0.method192((byte) -92);
            this.field276[var5] = arg0.method195((byte) 120);
        }
        this.field270 = arg0.method195((byte) 120);
        this.field287 = arg0.method195((byte) 120);
        this.field288 = arg0.method197(-1);
        this.field277 = arg0.method197(-1);
        this.field272 = new class154();
        this.field284 = new class24();
        this.field272.method1201(arg0, this.field284);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V", line = 397)
    public static void method104() {
        field264 = null;
        field268 = null;
        field269 = null;
        field282 = null;
        field286 = null;
        field283 = null;
        field280 = null;
        field285 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field268[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field269 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field269[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field264 = new int[220500];
        field282 = new int[5];
        field280 = new int[5];
        field285 = new int[5];
        field286 = new int[5];
        field283 = new int[5];
    }
}
