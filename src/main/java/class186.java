import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class186 {

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
    private boolean field2535;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    private int field2530;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    private int field2539;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[I")
    private static int[] field2523 = new int[4];

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    private int field2525;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    private int field2526;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lqa;")
    private static class243 field2528;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lqa;")
    private static class243 field2532;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lqa;")
    private class243 field2538;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lqc;")
    private static class95 field2527;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnr;Lu;)V")
    private final void method1152(class437 arg0, class186 arg1) {
        class180 var3 = class357.method2343(this.field2530, 0, class66.field937, 1);
        if (var3 == null) {
            return;
        }
        arg0.method2101(field2523);
        arg0.method2155(0, 0, this.field2526, this.field2526);
        arg0.method2188(0, 0, this.field2526, this.field2526, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2535) {
                var4 = -arg1.field2537;
                var5 = -arg1.field2524;
                var6 = -arg1.field2531;
            } else {
                var4 = this.field2537 - arg1.field2537;
                var5 = this.field2524 - arg1.field2524;
                var6 = this.field2531 - arg1.field2531;
            }
        }
        if (this.field2536 != 0) {
            int var7 = -this.field2536 & 0x3FFF;
            int var8 = class190.field2644[var7];
            int var9 = class190.field2635[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2529 != 0) {
            int var11 = -this.field2529 & 0x3FFF;
            int var12 = class190.field2644[var11];
            int var13 = class190.field2635[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method2063(1.0F);
        arg0.method2139(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class95 var15 = arg0.method2164(var3, 1024, 0, 64, 768);
        int var16 = var15.method608() - var15.method606();
        int var17 = var15.method599() - var15.method597();
        int var18 = var15.method606() + var16 / 2;
        int var19 = var15.method597() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method2074(var18, var19, var20, var20);
        arg0.method2059(arg0.method2060());
        class116 var21 = arg0.method2026();
        var21.method809(0, 0, arg0.method2182() - var15.method604());
        var15.method586(var21, (class206) null, arg0.method2182(), 1);
        this.field2538 = arg0.method2173(0, 0, this.field2526, this.field2526, true);
        this.field2538.method33(0, 0, 3);
        arg0.method2155(field2523[0], field2523[1], field2523[2], field2523[3]);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static void method1153() {
        field2527 = null;
        field2528 = null;
        field2532 = null;
        field2523 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lnr;Lu;)Z")
    private final boolean method1154(class437 arg0, class186 arg1) {
        if (this.field2538 == null) {
            if (this.field2539 == 0) {
                if (class281.field4136.method1756(false, this.field2530)) {
                    int[] var3 = class281.field4136.method1758(this.field2526, this.field2530, false, -11047, 0.7F, this.field2526);
                    this.field2538 = arg0.method2158(var3, 0, this.field2526, this.field2526, this.field2526);
                }
            } else if (this.field2539 == 2) {
                this.method1152(arg0, arg1);
            } else if (this.field2539 == 1) {
                this.method1158(arg0, arg1);
            }
        }
        return this.field2538 != null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)Z")
    public final boolean method1155(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2535) {
            this.field2534 = 1073741823;
            var8 = this.field2537;
            var9 = this.field2524;
            var10 = this.field2531;
        } else {
            int var5 = this.field2537 - arg0;
            int var6 = this.field2524 - arg1;
            int var7 = this.field2531 - arg2;
            this.field2534 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2534 == 0) {
                this.field2534 = 1;
            }
            var8 = (var5 << 8) / this.field2534;
            var9 = (var6 << 8) / this.field2534;
            var10 = (var7 << 8) / this.field2534;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2525 = this.field2533 * arg3 / (this.field2535 ? 1024 : this.field2534);
        } else {
            this.field2525 = 0;
        }
        if (this.field2525 < 8) {
            this.field2538 = null;
            return false;
        }
        int var12 = class8.method64(1388313616, this.field2525);
        if (var12 > arg3) {
            var12 = class34.method278(arg3, (byte) 103);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2526 != var12) {
            this.field2526 = var12;
        }
        this.field2536 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2529 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2538 = null;
        return true;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()V")
    public static final void method1156() {
        field2527 = null;
        field2532 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnr;IIIIII)V")
    public final void method1157(class437 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2538 == null) {
            return;
        }
        int var8 = this.field2536 - arg5 & 0x3FFF;
        int var9 = this.field2529 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2525) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2525) / 2;
        if (var10 < arg4 && this.field2525 + var10 > 0 && var11 < arg3 && this.field2525 + var11 > 0) {
            this.field2538.method1495(arg1 + var11, arg2 + var10, this.field2525, this.field2525);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Lnr;Lu;)V")
    private final void method1158(class437 arg0, class186 arg1) {
        method1160(arg0);
        method1161(arg0);
        arg0.method2101(field2523);
        arg0.method2155(0, 0, this.field2526, this.field2526);
        arg0.method2033();
        arg0.method2188(0, 0, this.field2526, this.field2526, this.field2540 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2535) {
                var3 = -arg1.field2537;
                var4 = -arg1.field2524;
                var5 = -arg1.field2531;
            } else {
                var3 = arg1.field2537 - this.field2537;
                var4 = arg1.field2524 - this.field2524;
                var5 = arg1.field2531 - this.field2531;
            }
        }
        if (this.field2536 != 0) {
            int var6 = class190.field2644[this.field2536];
            int var7 = class190.field2635[this.field2536];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2529 != 0) {
            int var9 = class190.field2644[this.field2529];
            int var10 = class190.field2635[this.field2529];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class95 var12 = field2527.method628((byte) 0, 25600, true);
        if (arg0.method2089()) {
            var12.method622((short) 0, (short) this.field2530);
        } else {
            var12.method601((short) 127, class281.field4136.method1760(-19907, this.field2530).field2295);
            var12.method622((short) 0, (short) -1);
        }
        arg0.method2063(1.0F);
        arg0.method2139(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2526 * 1024 / (var12.method608() - var12.method606());
        if (this.field2540 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method2074(this.field2526 / 2, this.field2526 / 2, var13, var13);
        arg0.method2059(arg0.method2060());
        class116 var14 = arg0.method2060();
        var14.method809(0, 0, arg0.method2182() - var12.method604());
        var12.method586(var14, (class206) null, 1024, 1);
        int var15 = this.field2526 * 13 / 16;
        int var16 = (this.field2526 - var15) / 2;
        field2528.method32(var16, var16, var15, var15, 1, this.field2540 | 0xFF000000, 1);
        this.field2538 = arg0.method2173(0, 0, this.field2526, this.field2526, true);
        arg0.method2033();
        arg0.method2188(0, 0, this.field2526, this.field2526, 0, 0);
        field2532.method32(0, 0, this.field2526, this.field2526, 0, 0, 0);
        this.field2538.method33(0, 0, 0);
        arg0.method2155(field2523[0], field2523[1], field2523[2], field2523[3]);
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
    public final void method1159() {
        this.field2538 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnr;)V")
    private static final void method1160(class437 arg0) {
        if (field2527 != null) {
            return;
        }
        class180 var1 = new class180(580, 1104, 1);
        var1.method1121((short) 32767, -1286, (byte) 0, (short) 0, (byte) 0, (short) 1024, (short) 1024, (byte) 0, (short) 1024, (short) 0);
        var1.method1116(0, 0, 128, -2);
        var1.method1116(0, 0, -128, -2);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class190.field2644[var3];
            int var5 = class190.field2635[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class190.field2635[var12] >> 8;
                int var14 = class190.field2644[var12] * var4 >> 23;
                int var15 = class190.field2644[var12] * var5 >> 23;
                var1.method1116(-var14, var15, var13, -2);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1115(var7, 0, (short) 127, var8, (byte) 0, (byte) 0, (short) 0, (byte) -88, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1115(var7, var8, (short) 127, var10, (byte) 0, (byte) 0, (short) 0, (byte) -105, (byte) 0);
                    var1.method1115(var7, var10, (short) 127, var11, (byte) 0, (byte) 0, (short) 0, (byte) -63, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1115(1, var7, (short) 127, var8, (byte) 0, (byte) 0, (short) 0, (byte) 105, (byte) 0);
            }
        }
        var1.field2370 = var1.field2409;
        var1.field2405 = null;
        var1.field2381 = null;
        var1.field2403 = null;
        field2527 = arg0.method2164(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2537 = arg2;
        this.field2524 = arg3;
        this.field2531 = arg4;
        this.field2535 = arg7;
        this.field2530 = arg1;
        this.field2540 = arg6;
        this.field2533 = arg5;
        this.field2539 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lnr;)V")
    private static final void method1161(class437 arg0) {
        if (field2532 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field2532 = arg0.method2158(var2, 0, 128, 128, 128);
        field2528 = arg0.method2158(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(Lnr;Lu;)Z")
    public final boolean method1162(class437 arg0, class186 arg1) {
        return this.field2538 != null || this.method1154(arg0, arg1);
    }
}
