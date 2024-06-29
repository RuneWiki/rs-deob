import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class540 {

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    private int field7724;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    private int field7717;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int field7721;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
    private boolean field7718;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    private int field7710;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    private int field7719;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    private int field7707;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    private int field7711;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
    private static int[] field7720 = new int[4];

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public int field7713;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    private int field7714;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    private int field7715;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    private int field7716;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    private int field7722;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lka;")
    private static class473 field7709;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lpga;")
    private static class536 field7708;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lpga;")
    private class536 field7712;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lpga;")
    private static class536 field7723;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V", line = 5)
    public static void method3161() {
        field7709 = null;
        field7723 = null;
        field7708 = null;
        field7720 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lha;)V", line = 14)
    private static final void method3162(class60 arg0) {
        if (field7708 != null) {
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
        field7708 = arg0.method531(128, 128, var2, 128, 0, (byte) -101);
        field7723 = arg0.method531(128, 128, var1, 128, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)Z", line = 83)
    public final boolean method3163(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field7718) {
            this.field7713 = 1073741823;
            var8 = this.field7724;
            var9 = this.field7717;
            var10 = this.field7721;
        } else {
            int var5 = this.field7724 - arg0;
            int var6 = this.field7717 - arg1;
            int var7 = this.field7721 - arg2;
            this.field7713 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field7713 == 0) {
                this.field7713 = 1;
            }
            var8 = (var5 << 8) / this.field7713;
            var9 = (var6 << 8) / this.field7713;
            var10 = (var7 << 8) / this.field7713;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field7722 = this.field7707 * arg3 / (this.field7718 ? 1024 : this.field7713);
        } else {
            this.field7722 = 0;
        }
        if (this.field7722 < 8) {
            this.field7712 = null;
            return false;
        }
        int var12 = class432.method2684(this.field7722, -21774);
        if (var12 > arg3) {
            var12 = class505.method2996(arg3, 29);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field7715 != var12) {
            this.field7715 = var12;
        }
        this.field7714 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field7716 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field7712 = null;
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lha;Lrc;)V", line = 141)
    private final void method3164(class60 arg0, class540 arg1) {
        class322 var3 = class342.method2175(class604.field8545, 0, this.field7710, (byte) -126);
        if (var3 == null) {
            return;
        }
        arg0.method530(field7720);
        arg0.method476(0, 0, this.field7715, this.field7715);
        arg0.method516(0, 0, this.field7715, this.field7715, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field7718) {
                var4 = -arg1.field7724;
                var5 = -arg1.field7717;
                var6 = -arg1.field7721;
            } else {
                var4 = this.field7724 - arg1.field7724;
                var5 = this.field7717 - arg1.field7717;
                var6 = this.field7721 - arg1.field7721;
            }
        }
        if (this.field7714 != 0) {
            int var7 = -this.field7714 & 0x3FFF;
            int var8 = class373.field5548[var7];
            int var9 = class373.field5549[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field7716 != 0) {
            int var11 = -this.field7716 & 0x3FFF;
            int var12 = class373.field5548[var11];
            int var13 = class373.field5549[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method484(1.0F);
        arg0.method460(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class473 var15 = arg0.method418(var3, 2048, 0, 64, 768);
        int var16 = var15.method239() - var15.method258();
        int var17 = var15.method236() - var15.method253();
        int var18 = var15.method258() + var16 / 2;
        int var19 = var15.method253() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method500(var18, var19, var20, var20);
        arg0.method534(arg0.method515());
        class738 var21 = arg0.method442();
        var21.method774(0, 0, arg0.method457() - var15.method246());
        var15.method235(var21, null, arg0.method457(), 1);
        this.field7712 = arg0.method470(0, 0, this.field7715, this.field7715, true);
        this.field7712.method130(0, 0, 3);
        arg0.method476(field7720[0], field7720[1], field7720[2], field7720[3]);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lha;Lrc;)V", line = 226)
    private final void method3165(class60 arg0, class540 arg1) {
        method3167(arg0);
        method3162(arg0);
        arg0.method530(field7720);
        arg0.method476(0, 0, this.field7715, this.field7715);
        arg0.method444();
        arg0.method516(0, 0, this.field7715, this.field7715, this.field7719 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field7718) {
                var3 = -arg1.field7724;
                var4 = -arg1.field7717;
                var5 = -arg1.field7721;
            } else {
                var3 = arg1.field7724 - this.field7724;
                var4 = arg1.field7717 - this.field7717;
                var5 = arg1.field7721 - this.field7721;
            }
        }
        if (this.field7714 != 0) {
            int var6 = class373.field5548[this.field7714];
            int var7 = class373.field5549[this.field7714];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field7716 != 0) {
            int var9 = class373.field5548[this.field7716];
            int var10 = class373.field5549[this.field7716];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class473 var12 = field7709.method251((byte) 0, 51200, true);
        var12.method254((short) 0, (short) this.field7710);
        arg0.method484(1.0F);
        arg0.method460(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field7715 * 1024 / (var12.method239() - var12.method258());
        if (this.field7719 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method500(this.field7715 / 2, this.field7715 / 2, var13, var13);
        arg0.method534(arg0.method515());
        class738 var14 = arg0.method515();
        var14.method774(0, 0, arg0.method457() - var12.method246());
        var12.method235(var14, null, 1024, 1);
        int var15 = this.field7715 * 13 / 16;
        int var16 = (this.field7715 - var15) / 2;
        field7723.method3144(var16, var16, var15, var15, 0, this.field7719 | 0xFF000000, 1);
        this.field7712 = arg0.method470(0, 0, this.field7715, this.field7715, true);
        arg0.method444();
        arg0.method516(0, 0, this.field7715, this.field7715, 0, 0);
        field7708.method3144(0, 0, this.field7715, this.field7715, 1, 0, 0);
        this.field7712.method130(0, 0, 0);
        arg0.method476(field7720[0], field7720[1], field7720[2], field7720[3]);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lha;IIIIII)V", line = 313)
    public final void method3166(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field7712 == null) {
            return;
        }
        int var8 = this.field7714 - arg5 & 0x3FFF;
        int var9 = this.field7716 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field7722) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field7722) / 2;
        if (var10 < arg4 && this.field7722 + var10 > 0 && var11 < arg3 && this.field7722 + var11 > 0) {
            this.field7712.method3149(arg1 + var11, arg2 + var10, this.field7722, this.field7722);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lha;)V", line = 338)
    private static final void method3167(class60 arg0) {
        if (field7709 != null) {
            return;
        }
        class322 var1 = new class322(580, 1104, 1);
        var1.method2037((short) 1024, (short) 1024, (short) 0, (short) 1024, (byte) 0, (byte) 0, (short) 32767, (byte) 0, (short) 0, -2);
        var1.method2052(128, 0, (byte) 44, 0);
        var1.method2052(-128, 0, (byte) 43, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class373.field5548[var3];
            int var5 = class373.field5549[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class373.field5549[var12] >> 7;
                int var14 = class373.field5548[var12] * var4 >> 21;
                int var15 = class373.field5548[var12] * var5 >> 21;
                var1.method2052(var13, -var14, (byte) 74, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2051(var7, (byte) 0, (byte) 0, (short) 127, 0, (byte) 0, var8, 0, (short) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2051(var7, (byte) 0, (byte) 0, (short) 127, 0, (byte) 0, var10, var8, (short) 0);
                    var1.method2051(var7, (byte) 0, (byte) 0, (short) 127, 0, (byte) 0, var11, var10, (short) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2051(1, (byte) 0, (byte) 0, (short) 127, 0, (byte) 0, var8, var7, (short) 0);
            }
        }
        var1.field4568 = var1.field4590;
        var1.field4583 = null;
        var1.field4585 = null;
        var1.field4591 = null;
        field7709 = arg0.method418(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()V", line = 423)
    public static final void method3168() {
        field7709 = null;
        field7708 = null;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lha;Lrc;)Z", line = 427)
    public final boolean method3169(class60 arg0, class540 arg1) {
        return this.field7712 != null || this.method3170(arg0, arg1);
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(Lha;Lrc;)Z", line = 431)
    private final boolean method3170(class60 arg0, class540 arg1) {
        if (this.field7712 == null) {
            if (this.field7711 == 0) {
                if (class728.field10181.method1121(-30695, this.field7710)) {
                    int[] var3 = class728.field10181.method1126(false, this.field7710, (byte) 79, 0.7F, this.field7715, this.field7715);
                    this.field7712 = arg0.method531(this.field7715, this.field7715, var3, this.field7715, 0, (byte) -101);
                }
            } else if (this.field7711 == 2) {
                this.method3164(arg0, arg1);
            } else if (this.field7711 == 1) {
                this.method3165(arg0, arg1);
            }
        }
        return this.field7712 != null;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()V", line = 468)
    public final void method3171() {
        this.field7712 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 471)
    public class540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field7724 = arg2;
        this.field7717 = arg3;
        this.field7721 = arg4;
        this.field7718 = arg7;
        this.field7710 = arg1;
        this.field7719 = arg6;
        this.field7707 = arg5;
        this.field7711 = arg0;
    }
}
