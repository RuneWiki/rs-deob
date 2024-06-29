import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class241 extends class367 implements class278 {

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "Z")
    private boolean field3393;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "Z")
    private boolean field3409;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "B")
    private byte field3402;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Z")
    private boolean field3388;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "B")
    private byte field3403;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "S")
    private short field3406;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "Z")
    private boolean field3407;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "Lab;")
    private class232 field3404;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "Lmr;")
    private class173 field3397;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!pq", name = "W", descriptor = "Ldt;")
    public static class184 field3415;

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "F")
    public static float field3412;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!pq", name = "S", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!pq", name = "U", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!pq", name = "V", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!pq", name = "X", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!pq", name = "Y", descriptor = "I")
    public static int field3417;

    static {
        new class112("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
        field3415 = new class184(128);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lkm;II)Lab;", line = 4)
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        int var4 = -97 / ((-12 - arg1) / 47);
        ++field3399;
        return this.method1511(arg2, arg0, 96);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lkm;BII)Z", line = 21)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        ++field3395;
        class232 var5 = this.method1511(65536, arg0, 100);
        if (var5 != null) {
            class250 var6 = arg0.method1105();
            var6.method1382(super.field5224, super.field5216, super.field5223);
            return var5.method75(arg3, arg2, var6, false);
        } else {
            return arg1 < 123;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIZIZ)I", line = 42)
    public static final int method1508(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        ++field3408;
        class459 var5 = class27.method228((byte) -77, arg2, arg3);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field6464.length; ++var7) {
                if (var5.field6464[var7] >= 0 && ~class58.field918.field692 < ~var5.field6464[var7]) {
                    class164 var8 = class58.field918.method344(var5.field6464[var7], 31757);
                    int var9 = var8.method997(class68.field1007.method963(arg1, (byte) -43).field4199, (byte) -21, arg1);
                    if (!arg4) {
                        var6 += var9;
                    } else {
                        var6 += var5.field6463[var7] * var9;
                    }
                }
            }
            if (arg0 > -127) {
                field3412 = -0.05384557F;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)Z", line = 83)
    public final boolean method195(int arg0) {
        if (arg0 < 91) {
            this.method198(94, (class487) null, -123, false, 64, (class280) null, (byte) -88);
        }
        ++field3398;
        return this.field3388;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lkm;I)V", line = 94)
    public final void method216(class487 arg0, int arg1) {
        int var3 = 88 / ((arg1 - -12) / 60);
        ++field3394;
        Object var4 = null;
        class173 var6;
        if (this.field3397 == null && this.field3407) {
            class172 var5 = this.method1510(arg0, 131072, 1, true);
            var6 = var5 != null ? var5.field2554 : null;
        } else {
            var6 = this.field3397;
            this.field3397 = null;
        }
        if (var6 != null) {
            class199.method1265(var6, this.field3403, super.field5224, super.field5223, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I", line = 125)
    public final int method215(int arg0) {
        if (arg0 != -11524) {
            field3410 = 94;
        }
        ++field3414;
        return this.field3402;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(Lkm;I)V", line = 136)
    public final void method197(class487 arg0, int arg1) {
        int var3 = 109 % ((64 - arg1) / 59);
        ++field3401;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lkm;Lcj;IIIIZIZ)V", line = 152)
    public class241(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field6732, arg1.field6650);
        super.field5223 = (short) arg5;
        super.field5224 = (short) arg3;
        this.field3393 = ~arg1.field6681 != -1 && !arg6;
        this.field3409 = arg6;
        this.field3402 = (byte) arg7;
        this.field3388 = arg8;
        this.field3403 = (byte) arg2;
        this.field3406 = (short) arg1.field6705;
        this.field3407 = arg0.method1123() && arg1.field6697 && !this.field3409 && class47.field761 != 0;
        int var10 = 1024;
        if (this.field3388) {
            var10 |= 32768;
        }
        class172 var11 = this.method1510(arg0, var10, 1, this.field3407);
        if (var11 != null) {
            this.field3404 = var11.field2549;
            this.field3397 = var11.field2554;
            if (this.field3388) {
                this.field3404 = this.field3404.method51((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I", line = 188)
    public final int method219(int arg0) {
        if (arg0 != -17942) {
            this.field3393 = false;
        }
        ++field3413;
        return 22;
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(I)V", line = 199)
    public static void method1509(int arg0) {
        if (arg0 != 0) {
            method1508(112, 67, false, -43, true);
        }
        field3415 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lkm;IIZ)Llt;", line = 209)
    private final class172 method1510(class487 arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != 1) {
            return null;
        } else {
            ++field3389;
            class475 var5 = class304.field4160.method2075(65535 & this.field3406, false);
            class269 var6;
            class269 var7;
            if (this.field3409) {
                var6 = class8.field166[this.field3403];
                var7 = class366.field5215[0];
            } else {
                if (~this.field3403 > -4) {
                    var7 = class366.field5215[this.field3403 + 1];
                } else {
                    var7 = null;
                }
                var6 = class366.field5215[this.field3403];
            }
            return var5.method2793(var7, super.field5224, 22, var6, this.field3402, arg0, arg1, arg3, super.field5223, (byte) 87, super.field5216);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Lkm;I)V", line = 239)
    public final void method218(class487 arg0, int arg1) {
        ++field3416;
        Object var3 = null;
        class173 var5;
        if (this.field3397 == null && this.field3407) {
            class172 var4 = this.method1510(arg0, 131072, 1, true);
            var5 = var4 == null ? null : var4.field2554;
        } else {
            var5 = this.field3397;
            this.field3397 = null;
        }
        if (arg1 >= -73) {
            this.field3397 = null;
        }
        if (var5 != null) {
            class204.method1291(var5, this.field3403, super.field5224, super.field5223, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V", line = 267)
    public final void method217(boolean arg0) {
        if (arg0) {
            field3410 = 27;
        }
        ++field3411;
        if (this.field3404 != null) {
            this.field3404.method22();
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z", line = 284)
    public final boolean method214(int arg0) {
        ++field3405;
        if (arg0 <= 24) {
            this.field3404 = null;
        }
        return this.field3407;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)I", line = 296)
    public final int method211(boolean arg0) {
        ++field3392;
        return !arg0 ? -52 : 65535 & this.field3406;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(Lkm;I)Lto;", line = 307)
    public final class370 method193(class487 arg0, int arg1) {
        ++field3396;
        if (this.field3404 == null) {
            return null;
        } else {
            if (arg1 > -6) {
                this.method208((class487) null, -60, -4);
            }
            class250 var3 = arg0.method1105();
            var3.method1382(super.field5224, super.field5216, super.field5223);
            class370 var4 = null;
            if (this.field3393) {
                var4 = class277.method1737((byte) 28, 1);
            }
            this.field3404.method41(var3, var4 != null ? var4.field5233[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 339)
    public final void method202(byte arg0) {
        this.field3388 = false;
        ++field3400;
        if (this.field3404 != null) {
            this.field3404.method56(-32769 & this.field3404.method50());
        }
        if (arg0 < 42) {
            field3415 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 358)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 != 59) {
            field3412 = -0.31828824F;
        }
        ++field3391;
        if (arg5 instanceof class241) {
            class241 var8 = (class241) arg5;
            if (this.field3404 != null && var8.field3404 != null) {
                this.field3404.method59(var8.field3404, arg0, arg2, arg4, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILkm;I)Lab;", line = 380)
    private final class232 method1511(int arg0, class487 arg1, int arg2) {
        ++field3417;
        if (this.field3404 != null && ~arg1.method1102(this.field3404.method50(), arg0) == -1) {
            return this.field3404;
        } else {
            class172 var4 = this.method1510(arg1, arg0, 1, false);
            if (arg2 <= 92) {
                return null;
            } else {
                return var4 == null ? null : var4.field2549;
            }
        }
    }
}
