import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class268 extends class641 implements class532 {

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "B")
    private byte field3731;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "B")
    private byte field3730;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "B")
    private byte field3735;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "Z")
    private boolean field3724;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "S")
    private short field3712;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "Z")
    private boolean field3727;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "Z")
    private boolean field3734;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "Z")
    private boolean field3719;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "Lba;")
    public class358 field3721;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "Lw;")
    private class276 field3713;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "[I")
    public static int[] field3726 = new int[256];

    @OriginalMember(owner = "client!bq", name = "V", descriptor = "Z")
    public static boolean field3740;

    @OriginalMember(owner = "client!bq", name = "X", descriptor = "J")
    public static long field3742;

    @OriginalMember(owner = "client!bq", name = "Y", descriptor = "[I")
    public static int[] field3743;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!bq", name = "S", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!bq", name = "T", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!bq", name = "W", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!bq", name = "Z", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!bq", name = "U", descriptor = "Lbi;")
    public static class449 field3739;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "Ldd;")
    private class660 field3718;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((var1 & 1) != 1) {
                    var1 >>>= 1;
                } else {
                    var1 = -306674912 ^ var1 >>> 1;
                }
            }
            field3726[var0] = var1;
        }
        field3740 = true;
        field3742 = 0L;
        field3743 = new int[4];
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BILoa;I)Z", line = 5)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        ++field3732;
        int var5 = 38 % ((-26 - arg0) / 38);
        class358 var6 = this.method1636(arg2, 131072, (byte) 105);
        if (var6 != null) {
            class397 var7 = arg2.method455();
            var7.method576(super.field8620, super.field8616, super.field8612);
            return var6.method1931(arg3, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I", line = 26)
    public final int method1633(int arg0) {
        if (arg0 < 27) {
            this.method146(false);
        }
        ++field3723;
        return this.field3721 == null ? 15 : this.field3721.method1940() / 4;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)I", line = 37)
    public final int method151(byte arg0) {
        ++field3716;
        if (arg0 != 78) {
            method1634(-29);
        }
        return this.field3731;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Z", line = 51)
    public final boolean method139(int arg0) {
        ++field3725;
        if (arg0 != 2) {
            this.method1635(true, 125, (class651) null, 29);
        }
        return this.field3724;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Loa;Z)V", line = 63)
    public final void method147(class651 arg0, boolean arg1) {
        if (arg1) {
            ++field3714;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLoa;)Lpe;", line = 73)
    public final class571 method145(byte arg0, class651 arg1) {
        ++field3711;
        if (this.field3721 == null) {
            return null;
        } else {
            class397 var3 = arg1.method455();
            var3.method576(super.field8620, super.field8616, super.field8612);
            class571 var4 = null;
            if (this.field3734) {
                var4 = class157.method1100((byte) -111, 1);
            }
            if (arg0 != 124) {
                this.method1636((class651) null, 49, (byte) 113);
            }
            this.field3721.method1947(var3, var4 == null ? null : var4.field7581[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(Z)I", line = 98)
    public final int method729(boolean arg0) {
        ++field3741;
        if (arg0) {
            this.field3713 = null;
        }
        return this.field3721 != null ? this.field3721.method1939() : 0;
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(I)V", line = 109)
    public static void method1634(int arg0) {
        field3726 = null;
        field3739 = null;
        field3743 = null;
        if (arg0 <= 45) {
            method1634(118);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Loa;I)V", line = 121)
    public final void method138(class651 arg0, int arg1) {
        ++field3738;
        Object var3 = null;
        if (arg1 != 2215) {
            field3742 = -118L;
        }
        class276 var5;
        if (this.field3713 == null && this.field3719) {
            class392 var4 = this.method1635(true, arg1 ^ -16167, arg0, 262144);
            var5 = var4 != null ? var4.field5170 : null;
        } else {
            var5 = this.field3713;
            this.field3713 = null;
        }
        if (var5 != null) {
            class232.method1447(var5, this.field3735, super.field8620, super.field8612, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)I", line = 148)
    public final int method152(boolean arg0) {
        ++field3715;
        if (!arg0) {
            this.method152(true);
        }
        return this.field3730;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)I", line = 159)
    public final int method146(boolean arg0) {
        if (arg0) {
            this.method145((byte) 15, (class651) null);
        }
        ++field3717;
        return this.field3712 & 65535;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZILoa;I)Lun;", line = 174)
    private final class392 method1635(boolean arg0, int arg1, class651 arg2, int arg3) {
        ++field3733;
        class58 var5 = class470.field6288.method1258(65535 & this.field3712, (byte) -112);
        if (arg1 != -14210) {
            this.method143(94, (class651) null);
        }
        class139 var6;
        class139 var7;
        if (!this.field3727) {
            var6 = class684.field9625[this.field3735];
            if (~this.field3735 > -4) {
                var7 = class684.field9625[this.field3735 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class684.field9625[0];
            var6 = class467.field6283[this.field3735];
        }
        return var5.method472(var7, super.field8620, super.field8612, arg3, super.field8616, arg2, (byte) -111, arg0, ~this.field3731 == -12 ? 10 : this.field3731, var6, this.field3731 != 11 ? this.field3730 : this.field3730 + 4);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 205)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg5) {
            ++field3728;
            if (!(arg3 instanceof class363)) {
                if (arg3 instanceof class268) {
                    class268 var8 = (class268) arg3;
                    if (this.field3721 != null && var8.field3721 != null) {
                        this.field3721.method1923(var8.field3721, arg0, arg2, arg6, arg4);
                        return;
                    }
                }
            } else {
                class363 var9 = (class363) arg3;
                if (this.field3721 == null || var9.field4901 == null) {
                    return;
                }
                this.field3721.method1923(var9.field4901, arg0, arg2, arg6, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)Z", line = 235)
    public final boolean method150(byte arg0) {
        if (arg0 >= -34) {
            this.field3730 = 15;
        }
        ++field3720;
        return this.field3719;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V", line = 250)
    public final void method144(boolean arg0) {
        if (arg0) {
            this.field3730 = -63;
        }
        ++field3729;
        if (this.field3721 != null) {
            this.field3721.method1913();
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Loa;B)V", line = 264)
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 != 70) {
            this.field3719 = true;
        }
        ++field3737;
        Object var3 = null;
        class276 var5;
        if (this.field3713 == null && this.field3719) {
            class392 var4 = this.method1635(true, arg1 + -14280, arg0, 262144);
            var5 = var4 != null ? var4.field5170 : null;
        } else {
            var5 = this.field3713;
            this.field3713 = null;
        }
        if (var5 != null) {
            class486.method2723(var5, this.field3735, super.field8620, super.field8612, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Loa;Lbd;IIIIIZIIIIIIZ)V", line = 291)
    public class268(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field821 == 1, class127.method981(arg12, -114, arg13));
        this.field3731 = (byte) arg12;
        this.field3730 = (byte) arg13;
        this.field3735 = (byte) arg3;
        this.field3724 = arg14;
        this.field3712 = (short) arg1.field824;
        this.field3727 = arg7;
        this.field3734 = arg1.field816 != 0 && !arg7;
        this.field3719 = arg0.method404() && arg1.field877 && !this.field3727 && ~class344.field4718.method2329(108, class571.field7587) != -1;
        int var16 = 2048;
        if (this.field3724) {
            var16 |= 65536;
        }
        class392 var17 = this.method1635(this.field3719, -14210, arg0, var16);
        if (var17 != null) {
            this.field3721 = var17.field5169;
            this.field3713 = var17.field5170;
            if (this.field3724) {
                this.field3721 = this.field3721.method1519((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILoa;)Ldd;", line = 322)
    public final class660 method143(int arg0, class651 arg1) {
        ++field3744;
        if (this.field3718 == null) {
            this.field3718 = class516.method2881(super.field8616, true, this.method1636(arg1, 0, (byte) 92), super.field8620, super.field8612);
        }
        if (arg0 != 31358) {
            this.method1636((class651) null, 67, (byte) 96);
        }
        return this.field3718;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Loa;IB)Lba;", line = 375)
    private final class358 method1636(class651 arg0, int arg1, byte arg2) {
        if (arg2 <= 60) {
            this.method147((class651) null, true);
        }
        ++field3722;
        if (this.field3721 != null && arg0.method376(this.field3721.method1945(), arg1) == 0) {
            return this.field3721;
        } else {
            class392 var4 = this.method1635(false, -14210, arg0, arg1);
            return var4 == null ? null : var4.field5169;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V", line = 398)
    public final void method142(byte arg0) {
        this.field3724 = false;
        if (arg0 != -77) {
            this.method147((class651) null, true);
        }
        ++field3736;
        if (this.field3721 != null) {
            this.field3721.method1899(this.field3721.method1945() & -65537);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Loa;BI)Lba;", line = 421)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        ++field3710;
        if (arg1 != -47) {
            field3740 = false;
        }
        return this.method1636(arg0, arg2, (byte) 102);
    }
}
