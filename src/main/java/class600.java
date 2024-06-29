import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class600 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private int field8545;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    private int field8559;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    private int field8550;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Z")
    private boolean field8547;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private int field8546;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private int field8558;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    private int field8552;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    private int field8556;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[I")
    private static int[] field8554 = new int[4];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field8543;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    private int field8549;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    private int field8551;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    private int field8553;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    private int field8560;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lda;")
    private static class55 field8555;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lf;")
    private class702 field8544;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lf;")
    private static class702 field8548;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Lf;")
    private static class702 field8557;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
    public static final void method3500() {
        field8555 = null;
        field8548 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lr;Llc;)V")
    private final void method3501(class167 arg0, class600 arg1) {
        class534 var3 = class243.method1736(this.field8546, 0, 6392, class412.field6326);
        if (var3 == null) {
            return;
        }
        arg0.method343(field8554);
        arg0.method352(0, 0, this.field8549, this.field8549);
        arg0.method335(0, 0, this.field8549, this.field8549, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field8547) {
                var4 = -arg1.field8545;
                var5 = -arg1.field8559;
                var6 = -arg1.field8550;
            } else {
                var4 = this.field8545 - arg1.field8545;
                var5 = this.field8559 - arg1.field8559;
                var6 = this.field8550 - arg1.field8550;
            }
        }
        if (this.field8553 != 0) {
            int var7 = -this.field8553 & 0x3FFF;
            int var8 = class567.field8139[var7];
            int var9 = class567.field8138[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field8560 != 0) {
            int var11 = -this.field8560 & 0x3FFF;
            int var12 = class567.field8139[var11];
            int var13 = class567.field8138[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method342(1.0F);
        arg0.method296(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class55 var15 = arg0.method287(var3, 2048, 0, 64, 768);
        int var16 = var15.method622() - var15.method645();
        int var17 = var15.method604() - var15.method623();
        int var18 = var15.method645() + var16 / 2;
        int var19 = var15.method623() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method318(var18, var19, var20, var20);
        arg0.method346(arg0.method272());
        class393 var21 = arg0.method339();
        var21.method503(0, 0, arg0.method322() - var15.method611());
        var15.method613(var21, null, arg0.method322(), 1);
        this.field8544 = arg0.method282(0, 0, this.field8549, this.field8549, true);
        this.field8544.method1077(0, 0, 3);
        arg0.method352(field8554[0], field8554[1], field8554[2], field8554[3]);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)Z")
    public final boolean method3502(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field8547) {
            this.field8543 = 1073741823;
            var8 = this.field8545;
            var9 = this.field8559;
            var10 = this.field8550;
        } else {
            int var5 = this.field8545 - arg0;
            int var6 = this.field8559 - arg1;
            int var7 = this.field8550 - arg2;
            this.field8543 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field8543 == 0) {
                this.field8543 = 1;
            }
            var8 = (var5 << 8) / this.field8543;
            var9 = (var6 << 8) / this.field8543;
            var10 = (var7 << 8) / this.field8543;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field8551 = this.field8552 * arg3 / (this.field8547 ? 1024 : this.field8543);
        } else {
            this.field8551 = 0;
        }
        if (this.field8551 < 8) {
            this.field8544 = null;
            return false;
        }
        int var12 = class413.method2636(this.field8551, 127);
        if (var12 > arg3) {
            var12 = class638.method3708(false, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field8549 != var12) {
            this.field8549 = var12;
        }
        this.field8553 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field8560 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field8544 = null;
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lr;Llc;)V")
    private final void method3503(class167 arg0, class600 arg1) {
        method3506(arg0);
        method3507(arg0);
        arg0.method343(field8554);
        arg0.method352(0, 0, this.field8549, this.field8549);
        arg0.method136();
        arg0.method335(0, 0, this.field8549, this.field8549, this.field8558 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field8547) {
                var3 = -arg1.field8545;
                var4 = -arg1.field8559;
                var5 = -arg1.field8550;
            } else {
                var3 = arg1.field8545 - this.field8545;
                var4 = arg1.field8559 - this.field8559;
                var5 = arg1.field8550 - this.field8550;
            }
        }
        if (this.field8553 != 0) {
            int var6 = class567.field8139[this.field8553];
            int var7 = class567.field8138[this.field8553];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field8560 != 0) {
            int var9 = class567.field8139[this.field8560];
            int var10 = class567.field8138[this.field8560];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class55 var12 = field8555.method609((byte) 0, 51200, true);
        if (arg0.method305()) {
            var12.method602((short) 0, (short) this.field8546);
        } else {
            var12.method608((short) 127, class27.field425.method1610(18904, this.field8546).field4120);
            var12.method602((short) 0, (short) -1);
        }
        arg0.method342(1.0F);
        arg0.method296(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field8549 * 1024 / (var12.method622() - var12.method645());
        if (this.field8558 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method318(this.field8549 / 2, this.field8549 / 2, var13, var13);
        arg0.method346(arg0.method272());
        class393 var14 = arg0.method272();
        var14.method503(0, 0, arg0.method322() - var12.method611());
        var12.method613(var14, null, 1024, 1);
        int var15 = this.field8549 * 13 / 16;
        int var16 = (this.field8549 - var15) / 2;
        field8557.method3954(var16, var16, var15, var15, 0, this.field8558 | 0xFF000000, 1);
        this.field8544 = arg0.method282(0, 0, this.field8549, this.field8549, true);
        arg0.method136();
        arg0.method335(0, 0, this.field8549, this.field8549, 0, 0);
        field8548.method3954(0, 0, this.field8549, this.field8549, 1, 0, 0);
        this.field8544.method1077(0, 0, 0);
        arg0.method352(field8554[0], field8554[1], field8554[2], field8554[3]);
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(Lr;Llc;)Z")
    public final boolean method3504(class167 arg0, class600 arg1) {
        return this.field8544 != null || this.method3510(arg0, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V")
    public final void method3505() {
        this.field8544 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lr;)V")
    private static final void method3506(class167 arg0) {
        if (field8555 != null) {
            return;
        }
        class534 var1 = new class534(580, 1104, 1);
        var1.method3233((short) 1024, (short) 0, (byte) 0, (byte) 0, (short) 1024, (short) 1024, (byte) 0, (byte) -40, (short) 0, (short) 32767);
        var1.method3231(0, -116, 128, 0);
        var1.method3231(0, -88, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class567.field8139[var3];
            int var5 = class567.field8138[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class567.field8138[var12] >> 7;
                int var14 = class567.field8139[var12] * var4 >> 21;
                int var15 = class567.field8139[var12] * var5 >> 21;
                var1.method3231(var15, -103, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3236((byte) 0, (short) 0, (byte) 0, (short) 127, var8, 0, (byte) 0, 12712, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3236((byte) 0, (short) 0, (byte) 0, (short) 127, var10, var8, (byte) 0, 12712, var7);
                    var1.method3236((byte) 0, (short) 0, (byte) 0, (short) 127, var11, var10, (byte) 0, 12712, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3236((byte) 0, (short) 0, (byte) 0, (short) 127, var8, var7, (byte) 0, 12712, 1);
            }
        }
        var1.field7800 = var1.field7781;
        var1.field7816 = null;
        var1.field7822 = null;
        var1.field7791 = null;
        field8555 = arg0.method287(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lr;)V")
    private static final void method3507(class167 arg0) {
        if (field8548 != null) {
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
        field8548 = arg0.method306(var2, 0, 128, 128, 128);
        field8557 = arg0.method306(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lr;IIIIII)V")
    public final void method3508(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8544 == null) {
            return;
        }
        int var8 = this.field8553 - arg5 & 0x3FFF;
        int var9 = this.field8560 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field8551) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field8551) / 2;
        if (var10 < arg4 && this.field8551 + var10 > 0 && var11 < arg3 && this.field8551 + var11 > 0) {
            this.field8544.method3958(arg1 + var11, arg2 + var10, this.field8551, this.field8551);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()V")
    public static void method3509() {
        field8555 = null;
        field8557 = null;
        field8548 = null;
        field8554 = null;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(Lr;Llc;)Z")
    private final boolean method3510(class167 arg0, class600 arg1) {
        if (this.field8544 == null) {
            if (this.field8556 == 0) {
                if (class27.field425.method1608(-20340, this.field8546)) {
                    int[] var3 = class27.field425.method1609(0.7F, false, this.field8546, (byte) -109, this.field8549, this.field8549);
                    this.field8544 = arg0.method306(var3, 0, this.field8549, this.field8549, this.field8549);
                }
            } else if (this.field8556 == 2) {
                this.method3501(arg0, arg1);
            } else if (this.field8556 == 1) {
                this.method3503(arg0, arg1);
            }
        }
        return this.field8544 != null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field8545 = arg2;
        this.field8559 = arg3;
        this.field8550 = arg4;
        this.field8547 = arg7;
        this.field8546 = arg1;
        this.field8558 = arg6;
        this.field8552 = arg5;
        this.field8556 = arg0;
    }
}
