import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class381 {

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    private int field5568 = -1;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Z")
    private boolean field5575 = false;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field5574 = -1;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Z")
    private boolean field5583 = false;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private int field5564 = -32768;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    private int field5580;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "B")
    private byte field5591;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    private int field5587;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "B")
    private byte field5558;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Z")
    private boolean field5560;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field5570 = 0;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field5579 = 0;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Z")
    public static volatile boolean field5586 = true;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    private int field5572;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    private int field5576;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lmd;")
    private class233 field5557;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Lqb;")
    private class257 field5584;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lc;")
    private class308 field5565;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Lnd;")
    public class411 field5588;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "[Z")
    private boolean[] field5571;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLtj;IZIII)Lqb;")
    public final class257 method2477(boolean arg0, class298 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field5577++;
        class212 var8 = class372.method2447(this.field5562, (byte) 14);
        if (var8.field2944 != null) {
            var8 = var8.method1387((byte) -53);
        }
        if (var8 == null) {
            this.method2485(arg1, 120);
            this.field5568 = this.field5576;
            this.field5574 = -1;
            return null;
        }
        if (!this.field5583 && this.field5574 != var8.field2942) {
            this.field5584 = null;
            this.method2481(0, -1);
        }
        this.method2480(arg2, (byte) 68, arg4);
        boolean var9 = arg3 & this.field5560 & class330.field4863 != 0;
        boolean var10 = var9 & (this.field5574 != var8.field2942 || (this.field5576 != this.field5568 || this.field5557 != null && (this.field5557.field3229 || class361.field5345) && this.field5576 != this.field5559) && class330.field4863 >= 2);
        if (arg0 && !var10) {
            this.field5568 = this.field5576;
            this.field5574 = var8.field2942;
            return null;
        }
        if (var10) {
            class108.method818(this.field5565, this.field5558, this.field5587, this.field5580, this.field5571);
        }
        class193 var11 = class266.field3950[this.field5558];
        class193 var12;
        if (this.field5575) {
            var12 = class142.field1804[0];
        } else {
            var12 = this.field5558 >= 3 ? null : class266.field3950[this.field5558 + 1];
        }
        class257 var13 = null;
        if (this.field5557 != null) {
            if (var10) {
                arg6 |= 0x20000;
            }
            var13 = var8.method1399(this.field5580, arg1, this.field5576, var11, this.field5589 == 11 ? this.field5582 + 4 : this.field5582, this.field5557, var12, this.field5559, this.field5589 == 11 ? 10 : this.field5589, arg6, this.field5587, (byte) 42, var11.method725(this.field5587, this.field5580), this.field5572);
            if (var13 == null) {
                this.field5571 = null;
                this.field5564 = 0;
                this.field5565 = null;
            } else {
                if (var10) {
                    if (this.field5571 == null) {
                        this.field5571 = new boolean[4];
                    }
                    this.field5565 = var13.method1663(this.field5565);
                    class215.method1412(this.field5565, this.field5558, arg2, arg4, this.field5571);
                }
                this.field5564 = var13.method1688();
            }
            this.field5584 = null;
        } else if (this.field5584 != null && arg6 == (arg6 & this.field5584.method1690()) && this.field5574 == var8.field2942) {
            var13 = this.field5584;
        } else {
            if (this.field5584 != null) {
                arg6 |= this.field5584.method1690();
            }
            class373 var14 = var8.method1406(this.field5580, var10, this.field5589 == 11 ? this.field5582 + 4 : this.field5582, (byte) -67, arg6, this.field5589 == 11 ? 10 : this.field5589, var11.method725(this.field5587, this.field5580), var12, arg1, var11, this.field5587);
            if (var14 == null) {
                this.field5571 = null;
                this.field5565 = null;
                this.field5564 = 0;
                this.field5584 = null;
            } else {
                var13 = var14.field5505;
                this.field5584 = var14.field5505;
                if (var10) {
                    this.field5565 = var14.field5496;
                    this.field5571 = null;
                    class215.method1412(this.field5565, this.field5558, arg2, arg4, (boolean[]) null);
                }
                this.field5564 = var13.method1688();
            }
        }
        this.field5574 = var8.field2942;
        this.field5580 = arg4;
        int var15 = 115 / ((37 - arg5) / 51);
        this.field5568 = this.field5576;
        this.field5587 = arg2;
        return var13;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILtj;)V")
    public final void method2478(int arg0, class298 arg1) {
        field5569++;
        if (arg0 == -18021) {
            this.method2477(true, arg1, this.field5587, true, this.field5580, -30, 131072);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
    public final int method2479(boolean arg0) {
        field5566++;
        if (!arg0) {
            this.field5565 = null;
        }
        return this.field5564;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI)V")
    private final void method2480(int arg0, byte arg1, int arg2) {
        field5581++;
        if (arg1 != 68) {
            this.method2482(true);
        }
        label90: while (true) {
            if (this.field5557 == null) {
                if (this.field5583) {
                    return;
                }
                this.method2481(0, -1);
                if (this.field5557 == null) {
                    return;
                }
            }
            int var4 = class231.field3179 - this.field5556;
            if (var4 > 100 && this.field5557.field3244 > 0) {
                int var5 = this.field5557.field3242.length - this.field5557.field3244;
                while (this.field5576 < var5 && this.field5557.field3248[this.field5576] < var4) {
                    var4 -= this.field5557.field3248[this.field5576];
                    this.field5576++;
                }
                if (var5 <= this.field5576) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5557.field3242.length; var7++) {
                        var6 += this.field5557.field3248[var7];
                    }
                    var4 %= var6;
                }
                this.field5559 = this.field5576 + 1;
                if (this.field5559 >= this.field5557.field3242.length) {
                    this.field5559 -= this.field5557.field3244;
                    if (this.field5559 < 0 || this.field5559 >= this.field5557.field3242.length) {
                        this.field5559 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field5557.field3248[this.field5576] >= var4) {
                            this.field5556 = class231.field3179 - var4;
                            this.field5572 = var4;
                            return;
                        }
                        class379.method2476(this.field5576, false, false, arg2, this.field5557, arg0);
                        var4 -= this.field5557.field3248[this.field5576];
                        this.field5576++;
                        if (this.field5557.field3242.length <= this.field5576) {
                            this.field5576 -= this.field5557.field3244;
                            if (this.field5576 < 0 || this.field5557.field3242.length <= this.field5576) {
                                this.field5557 = null;
                                continue label90;
                            }
                        }
                        this.field5559 = this.field5576 + 1;
                    } while (this.field5559 < this.field5557.field3242.length);
                    this.field5559 -= this.field5557.field3244;
                } while (this.field5559 >= 0 && this.field5557.field3242.length > this.field5559);
                this.field5559 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    private final void method2481(int arg0, int arg1) {
        field5578++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class212 var5 = class372.method2447(this.field5562, (byte) -128);
            class212 var6 = var5;
            if (var5.field2944 != null) {
                var5 = var5.method1387((byte) -53);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2896 != null) {
                if (this.field5557 != null && var5.method1404(true, this.field5557.field3255)) {
                    return;
                }
                var3 = var5.method1405(arg0 - 23423);
                if (this.field5574 != var5.field2942) {
                    var4 = var5.field2894;
                }
            } else if (var5.field2919 == -1) {
                if (var6 != null && var6.field2896 != null) {
                    if (this.field5557 != null && var6.method1404(true, this.field5557.field3255)) {
                        return;
                    }
                    var3 = var6.method1405(-23423);
                    if (this.field5574 != var6.field2942) {
                        var4 = var6.field2894;
                    }
                } else if (var6 != null && var6.field2919 != -1 && this.field5574 != var6.field2942) {
                    var4 = var6.field2894;
                    var3 = var6.field2919;
                }
            } else if (this.field5574 != var5.field2942) {
                var4 = var5.field2894;
                var3 = var5.field2919;
            }
        }
        if (var3 == -1) {
            this.field5557 = null;
            return;
        }
        this.field5584 = null;
        if (this.field5557 == null || this.field5557.field3255 != var3) {
            this.field5557 = class73.method597(var3, -1);
        } else if (this.field5557.field3239 == 0) {
            return;
        }
        if (this.field5557.field3242 == null) {
            this.field5557 = null;
            return;
        }
        if (var4) {
            this.field5576 = (int) (Math.random() * (double) this.field5557.field3242.length);
            this.field5572 = (int) ((double) this.field5557.field3248[this.field5576] * Math.random()) + 1;
        } else {
            this.field5572 = 1;
            this.field5576 = 0;
        }
        this.field5559 = this.field5576 + 1;
        if (this.field5559 < arg0 || this.field5559 >= this.field5557.field3242.length) {
            this.field5559 = -1;
        }
        this.field5556 = class231.field3179 - this.field5572;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)Z")
    public final boolean method2482(boolean arg0) {
        field5573++;
        if (!arg0) {
            this.method2485((class298) null, 80);
        }
        return this.field5560;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
    public final void method2483(byte arg0, int arg1) {
        this.field5583 = true;
        field5561++;
        if (arg0 > -13) {
            field5570 = -54;
        }
        this.method2481(0, arg1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZLtj;Lqb;IIII)V")
    public final void method2484(int arg0, boolean arg1, class298 arg2, class257 arg3, int arg4, int arg5, int arg6, int arg7) {
        field5590++;
        class230[] var9 = arg3.method1656();
        if (arg6 != 5915) {
            this.method2477(false, (class298) null, -102, false, -57, 109, 125);
        }
        class1[] var10 = arg3.method1694();
        if ((this.field5588 == null || this.field5588.field5959) && (var9 != null || var10 != null)) {
            class212 var11 = class372.method2447(this.field5562, (byte) 110);
            if (var11.field2944 != null) {
                var11 = var11.method1387((byte) -53);
            }
            if (var11 != null) {
                this.field5588 = new class411(class231.field3179);
            }
        }
        if (this.field5588 == null) {
            return;
        }
        if (arg1) {
            this.field5588.method2601(arg2, (long) class231.field3179, var9, var10, false);
        } else {
            this.field5588.method2607((long) class231.field3179);
        }
        this.field5588.method2598(this.field5591, arg0, arg7, arg5, arg4);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ltj;I)V")
    public final void method2485(class298 arg0, int arg1) {
        field5563++;
        if (this.field5565 != null) {
            class108.method818(this.field5565, this.field5558, this.field5587, this.field5580, this.field5571);
            this.field5571 = null;
            this.field5565 = null;
        }
        if (arg1 <= 107) {
            this.method2479(true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field5588 != null) {
            this.field5588.method2596();
        }
        field5567++;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ltj;Lqr;IIIIIIZI)V")
    public class381(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5582 = arg3;
        this.field5580 = arg7;
        this.field5591 = (byte) arg4;
        this.field5575 = arg8;
        this.field5587 = arg6;
        this.field5562 = arg1.field2942;
        this.field5558 = (byte) arg5;
        this.field5589 = arg2;
        this.field5560 = arg0.method434() && arg1.field2927 && !this.field5575;
        if (arg9 != -1) {
            this.field5583 = true;
        }
        this.method2481(0, arg9);
    }
}
