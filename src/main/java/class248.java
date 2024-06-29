import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class248 {

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    private int field3272;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    private int field3279;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Z")
    private boolean field3280;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    private int field3277;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    private int field3288;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "[I")
    private static int[] field3285 = new int[4];

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    private int field3273;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    private int field3281;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lo;")
    private static class24 field3275;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lo;")
    private class24 field3276;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lo;")
    private static class24 field3284;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Le;")
    private static class373 field3287;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)Z", line = 7)
    public final boolean method1532(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3280) {
            this.field3283 = 1073741823;
            var8 = this.field3289;
            var9 = this.field3272;
            var10 = this.field3279;
        } else {
            int var5 = this.field3289 - arg0;
            int var6 = this.field3272 - arg1;
            int var7 = this.field3279 - arg2;
            this.field3283 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3283 == 0) {
                this.field3283 = 1;
            }
            var8 = (var5 << 8) / this.field3283;
            var9 = (var6 << 8) / this.field3283;
            var10 = (var7 << 8) / this.field3283;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3273 = this.field3277 * arg3 / (this.field3280 ? 1024 : this.field3283);
        } else {
            this.field3273 = 0;
        }
        if (this.field3273 < 8) {
            this.field3276 = null;
            return false;
        }
        int var12 = class111.method682(-128, this.field3273);
        if (var12 > arg3) {
            var12 = class525.method3127(arg3, 1617667937);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3281 != var12) {
            this.field3281 = var12;
        }
        this.field3278 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3286 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3276 = null;
        return true;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V", line = 63)
    public static void method1533() {
        field3287 = null;
        field3284 = null;
        field3275 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V", line = 72)
    public static final void method1534() {
        field3287 = null;
        field3275 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lza;)V", line = 77)
    private static final void method1535(class287 arg0) {
        if (field3275 != null) {
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
        field3275 = arg0.method1218(var2, 0, 128, 128, 128);
        field3284 = arg0.method1218(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lza;Lbc;)V", line = 142)
    private final void method1536(class287 arg0, class248 arg1) {
        method1538(arg0);
        method1535(arg0);
        arg0.method1163(field3285);
        arg0.method1182(0, 0, this.field3281, this.field3281);
        arg0.method1188();
        arg0.method1153(0, 0, this.field3281, this.field3281, this.field3274 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3280) {
                var3 = -arg1.field3289;
                var4 = -arg1.field3272;
                var5 = -arg1.field3279;
            } else {
                var3 = arg1.field3289 - this.field3289;
                var4 = arg1.field3272 - this.field3272;
                var5 = arg1.field3279 - this.field3279;
            }
        }
        if (this.field3278 != 0) {
            int var6 = class456.field6812[this.field3278];
            int var7 = class456.field6811[this.field3278];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3286 != 0) {
            int var9 = class456.field6812[this.field3286];
            int var10 = class456.field6811[this.field3286];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class373 var12 = field3287.method2027((byte) 0, 51200, true);
        if (arg0.method1132()) {
            var12.method2018((short) 0, (short) this.field3282);
        } else {
            var12.method2032((short) 127, class190.field2451.method94(this.field3282, (byte) -72).field6309);
            var12.method2018((short) 0, (short) -1);
        }
        arg0.method1139(1.0F);
        arg0.method1181(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3281 * 1024 / (var12.method2019() - var12.method2043());
        if (this.field3274 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1221(this.field3281 / 2, this.field3281 / 2, var13, var13);
        arg0.method1227(arg0.method1125());
        class124 var14 = arg0.method1125();
        var14.method743(0, 0, arg0.method1234() - var12.method2048());
        var12.method2016(var14, null, 1024, 1);
        int var15 = this.field3281 * 13 / 16;
        int var16 = (this.field3281 - var15) / 2;
        field3284.method6(var16, var16, var15, var15, 0, this.field3274 | 0xFF000000, 1);
        this.field3276 = arg0.method1216(0, 0, this.field3281, this.field3281, true);
        arg0.method1188();
        arg0.method1153(0, 0, this.field3281, this.field3281, 0, 0);
        field3275.method6(0, 0, this.field3281, this.field3281, 1, 0, 0);
        this.field3276.method9(0, 0, 0);
        arg0.method1182(field3285[0], field3285[1], field3285[2], field3285[3]);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Lza;Lbc;)Z", line = 235)
    public final boolean method1537(class287 arg0, class248 arg1) {
        return this.field3276 != null || this.method1541(arg0, arg1);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Lza;)V", line = 240)
    private static final void method1538(class287 arg0) {
        if (field3287 != null) {
            return;
        }
        class131 var1 = new class131(580, 1104, 1);
        var1.method790((byte) 0, (short) 0, (short) 0, 255, (short) 1024, (byte) 0, (short) 1024, (byte) 0, (short) 32767, (short) 1024);
        var1.method798(true, 0, 0, 128);
        var1.method798(true, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class456.field6812[var3];
            int var5 = class456.field6811[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class456.field6811[var12] >> 8;
                int var14 = class456.field6812[var12] * var4 >> 23;
                int var15 = class456.field6812[var12] * var5 >> 23;
                var1.method798(true, var15, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method785(0, (byte) 0, var8, (short) 127, (byte) 0, var7, (byte) 0, (short) 0, -96);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method785(var8, (byte) 0, var10, (short) 127, (byte) 0, var7, (byte) 0, (short) 0, -82);
                    var1.method785(var10, (byte) 0, var11, (short) 127, (byte) 0, var7, (byte) 0, (short) 0, -87);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method785(var7, (byte) 0, var8, (short) 127, (byte) 0, 1, (byte) 0, (short) 0, -111);
            }
        }
        var1.field1701 = var1.field1727;
        var1.field1703 = null;
        var1.field1740 = null;
        var1.field1720 = null;
        field3287 = arg0.method1213(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V", line = 323)
    public final void method1539() {
        this.field3276 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lza;IIIIII)V", line = 326)
    public final void method1540(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3276 == null) {
            return;
        }
        int var8 = this.field3278 - arg5 & 0x3FFF;
        int var9 = this.field3286 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3273) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3273) / 2;
        if (var10 < arg4 && this.field3273 + var10 > 0 && var11 < arg3 && this.field3273 + var11 > 0) {
            this.field3276.method141(arg1 + var11, arg2 + var10, this.field3273, this.field3273);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(Lza;Lbc;)Z", line = 353)
    private final boolean method1541(class287 arg0, class248 arg1) {
        if (this.field3276 == null) {
            if (this.field3288 == 0) {
                if (class190.field2451.method91(this.field3282, -1221)) {
                    int[] var3 = class190.field2451.method92(2384, this.field3281, this.field3281, this.field3282, 0.7F, false);
                    this.field3276 = arg0.method1218(var3, 0, this.field3281, this.field3281, this.field3281);
                }
            } else if (this.field3288 == 2) {
                this.method1542(arg0, arg1);
            } else if (this.field3288 == 1) {
                this.method1536(arg0, arg1);
            }
        }
        return this.field3276 != null;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(Lza;Lbc;)V", line = 390)
    private final void method1542(class287 arg0, class248 arg1) {
        class131 var3 = class490.method2960(0, this.field3282, class412.field5884, -111);
        if (var3 == null) {
            return;
        }
        arg0.method1163(field3285);
        arg0.method1182(0, 0, this.field3281, this.field3281);
        arg0.method1153(0, 0, this.field3281, this.field3281, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3280) {
                var4 = -arg1.field3289;
                var5 = -arg1.field3272;
                var6 = -arg1.field3279;
            } else {
                var4 = this.field3289 - arg1.field3289;
                var5 = this.field3272 - arg1.field3272;
                var6 = this.field3279 - arg1.field3279;
            }
        }
        if (this.field3278 != 0) {
            int var7 = -this.field3278 & 0x3FFF;
            int var8 = class456.field6812[var7];
            int var9 = class456.field6811[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3286 != 0) {
            int var11 = -this.field3286 & 0x3FFF;
            int var12 = class456.field6812[var11];
            int var13 = class456.field6811[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1139(1.0F);
        arg0.method1181(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class373 var15 = arg0.method1213(var3, 2048, 0, 64, 768);
        int var16 = var15.method2019() - var15.method2043();
        int var17 = var15.method2023() - var15.method2041();
        int var18 = var15.method2043() + var16 / 2;
        int var19 = var15.method2041() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1221(var18, var19, var20, var20);
        arg0.method1227(arg0.method1125());
        class124 var21 = arg0.method1183();
        var21.method743(0, 0, arg0.method1234() - var15.method2048());
        var15.method2016(var21, null, arg0.method1234(), 1);
        this.field3276 = arg0.method1216(0, 0, this.field3281, this.field3281, true);
        this.field3276.method9(0, 0, 3);
        arg0.method1182(field3285[0], field3285[1], field3285[2], field3285[3]);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3289 = arg2;
        this.field3272 = arg3;
        this.field3279 = arg4;
        this.field3280 = arg7;
        this.field3282 = arg1;
        this.field3274 = arg6;
        this.field3277 = arg5;
        this.field3288 = arg0;
    }
}
