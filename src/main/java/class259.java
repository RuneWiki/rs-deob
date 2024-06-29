import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class259 {

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    private int field3560;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    private int field3551;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    private int field3552;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
    private boolean field3553;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    private int field3556;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    private int field3565;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "[I")
    private static int[] field3562 = new int[4];

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    private int field3564;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "Lda;")
    private static class55 field3558;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "Lf;")
    private static class701 field3554;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "Lf;")
    private static class701 field3555;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "Lf;")
    private class701 field3566;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lr;Luu;)Z")
    private final boolean method1572(class165 arg0, class259 arg1) {
        if (this.field3566 == null) {
            if (this.field3549 == 0) {
                if (class490.field6845.method395(this.field3563, 28576)) {
                    int[] var3 = class490.field6845.method392(false, this.field3564, this.field3563, this.field3564, 87, 0.7F);
                    this.field3566 = arg0.method311(var3, 0, this.field3564, this.field3564, this.field3564);
                }
            } else if (this.field3549 == 2) {
                this.method1580(arg0, arg1);
            } else if (this.field3549 == 1) {
                this.method1575(arg0, arg1);
            }
        }
        return this.field3566 != null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lr;IIIIII)V")
    public final void method1573(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3566 == null) {
            return;
        }
        int var8 = this.field3561 - arg5 & 0x3FFF;
        int var9 = this.field3550 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3559) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3559) / 2;
        if (var10 < arg4 && this.field3559 + var10 > 0 && var11 < arg3 && this.field3559 + var11 > 0) {
            this.field3566.method3925(arg1 + var11, arg2 + var10, this.field3559, this.field3559);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lr;)V")
    private static final void method1574(class165 arg0) {
        if (field3558 != null) {
            return;
        }
        class173 var1 = new class173(580, 1104, 1);
        var1.method1084((short) 0, (byte) 0, (short) 32767, -127, (byte) 0, (short) 1024, (short) 1024, (byte) 0, (short) 0, (short) 1024);
        var1.method1082(0, 128, 0, 4);
        var1.method1082(0, -128, 0, 4);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class395.field5579[var3];
            int var5 = class395.field5582[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class395.field5582[var12] >> 7;
                int var14 = class395.field5579[var12] * var4 >> 21;
                int var15 = class395.field5579[var12] * var5 >> 21;
                var1.method1082(var15, var13, -var14, 4);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1087(var8, (byte) 40, (short) 127, (short) 0, var7, (byte) 0, 0, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1087(var10, (byte) 87, (short) 127, (short) 0, var7, (byte) 0, var8, (byte) 0, (byte) 0);
                    var1.method1087(var11, (byte) 117, (short) 127, (short) 0, var7, (byte) 0, var10, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1087(var8, (byte) 67, (short) 127, (short) 0, 1, (byte) 0, var7, (byte) 0, (byte) 0);
            }
        }
        var1.field2100 = var1.field2123;
        var1.field2101 = null;
        var1.field2110 = null;
        var1.field2112 = null;
        field3558 = arg0.method274(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Lr;Luu;)V")
    private final void method1575(class165 arg0, class259 arg1) {
        method1574(arg0);
        method1577(arg0);
        arg0.method251(field3562);
        arg0.method292(0, 0, this.field3564, this.field3564);
        arg0.method246();
        arg0.method248(0, 0, this.field3564, this.field3564, this.field3556 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3553) {
                var3 = -arg1.field3560;
                var4 = -arg1.field3551;
                var5 = -arg1.field3552;
            } else {
                var3 = arg1.field3560 - this.field3560;
                var4 = arg1.field3551 - this.field3551;
                var5 = arg1.field3552 - this.field3552;
            }
        }
        if (this.field3561 != 0) {
            int var6 = class395.field5579[this.field3561];
            int var7 = class395.field5582[this.field3561];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field3550 != 0) {
            int var9 = class395.field5579[this.field3550];
            int var10 = class395.field5582[this.field3550];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class55 var12 = field3558.method97((byte) 0, 51200, true);
        if (arg0.method247()) {
            var12.method130((short) 0, (short) this.field3563);
        } else {
            var12.method87((short) 127, class490.field6845.method397(this.field3563, (byte) 78).field4713);
            var12.method130((short) 0, (short) -1);
        }
        arg0.method239(1.0F);
        arg0.method236(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3564 * 1024 / (var12.method115() - var12.method94());
        if (this.field3556 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method301(this.field3564 / 2, this.field3564 / 2, var13, var13);
        arg0.method262(arg0.method305());
        class394 var14 = arg0.method305();
        var14.method712(0, 0, arg0.method260() - var12.method79());
        var12.method122(var14, null, 1024, 1);
        int var15 = this.field3564 * 13 / 16;
        int var16 = (this.field3564 - var15) / 2;
        field3554.method3932(var16, var16, var15, var15, 0, this.field3556 | 0xFF000000, 1);
        this.field3566 = arg0.method231(0, 0, this.field3564, this.field3564, true);
        arg0.method246();
        arg0.method248(0, 0, this.field3564, this.field3564, 0, 0);
        field3555.method3932(0, 0, this.field3564, this.field3564, 1, 0, 0);
        this.field3566.method4(0, 0, 0);
        arg0.method292(field3562[0], field3562[1], field3562[2], field3562[3]);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "()V")
    public final void method1576() {
        this.field3566 = null;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Lr;)V")
    private static final void method1577(class165 arg0) {
        if (field3555 != null) {
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
        field3555 = arg0.method311(var2, 0, 128, 128, 128);
        field3554 = arg0.method311(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "()V")
    public static void method1578() {
        field3558 = null;
        field3554 = null;
        field3555 = null;
        field3562 = null;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(Lr;Luu;)Z")
    public final boolean method1579(class165 arg0, class259 arg1) {
        return this.field3566 != null || this.method1572(arg0, arg1);
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(Lr;Luu;)V")
    private final void method1580(class165 arg0, class259 arg1) {
        class173 var3 = class110.method797((byte) 104, 0, class501.field7003, this.field3563);
        if (var3 == null) {
            return;
        }
        arg0.method251(field3562);
        arg0.method292(0, 0, this.field3564, this.field3564);
        arg0.method248(0, 0, this.field3564, this.field3564, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3553) {
                var4 = -arg1.field3560;
                var5 = -arg1.field3551;
                var6 = -arg1.field3552;
            } else {
                var4 = this.field3560 - arg1.field3560;
                var5 = this.field3551 - arg1.field3551;
                var6 = this.field3552 - arg1.field3552;
            }
        }
        if (this.field3561 != 0) {
            int var7 = -this.field3561 & 0x3FFF;
            int var8 = class395.field5579[var7];
            int var9 = class395.field5582[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field3550 != 0) {
            int var11 = -this.field3550 & 0x3FFF;
            int var12 = class395.field5579[var11];
            int var13 = class395.field5582[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method239(1.0F);
        arg0.method236(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class55 var15 = arg0.method274(var3, 2048, 0, 64, 768);
        int var16 = var15.method115() - var15.method94();
        int var17 = var15.method119() - var15.method65();
        int var18 = var15.method94() + var16 / 2;
        int var19 = var15.method65() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method301(var18, var19, var20, var20);
        arg0.method262(arg0.method305());
        class394 var21 = arg0.method315();
        var21.method712(0, 0, arg0.method260() - var15.method79());
        var15.method122(var21, null, arg0.method260(), 1);
        this.field3566 = arg0.method231(0, 0, this.field3564, this.field3564, true);
        this.field3566.method4(0, 0, 3);
        arg0.method292(field3562[0], field3562[1], field3562[2], field3562[3]);
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "()V")
    public static final void method1581() {
        field3558 = null;
        field3555 = null;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3560 = arg2;
        this.field3551 = arg3;
        this.field3552 = arg4;
        this.field3553 = arg7;
        this.field3563 = arg1;
        this.field3556 = arg6;
        this.field3565 = arg5;
        this.field3549 = arg0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)Z")
    public final boolean method1582(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3553) {
            this.field3557 = 1073741823;
            var8 = this.field3560;
            var9 = this.field3551;
            var10 = this.field3552;
        } else {
            int var5 = this.field3560 - arg0;
            int var6 = this.field3551 - arg1;
            int var7 = this.field3552 - arg2;
            this.field3557 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3557 == 0) {
                this.field3557 = 1;
            }
            var8 = (var5 << 8) / this.field3557;
            var9 = (var6 << 8) / this.field3557;
            var10 = (var7 << 8) / this.field3557;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3559 = this.field3565 * arg3 / (this.field3553 ? 1024 : this.field3557);
        } else {
            this.field3559 = 0;
        }
        if (this.field3559 < 8) {
            this.field3566 = null;
            return false;
        }
        int var12 = class698.method3915(this.field3559, (byte) 93);
        if (var12 > arg3) {
            var12 = class13.method143(arg3, 72);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3564 != var12) {
            this.field3564 = var12;
        }
        this.field3561 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field3550 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field3566 = null;
        return true;
    }
}
