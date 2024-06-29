import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class265 {

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    private int field3353;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    private int field3346;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Z")
    private boolean field3357;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    private int field3354;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    private int field3355;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    private int field3351;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[I")
    private static int[] field3349 = new int[4];

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    private int field3345;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    private int field3352;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lba;")
    private static class359 field3348;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lxa;")
    private static class468 field3342;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Lxa;")
    private static class468 field3350;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Lxa;")
    private class468 field3356;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Loa;)V")
    private static final void method1569(class650 arg0) {
        if (field3342 != null) {
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
        field3342 = arg0.method428(var2, 0, 128, 128, 128);
        field3350 = arg0.method428(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Loa;Lol;)Z")
    private final boolean method1570(class650 arg0, class265 arg1) {
        if (this.field3356 == null) {
            if (this.field3351 == 0) {
                if (class474.field5870.method2717(this.field3354, false)) {
                    int[] var3 = class474.field5870.method2715(this.field3343, this.field3343, this.field3354, 0.7F, false, true);
                    this.field3356 = arg0.method428(var3, 0, this.field3343, this.field3343, this.field3343);
                }
            } else if (this.field3351 == 2) {
                this.method1579(arg0, arg1);
            } else if (this.field3351 == 1) {
                this.method1575(arg0, arg1);
            }
        }
        return this.field3356 != null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Loa;)V")
    private static final void method1571(class650 arg0) {
        if (field3348 != null) {
            return;
        }
        class229 var1 = new class229(580, 1104, 1);
        var1.method1390((short) 1024, false, (byte) 0, (short) 32767, (short) 1024, (short) 0, (byte) 0, (short) 1024, (short) 0, (byte) 0);
        var1.method1379(0, 128, 0, (byte) -126);
        var1.method1379(0, -128, 0, (byte) -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class243.field3129[var3];
            int var5 = class243.field3128[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class243.field3128[var12] >> 7;
                int var14 = class243.field3129[var12] * var4 >> 21;
                int var15 = class243.field3129[var12] * var5 >> 21;
                var1.method1379(var15, var13, -var14, (byte) -124);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1392((byte) 0, (byte) 0, var8, (byte) 0, 0, (short) 0, var7, 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1392((byte) 0, (byte) 0, var10, (byte) 0, var8, (short) 0, var7, 0, (short) 127);
                    var1.method1392((byte) 0, (byte) 0, var11, (byte) 0, var10, (short) 0, var7, 0, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1392((byte) 0, (byte) 0, var8, (byte) 0, var7, (short) 0, 1, 0, (short) 127);
            }
        }
        var1.field2965 = var1.field2993;
        var1.field2994 = null;
        var1.field2971 = null;
        var1.field2959 = null;
        field3348 = arg0.method408(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)Z")
    public final boolean method1572(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3357) {
            this.field3347 = 1073741823;
            var8 = this.field3353;
            var9 = this.field3346;
            var10 = this.field3341;
        } else {
            int var5 = this.field3353 - arg0;
            int var6 = this.field3346 - arg1;
            int var7 = this.field3341 - arg2;
            this.field3347 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3347 == 0) {
                this.field3347 = 1;
            }
            var8 = (var5 << 8) / this.field3347;
            var9 = (var6 << 8) / this.field3347;
            var10 = (var7 << 8) / this.field3347;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3345 = this.field3340 * arg3 / (this.field3357 ? 1024 : this.field3347);
        } else {
            this.field3345 = 0;
        }
        if (this.field3345 < 8) {
            this.field3356 = null;
            return false;
        }
        int var12 = class560.method2979(this.field3345, (byte) 70);
        if (var12 > arg3) {
            var12 = class217.method1256((byte) -64, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3343 != var12) {
            this.field3343 = var12;
        }
        this.field3352 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field3344 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field3356 = null;
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
    public static void method1573() {
        field3348 = null;
        field3350 = null;
        field3342 = null;
        field3349 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Loa;Lol;)Z")
    public final boolean method1574(class650 arg0, class265 arg1) {
        return this.field3356 != null || this.method1570(arg0, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(Loa;Lol;)V")
    private final void method1575(class650 arg0, class265 arg1) {
        method1571(arg0);
        method1569(arg0);
        arg0.method478(field3349);
        arg0.method403(0, 0, this.field3343, this.field3343);
        arg0.method322();
        arg0.method475(0, 0, this.field3343, this.field3343, this.field3355 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3357) {
                var3 = -arg1.field3353;
                var4 = -arg1.field3346;
                var5 = -arg1.field3341;
            } else {
                var3 = arg1.field3353 - this.field3353;
                var4 = arg1.field3346 - this.field3346;
                var5 = arg1.field3341 - this.field3341;
            }
        }
        if (this.field3352 != 0) {
            int var6 = class243.field3129[this.field3352];
            int var7 = class243.field3128[this.field3352];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field3344 != 0) {
            int var9 = class243.field3129[this.field3344];
            int var10 = class243.field3128[this.field3344];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class359 var12 = field3348.method951((byte) 0, 51200, true);
        if (arg0.method434()) {
            var12.method2079((short) 0, (short) this.field3354);
        } else {
            var12.method2080((short) 127, class474.field5870.method2718(this.field3354, (byte) 72).field1825);
            var12.method2079((short) 0, (short) -1);
        }
        arg0.method449(1.0F);
        arg0.method445(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3343 * 1024 / (var12.method2068() - var12.method2061());
        if (this.field3355 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method450(this.field3343 / 2, this.field3343 / 2, var13, var13);
        arg0.method490(arg0.method431());
        class396 var14 = arg0.method431();
        var14.method591(0, 0, arg0.method423() - var12.method2089());
        var12.method2059(var14, null, 1024, 1);
        int var15 = this.field3343 * 13 / 16;
        int var16 = (this.field3343 - var15) / 2;
        field3350.method1553(var16, var16, var15, var15, 0, this.field3355 | 0xFF000000, 1);
        this.field3356 = arg0.method433(0, 0, this.field3343, this.field3343, true);
        arg0.method322();
        arg0.method475(0, 0, this.field3343, this.field3343, 0, 0);
        field3342.method1553(0, 0, this.field3343, this.field3343, 1, 0, 0);
        this.field3356.method1550(0, 0, 0);
        arg0.method403(field3349[0], field3349[1], field3349[2], field3349[3]);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()V")
    public final void method1576() {
        this.field3356 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Loa;IIIIII)V")
    public final void method1577(class650 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3356 == null) {
            return;
        }
        int var8 = this.field3352 - arg5 & 0x3FFF;
        int var9 = this.field3344 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3345) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3345) / 2;
        if (var10 < arg4 && this.field3345 + var10 > 0 && var11 < arg3 && this.field3345 + var11 > 0) {
            this.field3356.method2549(arg1 + var11, arg2 + var10, this.field3345, this.field3345);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "()V")
    public static final void method1578() {
        field3348 = null;
        field3342 = null;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(Loa;Lol;)V")
    private final void method1579(class650 arg0, class265 arg1) {
        class229 var3 = class167.method1013((byte) -28, this.field3354, class563.field7029, 0);
        if (var3 == null) {
            return;
        }
        arg0.method478(field3349);
        arg0.method403(0, 0, this.field3343, this.field3343);
        arg0.method475(0, 0, this.field3343, this.field3343, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3357) {
                var4 = -arg1.field3353;
                var5 = -arg1.field3346;
                var6 = -arg1.field3341;
            } else {
                var4 = this.field3353 - arg1.field3353;
                var5 = this.field3346 - arg1.field3346;
                var6 = this.field3341 - arg1.field3341;
            }
        }
        if (this.field3352 != 0) {
            int var7 = -this.field3352 & 0x3FFF;
            int var8 = class243.field3129[var7];
            int var9 = class243.field3128[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field3344 != 0) {
            int var11 = -this.field3344 & 0x3FFF;
            int var12 = class243.field3129[var11];
            int var13 = class243.field3128[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method449(1.0F);
        arg0.method445(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class359 var15 = arg0.method408(var3, 2048, 0, 64, 768);
        int var16 = var15.method2068() - var15.method2061();
        int var17 = var15.method2085() - var15.method2084();
        int var18 = var15.method2061() + var16 / 2;
        int var19 = var15.method2084() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method450(var18, var19, var20, var20);
        arg0.method490(arg0.method431());
        class396 var21 = arg0.method470();
        var21.method591(0, 0, arg0.method423() - var15.method2089());
        var15.method2059(var21, null, arg0.method423(), 1);
        this.field3356 = arg0.method433(0, 0, this.field3343, this.field3343, true);
        this.field3356.method1550(0, 0, 3);
        arg0.method403(field3349[0], field3349[1], field3349[2], field3349[3]);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3353 = arg2;
        this.field3346 = arg3;
        this.field3341 = arg4;
        this.field3357 = arg7;
        this.field3354 = arg1;
        this.field3355 = arg6;
        this.field3340 = arg5;
        this.field3351 = arg0;
    }
}
