import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class518 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private int field7263 = 100;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    private int field7260 = 0;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "[I")
    private int[] field7267 = new int[5];

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public int field7272 = 0;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "[I")
    private int[] field7274 = new int[5];

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "[I")
    private int[] field7271 = new int[5];

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public int field7278 = 500;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
    private static int[] field7264 = new int[32768];

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[I")
    private static int[] field7275;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "[I")
    private static int[] field7269;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "[I")
    private static int[] field7277;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "[I")
    private static int[] field7279;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "[I")
    private static int[] field7276;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "[I")
    private static int[] field7281;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "[I")
    private static int[] field7283;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "Lop;")
    private class161 field7273;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Lec;")
    private class198 field7261;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Lec;")
    private class198 field7262;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "Lec;")
    private class198 field7265;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lec;")
    private class198 field7266;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lec;")
    private class198 field7268;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "Lec;")
    private class198 field7270;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Lec;")
    private class198 field7280;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "Lec;")
    private class198 field7282;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "Lec;")
    private class198 field7284;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)I")
    private final int method2985(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field7275[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field7264[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ldaa;)V")
    public final void method2986(class11 arg0) {
        this.field7265 = new class198();
        this.field7265.method1218(arg0);
        this.field7261 = new class198();
        this.field7261.method1218(arg0);
        int var2 = arg0.method110((byte) 34);
        if (var2 != 0) {
            arg0.field165--;
            this.field7284 = new class198();
            this.field7284.method1218(arg0);
            this.field7280 = new class198();
            this.field7280.method1218(arg0);
        }
        int var3 = arg0.method110((byte) 82);
        if (var3 != 0) {
            arg0.field165--;
            this.field7282 = new class198();
            this.field7282.method1218(arg0);
            this.field7268 = new class198();
            this.field7268.method1218(arg0);
        }
        int var4 = arg0.method110((byte) 85);
        if (var4 != 0) {
            arg0.field165--;
            this.field7266 = new class198();
            this.field7266.method1218(arg0);
            this.field7262 = new class198();
            this.field7262.method1218(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method112(-8838);
            if (var6 == 0) {
                break;
            }
            this.field7267[var5] = var6;
            this.field7271[var5] = arg0.method97(30570);
            this.field7274[var5] = arg0.method112(-8838);
        }
        this.field7260 = arg0.method112(-8838);
        this.field7263 = arg0.method112(-8838);
        this.field7278 = arg0.method93((byte) 126);
        this.field7272 = arg0.method93((byte) 124);
        this.field7273 = new class161();
        this.field7270 = new class198();
        this.field7273.method1032(arg0, this.field7270);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "()V")
    public static void method2987() {
        field7269 = null;
        field7264 = null;
        field7275 = null;
        field7281 = null;
        field7283 = null;
        field7276 = null;
        field7279 = null;
        field7277 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)[I")
    public final int[] method2988(int arg0, int arg1) {
        class416.method2499(field7269, 0, arg0);
        if (arg1 < 10) {
            return field7269;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field7265.method1219();
        this.field7261.method1219();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field7284 != null) {
            this.field7284.method1219();
            this.field7280.method1219();
            var5 = (int) ((double) (this.field7284.field2802 - this.field7284.field2801) * 32.768D / var3);
            var6 = (int) ((double) this.field7284.field2801 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field7282 != null) {
            this.field7282.method1219();
            this.field7268.method1219();
            var8 = (int) ((double) (this.field7282.field2802 - this.field7282.field2801) * 32.768D / var3);
            var9 = (int) ((double) this.field7282.field2801 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field7267[var11] != 0) {
                field7281[var11] = 0;
                field7283[var11] = (int) ((double) this.field7274[var11] * var3);
                field7276[var11] = (this.field7267[var11] << 14) / 100;
                field7279[var11] = (int) ((double) (this.field7265.field2802 - this.field7265.field2801) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field7271[var11]) / var3);
                field7277[var11] = (int) ((double) this.field7265.field2801 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field7265.method1217(arg0);
            int var40 = this.field7261.method1217(arg0);
            if (this.field7284 != null) {
                int var41 = this.field7284.method1217(arg0);
                int var42 = this.field7280.method1217(arg0);
                var39 += this.method2985(var7, var42, this.field7284.field2805) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field7282 != null) {
                int var43 = this.field7282.method1217(arg0);
                int var44 = this.field7268.method1217(arg0);
                var40 = var40 * ((this.method2985(var10, var44, this.field7282.field2805) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field7267[var45] != 0) {
                    int var46 = field7283[var45] + var12;
                    if (var46 < arg0) {
                        field7269[var46] += this.method2985(field7281[var45], field7276[var45] * var40 >> 15, this.field7265.field2805);
                        field7281[var45] += (field7279[var45] * var39 >> 16) + field7277[var45];
                    }
                }
            }
        }
        if (this.field7266 != null) {
            this.field7266.method1219();
            this.field7262.method1219();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field7266.method1217(arg0);
                int var18 = this.field7262.method1217(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field7266.field2802 - this.field7266.field2801) * var17 >> 8) + this.field7266.field2801;
                } else {
                    var19 = ((this.field7266.field2802 - this.field7266.field2801) * var18 >> 8) + this.field7266.field2801;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field7269[var16] = 0;
                }
            }
        }
        if (this.field7260 > 0 && this.field7263 > 0) {
            int var20 = (int) ((double) this.field7260 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field7269[var21] += field7269[var21 - var20] * this.field7263 / 100;
            }
        }
        if (this.field7273.field2359[0] > 0 || this.field7273.field2359[1] > 0) {
            this.field7270.method1219();
            int var22 = this.field7270.method1217(arg0 + 1);
            int var23 = this.field7273.method1033(0, (float) var22 / 65536.0F);
            int var24 = this.field7273.method1033(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field7269[var23 + var25] * (long) class161.field2355 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field7269[var23 + var25 - var36 - 1] * (long) class161.field2356[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field7269[var25 - var37 - 1] * (long) class161.field2356[1][var37] >> 16);
                    }
                    field7269[var25] = var35;
                    var22 = this.field7270.method1217(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field7269[var23 + var25] * (long) class161.field2355 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field7269[var23 + var25 - var33 - 1] * (long) class161.field2356[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field7269[var25 - var34 - 1] * (long) class161.field2356[1][var34] >> 16);
                        }
                        field7269[var25] = var32;
                        var22 = this.field7270.method1217(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field7269[var23 + var25 - var29 - 1] * (long) class161.field2356[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field7269[var25 - var30 - 1] * (long) class161.field2356[1][var30] >> 16);
                            }
                            field7269[var25] = var28;
                            this.field7270.method1217(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field7273.method1033(0, (float) var22 / 65536.0F);
                    var24 = this.field7273.method1033(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field7269[var38] < -32768) {
                field7269[var38] = -32768;
            }
            if (field7269[var38] > 32767) {
                field7269[var38] = 32767;
            }
        }
        return field7269;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field7264[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field7275 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field7275[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field7269 = new int[220500];
        field7277 = new int[5];
        field7279 = new int[5];
        field7276 = new int[5];
        field7281 = new int[5];
        field7283 = new int[5];
    }
}
