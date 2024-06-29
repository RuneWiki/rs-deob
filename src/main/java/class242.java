import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class242 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    private int field3258;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    private int field3264;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Z")
    private boolean field3262;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    private int field3248;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
    private static int[] field3251 = new int[4];

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    private int field3257;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lvr;")
    private class147 field3254;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lvr;")
    private static class147 field3255;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lvr;")
    private static class147 field3261;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Lka;")
    private static class500 field3263;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lha;Lui;)Z", line = 4)
    private final boolean method1558(class65 arg0, class242 arg1) {
        if (this.field3254 == null) {
            if (this.field3247 == 0) {
                if (class293.field4280.method1173(true, this.field3256)) {
                    int[] var3 = class293.field4280.method1178(this.field3257, this.field3256, -115, 0.7F, this.field3257, false);
                    this.field3254 = arg0.method499(this.field3257, var3, true, 0, this.field3257, this.field3257);
                }
            } else if (this.field3247 == 2) {
                this.method1561(arg0, arg1);
            } else if (this.field3247 == 1) {
                this.method1565(arg0, arg1);
            }
        }
        return this.field3254 != null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)Z", line = 43)
    public final boolean method1559(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3262) {
            this.field3250 = 1073741823;
            var8 = this.field3253;
            var9 = this.field3258;
            var10 = this.field3264;
        } else {
            int var5 = this.field3253 - arg0;
            int var6 = this.field3258 - arg1;
            int var7 = this.field3264 - arg2;
            this.field3250 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3250 == 0) {
                this.field3250 = 1;
            }
            var8 = (var5 << 8) / this.field3250;
            var9 = (var6 << 8) / this.field3250;
            var10 = (var7 << 8) / this.field3250;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3249 = this.field3248 * arg3 / (this.field3262 ? 1024 : this.field3250);
        } else {
            this.field3249 = 0;
        }
        if (this.field3249 < 8) {
            this.field3254 = null;
            return false;
        }
        int var12 = class719.method4014(this.field3249, (byte) -100);
        if (var12 > arg3) {
            var12 = class37.method261(arg3, false);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3257 != var12) {
            this.field3257 = var12;
        }
        this.field3260 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field3259 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field3254 = null;
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lha;IIIIII)V", line = 100)
    public final void method1560(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3254 == null) {
            return;
        }
        int var8 = this.field3260 - arg5 & 0x3FFF;
        int var9 = this.field3259 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3249) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3249) / 2;
        if (var10 < arg4 && this.field3249 + var10 > 0 && var11 < arg3 && this.field3249 + var11 > 0) {
            this.field3254.method1101(arg1 + var11, arg2 + var10, this.field3249, this.field3249);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lha;Lui;)V", line = 128)
    private final void method1561(class65 arg0, class242 arg1) {
        class782 var3 = class558.method3142(2085750768, class398.field5836, this.field3256, 0);
        if (var3 == null) {
            return;
        }
        arg0.method494(field3251);
        arg0.method456(0, 0, this.field3257, this.field3257);
        arg0.method563(0, 0, this.field3257, this.field3257, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3262) {
                var4 = -arg1.field3253;
                var5 = -arg1.field3258;
                var6 = -arg1.field3264;
            } else {
                var4 = this.field3253 - arg1.field3253;
                var5 = this.field3258 - arg1.field3258;
                var6 = this.field3264 - arg1.field3264;
            }
        }
        if (this.field3260 != 0) {
            int var7 = -this.field3260 & 0x3FFF;
            int var8 = class749.field10324[var7];
            int var9 = class749.field10316[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field3259 != 0) {
            int var11 = -this.field3259 & 0x3FFF;
            int var12 = class749.field10324[var11];
            int var13 = class749.field10316[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method452(1.0F);
        arg0.method533(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class500 var15 = arg0.method510(var3, 2048, 0, 64, 768);
        int var16 = var15.method316() - var15.method327();
        int var17 = var15.method338() - var15.method335();
        int var18 = var15.method327() + var16 / 2;
        int var19 = var15.method335() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method540(var18, var19, var20, var20);
        arg0.method526(arg0.method472());
        class303 var21 = arg0.method450();
        var21.method981(0, 0, arg0.method539() - var15.method294());
        var15.method300(var21, null, arg0.method539(), 1);
        this.field3254 = arg0.method562(0, 0, this.field3257, this.field3257, true);
        this.field3254.method1081(0, 0, 3);
        arg0.method456(field3251[0], field3251[1], field3251[2], field3251[3]);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V", line = 215)
    public static void method1562() {
        field3263 = null;
        field3261 = null;
        field3255 = null;
        field3251 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lha;)V", line = 224)
    private static final void method1563(class65 arg0) {
        if (field3263 != null) {
            return;
        }
        class782 var1 = new class782(580, 1104, 1);
        var1.method4326((short) 1024, (byte) 0, (byte) 88, (short) 0, (short) 0, (byte) 0, (byte) 0, (short) 1024, (short) 32767, (short) 1024);
        var1.method4334(128, 0, 0, (byte) 101);
        var1.method4334(-128, 0, 0, (byte) 101);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class749.field10324[var3];
            int var5 = class749.field10316[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class749.field10316[var12] >> 7;
                int var14 = class749.field10324[var12] * var4 >> 21;
                int var15 = class749.field10324[var12] * var5 >> 21;
                var1.method4334(var13, var15, -var14, (byte) 101);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method4329(0, (byte) 0, var8, (short) 127, var7, (byte) 0, (short) 0, 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method4329(0, (byte) 0, var10, (short) 127, var7, (byte) 0, (short) 0, var8, (byte) 0);
                    var1.method4329(0, (byte) 0, var11, (short) 127, var7, (byte) 0, (short) 0, var10, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method4329(0, (byte) 0, var8, (short) 127, 1, (byte) 0, (short) 0, var7, (byte) 0);
            }
        }
        var1.field10756 = var1.field10746;
        var1.field10770 = null;
        var1.field10755 = null;
        var1.field10742 = null;
        field3263 = arg0.method510(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lha;)V", line = 303)
    private static final void method1564(class65 arg0) {
        if (field3255 != null) {
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
        field3255 = arg0.method499(128, var2, true, 0, 128, 128);
        field3261 = arg0.method499(128, var1, true, 0, 128, 128);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(Lha;Lui;)V", line = 372)
    private final void method1565(class65 arg0, class242 arg1) {
        method1563(arg0);
        method1564(arg0);
        arg0.method494(field3251);
        arg0.method456(0, 0, this.field3257, this.field3257);
        arg0.method483();
        arg0.method563(0, 0, this.field3257, this.field3257, this.field3252 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3262) {
                var3 = -arg1.field3253;
                var4 = -arg1.field3258;
                var5 = -arg1.field3264;
            } else {
                var3 = arg1.field3253 - this.field3253;
                var4 = arg1.field3258 - this.field3258;
                var5 = arg1.field3264 - this.field3264;
            }
        }
        if (this.field3260 != 0) {
            int var6 = class749.field10324[this.field3260];
            int var7 = class749.field10316[this.field3260];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field3259 != 0) {
            int var9 = class749.field10324[this.field3259];
            int var10 = class749.field10316[this.field3259];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class500 var12 = field3263.method298((byte) 0, 51200, true);
        var12.method299((short) 0, (short) this.field3256);
        arg0.method452(1.0F);
        arg0.method533(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3257 * 1024 / (var12.method316() - var12.method327());
        if (this.field3252 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method540(this.field3257 / 2, this.field3257 / 2, var13, var13);
        arg0.method526(arg0.method472());
        class303 var14 = arg0.method472();
        var14.method981(0, 0, arg0.method539() - var12.method294());
        var12.method300(var14, null, 1024, 1);
        int var15 = this.field3257 * 13 / 16;
        int var16 = (this.field3257 - var15) / 2;
        field3261.method1104(var16, var16, var15, var15, 0, this.field3252 | 0xFF000000, 1);
        this.field3254 = arg0.method562(0, 0, this.field3257, this.field3257, true);
        arg0.method483();
        arg0.method563(0, 0, this.field3257, this.field3257, 0, 0);
        field3255.method1104(0, 0, this.field3257, this.field3257, 1, 0, 0);
        this.field3254.method1081(0, 0, 0);
        arg0.method456(field3251[0], field3251[1], field3251[2], field3251[3]);
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(Lha;Lui;)Z", line = 455)
    public final boolean method1566(class65 arg0, class242 arg1) {
        return this.field3254 != null || this.method1558(arg0, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()V", line = 458)
    public static final void method1567() {
        field3263 = null;
        field3255 = null;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "()V", line = 462)
    public final void method1568() {
        this.field3254 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 472)
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3253 = arg2;
        this.field3258 = arg3;
        this.field3264 = arg4;
        this.field3262 = arg7;
        this.field3256 = arg1;
        this.field3252 = arg6;
        this.field3248 = arg5;
        this.field3247 = arg0;
    }
}
