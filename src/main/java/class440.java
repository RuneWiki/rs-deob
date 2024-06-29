import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class440 {

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    private int field6568;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    private int field6569;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    private int field6573;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "Z")
    private boolean field6582;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    private int field6576;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    private int field6581;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    private int field6567;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    private int field6583;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "[I")
    private static int[] field6570 = new int[4];

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    private int field6571;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    private int field6572;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public int field6574;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    private int field6578;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    private int field6579;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "Lc;")
    private static class121 field6575;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Lf;")
    private static class529 field6577;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "Lf;")
    private static class529 field6580;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "Lf;")
    private class529 field6584;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()V", line = 9)
    public static final void method2650() {
        field6575 = null;
        field6577 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lqa;Loo;)V", line = 15)
    private final void method2651(class162 arg0, class440 arg1) {
        class521 var3 = class99.method612(class135.field2068, 0, this.field6576, (byte) 104);
        if (var3 == null) {
            return;
        }
        arg0.method1062(field6570);
        arg0.method1098(0, 0, this.field6578, this.field6578);
        arg0.method1036(0, 0, this.field6578, this.field6578, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field6582) {
                var4 = -arg1.field6568;
                var5 = -arg1.field6569;
                var6 = -arg1.field6573;
            } else {
                var4 = this.field6568 - arg1.field6568;
                var5 = this.field6569 - arg1.field6569;
                var6 = this.field6573 - arg1.field6573;
            }
        }
        if (this.field6579 != 0) {
            int var7 = -this.field6579 & 0x3FFF;
            int var8 = class457.field6760[var7];
            int var9 = class457.field6759[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field6571 != 0) {
            int var11 = -this.field6571 & 0x3FFF;
            int var12 = class457.field6760[var11];
            int var13 = class457.field6759[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1111(1.0F);
        arg0.method1049(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class121 var15 = arg0.method1118(var3, 2048, 0, 64, 768);
        int var16 = var15.method698() - var15.method746();
        int var17 = var15.method743() - var15.method709();
        int var18 = var15.method746() + var16 / 2;
        int var19 = var15.method709() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1050(var18, var19, var20, var20);
        arg0.method1082(arg0.method1126());
        class414 var21 = arg0.method1115();
        var21.method913(0, 0, arg0.method1076() - var15.method717());
        var15.method691(var21, null, arg0.method1076(), 1);
        this.field6584 = arg0.method1067(0, 0, this.field6578, this.field6578, true);
        this.field6584.method99(0, 0, 3);
        arg0.method1098(field6570[0], field6570[1], field6570[2], field6570[3]);
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "()V", line = 98)
    public static void method2652() {
        field6575 = null;
        field6580 = null;
        field6577 = null;
        field6570 = null;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Lqa;Loo;)Z", line = 107)
    private final boolean method2653(class162 arg0, class440 arg1) {
        if (this.field6584 == null) {
            if (this.field6583 == 0) {
                if (class266.field3894.method839(this.field6576, (byte) 67)) {
                    int[] var3 = class266.field3894.method836(false, this.field6578, this.field6578, 123, this.field6576, 0.7F);
                    this.field6584 = arg0.method1078(var3, 0, this.field6578, this.field6578, this.field6578);
                }
            } else if (this.field6583 == 2) {
                this.method2651(arg0, arg1);
            } else if (this.field6583 == 1) {
                this.method2659(arg0, arg1);
            }
        }
        return this.field6584 != null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lqa;)V", line = 142)
    private static final void method2654(class162 arg0) {
        if (field6577 != null) {
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
        field6577 = arg0.method1078(var2, 0, 128, 128, 128);
        field6580 = arg0.method1078(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "()V", line = 202)
    public final void method2655() {
        this.field6584 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lqa;IIIIII)V", line = 208)
    public final void method2656(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6584 == null) {
            return;
        }
        int var8 = this.field6579 - arg5 & 0x3FFF;
        int var9 = this.field6571 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field6572) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field6572) / 2;
        if (var10 < arg4 && this.field6572 + var10 > 0 && var11 < arg3 && this.field6572 + var11 > 0) {
            this.field6584.method3123(arg1 + var11, arg2 + var10, this.field6572, this.field6572);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Lqa;)V", line = 236)
    private static final void method2657(class162 arg0) {
        if (field6575 != null) {
            return;
        }
        class521 var1 = new class521(580, 1104, 1);
        var1.method3084(0, (short) 0, (short) 1024, (short) 1024, (byte) 0, (short) 32767, (short) 1024, (byte) 0, (short) 0, (byte) 0);
        var1.method3090(0, 128, 0, -1);
        var1.method3090(0, -128, 0, -1);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class457.field6760[var3];
            int var5 = class457.field6759[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class457.field6759[var12] >> 8;
                int var14 = class457.field6760[var12] * var4 >> 23;
                int var15 = class457.field6760[var12] * var5 >> 23;
                var1.method3090(-var14, var13, var15, -1);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3078((byte) 0, var7, (short) 0, (byte) 0, 0, var8, (byte) 0, -256, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3078((byte) 0, var7, (short) 0, (byte) 0, var8, var10, (byte) 0, -256, (short) 127);
                    var1.method3078((byte) 0, var7, (short) 0, (byte) 0, var10, var11, (byte) 0, -256, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3078((byte) 0, 1, (short) 0, (byte) 0, var7, var8, (byte) 0, -256, (short) 127);
            }
        }
        var1.field7695 = var1.field7689;
        var1.field7682 = null;
        var1.field7667 = null;
        var1.field7690 = null;
        field6575 = arg0.method1118(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIII)Z", line = 320)
    public final boolean method2658(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field6582) {
            this.field6574 = 1073741823;
            var8 = this.field6568;
            var9 = this.field6569;
            var10 = this.field6573;
        } else {
            int var5 = this.field6568 - arg0;
            int var6 = this.field6569 - arg1;
            int var7 = this.field6573 - arg2;
            this.field6574 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field6574 == 0) {
                this.field6574 = 1;
            }
            var8 = (var5 << 8) / this.field6574;
            var9 = (var6 << 8) / this.field6574;
            var10 = (var7 << 8) / this.field6574;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field6572 = this.field6567 * arg3 / (this.field6582 ? 1024 : this.field6574);
        } else {
            this.field6572 = 0;
        }
        if (this.field6572 < 8) {
            this.field6584 = null;
            return false;
        }
        int var12 = class476.method2841(this.field6572, true);
        if (var12 > arg3) {
            var12 = class293.method1867(arg3, -210300991);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field6578 != var12) {
            this.field6578 = var12;
        }
        this.field6579 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field6571 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field6584 = null;
        return true;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(Lqa;Loo;)V", line = 376)
    private final void method2659(class162 arg0, class440 arg1) {
        method2657(arg0);
        method2654(arg0);
        arg0.method1062(field6570);
        arg0.method1098(0, 0, this.field6578, this.field6578);
        arg0.method1089();
        arg0.method1036(0, 0, this.field6578, this.field6578, this.field6581 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field6582) {
                var3 = -arg1.field6568;
                var4 = -arg1.field6569;
                var5 = -arg1.field6573;
            } else {
                var3 = arg1.field6568 - this.field6568;
                var4 = arg1.field6569 - this.field6569;
                var5 = arg1.field6573 - this.field6573;
            }
        }
        if (this.field6579 != 0) {
            int var6 = class457.field6760[this.field6579];
            int var7 = class457.field6759[this.field6579];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field6571 != 0) {
            int var9 = class457.field6760[this.field6571];
            int var10 = class457.field6759[this.field6571];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class121 var12 = field6575.method723((byte) 0, 51200, true);
        if (arg0.method1037()) {
            var12.method744((short) 0, (short) this.field6576);
        } else {
            var12.method713((short) 127, class266.field3894.method838(true, this.field6576).field4602);
            var12.method744((short) 0, (short) -1);
        }
        arg0.method1111(1.0F);
        arg0.method1049(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field6578 * 1024 / (var12.method698() - var12.method746());
        if (this.field6581 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1050(this.field6578 / 2, this.field6578 / 2, var13, var13);
        arg0.method1082(arg0.method1126());
        class414 var14 = arg0.method1126();
        var14.method913(0, 0, arg0.method1076() - var12.method717());
        var12.method691(var14, null, 1024, 1);
        int var15 = this.field6578 * 13 / 16;
        int var16 = (this.field6578 - var15) / 2;
        field6580.method106(var16, var16, var15, var15, 0, this.field6581 | 0xFF000000, 1);
        this.field6584 = arg0.method1067(0, 0, this.field6578, this.field6578, true);
        arg0.method1089();
        arg0.method1036(0, 0, this.field6578, this.field6578, 0, 0);
        field6577.method106(0, 0, this.field6578, this.field6578, 1, 0, 0);
        this.field6584.method99(0, 0, 0);
        arg0.method1098(field6570[0], field6570[1], field6570[2], field6570[3]);
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(Lqa;Loo;)Z", line = 467)
    public final boolean method2660(class162 arg0, class440 arg1) {
        return this.field6584 != null || this.method2653(arg0, arg1);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 477)
    public class440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field6568 = arg2;
        this.field6569 = arg3;
        this.field6573 = arg4;
        this.field6582 = arg7;
        this.field6576 = arg1;
        this.field6581 = arg6;
        this.field6567 = arg5;
        this.field6583 = arg0;
    }
}
