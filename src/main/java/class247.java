import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class247 extends class198 {

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Z")
    public boolean field3240 = false;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    private int field3256 = 0;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "Z")
    private boolean field3269 = false;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "J")
    private long field3238;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "Lsu;")
    public class142 field3259;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "Ldl;")
    public class46 field3270;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "Lew;")
    public class342 field3266;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Lwc;")
    public class49 field3262;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    private int field3244;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    private int field3248;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    private int field3254;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    private int field3257;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    private int field3264;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    private int field3267;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    private int field3268;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    private int field3271;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public final void method1527(byte arg0) {
        this.field3255 = this.field3259.field1891;
        this.field3268 = this.field3259.field1876;
        this.field3267 = this.field3259.field1878;
        this.field3245 = this.field3259.field1886;
        field3260++;
        this.field3251 = this.field3259.field1884;
        this.field3271 = this.field3259.field1877;
        this.field3241 = this.field3259.field1894;
        this.field3250 = this.field3259.field1881;
        this.field3248 = this.field3259.field1874;
        if (this.field3268 == this.field3267 && this.field3268 == this.field3241 && this.field3255 == this.field3245 && this.field3255 == this.field3250 && this.field3271 == this.field3248 && this.field3271 == this.field3251) {
            this.field3269 = true;
            return;
        }
        this.field3269 = false;
        if (arg0 != 86) {
            this.method1528(false, 47L);
        }
        int var2 = (this.field3268 + this.field3241 + this.field3267) / 3;
        int var3 = (this.field3255 + this.field3245 + this.field3250) / 3;
        int var4 = (this.field3271 + this.field3248 + this.field3251) / 3;
        if (this.field3252 == var2 && this.field3249 == var3 && this.field3239 == var4) {
            return;
        }
        this.field3249 = var3;
        this.field3239 = var4;
        this.field3252 = var2;
        int var5 = this.field3268 - this.field3267;
        int var6 = this.field3255 - this.field3245;
        int var7 = this.field3271 - this.field3248;
        int var8 = this.field3241 - this.field3267;
        int var9 = this.field3250 - this.field3245;
        int var10 = this.field3251 - this.field3248;
        this.field3246 = var5 * var9 - var6 * var8;
        this.field3254 = var7 * var8 - (var5 * var10);
        this.field3257 = var6 * var10 - (var7 * var9);
        while (this.field3257 > 32767 || this.field3254 > 32767 || this.field3246 > 32767 || this.field3257 < -32767 || this.field3254 < -32767 || this.field3246 < -32767) {
            this.field3254 >>= 0x1;
            this.field3257 >>= 0x1;
            this.field3246 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field3254 * this.field3254 + this.field3257 * this.field3257 + this.field3246 * this.field3246));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field3254 = this.field3254 * 32767 / var11;
        this.field3257 = this.field3257 * 32767 / var11;
        this.field3246 = this.field3246 * 32767 / var11;
        if (this.field3266.field4582 <= 0 && this.field3266.field4553 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field3246, (double) this.field3257) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field3254, Math.sqrt((double) (this.field3257 * this.field3257 + (this.field3246 * this.field3246)))) * 2607.5945876176133D);
        this.field3244 = this.field3266.field4582 - this.field3266.field4557;
        this.field3247 = this.field3266.field4557 + var12 - (this.field3244 >> 1);
        this.field3264 = this.field3266.field4553 - this.field3266.field4538;
        this.field3265 = this.field3266.field4538 + var13 - (this.field3264 >> 1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZJ)V")
    public final void method1528(boolean arg0, long arg1) {
        field3263++;
        if (arg0) {
            for (class311 var4 = (class311) this.field3262.method290(-1); var4 != null; var4 = (class311) this.field3262.method284(10748)) {
                var4.method1853(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public static final void method1529(boolean arg0) {
        class474.field7027.method293((byte) -126);
        field3242++;
        if (!arg0) {
            method1529(false);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(JIILza;Z)V")
    public final void method1530(long arg0, int arg1, int arg2, class287 arg3, boolean arg4) {
        field3261++;
        if (this.field3240) {
            arg4 = false;
        } else if (class314.field4180 < this.field3266.field4541) {
            arg4 = false;
        } else if (class136.field1817[class314.field4180] < class290.field3825) {
            arg4 = false;
        } else if (this.field3269) {
            arg4 = false;
        } else if (this.field3266.field4550 != -1) {
            int var7 = (int) (arg0 - this.field3238);
            if (this.field3266.field4560 || this.field3266.field4550 >= var7) {
                var7 %= this.field3266.field4550;
            } else {
                arg4 = false;
            }
            if (!this.field3266.field4555 && this.field3266.field4584 > var7) {
                arg4 = false;
            }
            if (this.field3266.field4555 && this.field3266.field4584 <= var7) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field3256 += (int) ((double) arg1 * ((double) (this.field3266.field4552 - this.field3266.field4543) * Math.random() + (double) this.field3266.field4543));
            if (this.field3256 > 63) {
                int var8 = this.field3256 >> 6;
                this.field3256 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3266.field4582 <= 0 && this.field3266.field4553 <= 0) {
                        var10 = this.field3254;
                        var11 = this.field3257;
                        var12 = this.field3246;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field3244) + this.field3247;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class456.field6812[var14];
                        int var16 = class456.field6811[var14];
                        int var17 = (int) ((double) this.field3264 * Math.random()) + this.field3265;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class456.field6812[var18];
                        int var20 = class456.field6811[var18];
                        byte var21 = 15;
                        var10 = (var20 << 0) * -1;
                        var11 = var16 * var19 >> var21;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = -var23 - (var22 - 65535);
                    int var25 = (int) ((long) this.field3268 * (long) var23 + (long) this.field3267 * (long) var22 + ((long) this.field3241 * (long) var24) >> 16);
                    int var26 = (int) ((long) this.field3250 * (long) var24 + ((long) this.field3245 * (long) var22 + ((long) this.field3255 * (long) var23)) >> 16);
                    int var27 = (int) ((long) this.field3271 * (long) var23 + (long) this.field3251 * (long) var24 + (long) this.field3248 * (long) var22 >> 16);
                    int var28 = (int) (Math.random() * (double) (this.field3266.field4528 - this.field3266.field4558)) + this.field3266.field4558;
                    int var29 = (int) ((double) (this.field3266.field4556 - this.field3266.field4566) * Math.random()) + this.field3266.field4566;
                    int var30 = this.field3266.field4532 + ((int) (Math.random() * (double) (this.field3266.field4548 - this.field3266.field4532)));
                    int var33;
                    if (this.field3266.field4559) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field3266.field4545 + Math.random() * (double) this.field3266.field4537) << 24 | (int) ((double) this.field3266.field4563 * var31 + (double) this.field3266.field4524) << 8 | (int) ((double) this.field3266.field4561 * var31 + (double) this.field3266.field4540) << 16 | (int) ((double) this.field3266.field4574 * var31 + (double) this.field3266.field4535);
                    } else {
                        var33 = (int) ((double) this.field3266.field4563 * Math.random() + (double) this.field3266.field4524) << 8 | (int) ((double) this.field3266.field4540 + Math.random() * (double) this.field3266.field4561) << 16 | (int) ((double) this.field3266.field4574 * Math.random() + (double) this.field3266.field4535) | (int) ((double) this.field3266.field4545 + Math.random() * (double) this.field3266.field4537) << 24;
                    }
                    int var34 = this.field3266.field4577;
                    if (!arg3.method1237() && !this.field3266.field4515) {
                        var34 = -1;
                    }
                    if (class462.field6898 == class237.field3157) {
                        new class311(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field3266.field4579, this.field3266.field4539);
                    } else {
                        class311 var35 = class60.field693[class462.field6898];
                        class462.field6898 = class462.field6898 + 1 & 0x3FF;
                        var35.method1857(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field3266.field4579, this.field3266.field4539);
                    }
                }
            }
        }
        this.field3253 = 0;
        if (arg2 <= 97) {
            return;
        }
        for (class311 var37 = (class311) this.field3262.method290(-1); var37 != null; var37 = (class311) this.field3262.method284(10748)) {
            var37.method1856(arg0, arg1);
            this.field3253++;
        }
        class186.field2423 += this.field3253;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public static final void method1531(int arg0) {
        field3243++;
        if (arg0 != -30994) {
            field3258 = -127;
        }
        for (class263 var1 = (class263) class366.field4995.method970(arg0 + 31006); var1 != null; var1 = (class263) class366.field4995.method976((byte) -122)) {
            if (var1.field3523 > 0) {
                var1.field3523--;
            }
            if (var1.field3523 != 0) {
                if (var1.field3521 > 0) {
                    var1.field3521--;
                }
                if (var1.field3521 == 0 && var1.field3534 >= 1 && var1.field3527 >= 1 && (class308.field4128 - 2) >= var1.field3534 && class426.field6200 - 2 >= var1.field3527 && (var1.field3531 < 0 || class144.method879(true, var1.field3531, var1.field3522))) {
                    class178.method1032(-1, var1.field3531, var1.field3534, -99, var1.field3532, var1.field3522, var1.field3518, var1.field3535, var1.field3527);
                    var1.field3521 = -1;
                    if (var1.field3531 == var1.field3529 && var1.field3529 == -1) {
                        var1.method2674(true);
                    } else if (var1.field3531 == var1.field3529 && var1.field3519 == var1.field3518 && var1.field3522 == var1.field3520) {
                        var1.method2674(true);
                    }
                }
            } else if (var1.field3529 < 0 || class144.method879(true, var1.field3529, var1.field3520)) {
                class178.method1032(-1, var1.field3529, var1.field3534, arg0 + 30915, var1.field3532, var1.field3520, var1.field3519, var1.field3535, var1.field3527);
                var1.method2674(true);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lza;Lsu;Ldl;J)V")
    public class247(class287 arg0, class142 arg1, class46 arg2, long arg3) {
        this.field3238 = arg3;
        this.field3259 = arg1;
        this.field3270 = arg2;
        this.field3266 = this.field3259.method873(-3);
        if (!arg0.method1237() && this.field3266.field4586 != -1) {
            this.field3266 = class115.method695(this.field3266.field4586, 24009);
        }
        this.field3262 = new class49();
        this.field3256 = (int) ((double) this.field3256 + Math.random() * 64.0D);
        this.method1527((byte) 86);
    }
}
